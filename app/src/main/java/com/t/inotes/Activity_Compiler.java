package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.t.inotes.Api.ApiHandler;
import com.t.inotes.Api.ApiService;
import com.t.inotes.Api.PostData;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Compiler extends AppCompatActivity {
    TextView tvResult;
    EditText etInput;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler);
        tvResult  = findViewById(R.id.tv_result);
        etInput   = findViewById(R.id.et_input);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ApiService apiService = ApiHandler.getRetrofitInstance();
                Call<String> execute = apiService.execute(new PostData(etInput.getText().toString()));

                tvResult.setText("Loading...");

                execute.enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {

                        tvResult.setText("");

                        try {

                            if(response.isSuccessful()){


                                JSONObject responseJson = new JSONObject(response.body().toString());
                                String output = responseJson.getString("output");
                                tvResult.setText(output);

                            }else{

                                Toast.makeText(Activity_Compiler.this, response.errorBody().string(), Toast.LENGTH_SHORT).show();
                            }

                        } catch (JSONException e) {
                            Toast.makeText(Activity_Compiler.this, "Gagal Parsing JSON : " + e.getMessage(), Toast.LENGTH_SHORT).show();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    @Override
                    public void onFailure(Call<String> call, Throwable t) {

                        tvResult.setText("Failed");
                        Toast.makeText(Activity_Compiler.this, "Gagal : " + t.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });


            }
        });
    }
}
package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class nav_code extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_nav_code);

        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15= findViewById(R.id.button15);
        Button button16= findViewById(R.id.button16);
        Button button17= findViewById(R.id.button17);
        Button button18= findViewById(R.id.button18);


        
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button13:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button14:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button15:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button16:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button17:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button18:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
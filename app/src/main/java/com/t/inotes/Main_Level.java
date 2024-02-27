package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.Toast;


public class Main_Level extends AppCompatActivity implements View.OnClickListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_level);


        Button button1 = findViewById(R.id.level1);
        Button button2 = findViewById(R.id.level2);
        Button button3 = findViewById(R.id.level3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent intentb1 = new Intent(this, TestPage.class);
                intentb1.putExtra("intVariableName", view.getId());
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                startActivity(intentb1);
            case R.id.button2:
                Intent intentb2 = new Intent(this, TestPage.class);
                intentb2.putExtra("intVariableName", view.getId());
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                startActivity(intentb2);
            case R.id.button3:
                Intent intentb3 = new Intent(this, TestPage.class);
                intentb3.putExtra("intVariableName", view.getId());
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                startActivity(intentb3);

        }
    }
}
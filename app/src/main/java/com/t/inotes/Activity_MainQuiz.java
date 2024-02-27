package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_MainQuiz extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);
        Button qbutton1 = findViewById(R.id.qbutton1);
        Button qbutton2 = findViewById(R.id.qbutton2);
        Button qbutton3 = findViewById(R.id.qbutton3);
        Button qbutton4 = findViewById(R.id.qbutton4);
        Button qbutton5 = findViewById(R.id.qbutton5);
        Button qbutton6 = findViewById(R.id.qbutton6);
        Button qbutton7 = findViewById(R.id.qbutton7);
        Button qbutton8 = findViewById(R.id.qbutton8);
        Button qbutton9 = findViewById(R.id.qbutton9);



        qbutton1.setOnClickListener(this);
        qbutton2.setOnClickListener(this);
        qbutton3.setOnClickListener(this);
        qbutton4.setOnClickListener(this);
        qbutton5.setOnClickListener(this);
        qbutton6.setOnClickListener(this);
        qbutton7.setOnClickListener(this);
        qbutton8.setOnClickListener(this);
        qbutton9.setOnClickListener(this);


    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.qbutton1:
                Intent intent1q = new Intent(this, TestPage.class);
                intent1q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent1q);
            case R.id.qbutton2:
                Intent intent2q = new Intent(this, TestPage.class);
                intent2q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent2q);
            case R.id.qbutton3:
                Intent intent3q = new Intent(this, TestPage.class);
                intent3q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent3q);
            case R.id.qbutton4:
                Intent intent4q = new Intent(this, TestPage.class);
                intent4q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent4q);
            case R.id.qbutton5:
                Intent intent5q = new Intent(this, TestPage.class);
                intent5q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent5q);
            case R.id.qbutton6:
                Intent intent6q = new Intent(this, TestPage.class);
                intent6q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent6q);

            case R.id.qbutton7:
                Intent intent7q = new Intent(this, TestPage.class);
                intent7q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent7q);

            case R.id.qbutton8:
                Intent intent8q = new Intent(this, TestPage.class);
                intent8q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent8q);

            case R.id.qbutton9:
                Intent intent9q = new Intent(this, TestPage.class);
                intent9q.putExtra("intVariableName", v.getId());
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                startActivity(intent9q);


        }

    }
}
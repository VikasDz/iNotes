package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class practice_set extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_practice_set);

        Button buttonand = findViewById(R.id.and);
        Button buttonpy = findViewById(R.id.pyt1);
        Button buttonjava = findViewById(R.id.java2);
        Button buttoncp = findViewById(R.id.c3);
        Button buttoncss = findViewById(R.id.css5);
        Button buttonhtml = findViewById(R.id.html4);
        Button buttonc = findViewById(R.id.clan);
        Button buttonphp = findViewById(R.id.php);


        buttonand.setOnClickListener(this);
        buttonpy.setOnClickListener(this);
        buttonjava.setOnClickListener(this);
        buttoncp.setOnClickListener(this);
        buttoncss.setOnClickListener(this);
        buttonhtml.setOnClickListener(this);
        buttonc.setOnClickListener(this);
        buttonphp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v1) {
        switch (v1.getId()) {
            case R.id.and:
                Intent intentand = new Intent(this, Single_Practice_set.class);
                intentand.putExtra("intVariableName", v1.getId());
                startActivity(intentand);
            case R.id.pyt1:
                Intent intent2 = new Intent(this, Single_Practice_set.class);
                intent2.putExtra("intVariableName", v1.getId());
                startActivity(intent2);
            case R.id.java2:
                Intent intent3 = new Intent(this, Single_Practice_set.class);
                intent3.putExtra("intVariableName", v1.getId());
                startActivity(intent3);
            case R.id.html4:
                Intent intent8 = new Intent(this, Single_Practice_set.class);
                intent8.putExtra("intVariableName", v1.getId());
                startActivity(intent8);
            case R.id.c3:
                Intent intent4 = new Intent(this, Single_Practice_set.class);
                intent4.putExtra("intVariableName", v1.getId());
                startActivity(intent4);
            case R.id.clan:
                Intent intent5 = new Intent(this, Single_Practice_set.class);
                intent5.putExtra("intVariableName", v1.getId());
                startActivity(intent5);
            case R.id.css5:
                Intent intent6 = new Intent(this, Single_Practice_set.class);
                intent6.putExtra("intVariableName", v1.getId());
                startActivity(intent6);
            case R.id.php:
                Intent intent7 = new Intent(this, Single_Practice_set.class);
                intent7.putExtra("intVariableName", v1.getId());
                startActivity(intent7);

        }
        
    }
}
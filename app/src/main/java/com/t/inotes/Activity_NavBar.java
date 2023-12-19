package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_NavBar extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_code);

        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15= findViewById(R.id.button15);
        Button button16= findViewById(R.id.button16);
        Button button17= findViewById(R.id.button17);
        Button button18= findViewById(R.id.button18);
        Button button19= findViewById(R.id.button19);
        Button button20= findViewById(R.id.button20);
        Button button21= findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);

        
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);

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
            case R.id.button19:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button20:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button21:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button22:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button23:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button24:
                Toast.makeText(this, "Wait For It ", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
                String urlf = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse(urlf));
                startActivity(i1);
                break;

            case R.id.button14:
                String url2 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse(url2));
                startActivity(i2);
                break;


            case R.id.button15:
                String url3 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i3 = new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse(url3));
                startActivity(i3);
                break;

            case R.id.button16:
                String url4 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i4 = new Intent(Intent.ACTION_VIEW);
                i4.setData(Uri.parse(url4));
                startActivity(i4);
                break;



            case R.id.button17:
                String url5 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i5 = new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url5));
                startActivity(i5);
                break;


            case R.id.button18:
                String url18 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i18 = new Intent(Intent.ACTION_VIEW);
                i18.setData(Uri.parse(url18));
                startActivity(i18);
                break;


            case R.id.button19:
                String url19= "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i19 = new Intent(Intent.ACTION_VIEW);
                i19.setData(Uri.parse(url19));
                startActivity(i19);
                break;

            case R.id.button20:
                String url20 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i20 = new Intent(Intent.ACTION_VIEW);
                i20.setData(Uri.parse(url20));
                startActivity(i20);
                break;


            case R.id.button21:
                String url21 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i21 = new Intent(Intent.ACTION_VIEW);
                i21.setData(Uri.parse(url21));
                startActivity(i21);
                break;


            case R.id.button22:
                String url22 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i22 = new Intent(Intent.ACTION_VIEW);
                i22.setData(Uri.parse(url22));
                startActivity(i22);
                break;


            case R.id.button23:
                String url23 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i23 = new Intent(Intent.ACTION_VIEW);
                i23.setData(Uri.parse(url23));
                startActivity(i23);
                break;


            case R.id.button24:
                String url24 = "https://drive.google.com/drive/folders/1aMr-_-EBtLlhqDI42rjOo6SWlli-86ix?usp=sharing";
                Intent i24 = new Intent(Intent.ACTION_VIEW);
                i24.setData(Uri.parse(url24));
                startActivity(i24);
                break;


        }

    }
}
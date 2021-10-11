package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        Thread Th = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent001 = new Intent( SplashScreen.this, MainActivity.class);
                    startActivity(intent001);
                }
            }
        };Th.start();
    }
}
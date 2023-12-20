package com.t.inotes;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;


import com.t.inotes.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBarMain.toolbar);


        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey Check Out iNotes 🔥" + "https://drive.google.com/drive/u/3/folders/18t67PfuoPi-5FPa6nTDmnW3zW_swq2bo" );
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });


        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
// Passing each menu ID as a set of Ids because each
// menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView =findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_login:
                        Intent nlogin = new Intent(MainActivity.this , Activity_Login.class);
                        startActivity(nlogin);
                        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                        return false;

                    case R.id.sharebtn:
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT,
                                "Hey Check Out iNotes 🔥" + "https://drive.google.com/drive/u/3/folders/18t67PfuoPi-5FPa6nTDmnW3zW_swq2bo");
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);
                        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                        return false;

                    case  R.id.nav_code:
                        Intent n1 = new Intent(MainActivity.this , Activity_NavBar.class);
                        startActivity(n1);
                        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                        return false;

                    case  R.id.nav_music:
                        Intent n = new Intent(MainActivity.this , Activity_Music.class);
                        startActivity(n);
                        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                        return false;
                        
                    case  R.id.nav_quiz:
                        Intent nq = new Intent(MainActivity.this , Activity_MainQuiz.class);
                        startActivity(nq);
                        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                        return false;


                    case R.id.nav_facebook:
                        String urlf = "https://imvikash.in/";
                        Intent i2 = new Intent(Intent.ACTION_VIEW);
                        i2.setData(Uri.parse(urlf));
                        startActivity(i2);
                        return false;

                    case R.id.nav_instagram:
                        String urli = "https://www.instagram.com/satya.py/";
                        Intent i3 = new Intent(Intent.ACTION_VIEW);
                        i3.setData(Uri.parse(urli));
                        startActivity(i3);
                        return false;

                    case R.id.nav_contactus:
                        Toast.makeText(MainActivity.this, "Error 404 😉", Toast.LENGTH_SHORT).show();
                        return false;
                }
                return false;

            }
        });


//Here We Have All Buttons------------------------------------------------------------------------------------------>

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);



//  <------------------------------------------------------------------------------------------------------------------------------------------------------>
    }



@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.main, menu);
return true;
}

@Override
public boolean onSupportNavigateUp() {
NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
return NavigationUI.navigateUp(navController, mAppBarConfiguration)
        || super.onSupportNavigateUp();
}

@Override
public void onClick(View v) {
    switch (v.getId()) {
        case R.id.button1:
            Intent intent1 = new Intent(this, MainActivity_Pdf.class);
            intent1.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent1);
        case R.id.button2:
            Intent intent2 = new Intent(this, MainActivity_Pdf.class);
            intent2.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent2);
        case R.id.button3:
            Intent intent3 = new Intent(this, MainActivity_Pdf.class);
            intent3.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent3);
        case R.id.button4:
            Intent intent4 = new Intent(this, MainActivity_Pdf.class);
            intent4.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent4);
        case R.id.button5:
            Intent intent5 = new Intent(this, MainActivity_Pdf.class);
            intent5.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent5);
        case R.id.button6:
            Intent intent6 = new Intent(this, MainActivity_Pdf.class);
            intent6.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent6);

        case R.id.button7:
            Intent intent7 = new Intent(this, MainActivity_Pdf.class);
            intent7.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent7);

        case R.id.button8:
            Intent intent8 = new Intent(this, MainActivity_Pdf.class);
            intent8.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent8);

        case R.id.button9:
            Intent intent9 = new Intent(this, MainActivity_Pdf.class);
            intent9.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent9);

        case R.id.button10:
            Intent intent10 = new Intent(this, MainActivity_Pdf.class);
            intent10.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent10);

        case R.id.button11:
            Intent intent11 = new Intent(this, MainActivity_Pdf.class);
            intent11.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent11);

        case R.id.button12:
            Intent intent12= new Intent(this, MainActivity_Pdf.class);
            intent12.putExtra("intVariableName", v.getId());
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            startActivity(intent12);

    }
}
}
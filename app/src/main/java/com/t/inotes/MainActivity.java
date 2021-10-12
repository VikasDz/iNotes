package com.t.inotes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.os.Handler;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.material.navigation.NavigationView;
import com.t.inotes.databinding.ActivityMainBinding;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    PDFView testpdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
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
                    case R.id.sharebtn:
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT,
                                "Hey Check Out iNotes 🔥" + "https://drive.google.com/drive/u/3/folders/18t67PfuoPi-5FPa6nTDmnW3zW_swq2bo");
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);
                        return false;

                    case  R.id.nav_code:
                        String urlcode = "https://paiza.io/en";
                        Intent i21 = new Intent(Intent.ACTION_VIEW);
                        i21.setData(Uri.parse(urlcode));
                        startActivity(i21);
                        return false;

                    case  R.id.nav_music:
                        Intent n = new Intent(MainActivity.this ,music.class);
                        startActivity(n);
                        return false;

                    case  R.id.nav_practiceset:
                        Intent pn = new Intent(MainActivity.this, practice_set.class);
                        startActivity(pn);
                        return false;

                    case R.id.nav_sourcecode:
                        String urls = "https://github.com/VikasDz?tab=repositories";
                        Intent i2s = new Intent(Intent.ACTION_VIEW);
                        i2s.setData(Uri.parse(urls));
                        startActivity(i2s);
                        return false;

                    case R.id.nav_facebook:
                        String urlf = "https://www.facebook.com/satya.py0/";
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
                    case R.id.nav_github:
                        String urlig = "https://github.com/VikasDz";
                        Intent i31 = new Intent(Intent.ACTION_VIEW);
                        i31.setData(Uri.parse(urlig));
                        startActivity(i31);
                        return false;


                }
                return false;

            }
        });

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
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);
        Button button17 = findViewById(R.id.button17);
        Button button18 = findViewById(R.id.button18);


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
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
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
            Intent intent1 = new Intent(this, MainActivity1.class);
            intent1.putExtra("intVariableName", v.getId());
            startActivity(intent1);
        case R.id.button2:
            Intent intent2 = new Intent(this, MainActivity1.class);
            intent2.putExtra("intVariableName", v.getId());
            startActivity(intent2);
        case R.id.button3:
            Intent intent3 = new Intent(this, MainActivity1.class);
            intent3.putExtra("intVariableName", v.getId());
            startActivity(intent3);
        case R.id.button4:
            Intent intent4 = new Intent(this, MainActivity1.class);
            intent4.putExtra("intVariableName", v.getId());
            startActivity(intent4);
        case R.id.button5:
            Intent intent5 = new Intent(this, MainActivity1.class);
            intent5.putExtra("intVariableName", v.getId());
            startActivity(intent5);
        case R.id.button6:
            Intent intent6 = new Intent(this, MainActivity1.class);
            intent6.putExtra("intVariableName", v.getId());
            startActivity(intent6);

        case R.id.button7:
            Intent intent7 = new Intent(this, MainActivity1.class);
            intent7.putExtra("intVariableName", v.getId());
            startActivity(intent7);

        case R.id.button8:
            Intent intent8 = new Intent(this, MainActivity1.class);
            intent8.putExtra("intVariableName", v.getId());
            startActivity(intent8);

        case R.id.button9:
            Intent intent9 = new Intent(this, MainActivity1.class);
            intent9.putExtra("intVariableName", v.getId());
            startActivity(intent9);

        case R.id.button10:
            Intent intent10 = new Intent(this, MainActivity1.class);
            intent10.putExtra("intVariableName", v.getId());
            startActivity(intent10);

        case R.id.button11:
            Intent intent11 = new Intent(this, MainActivity1.class);
            intent11.putExtra("intVariableName", v.getId());
            startActivity(intent11);

        case R.id.button12:
            Intent intent12= new Intent(this, MainActivity1.class);
            intent12.putExtra("intVariableName", v.getId());
            startActivity(intent12);

        case R.id.button13:
            Intent intent13 = new Intent(this, MainActivity1.class);
            intent13.putExtra("intVariableName", v.getId());
            startActivity(intent13);

        case R.id.button14:
            Intent intent14 = new Intent(this, MainActivity1.class);
            intent14.putExtra("intVariableName", v.getId());
            startActivity(intent14);

        case R.id.button15:
            Intent intent15 = new Intent(this, MainActivity1.class);
            intent15.putExtra("intVariableName", v.getId());
            startActivity(intent15);

        case R.id.button16:
            Intent intent16 = new Intent(this, MainActivity1.class);
            intent16.putExtra("intVariableName", v.getId());
            startActivity(intent16);

        case R.id.button17:
            Intent intent17 = new Intent(this, MainActivity1.class);
            intent17.putExtra("intVariableName", v.getId());
            startActivity(intent17);

        case R.id.button18:
            Intent intent18= new Intent(this, MainActivity1.class);
            intent18.putExtra("intVariableName", v.getId());
            startActivity(intent18);

    }
}
}
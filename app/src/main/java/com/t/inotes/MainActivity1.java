package com.t.inotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class MainActivity1 extends AppCompatActivity {
    PDFView testpdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("intVariableName", 0);
        if(intValue == R.id.button1) {

            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            testpdf.fromAsset("Android Note.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button2) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            testpdf.fromAsset("Python iNotes.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button3) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            testpdf.fromAsset("Java Cheatsheet.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button4) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            testpdf.fromAsset("NodeJs.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button5) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            //C Notes----------------------->
            testpdf.fromAsset("CiNotes.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button6) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            //c ++ Notes--------------------------------------->
            testpdf.fromAsset("C++ CheetSheet.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button7) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            //Angular Notes--------------------------------------->
            testpdf.fromAsset("HTML Cheatsheet.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button8) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            //React Notes---------------------------------------->
            testpdf.fromAsset("CSS Cheatsheet.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button9) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            //NodeJs Notes------------------------------------------->
            testpdf.fromAsset("JavaScript Cheatsheet.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button10) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            //Server Management Notes------------------------------>
            testpdf.fromAsset("Server Setup.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
//                        .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button11) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            //Php Notes ---------------------------------------->
            testpdf.fromAsset("Php.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();

        }
        else if (intValue == R.id.button12) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);
            //Mongo DB Notes-------------------------->
            testpdf.fromAsset("MongoDb.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button13) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);

            testpdf.fromAsset("MySQL.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button14) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);

            testpdf.fromAsset("FlaskNotes.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button15) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);

            testpdf.fromAsset("GitHub Notes.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button16) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);

            testpdf.fromAsset("DjangoNotes.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button17) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);

            testpdf.fromAsset("MongoDb.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else if (intValue == R.id.button18) {
            testpdf = (PDFView) findViewById(R.id.pdfviewer);

            testpdf.fromAsset("MongoDb.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(1)
                    .load();
        }
        else {
            Toast.makeText(this, "Error Found", Toast.LENGTH_SHORT).show();
        }

    }



}



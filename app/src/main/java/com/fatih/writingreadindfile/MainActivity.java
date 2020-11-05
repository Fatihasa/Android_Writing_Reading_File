package com.fatih.writingreadindfile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            FileOutputStream fos = openFileOutput("File",MODE_PRIVATE);
            String s = "File written";



        }catch (Exception e){

        }

        try{

        }catch (Exception e){

        }
    }
}
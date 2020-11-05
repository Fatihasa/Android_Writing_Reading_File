package com.fatih.writingreadindfile;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            FileOutputStream fos = openFileOutput("File",MODE_PRIVATE);
            String s = "File written";
            fos.write(s.getBytes());
            fos.close();

        }catch (Exception e){

        }

        try{
            FileInputStream fis = openFileInput("File");
            InputStreamReader isr = new InputStreamReader(fis);
            TextView textView = findViewById(R.id.hello);
            BufferedReader bf =new BufferedReader(isr);
            textView.setText(bf.readLine());


        }catch (Exception e){

        }
    }
}
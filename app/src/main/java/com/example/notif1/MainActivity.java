package com.example.notif1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MyApp","I am here");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
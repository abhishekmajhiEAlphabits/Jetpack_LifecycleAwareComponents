package com.example.jetpackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Event", "Owner onCreate");

        getLifecycle().addObserver(new MainActivityObserver());
    }

    protected void onStart() {

        super.onStart();
        Log.d("Event", "Owner onStart");

    }

    protected void onResume() {
        super.onResume();
        Log.d("Event", "Owner onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.d("Event", "Owner onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.d("Event", "Owner onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Event", "Owner onDestroy");

    }
}
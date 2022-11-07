package com.example.olman;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startNewActivity(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }
    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }
}
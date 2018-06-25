package com.example.android.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hey there this is a Button !",Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"My Name is Mayank Khanna :)",Toast.LENGTH_SHORT).show();
            }
        });


        Log.d("activityState","Created");
    }

    @Override
    protected void onStart() {
        Log.d("activityState", "Started");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("activityState", "Resumed");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("activityState","Paused");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("activityState", "Stopped");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("activityState", "Destroyed");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("activityState","Restarted");
        super.onRestart();
    }
}

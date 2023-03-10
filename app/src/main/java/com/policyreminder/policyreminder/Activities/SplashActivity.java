package com.policyreminder.policyreminder.Activities;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.policyreminder.policyreminder.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread thread  = new Thread(() -> {
            try {
                sleep(2000);
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();



    }
}
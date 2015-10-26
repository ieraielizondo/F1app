package com.example.ierai.f1app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Ierai on 07/10/2015.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread miHilo = new Thread()
        {
            @Override
            public void run(){
                try {
                    sleep(2500);
                    Intent iPrincipal = new Intent(getApplicationContext(),Principal_NavView.class);
                    startActivity(iPrincipal);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        miHilo.start();


    }
}

package com.rutasde.trekking;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chalten (View v)
    {
        Intent intent = new Intent(getApplicationContext(), ChaltenActivity.class);
        startActivity(intent);
       // final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        //v.startAnimation(blink);
        //overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);

    }
    public void torres (View v)
    {
        Intent intent = new Intent(getApplicationContext(), TorresActivity.class);
        startActivity(intent);


    }

    public void ajustes (View v)
    {
        Intent intent = new Intent(getApplicationContext(), AjustesActivity.class);
        startActivity(intent);


    }

    public void feedback (View v)
    {
        Intent intent = new Intent(getApplicationContext(), FeedbackActivity.class);
        startActivity(intent);


    }

    public void pronostico (View v)
    {
        Intent intent = new Intent(getApplicationContext(), PronosticoActivity.class);
        startActivity(intent);


    }

    public void rutas (View v)
    {
        Intent intent = new Intent(getApplicationContext(), RutasActivity.class);
        startActivity(intent);


    }

    public void acerca (View v)
    {
        Intent intent = new Intent(getApplicationContext(), AcercaActivity.class);
        startActivity(intent);


    }


}

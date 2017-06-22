package com.rutasde.trekking;

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
}

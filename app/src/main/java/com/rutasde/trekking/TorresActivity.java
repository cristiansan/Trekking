package com.rutasde.trekking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Cnc on 29/4/2017.
 */

public class TorresActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_torres);

        }

        public void back(View v)
        {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            // final Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
            //v.startAnimation(blink);
            //overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);

        }
}




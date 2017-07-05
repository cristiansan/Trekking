package com.rutasde.trekking;

/**
 * Created by Cnc on 4/7/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Splash extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      /*  // Native ads --------------------------------------------------------------
        NativeExpressAdView adView = (NativeExpressAdView) findViewById(R.id.adView);
        adView.loadAd(new AdRequest.Builder().build());
        // end ads -----------------------------------------------------------------*/


        int secondsDelayed = 1;
        new android.os.Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                finish();
              /*  overridePendingTransition(R.anim.fadein, R.anim.fadeout);*/

            }
        }, secondsDelayed * 3000);
    }
}
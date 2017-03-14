package com.example.evan.eShop;


import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * Created by EVAN on 1/8/2017.
 */

public class Spalash extends Activity {

    ProgressBar mprogressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalash);
        //Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();

            Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.anim_down);
        ImageView img =(ImageView)findViewById(R.id.imageView);
        img.setAnimation(anim1);

        mprogressBar = (ProgressBar) findViewById(R.id.progressBar);
        ObjectAnimator anim = ObjectAnimator.ofInt(mprogressBar, "progress", 0, 100);
        anim.setDuration(4000);
        anim.setInterpolator(new DecelerateInterpolator());
        anim.start();

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(Spalash.this,MainActivity.class));
                finish();

            }
        },3000);
    }
}
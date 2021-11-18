package com.example.bda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView logo;
    private TextView title, slogan;


    Animation topAnimation, bottomAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        /* connecting the views in activity_splash_screen.xml to the java file so that we can perform more functionality */
        logo=findViewById(R.id.logo);
        title=findViewById(R.id.title);
        slogan=findViewById(R.id.slogan);

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation= AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        /* let set the animation to the views */
        logo.setAnimation(topAnimation);
        title.setAnimation(bottomAnimation);
        slogan.setAnimation(bottomAnimation);

        /* after animation is done we want to jump to another activity */

        int SPLASH_SCREEN= 4300;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashScreenActivity.this, LoginActivity.class );
                startActivity(intent);
                finish();


            }
        },SPLASH_SCREEN);


        /* let us create this login activity, right click on bda2, new, activity, empty activity  */
        /* once the splash screen is complete we want to jump to login activity  */



    }
}
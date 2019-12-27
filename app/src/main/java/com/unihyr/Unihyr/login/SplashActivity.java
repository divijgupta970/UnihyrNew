package com.unihyr.Unihyr.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import com.unihyr.Unihyr.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.logo_fade_in);
        ivLogo=findViewById(R.id.ivLogo);
        ivLogo.startAnimation(animation);
        findViewById(R.id.tvLabel).startAnimation(AnimationUtils.loadAnimation(this,R.anim.logo_fade_in));
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animationEndFunction();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    private void animationEndFunction() {
        Intent intent = new Intent(this, LoginActivity.class);
        String imageTransition = getString(R.string.transition_image);
        Pair<View, String> p1 = Pair.create((View) ivLogo, imageTransition);

        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) SplashActivity.this, p1);
        startActivity(intent, options.toBundle());
        finish();
    }

}

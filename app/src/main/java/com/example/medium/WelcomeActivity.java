package com.example.medium;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcomeText, amazingText;
    Button goButton;
    LottieAnimationView animationView;
    Animation animation_one, animation_two, animation_three, animation_four;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        goButton = findViewById(R.id.goButton);
        welcomeText = findViewById(R.id.welcomeText);
        amazingText = findViewById(R.id.amazingText);
        animationView = findViewById(R.id.animationView);
        animation_one = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.fade_in);
        animation_two = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.left_to_right);
        animation_four = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.right_to_left);


        welcomeText.startAnimation(animation_one);
        amazingText.startAnimation(animation_one);
        animationView.setAnimation(animation_two);
        goButton.setAnimation(animation_four);


        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, InformationActivity.class);
                startActivity(intent);
                finish();
            }
        });




    } // onCreate Method End Here =======================





} // Public Class End Here =======================
package com.example.matala1;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity2 extends AppCompatActivity {
    private Button buttonLike;
    private TextView textLikeCounter;
    private int likeCount = 0;
    private boolean isLiked = false;
    private Button  buttonBack, buttonNext;
    private ImageView imageView;
    private TextView textPhoneNumber, textEmail, textHopes ;


    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile2);
        buttonNext=findViewById(R.id.buttonNext);
        buttonBack=findViewById(R.id.buttonBack);
        imageView = findViewById(R.id.imageView);
        textPhoneNumber = findViewById(R.id.textPhoneNumber);
        textEmail = findViewById(R.id.textEmail);
        textHopes= findViewById(R.id.textHopes);

        textPhoneNumber.setText("Phone number: +975-55555555");
        textEmail.setText("Email: jonyd@gmail.com");
        textHopes.setText("Hopes: dancing");



        buttonBack.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        buttonBack.setBackgroundColor(getResources().getColor(R.color.colorPressed)); // Red when pressed
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        buttonBack.setBackgroundColor(getResources().getColor(R.color.colorPrimary)); // Blue when not pressed
                        break;
                }
                return false;
            }
        });

        buttonNext.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        buttonNext.setBackgroundColor(getResources().getColor(R.color.colorPressed)); // Red when pressed
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        buttonNext.setBackgroundColor(getResources().getColor(R.color.colorPrimary)); // Blue when not pressed
                        break;
                }
                return false;
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity2.this,ProfileActivity1.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); // Swipe to left

            }
        });
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity2.this,ProfileActivity3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // Swipe to right

            }
        });

        buttonLike = findViewById(R.id.buttonLike);
        textLikeCounter = findViewById(R.id.textLikeCounter);

        // Set up the Like button
        buttonLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeCount++; // Increment the counter
                textLikeCounter.setText("Likes: " + likeCount); // Update the counter display
            }
        });
    }

    // Reset the counter when the activity is exited
    @Override
    protected void onStop() {
        super.onStop();
        likeCount = 0; // Reset the counter
        if (textLikeCounter != null) {
            textLikeCounter.setText("Likes: 0"); // Update the counter display
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Reset the color of the buttons when the activity is resumed
        buttonBack.setBackgroundColor(getResources().getColor(R.color.colorPrimary)); // Blue
        buttonNext.setBackgroundColor(getResources().getColor(R.color.colorPrimary)); // Blue
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Reset the color of the buttons when the activity is paused to prevent lingering state
        buttonBack.setBackgroundColor(getResources().getColor(R.color.colorPrimary)); // Blue
        buttonNext.setBackgroundColor(getResources().getColor(R.color.colorPrimary)); // Blue
    }




}
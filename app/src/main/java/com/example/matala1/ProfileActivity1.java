package com.example.matala1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;



public class ProfileActivity1 extends AppCompatActivity {
    private Button buttonLike;
    private TextView textLikeCounter;
    private int likeCount = 0;
    private boolean isLiked = false;
    private Button buttonMenu1, buttonMenu2, buttonMenu3;
    private ImageView imageView;
    private TextView textPhoneNumber, textEmail, textHopes;


    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile1);

        buttonMenu1 = findViewById(R.id.buttonMenu1);
        buttonMenu2 = findViewById(R.id.buttonMenu2);
        buttonMenu3 = findViewById(R.id.buttonMenu3);
        imageView = findViewById(R.id.imageView);
        textPhoneNumber = findViewById(R.id.textPhoneNumber);
        textEmail = findViewById(R.id.textEmail);
        textHopes = findViewById(R.id.textHopes);

        textPhoneNumber.setText("Phone number: +971-23456789");
        textEmail.setText("Email: leo21@gmail.com");
        textHopes.setText("Hopes: acting");


        buttonMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity1.this, ProfileActivity1.class);
                startActivity(intent);
            }
        });
        buttonMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity1.this, ProfileActivity2.class);
                startActivity(intent);
            }
        });
        buttonMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity1.this, ProfileActivity3.class);
                startActivity(intent);
            }
        });

        buttonLike = findViewById(R.id.buttonLike);
        textLikeCounter = findViewById(R.id.textLikeCounter);

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
}


package com.example.matala1;

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

    private Button buttonMenu1, buttonMenu2, buttonMenu3;
    private ImageView imageView;
    private TextView textPhoneNumber, textEmail, textHopes ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile1);

        buttonMenu1=findViewById(R.id.buttonMenu1);
        buttonMenu2=findViewById(R.id.buttonMenu2);
        buttonMenu3=findViewById(R.id.buttonMenu3);
        imageView = findViewById(R.id.imageView);
        textPhoneNumber = findViewById(R.id.textPhoneNumber);
        textEmail = findViewById(R.id.textEmail);
        textHopes= findViewById(R.id.textHopes);

        textPhoneNumber.setText("123456789");
        textEmail.setText("leo21@gmail.com");
        textHopes.setText("acting");


        buttonMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity1.this,ProfileActivity1.class);
                startActivity(intent);
            }
        });
        buttonMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity1.this,ProfileActivity2.class);
                startActivity(intent);
            }
        });
        buttonMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity1.this,ProfileActivity3.class);
                startActivity(intent);
            }
        });






    }
}
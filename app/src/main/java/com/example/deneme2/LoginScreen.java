package com.example.deneme2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    public Button login_Screen;
    public TextView sign_Up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        login_Screen = findViewById(R.id.btn_login_screen);
        sign_Up = (TextView) findViewById(R.id.sign_up);


        login_Screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent login_screen = new Intent(LoginScreen.this, MainActivity.class);
                startActivity(login_screen);
            }
        });


        sign_Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(LoginScreen.this, RegisterScreen.class);
                startActivity(myIntent);
            }
        });

    }
}
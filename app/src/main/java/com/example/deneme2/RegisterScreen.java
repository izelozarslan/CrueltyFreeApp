package com.example.deneme2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterScreen extends AppCompatActivity {

    public Button register_Screen;
    public TextView register_Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        register_Screen = findViewById(R.id.btn_register_screen);
        register_Txt = findViewById(R.id.register_screen);


        register_Screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent register_screen = new Intent(RegisterScreen.this, MainActivity.class);
                startActivity(register_screen);
            }
        });

        register_Txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(RegisterScreen.this, LoginScreen.class);
                startActivity(myIntent);
            }
        });

    }
}
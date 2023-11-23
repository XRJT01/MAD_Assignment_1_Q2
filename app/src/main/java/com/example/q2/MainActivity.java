package com.example.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent Next = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(Next);
                Toast.makeText(getApplicationContext(), "Welcom to the plant",Toast.LENGTH_SHORT).show();

            }
        });



    }
}
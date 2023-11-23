package com.example.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = findViewById(R.id.button2);

        button.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent Next = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(Next);
                Toast.makeText(getApplicationContext(), "Welcom to the plant",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
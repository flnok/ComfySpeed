package com.uddd.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnsi;
    private Button btncreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncreate = findViewById(R.id.button_main_create);
        btnsi = findViewById(R.id.button_main_signin);

        btnsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoHome = new Intent(MainActivity.this,Reports.class);
                startActivity(gotoHome);

            }
        });
    }
}

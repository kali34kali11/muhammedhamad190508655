package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tatli2 extends AppCompatActivity {
    TextView kunf ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatli2);
      this.setTitle("hatay yöresel tatlıları");
        kunf = (TextView) findViewById(R.id.kunf);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        kunf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kun = new Intent(tatli2.this,kunfe.class);
                startActivity(kun);
            }
        });


    }
}
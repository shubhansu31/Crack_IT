package com.e.crackit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView new_session , past_session;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new_session = (TextView)findViewById(R.id.newSession);
        past_session = (TextView)findViewById(R.id.pastSession);
        new_session.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity2.this,MainActivity.class);
                MainActivity2.this.startActivity(intent);
            }
        });
        past_session.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity2.this,MainActivity3.class);
                MainActivity2.this.startActivity(intent);
            }
        });

    }
}
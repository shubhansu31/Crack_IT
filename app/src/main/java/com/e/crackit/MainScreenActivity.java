package com.e.crackit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainScreenActivity extends AppCompatActivity {

    TextView new_session , past_session;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        new_session = (TextView)findViewById(R.id.newSession);
        past_session = (TextView)findViewById(R.id.pastSession);
        new_session.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainScreenActivity.this, InputMainInfoActivity.class);
                MainScreenActivity.this.startActivity(intent);
            }
        });
        past_session.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainScreenActivity.this, MainTopicShowActivity.class);
                MainScreenActivity.this.startActivity(intent);
            }
        });

    }
}
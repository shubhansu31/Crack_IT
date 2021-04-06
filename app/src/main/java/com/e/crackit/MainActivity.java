package com.e.crackit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText main_name , sub_name , question_number;
    private String mainName , subName;
    private int questionNumber;
    Button submit_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_name = (EditText)findViewById(R.id.mainTopicName);
        sub_name = (EditText)findViewById(R.id.subTopicName);
        question_number = (EditText)findViewById(R.id.questionNumber);
        submit_main = (Button)findViewById(R.id.button);
        Context context = getApplicationContext();
        submit_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainName = main_name.getText().toString();
                subName = sub_name.getText().toString();
                questionNumber = Integer.parseInt(question_number.getText().toString());
                Toast.makeText(context,mainName + " " + subName + " " + questionNumber , Toast.LENGTH_LONG).show();
            }
        });
    }
}
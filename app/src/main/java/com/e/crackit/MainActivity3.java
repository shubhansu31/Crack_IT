package com.e.crackit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    ArrayList<MainTopic> mainTopicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rvMainTopic);

        mainTopicList = new ArrayList<MainTopic>();
        for(int i = 0 ; i < 10 ; i++){
            MainTopic mainTopic = new MainTopic();
            mainTopic.TopicName = "Random";
            mainTopicList.add(mainTopic);
        }

        MainTopicAdapter mainTopicAdapter = new MainTopicAdapter(mainTopicList);
        recyclerView.setAdapter(mainTopicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
package com.e.crackit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainTopicShowActivity extends AppCompatActivity {

    ArrayList<MainTopic> mainTopicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_topic_show);

        RecyclerView recyclerView = findViewById(R.id.rvMainTopic);

        mainTopicList = new ArrayList<MainTopic>();
        for(int i = 0 ; i < 10 ; i++){
            MainTopic mainTopic = new MainTopic();
            mainTopic.TopicName = "Random Main Topic";
            mainTopicList.add(mainTopic);
        }

        MainTopicAdapter mainTopicAdapter = new MainTopicAdapter(mainTopicList);
        recyclerView.setAdapter(mainTopicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
package com.e.crackit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SubTopicShowActivity extends AppCompatActivity {

    ArrayList<SubTopic> subTopicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_topic_show);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rvSubTopic);

        subTopicList = new ArrayList<SubTopic>();
        for(int i = 0 ; i < 10 ; i++){
            SubTopic subTopic = new SubTopic();
            subTopic.Name = "Random Sub Topic";
            subTopicList.add(subTopic);
        }

        SubTopicAdapter subTopicAdapter = new SubTopicAdapter(subTopicList);
        recyclerView.setAdapter(subTopicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
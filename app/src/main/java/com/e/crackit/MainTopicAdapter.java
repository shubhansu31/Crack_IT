package com.e.crackit;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainTopicAdapter extends RecyclerView.Adapter<MainTopicAdapter.ViewHolder> {

    private List<MainTopic> mainTopicList;

    public MainTopicAdapter(List<MainTopic> currentTopicNames) {
        mainTopicList = currentTopicNames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View mainTopicView = inflater.inflate(R.layout.maintopic, parent, false);
        ViewHolder viewHolder = new ViewHolder(mainTopicView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MainTopic mainTopic = mainTopicList.get(position);
        TextView textView = holder.topicName;
        textView.setText(mainTopic.TopicName);
    }

    @Override
    public int getItemCount() {
        return mainTopicList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView topicName;

        public ViewHolder(View itemView) {
            super(itemView);
            topicName = (TextView) itemView.findViewById(R.id.topicName);
        }
    }
}

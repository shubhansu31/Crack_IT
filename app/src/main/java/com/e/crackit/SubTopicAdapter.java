package com.e.crackit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubTopicAdapter extends RecyclerView.Adapter<SubTopicAdapter.ViewHolder> {

    private List<SubTopic> subTopicList;

    public SubTopicAdapter(List<SubTopic> subTopicLists) {
        subTopicList = subTopicLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View subTopicView = inflater.inflate(R.layout.subtopic, parent, false);
        ViewHolder viewHolder = new ViewHolder(subTopicView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SubTopic subTopic = subTopicList.get(position);
        TextView textView = holder.subTopicName;
        textView.setText(subTopic.Name);
    }

    @Override
    public int getItemCount() {
        return subTopicList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView subTopicName;

        public ViewHolder(View itemView) {
            super(itemView);
            subTopicName = (TextView) itemView.findViewById(R.id.subTopicName);
        }
    }
}

package com.e.crackit;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "MainTopic")
public class MainTopic {
    @PrimaryKey
    public int mainId;

    @ColumnInfo(name = "Topic")
    public String TopicName;
}

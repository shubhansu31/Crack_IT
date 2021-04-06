package com.e.crackit;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class SubTopic {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "Name")
    public String Name;

    @ColumnInfo(name = "Number")
    public int numberOfQestions;
}

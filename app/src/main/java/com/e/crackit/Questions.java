package com.e.crackit;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Questions {
    @PrimaryKey
    public int questionId;

    @ColumnInfo(name = "subId")
    public int subId;

    @ColumnInfo(name = "Time")
    public int time;

    @ColumnInfo(name = "Number")
    public int questionNumber;

    @ColumnInfo(name = "Note")
    public String note;

    @ColumnInfo(name = "Correct")
    public boolean correct;
}

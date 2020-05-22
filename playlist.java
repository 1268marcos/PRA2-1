package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;


@Entity(tableName ="playlists")



public class Playlist {

    public playlist(String mCreationDate, @NonNull String mTitle, String mSinger, int mScore) {
        this.mCreationDate = mCreationDate;
        this.mTitle = mTitle;
        this.mSinger = mSinger;
        this.mScore = mScore;
    }

    @NonNull
    @ColumnInfo(name = "playlistId")
    @PrimaryKey(autoGenerate = true)
    private int mId;

    private String mCreationDate;

    @NonNull
    @ColumnInfo(name = "playlistTitle")
    private String mTitle;

    private String mSinger;

    private int mScore;

    public String getmCreationDate() {
        return mCreationDate;
    }

    public void setmCreationDate(String mCreationDate) {
        this.mCreationDate = mCreationDate;
    }

    @NonNull
    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(@NonNull String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmSinger() {
        return mSinger;
    }

    public void setmSinger(String mSinger) {
        this.mSinger = mSinger;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }
}

package de.haw_landshut.hawmobile.base;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class CustomTimetable{

    public CustomTimetable(){

    }

    @Ignore
    public CustomTimetable(int key, String prof,String fach,String raum,int color) {
        this.timetablekey=key;
        this.prof=prof;
        this.fach=fach;
        this.raum=raum;
        this.color=color;


    }
    @PrimaryKey
    private long timetablekey;

    @ColumnInfo
    private String prof;

    @ColumnInfo
    private String fach;

    @ColumnInfo
    private String raum;

    @ColumnInfo
    private int color;

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }


    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public long getTimetablekey() {
        return timetablekey;
    }

    public void setTimetablekey(long timetablekey) {
        this.timetablekey = timetablekey;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
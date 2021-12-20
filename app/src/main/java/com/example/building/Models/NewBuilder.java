package com.example.building.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NewBuilder {

    @PrimaryKey(autoGenerate = true)
    public long id;
    public String shrotName;
    public String fullName;
    public String city;
    public String street;
    public String phone;
    public String webSite;
    public int yearCreating;
    public int countUseByBrends;
    public int countSellFlat;
    public int countBuildingsFlat;
    public int countEndedFlat;
    public int countRegions;
    public int mBuild;
    public int mDelayBuild;
    public double mUtoch;
    public int rigions;
    public int organizations;
    public int gk;
    public String photoUrl;


    @Override
    public String toString() {
        return "NewBuilder{" +
                "id=" + id +
                ", shrotName='" + shrotName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", phone='" + phone + '\'' +
                ", webSite='" + webSite + '\'' +
                ", yearCreating=" + yearCreating +
                ", countUseByBrends=" + countUseByBrends +
                ", countSellFlat=" + countSellFlat +
                ", countBuildingsFlat=" + countBuildingsFlat +
                ", countEndedFlat=" + countEndedFlat +
                ", countRegions=" + countRegions +
                ", mBuild=" + mBuild +
                ", mDelayBuild=" + mDelayBuild +
                ", mUtoch=" + mUtoch +
                ", rigions=" + rigions +
                ", organizations=" + organizations +
                ", gk=" + gk +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }
}

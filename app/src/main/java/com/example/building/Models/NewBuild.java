package com.example.building.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NewBuild {

    @PrimaryKey(autoGenerate = true)
    public long id;

    public String nameBuild;
    public String typeBuilding;
    public String region;
    public String city;
    public String okryg;
    public String rayon;
    public String street;
    public String metro;
    public String brand;
    public String builder;
    public String sellPhone;
    public String webSite;
    public String countSell;
    public boolean military;
    public boolean motherCapital;
    public String yearStart;
    public String square;
    public String allCount;
    public String homeInGK;
    public String floarCount;
    public String parkCount;
    public String topGk;
    public String markERZ;
    public double m1_1;
    public double m1_2;
    public double m1_3;
    public double m2_1;
    public double m2_2;
    public double m2_3;
    public double m2_4;
    public double m2_5;
    public double m3_1;
    public double m3_2;
    public double m3_3;
    public double m3_4;
    public double m3_5;
    public double m3_6;
    public double m4_1;
    public double m4_2;
    public double m4_3;
    public double m4_4;
    public double m5_1;
    public double m5_2;
    public double m5_3;
    public double m5_4;
    public double m5_5;
    public double m5_6;
    public double m5_7;
    public double m5_8;
    public double m5_9;
    public double m5_10;
    public double m5_11;
    public double m5_12;
    public double m5_13;
    public double m5_14;
    public double m6_1;
    public double m6_2;
    public double m6_3;
    public double m6_4;
    public double m6_5;
    public double m7_1;
    public double m7_2;
    public double m7_3;
    public double m7_4;
    public double m7_5;
    public double m8_1;
    public double m8_2;
    public double m8_3;
    public double m8_4;
    public double m8_5;
    public double m8_6;
    public double m8_7;
    public double m8_8;
    public double m8_9;
    public double m8_10;
    public double m8_11;
    public double m8_12;
    public double m8_13;
    public double m9_1;
    public double m9_2;
    public double m9_3;
    public double m9_4;
    public double m9_5;
    public double m9_6;
    public double m9_7;
    public double m9_8;
    public double m9_9;
    public double m10_1;
    public double m10_2;
    public double m10_3;
    public double m10_4;
    public double m10_5;
    public double m10_6;
    public double m10_7;
    public double m10_8;
    public double m10_9;
    public double m10_10;
    public double m10_11;
    public double m10_12;
    public double m10_13;
    public double m10_14;
    public double m10_15;
    public double m10_16;
    public double m11_1;
    public double m11_2;
    public double m11_3;
    public double m11_4;
    public double m11_5;
    public double m11_6;
    public double m11_7;
    public double m12_1;
    public double m12_2;
    public double m12_3;
    public double m12_4;
    public double m12_5;
    public double m12_6;
    public double m12_7;
    public double m12_8;
    public double m13_1;
    public double m13_2;
    public double m13_3;
    public double m13_4;
    public double m13_5;
    public double m13_6;
    public double m14_1;
    public double m14_2;
    public double m14_3;
    public double m14_4;
    public double m15_1;
    public double m15_2;
    public double m15_3;
    public double m15_4;
    public double m15_5;
    public double m15_6;
    public double m15_7;
    public double m15_8;
    public double m15_9;
    public double m15_10;
    public double m15_11;
    public double m15_12;
    public double m15_13;
    public double m15_14;
    public double m16_1;
    public double m16_2;
    public double m16_3;
    public double m16_4;
    public double m16_5;
    public double m16_6;
    public double m17_1;
    public double m17_2;
    public double m17_3;
    public double m17_4;
    public double m17_5;
    public double m17_6;
    public double m17_7;
    public double m17_8;
    public long builderId;
    public String photoUrl;


    @Override
    public String toString() {
        return "NewBuild{" +
                "id=" + id +
                ", nameBuild='" + nameBuild + '\'' +
                ", typeBuilding='" + typeBuilding + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", okryg='" + okryg + '\'' +
                ", rayon='" + rayon + '\'' +
                ", street='" + street + '\'' +
                ", metro='" + metro + '\'' +
                ", brand='" + brand + '\'' +
                ", builder='" + builder + '\'' +
                ", sellPhone='" + sellPhone + '\'' +
                ", webSite='" + webSite + '\'' +
                ", countSell='" + countSell + '\'' +
                ", military=" + military +
                ", motherCapital=" + motherCapital +
                ", yearStart='" + yearStart + '\'' +
                ", square='" + square + '\'' +
                ", allCount='" + allCount + '\'' +
                ", homeInGK='" + homeInGK + '\'' +
                ", floarCount='" + floarCount + '\'' +
                ", parkCount='" + parkCount + '\'' +
                ", topGk='" + topGk + '\'' +
                ", markERZ='" + markERZ + '\'' +
                ", m1_1=" + m1_1 +
                ", m1_2=" + m1_2 +
                ", m1_3=" + m1_3 +
                ", m2_1=" + m2_1 +
                ", m2_2=" + m2_2 +
                ", m2_3=" + m2_3 +
                ", m2_4=" + m2_4 +
                ", m2_5=" + m2_5 +
                ", m3_1=" + m3_1 +
                ", m3_2=" + m3_2 +
                ", m3_3=" + m3_3 +
                ", m3_4=" + m3_4 +
                ", m3_5=" + m3_5 +
                ", m3_6=" + m3_6 +
                ", m4_1=" + m4_1 +
                ", m4_2=" + m4_2 +
                ", m4_3=" + m4_3 +
                ", m4_4=" + m4_4 +
                ", m5_1=" + m5_1 +
                ", m5_2=" + m5_2 +
                ", m5_3=" + m5_3 +
                ", m5_4=" + m5_4 +
                ", m5_5=" + m5_5 +
                ", m5_6=" + m5_6 +
                ", m5_7=" + m5_7 +
                ", m5_8=" + m5_8 +
                ", m5_9=" + m5_9 +
                ", m5_10=" + m5_10 +
                ", m5_11=" + m5_11 +
                ", m5_12=" + m5_12 +
                ", m5_13=" + m5_13 +
                ", m5_14=" + m5_14 +
                ", m6_1=" + m6_1 +
                ", m6_2=" + m6_2 +
                ", m6_3=" + m6_3 +
                ", m6_4=" + m6_4 +
                ", m6_5=" + m6_5 +
                ", m7_1=" + m7_1 +
                ", m7_2=" + m7_2 +
                ", m7_3=" + m7_3 +
                ", m7_4=" + m7_4 +
                ", m7_5=" + m7_5 +
                ", m8_1=" + m8_1 +
                ", m8_2=" + m8_2 +
                ", m8_3=" + m8_3 +
                ", m8_4=" + m8_4 +
                ", m8_5=" + m8_5 +
                ", m8_6=" + m8_6 +
                ", m8_7=" + m8_7 +
                ", m8_8=" + m8_8 +
                ", m8_9=" + m8_9 +
                ", m8_10=" + m8_10 +
                ", m8_11=" + m8_11 +
                ", m8_12=" + m8_12 +
                ", m8_13=" + m8_13 +
                ", m9_1=" + m9_1 +
                ", m9_2=" + m9_2 +
                ", m9_3=" + m9_3 +
                ", m9_4=" + m9_4 +
                ", m9_5=" + m9_5 +
                ", m9_6=" + m9_6 +
                ", m9_7=" + m9_7 +
                ", m9_8=" + m9_8 +
                ", m9_9=" + m9_9 +
                ", m10_1=" + m10_1 +
                ", m10_2=" + m10_2 +
                ", m10_3=" + m10_3 +
                ", m10_4=" + m10_4 +
                ", m10_5=" + m10_5 +
                ", m10_6=" + m10_6 +
                ", m10_7=" + m10_7 +
                ", m10_8=" + m10_8 +
                ", m10_9=" + m10_9 +
                ", m10_10=" + m10_10 +
                ", m10_11=" + m10_11 +
                ", m10_12=" + m10_12 +
                ", m10_13=" + m10_13 +
                ", m10_14=" + m10_14 +
                ", m10_15=" + m10_15 +
                ", m10_16=" + m10_16 +
                ", m11_1=" + m11_1 +
                ", m11_2=" + m11_2 +
                ", m11_3=" + m11_3 +
                ", m11_4=" + m11_4 +
                ", m11_5=" + m11_5 +
                ", m11_6=" + m11_6 +
                ", m11_7=" + m11_7 +
                ", m12_1=" + m12_1 +
                ", m12_2=" + m12_2 +
                ", m12_3=" + m12_3 +
                ", m12_4=" + m12_4 +
                ", m12_5=" + m12_5 +
                ", m12_6=" + m12_6 +
                ", m12_7=" + m12_7 +
                ", m12_8=" + m12_8 +
                ", m13_1=" + m13_1 +
                ", m13_2=" + m13_2 +
                ", m13_3=" + m13_3 +
                ", m13_4=" + m13_4 +
                ", m13_5=" + m13_5 +
                ", m13_6=" + m13_6 +
                ", m14_1=" + m14_1 +
                ", m14_2=" + m14_2 +
                ", m14_3=" + m14_3 +
                ", m14_4=" + m14_4 +
                ", m15_1=" + m15_1 +
                ", m15_2=" + m15_2 +
                ", m15_3=" + m15_3 +
                ", m15_4=" + m15_4 +
                ", m15_5=" + m15_5 +
                ", m15_6=" + m15_6 +
                ", m15_7=" + m15_7 +
                ", m15_8=" + m15_8 +
                ", m15_9=" + m15_9 +
                ", m15_10=" + m15_10 +
                ", m15_11=" + m15_11 +
                ", m15_12=" + m15_12 +
                ", m15_13=" + m15_13 +
                ", m15_14=" + m15_14 +
                ", m16_1=" + m16_1 +
                ", m16_2=" + m16_2 +
                ", m16_3=" + m16_3 +
                ", m16_4=" + m16_4 +
                ", m16_5=" + m16_5 +
                ", m16_6=" + m16_6 +
                ", m17_1=" + m17_1 +
                ", m17_2=" + m17_2 +
                ", m17_3=" + m17_3 +
                ", m17_4=" + m17_4 +
                ", m17_5=" + m17_5 +
                ", m17_6=" + m17_6 +
                ", m17_7=" + m17_7 +
                ", m17_8=" + m17_8 +
                ", builderId=" + builderId +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }
}

package com.example.building.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.building.DB.AppDatabase;
import com.example.building.DB.BuildDao;
import com.example.building.Models.NewBuild;
import com.example.building.Models.NewBuilder;
import com.example.building.R;

import java.text.DecimalFormat;
//activity в якому відображається конкретна будівля
public class ShowBuildongActivity extends AppCompatActivity {

    TextView name,type,region,city,okryg,rayon,street,
             metro,brand,builder,seelPhone,website,countSell,
             military,motherCapital,yearStart,square,allCount,homeIn,
             floarCount,parkCount,topGk,markERZ;

    TextView sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8,sum9,sum10,sum11,sum12,sum13,sum14,sum15,sum16,sum17;
    TextView m1_1,m1_2,m1_3;
    TextView m2_1,m2_2,m2_3,m2_4,m2_5;
    TextView m3_1,m3_2,m3_3,m3_4,m3_5,m3_6;
    TextView m4_1,m4_2,m4_3,m4_4;
    TextView m5_1,m5_2,m5_3,m5_4,m5_5,m5_6,m5_7,m5_8,m5_9,m5_10,m5_11,m5_12,m5_13,m5_14;
    TextView m6_1,m6_2,m6_3,m6_4,m6_5;
    TextView m7_1,m7_2,m7_3,m7_4,m7_5;
    TextView m8_1,m8_2,m8_3,m8_4,m8_5,m8_6,m8_7,m8_8,m8_9,m8_10,m8_11,m8_12,m8_13;
    TextView m9_1,m9_2,m9_3,m9_4,m9_5,m9_6,m9_7,m9_8,m9_9;
    TextView m10_1,m10_2,m10_3,m10_4,m10_5,m10_6,m10_7,m10_8,m10_9,m10_10,m10_11,m10_12,m10_13,m10_14,m10_15,m10_16;
    TextView m11_1,m11_2,m11_3,m11_4,m11_5,m11_6,m11_7;
    TextView m12_1,m12_2,m12_3,m12_4,m12_5,m12_6,m12_7,m12_8;
    TextView m13_1,m13_2,m13_3,m13_4,m13_5,m13_6;
    TextView m14_1,m14_2,m14_3,m14_4;
    TextView m15_1,m15_2,m15_3,m15_4,m15_5,m15_6,m15_7,m15_8,m15_9,m15_10,m15_11,m15_12,m15_13,m15_14;
    TextView m16_1,m16_2,m16_3,m16_4,m16_5,m16_6;
    TextView m17_1,m17_2,m17_3,m17_4,m17_5,m17_6,m17_7,m17_8;
    ImageView imageView;
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_buildong);

        sum1=findViewById(R.id.tv_b_sum1);
        sum2=findViewById(R.id.tv_b_sum2);
        sum3=findViewById(R.id.tv_b_sum3);
        sum4=findViewById(R.id.tv_b_sum4);
        sum5=findViewById(R.id.tv_b_sum5);
        sum6=findViewById(R.id.tv_b_sum6);
        sum7=findViewById(R.id.tv_b_sum7);
        sum8=findViewById(R.id.tv_b_sum8);
        sum9=findViewById(R.id.tv_b_sum9);
        sum10=findViewById(R.id.tv_b_sum10);
        sum11=findViewById(R.id.tv_b_sum11);
        sum12=findViewById(R.id.tv_b_sum12);
        sum13=findViewById(R.id.tv_b_sum13);
        sum14=findViewById(R.id.tv_b_sum14);
        sum15=findViewById(R.id.tv_b_sum15);
        sum16=findViewById(R.id.tv_b_sum16);
        sum17=findViewById(R.id.tv_b_sum17);

        m1_1=findViewById(R.id.tv_b_m_1_1);
        m1_2=findViewById(R.id.tv_b_m_1_2);
        m1_3=findViewById(R.id.tv_b_m_1_3);

        m2_1=findViewById(R.id.tv_b_m_2_1);
        m2_2=findViewById(R.id.tv_b_m_2_2);
        m2_3=findViewById(R.id.tv_b_m_2_3);
        m2_4=findViewById(R.id.tv_b_m_2_4);
        m2_5=findViewById(R.id.tv_b_m_2_5);

        m3_1=findViewById(R.id.tv_b_m_3_1);
        m3_2=findViewById(R.id.tv_b_m_3_2);
        m3_3=findViewById(R.id.tv_b_m_3_3);
        m3_4=findViewById(R.id.tv_b_m_3_4);
        m3_5=findViewById(R.id.tv_b_m_3_5);
        m3_6=findViewById(R.id.tv_b_m_3_6);

        m4_1=findViewById(R.id.tv_b_m_4_1);
        m4_2=findViewById(R.id.tv_b_m_4_2);
        m4_3=findViewById(R.id.tv_b_m_4_3);
        m4_4=findViewById(R.id.tv_b_m_4_4);

        m5_1=findViewById(R.id.tv_b_m_5_1);
        m5_2=findViewById(R.id.tv_b_m_5_2);
        m5_3=findViewById(R.id.tv_b_m_5_3);
        m5_4=findViewById(R.id.tv_b_m_5_4);
        m5_5=findViewById(R.id.tv_b_m_5_5);
        m5_6=findViewById(R.id.tv_b_m_5_6);
        m5_7=findViewById(R.id.tv_b_m_5_7);
        m5_8=findViewById(R.id.tv_b_m_5_8);
        m5_9=findViewById(R.id.tv_b_m_5_9);
        m5_10=findViewById(R.id.tv_b_m_5_10);
        m5_11=findViewById(R.id.tv_b_m_5_11);
        m5_12=findViewById(R.id.tv_b_m_5_12);
        m5_13=findViewById(R.id.tv_b_m_5_13);
        m5_14=findViewById(R.id.tv_b_m_5_14);

        m6_1=findViewById(R.id.tv_b_m_6_1);
        m6_2=findViewById(R.id.tv_b_m_6_2);
        m6_3=findViewById(R.id.tv_b_m_6_3);
        m6_4=findViewById(R.id.tv_b_m_6_4);
        m6_5=findViewById(R.id.tv_b_m_6_5);

        m7_1=findViewById(R.id.tv_b_m_7_1);
        m7_2=findViewById(R.id.tv_b_m_7_2);
        m7_3=findViewById(R.id.tv_b_m_7_3);
        m7_4=findViewById(R.id.tv_b_m_7_4);
        m7_5=findViewById(R.id.tv_b_m_7_5);

        m8_1=findViewById(R.id.tv_b_m_8_1);
        m8_2=findViewById(R.id.tv_b_m_8_2);
        m8_3=findViewById(R.id.tv_b_m_8_3);
        m8_4=findViewById(R.id.tv_b_m_8_4);
        m8_5=findViewById(R.id.tv_b_m_8_5);
        m8_6=findViewById(R.id.tv_b_m_8_6);
        m8_7=findViewById(R.id.tv_b_m_8_7);
        m8_8=findViewById(R.id.tv_b_m_8_8);
        m8_9=findViewById(R.id.tv_b_m_8_9);
        m8_10=findViewById(R.id.tv_b_m_8_10);
        m8_11=findViewById(R.id.tv_b_m_8_11);
        m8_12=findViewById(R.id.tv_b_m_8_12);
        m8_13=findViewById(R.id.tv_b_m_8_13);

        m9_1=findViewById(R.id.tv_b_m_9_1);
        m9_2=findViewById(R.id.tv_b_m_9_2);
        m9_3=findViewById(R.id.tv_b_m_9_3);
        m9_4=findViewById(R.id.tv_b_m_9_4);
        m9_5=findViewById(R.id.tv_b_m_9_5);
        m9_6=findViewById(R.id.tv_b_m_9_6);
        m9_7=findViewById(R.id.tv_b_m_9_7);
        m9_8=findViewById(R.id.tv_b_m_9_8);
        m9_9=findViewById(R.id.tv_b_m_9_9);

        m10_1=findViewById(R.id.tv_b_m_10_1);
        m10_2=findViewById(R.id.tv_b_m_10_2);
        m10_3=findViewById(R.id.tv_b_m_10_3);
        m10_4=findViewById(R.id.tv_b_m_10_4);
        m10_5=findViewById(R.id.tv_b_m_10_5);
        m10_6=findViewById(R.id.tv_b_m_10_6);
        m10_7=findViewById(R.id.tv_b_m_10_7);
        m10_8=findViewById(R.id.tv_b_m_10_8);
        m10_9=findViewById(R.id.tv_b_m_10_9);
        m10_10=findViewById(R.id.tv_b_m_10_10);
        m10_11=findViewById(R.id.tv_b_m_10_11);
        m10_12=findViewById(R.id.tv_b_m_10_12);
        m10_13=findViewById(R.id.tv_b_m_10_13);
        m10_14=findViewById(R.id.tv_b_m_10_14);
        m10_15=findViewById(R.id.tv_b_m_10_15);
        m10_16=findViewById(R.id.tv_b_m_10_16);

        m11_1=findViewById(R.id.tv_b_m_11_1);
        m11_2=findViewById(R.id.tv_b_m_11_2);
        m11_3=findViewById(R.id.tv_b_m_11_3);
        m11_4=findViewById(R.id.tv_b_m_11_4);
        m11_5=findViewById(R.id.tv_b_m_11_5);
        m11_6=findViewById(R.id.tv_b_m_11_6);
        m11_7=findViewById(R.id.tv_b_m_11_7);

        m12_1=findViewById(R.id.tv_b_m_12_1);
        m12_2=findViewById(R.id.tv_b_m_12_2);
        m12_3=findViewById(R.id.tv_b_m_12_3);
        m12_4=findViewById(R.id.tv_b_m_12_4);
        m12_5=findViewById(R.id.tv_b_m_12_5);
        m12_6=findViewById(R.id.tv_b_m_12_6);
        m12_7=findViewById(R.id.tv_b_m_12_7);
        m12_8=findViewById(R.id.tv_b_m_12_8);

        m13_1=findViewById(R.id.tv_b_m_13_1);
        m13_2=findViewById(R.id.tv_b_m_13_2);
        m13_3=findViewById(R.id.tv_b_m_13_3);
        m13_4=findViewById(R.id.tv_b_m_13_4);
        m13_5=findViewById(R.id.tv_b_m_13_5);
        m13_6=findViewById(R.id.tv_b_m_13_6);

        m14_1=findViewById(R.id.tv_b_m_14_1);
        m14_2=findViewById(R.id.tv_b_m_14_2);
        m14_3=findViewById(R.id.tv_b_m_14_3);
        m14_4=findViewById(R.id.tv_b_m_14_4);

        m15_1=findViewById(R.id.tv_b_m_15_1);
        m15_2=findViewById(R.id.tv_b_m_15_2);
        m15_3=findViewById(R.id.tv_b_m_15_3);
        m15_4=findViewById(R.id.tv_b_m_15_4);
        m15_5=findViewById(R.id.tv_b_m_15_5);
        m15_6=findViewById(R.id.tv_b_m_15_6);
        m15_7=findViewById(R.id.tv_b_m_15_7);
        m15_8=findViewById(R.id.tv_b_m_15_8);
        m15_9=findViewById(R.id.tv_b_m_15_9);
        m15_10=findViewById(R.id.tv_b_m_15_10);
        m15_11=findViewById(R.id.tv_b_m_15_11);
        m15_12=findViewById(R.id.tv_b_m_15_12);
        m15_13=findViewById(R.id.tv_b_m_15_13);
        m15_14=findViewById(R.id.tv_b_m_15_14);

        m16_1=findViewById(R.id.tv_b_m_16_1);
        m16_2=findViewById(R.id.tv_b_m_16_2);
        m16_3=findViewById(R.id.tv_b_m_16_3);
        m16_4=findViewById(R.id.tv_b_m_16_4);
        m16_5=findViewById(R.id.tv_b_m_16_5);
        m16_6=findViewById(R.id.tv_b_m_16_6);

        m17_1=findViewById(R.id.tv_b_m_17_1);
        m17_2=findViewById(R.id.tv_b_m_17_2);
        m17_3=findViewById(R.id.tv_b_m_17_3);
        m17_4=findViewById(R.id.tv_b_m_17_4);
        m17_5=findViewById(R.id.tv_b_m_17_5);
        m17_6=findViewById(R.id.tv_b_m_17_6);
        m17_7=findViewById(R.id.tv_b_m_17_7);
        m17_8=findViewById(R.id.tv_b_m_17_8);

        imageView=findViewById(R.id.iv_build);


        AppDatabase db = AppDatabase.getDbInstance(this);
        BuildDao buildDao = db.employeeDao();
        Bundle extras = getIntent().getExtras();
        long id=0;
        if (extras != null) {
            id = extras.getLong("id",0);
            //The key argument here must match that used in the other activity
        }

        name=findViewById(R.id.tv_name_b);
        type=findViewById(R.id.tv_type_b);
        region=findViewById(R.id.tv_region_b);
        city=findViewById(R.id.tv_city_b);
        okryg=findViewById(R.id.tv_okryg_b);
        rayon=findViewById(R.id.tv_rayon_b);
        street=findViewById(R.id.tv_street_b);
        metro=findViewById(R.id.tv_metro_b);
        brand=findViewById(R.id.tv_group_b);
        builder=findViewById(R.id.tv_builder_b);
        seelPhone=findViewById(R.id.tv_sell_b);
        website=findViewById(R.id.tv_website_b);
        countSell=findViewById(R.id.tv_sell_count_b);
        military=findViewById(R.id.tv_military_b);
        motherCapital=findViewById(R.id.tv_mother_b);
        yearStart=findViewById(R.id.tv_start_year_b);
        square=findViewById(R.id.tv_square_b);
        allCount=findViewById(R.id.tv_all_count_b);
        homeIn=findViewById(R.id.tv_home_gk_b);
        floarCount=findViewById(R.id.tv_floar_b);
        parkCount=findViewById(R.id.tv_car_place_b);
        topGk=findViewById(R.id.tv_top_b);
        markERZ=findViewById(R.id.tv_mark_erz_b);

        NewBuild newBuild= buildDao.getById(id);
        NewBuilder newBuilder= buildDao.getBuilderById(newBuild.builderId);

        name.setText(newBuild.nameBuild);
        type.setText(newBuild.typeBuilding);
        region.setText(newBuild.region);
        city.setText(newBuild.city);
        okryg.setText(newBuild.okryg);
        rayon.setText(newBuild.rayon);
        street.setText(newBuild.street);
        metro.setText(newBuild.metro);
        brand.setText(newBuild.brand);
        builder.setText(newBuilder.shrotName);
        int idImage = getResources().getIdentifier("com.example.building:drawable/" + newBuild.photoUrl, null, null);
        imageView.setImageResource(idImage);
        //builder.setText(newBuild.builder);
        seelPhone.setText(newBuild.sellPhone);
        website.setText(newBuild.webSite);
        countSell.setText(newBuild.countSell);
        if(newBuild.military){
            military.setText("Да");
        }
        else{
            military.setText("Нет");
        }
        if(newBuild.motherCapital){
            motherCapital.setText("Да");
        }
        else{
            motherCapital.setText("Нет");
        }
        yearStart.setText(newBuild.yearStart);
        square.setText(newBuild.square);
        allCount.setText(newBuild.allCount);
        homeIn.setText(newBuild.homeInGK);
        floarCount.setText(newBuild.floarCount);
        parkCount.setText(newBuild.parkCount);
        topGk.setText(newBuild.topGk);

        sum1.setText(df.format(newBuild.m1_1+newBuild.m1_2+newBuild.m1_3));
        m1_1.setText(String.valueOf(newBuild.m1_1));
        m1_2.setText(String.valueOf(newBuild.m1_2));
        m1_3.setText(String.valueOf(newBuild.m1_3));

        sum2.setText(df.format(newBuild.m2_1+newBuild.m2_2+newBuild.m2_3+newBuild.m2_4+newBuild.m2_5));
        m2_1.setText(String.valueOf(newBuild.m2_1));
        m2_2.setText(String.valueOf(newBuild.m2_2));
        m2_3.setText(String.valueOf(newBuild.m2_3));
        m2_4.setText(String.valueOf(newBuild.m2_4));
        m2_5.setText(String.valueOf(newBuild.m2_5));

        sum3.setText(df.format(newBuild.m3_1+newBuild.m3_2+newBuild.m3_3+newBuild.m3_4+newBuild.m3_5+newBuild.m3_6));
        m3_1.setText(String.valueOf(newBuild.m3_1));
        m3_2.setText(String.valueOf(newBuild.m3_2));
        m3_3.setText(String.valueOf(newBuild.m3_3));
        m3_4.setText(String.valueOf(newBuild.m3_4));
        m3_5.setText(String.valueOf(newBuild.m3_5));
        m3_6.setText(String.valueOf(newBuild.m3_6));

        sum4.setText(df.format(newBuild.m4_1+newBuild.m4_2+newBuild.m4_3+newBuild.m4_4));
        m4_1.setText(String.valueOf(newBuild.m4_1));
        m4_2.setText(String.valueOf(newBuild.m4_2));
        m4_3.setText(String.valueOf(newBuild.m4_3));
        m4_4.setText(String.valueOf(newBuild.m4_4));

        sum5.setText(df.format(newBuild.m5_1+newBuild.m5_2+newBuild.m5_3+newBuild.m5_4+
                newBuild.m5_5+newBuild.m5_6+newBuild.m5_7+newBuild.m5_8+
                newBuild.m5_9+newBuild.m5_10+newBuild.m5_11+newBuild.m5_12+
                newBuild.m5_13+newBuild.m5_14));
        m5_1.setText(String.valueOf(newBuild.m5_1));
        m5_2.setText(String.valueOf(newBuild.m5_2));
        m5_3.setText(String.valueOf(newBuild.m5_3));
        m5_4.setText(String.valueOf(newBuild.m5_4));
        m5_5.setText(String.valueOf(newBuild.m5_5));
        m5_6.setText(String.valueOf(newBuild.m5_6));
        m5_7.setText(String.valueOf(newBuild.m5_7));
        m5_8.setText(String.valueOf(newBuild.m5_8));
        m5_9.setText(String.valueOf(newBuild.m5_9));
        m5_10.setText(String.valueOf(newBuild.m5_10));
        m5_11.setText(String.valueOf(newBuild.m5_11));
        m5_12.setText(String.valueOf(newBuild.m5_12));
        m5_13.setText(String.valueOf(newBuild.m5_13));
        m5_14.setText(String.valueOf(newBuild.m5_14));

        sum6.setText(df.format(newBuild.m6_1+newBuild.m6_2+newBuild.m6_3+newBuild.m6_4+newBuild.m6_5));
        m6_1.setText(String.valueOf(newBuild.m6_1));
        m6_2.setText(String.valueOf(newBuild.m6_2));
        m6_3.setText(String.valueOf(newBuild.m6_3));
        m6_4.setText(String.valueOf(newBuild.m6_4));
        m6_5.setText(String.valueOf(newBuild.m6_5));

        sum7.setText(df.format(newBuild.m7_1+newBuild.m7_2+newBuild.m7_3+newBuild.m7_4+newBuild.m7_5));
        m7_1.setText(String.valueOf(newBuild.m7_1));
        m7_2.setText(String.valueOf(newBuild.m7_2));
        m7_3.setText(String.valueOf(newBuild.m7_3));
        m7_4.setText(String.valueOf(newBuild.m7_4));
        m7_5.setText(String.valueOf(newBuild.m7_5));

        sum8.setText(df.format(newBuild.m8_1+newBuild.m8_2+newBuild.m8_3+newBuild.m5_8+
                newBuild.m8_5+newBuild.m8_6+newBuild.m8_7+newBuild.m8_8+
                newBuild.m8_9+newBuild.m8_10+newBuild.m8_11+newBuild.m8_12+
                newBuild.m8_13));
        m8_1.setText(String.valueOf(newBuild.m8_1));
        m8_2.setText(String.valueOf(newBuild.m8_2));
        m8_3.setText(String.valueOf(newBuild.m8_3));
        m8_4.setText(String.valueOf(newBuild.m8_4));
        m8_5.setText(String.valueOf(newBuild.m8_5));
        m8_6.setText(String.valueOf(newBuild.m8_6));
        m8_7.setText(String.valueOf(newBuild.m8_7));
        m8_8.setText(String.valueOf(newBuild.m8_8));
        m8_9.setText(String.valueOf(newBuild.m8_9));
        m8_10.setText(String.valueOf(newBuild.m8_10));
        m8_11.setText(String.valueOf(newBuild.m8_11));
        m8_12.setText(String.valueOf(newBuild.m8_12));
        m8_13.setText(String.valueOf(newBuild.m8_13));

        sum9.setText(df.format(newBuild.m9_1+newBuild.m9_2+newBuild.m9_3+newBuild.m9_8+
                newBuild.m9_5+newBuild.m9_6+newBuild.m9_7+newBuild.m9_8+
                newBuild.m9_9));
        m9_1.setText(String.valueOf(newBuild.m9_1));
        m9_2.setText(String.valueOf(newBuild.m9_2));
        m9_3.setText(String.valueOf(newBuild.m9_3));
        m9_4.setText(String.valueOf(newBuild.m9_4));
        m9_5.setText(String.valueOf(newBuild.m9_5));
        m9_6.setText(String.valueOf(newBuild.m9_6));
        m9_7.setText(String.valueOf(newBuild.m9_7));
        m9_8.setText(String.valueOf(newBuild.m9_8));
        m9_9.setText(String.valueOf(newBuild.m9_9));

        sum10.setText(df.format(newBuild.m10_1+newBuild.m10_2+newBuild.m10_3+newBuild.m10_4+
                newBuild.m10_5+newBuild.m10_6+newBuild.m10_7+newBuild.m10_8+
                newBuild.m10_9+newBuild.m10_10+newBuild.m10_11+newBuild.m10_12+
                newBuild.m10_13+newBuild.m10_14+newBuild.m10_15+newBuild.m10_16));
        m10_1.setText(String.valueOf(newBuild.m10_1));
        m10_2.setText(String.valueOf(newBuild.m10_2));
        m10_3.setText(String.valueOf(newBuild.m10_3));
        m10_4.setText(String.valueOf(newBuild.m10_4));
        m10_5.setText(String.valueOf(newBuild.m10_5));
        m10_6.setText(String.valueOf(newBuild.m10_6));
        m10_7.setText(String.valueOf(newBuild.m10_7));
        m10_8.setText(String.valueOf(newBuild.m10_8));
        m10_9.setText(String.valueOf(newBuild.m10_9));
        m10_10.setText(String.valueOf(newBuild.m10_10));
        m10_11.setText(String.valueOf(newBuild.m10_11));
        m10_12.setText(String.valueOf(newBuild.m10_12));
        m10_13.setText(String.valueOf(newBuild.m10_13));
        m10_14.setText(String.valueOf(newBuild.m10_14));
        m10_15.setText(String.valueOf(newBuild.m10_15));
        m10_16.setText(String.valueOf(newBuild.m10_16));

        sum11.setText(df.format(newBuild.m11_1+newBuild.m11_2+newBuild.m11_3+newBuild.m11_4+
                newBuild.m11_5+newBuild.m11_6+newBuild.m11_7));
        m11_1.setText(String.valueOf(newBuild.m11_1));
        m11_2.setText(String.valueOf(newBuild.m11_2));
        m11_3.setText(String.valueOf(newBuild.m11_3));
        m11_4.setText(String.valueOf(newBuild.m11_4));
        m11_5.setText(String.valueOf(newBuild.m11_5));
        m11_6.setText(String.valueOf(newBuild.m11_6));
        m11_7.setText(String.valueOf(newBuild.m11_7));

        sum12.setText(df.format(newBuild.m12_1+newBuild.m12_2+newBuild.m12_3+newBuild.m12_4+
                newBuild.m12_5+newBuild.m12_6+newBuild.m12_7+newBuild.m12_8));
        m12_1.setText(String.valueOf(newBuild.m12_1));
        m12_2.setText(String.valueOf(newBuild.m12_2));
        m12_3.setText(String.valueOf(newBuild.m12_3));
        m12_4.setText(String.valueOf(newBuild.m12_4));
        m12_5.setText(String.valueOf(newBuild.m12_5));
        m12_6.setText(String.valueOf(newBuild.m12_6));
        m12_7.setText(String.valueOf(newBuild.m12_7));
        m12_8.setText(String.valueOf(newBuild.m12_8));

        sum13.setText(df.format(newBuild.m13_1+newBuild.m13_2+newBuild.m13_3+newBuild.m13_4+
                newBuild.m13_5+newBuild.m13_6));
        m13_1.setText(String.valueOf(newBuild.m13_1));
        m13_2.setText(String.valueOf(newBuild.m13_2));
        m13_3.setText(String.valueOf(newBuild.m13_3));
        m13_4.setText(String.valueOf(newBuild.m13_4));
        m13_5.setText(String.valueOf(newBuild.m13_5));
        m13_6.setText(String.valueOf(newBuild.m13_6));

        sum14.setText(df.format(newBuild.m14_1+newBuild.m14_2+newBuild.m14_3+newBuild.m14_4));
        m14_1.setText(String.valueOf(newBuild.m14_1));
        m14_2.setText(String.valueOf(newBuild.m14_2));
        m14_3.setText(String.valueOf(newBuild.m14_3));
        m14_4.setText(String.valueOf(newBuild.m14_4));

        sum15.setText(df.format(newBuild.m15_1+newBuild.m15_2+newBuild.m15_3+newBuild.m15_4+
                newBuild.m15_5+newBuild.m15_6+newBuild.m15_7+newBuild.m15_8+
                newBuild.m15_9+newBuild.m15_10+newBuild.m15_11+newBuild.m15_12+
                newBuild.m15_13+newBuild.m15_14));
        m15_1.setText(String.valueOf(newBuild.m15_1));
        m15_2.setText(String.valueOf(newBuild.m15_2));
        m15_3.setText(String.valueOf(newBuild.m15_3));
        m15_4.setText(String.valueOf(newBuild.m15_4));
        m15_5.setText(String.valueOf(newBuild.m15_5));
        m15_6.setText(String.valueOf(newBuild.m15_6));
        m15_7.setText(String.valueOf(newBuild.m15_7));
        m15_8.setText(String.valueOf(newBuild.m15_8));
        m15_9.setText(String.valueOf(newBuild.m15_9));
        m15_10.setText(String.valueOf(newBuild.m15_10));
        m15_11.setText(String.valueOf(newBuild.m15_11));
        m15_12.setText(String.valueOf(newBuild.m15_12));
        m15_13.setText(String.valueOf(newBuild.m15_13));
        m15_14.setText(String.valueOf(newBuild.m15_14));

        sum16.setText(df.format(newBuild.m16_1+newBuild.m16_2+newBuild.m16_3+newBuild.m16_4+
                newBuild.m16_5+newBuild.m16_6));
        m16_1.setText(String.valueOf(newBuild.m16_1));
        m16_2.setText(String.valueOf(newBuild.m16_2));
        m16_3.setText(String.valueOf(newBuild.m16_3));
        m16_4.setText(String.valueOf(newBuild.m16_4));
        m16_5.setText(String.valueOf(newBuild.m16_5));
        m16_6.setText(String.valueOf(newBuild.m16_6));

        sum17.setText(df.format(newBuild.m17_1+newBuild.m17_2+newBuild.m17_3+newBuild.m17_4+
                newBuild.m17_5+newBuild.m17_6+newBuild.m17_7+newBuild.m17_8));
        m17_1.setText(String.valueOf(newBuild.m17_1));
        m17_2.setText(String.valueOf(newBuild.m17_2));
        m17_3.setText(String.valueOf(newBuild.m17_3));
        m17_4.setText(String.valueOf(newBuild.m17_4));
        m17_5.setText(String.valueOf(newBuild.m17_5));
        m17_6.setText(String.valueOf(newBuild.m17_6));
        m17_7.setText(String.valueOf(newBuild.m17_7));
        m17_8.setText(String.valueOf(newBuild.m17_8));


        double mSum=Double.parseDouble(sum1.getText().toString().replace(",",".").trim())+Double.parseDouble(sum2.getText().toString().replace(",",".").trim())+Double.parseDouble(sum3.getText().toString().replace(",",".").trim())
                +Double.parseDouble(sum4.getText().toString().replace(",",".").trim())+Double.parseDouble(sum5.getText().toString().replace(",",".").trim())+Double.parseDouble(sum6.getText().toString().replace(",",".").trim())
                +Double.parseDouble(sum7.getText().toString().replace(",",".").trim())+Double.parseDouble(sum8.getText().toString().replace(",",".").trim())+Double.parseDouble(sum9.getText().toString().replace(",",".").trim())
                +Double.parseDouble(sum10.getText().toString().replace(",",".").trim())+Double.parseDouble(sum11.getText().toString().replace(",",".").trim())+Double.parseDouble(sum12.getText().toString().replace(",",".").trim())
                +Double.parseDouble(sum13.getText().toString().replace(",",".").trim())+Double.parseDouble(sum14.getText().toString().replace(",",".").trim())+Double.parseDouble(sum15.getText().toString().replace(",",".").trim())
                +Double.parseDouble(sum16.getText().toString().replace(",",".").trim())+Double.parseDouble(sum17.getText().toString().replace(",",".").trim());

        markERZ.setText(df.format(mSum));


        builder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //перехід на activity із забудовником
                Intent intent=new Intent(ShowBuildongActivity.this, ShowBuilderActivity.class);

                intent.putExtra("id",newBuilder.id);
                startActivity(intent);
            }
        });




    }
}
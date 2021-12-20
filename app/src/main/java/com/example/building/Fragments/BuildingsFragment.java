package com.example.building.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.building.DB.AppDatabase;
import com.example.building.Adapters.BuildingsAdapter;
import com.example.building.DB.BuildDao;
import com.example.building.Models.NewBuild;
import com.example.building.R;

import java.util.List;

//fragment в якому виводимо всі будівлі
public class BuildingsFragment extends Fragment {


    BuildingsAdapter buildingsAdapter;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_builders, container, false);
        AppDatabase db = AppDatabase.getDbInstance(getContext());
        BuildDao buildDao = db.employeeDao();
        recyclerView=view.findViewById(R.id.rv_buildings);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<NewBuild> newBuilds= buildDao.getAll();


        //створення обєкту будівлі
        NewBuild employee = new NewBuild();
        employee.nameBuild = "ЖК FORST";
        employee.typeBuilding = "жилой комплекс";
        employee.region = "г.Киев";
        employee.city = "г. Киев";
        employee.okryg = "Дарницкий";
        employee.rayon = "Позняки";
        employee.street = "улица Большая Полянка";
        employee.metro = "Славутич";
        employee.brand = "РИЕЛ №1 в Украине";
        employee.builder = "ООО РИЕЛ";
        employee.sellPhone = "+38 (096) 2669275";
        employee.webSite = "http://forst.branding.estate/main.html";
        employee.countSell = "1";
        employee.military = false;
        employee.motherCapital = false;
        employee.yearStart = "II кв. 2020";
        employee.square = "46 914 м²";
        employee.allCount = "808";
        employee.homeInGK = "1";
        employee.floarCount = "21";
        employee.parkCount = "2";
        employee.topGk = "2020 - победитель";
        employee.markERZ = "50.3";

        employee.m1_1 = 3;
        employee.m1_2 = 0;
        employee.m1_3 = 0;

        employee.m2_1 = 0.1;
        employee.m2_2 = 0;
        employee.m2_3 = 0.3;
        employee.m2_4 = 0.4;
        employee.m2_5 = 0;

        employee.m3_1 = 2;
        employee.m3_2 = 2;
        employee.m3_3 = 2;
        employee.m3_4 = 0.2;
        employee.m3_5 = 0.2;
        employee.m3_6 = 0.3;

        employee.m4_1 = 0.4;
        employee.m4_2 = 0;
        employee.m4_3 = 0.6;
        employee.m4_4 = 0.4;

        employee.m5_1 = 1.6;
        employee.m5_2 = 1;
        employee.m5_3 = 0;
        employee.m5_4 = 0.5;
        employee.m5_5 = 1;
        employee.m5_6 = 0.6;
        employee.m5_7 = 0.5;
        employee.m5_8 = 0;
        employee.m5_9 = 0.4;
        employee.m5_10 = 0.4;
        employee.m5_11 = 0.4;
        employee.m5_12 = 0;
        employee.m5_13 = 0.1;
        employee.m5_14 = 0;

        employee.m6_1 = 0;
        employee.m6_2 = 1;
        employee.m6_3 = 0.3;
        employee.m6_4 = 0;
        employee.m6_5 = 0.4;

        employee.m7_1 = 1.2;
        employee.m7_2 = 0.8;
        employee.m7_3 = 1;
        employee.m7_4 = 0;
        employee.m7_5 = 0.9;

        employee.m8_1 = 0;
        employee.m8_2 = -0.6;
        employee.m8_3 = 0;
        employee.m8_4 = 0;
        employee.m8_5 = 0;
        employee.m8_6 = 0;
        employee.m8_7 = 0;
        employee.m8_8 = 0;
        employee.m8_9 = 0;
        employee.m8_10 = 0;
        employee.m8_11 = 0;
        employee.m8_12 = 0;
        employee.m8_13 = 0;

        employee.m9_1 = -0.4;
        employee.m9_2 = 0;
        employee.m9_3 = 0.8;
        employee.m9_4 = 0;
        employee.m9_5 = 0.6;
        employee.m9_6 = 0.8;
        employee.m9_7 = 0.6;
        employee.m9_8 = 0;
        employee.m9_9 = 0;

        employee.m10_1 = 1.3;
        employee.m10_2 = 0;
        employee.m10_3 = 0;
        employee.m10_4 = 0.5;
        employee.m10_5 = 0.35;
        employee.m10_6 = 0.35;
        employee.m10_7 = 0;
        employee.m10_8 = 0;
        employee.m10_9 = 0;
        employee.m10_10 = 0;
        employee.m10_11 = 0.2;
        employee.m10_12 = 0;
        employee.m10_13 = 0.3;
        employee.m10_14 = 0;
        employee.m10_15 = 0;
        employee.m10_16 = 0;

        employee.m11_1 = 0;
        employee.m11_2 = 0;
        employee.m11_3 = 0;
        employee.m11_4 = 0;
        employee.m11_5 = 0;
        employee.m11_6 = 0;
        employee.m11_7 = 0;

        employee.m12_1 = 0;
        employee.m12_2 = 0;
        employee.m12_3 = 0.5;
        employee.m12_4 = 0;
        employee.m12_5 = 0;
        employee.m12_6 = 0;
        employee.m12_7 = 0;
        employee.m12_8 = 0;

        employee.m13_1 = 0.9;
        employee.m13_2 = 0;
        employee.m13_3 = 0;
        employee.m13_4 = 0;
        employee.m13_5 = 0;
        employee.m13_6 = 0;

        employee.m14_1 = 4.4;
        employee.m14_2 = 0;
        employee.m14_3 = 0;
        employee.m14_4 = 0;

        employee.m15_1 = 0;
        employee.m15_2 = 0.4;
        employee.m15_3 = 0;
        employee.m15_4 = 0.6;
        employee.m15_5 = 1;
        employee.m15_6 = 0.9;
        employee.m15_7 = 0.1;
        employee.m15_8 = 0.3;
        employee.m15_9 = 0.5;
        employee.m15_10 = 0.5;
        employee.m15_11 = 0;
        employee.m15_12 = 0;
        employee.m15_13 = 0.3;
        employee.m15_14 = 0.5;

        employee.m16_1 = 0;
        employee.m16_2 = 0;
        employee.m16_3 = -1.3;
        employee.m16_4 = -0.6;
        employee.m16_5 = 0;
        employee.m16_6 = 0;


        employee.m17_1 = -2.6;
        employee.m17_2 = 0;
        employee.m17_3 = 0;
        employee.m17_4 = 0;
        employee.m17_5 = -0.5;
        employee.m17_6 = 0;
        employee.m17_7 = 0;
        employee.m17_8 = 0;
        employee.builderId=1;
        employee.photoUrl="build_1";


        NewBuild employee1 = new NewBuild();
        employee1.nameBuild = "ЖК Crystal Park";
        employee1.typeBuilding = "жилой комплекс";
        employee1.region = "г.Киев";
        employee1.city = "г.Киев";
        employee1.okryg = "Правый берег";
        employee1.rayon = "Шулявская";
        employee1.street = "улица Шулявская";
        employee1.metro = "Политехническая," +
                "Шулявкая";
        employee1.brand = "РИЕЛ №1 в Украине";
        employee1.builder = "\t\n" +
                "АО Новый Горизонт";
        employee1.sellPhone = "+7 (495) 5000020";
        employee1.webSite = "https://www.riel.ua/bd";
        employee1.countSell = "417";
        employee1.military = false;
        employee1.motherCapital = false;
        employee1.yearStart = "II кв. 2018";
        employee1.square = "60 573 м²";
        employee1.allCount = "5397";
        employee1.homeInGK = "10";
        employee1.floarCount = "26";
        employee1.parkCount = "23";
        employee1.topGk = "2019 - победитель";
        employee1.markERZ = "50.3";

        employee1.m1_1 = -4;
        employee1.m1_2 = 0;
        employee1.m1_3 = 0;

        employee1.m2_1 = 0;
        employee1.m2_2 = 0;
        employee1.m2_3 = 0;
        employee1.m2_4 = 0.4;
        employee1.m2_5 = 0;

        employee1.m3_1 = 2;
        employee1.m3_2 = 2;
        employee1.m3_3 = 2;
        employee1.m3_4 = 0.2;
        employee1.m3_5 = 0.2;
        employee1.m3_6 = 0.3;

        employee1.m4_1 = 0.4;
        employee1.m4_2 = 0;
        employee1.m4_3 = 0.6;
        employee1.m4_4 = 0.4;

        employee1.m5_1 = 1.6;
        employee1.m5_2 = 0;
        employee1.m5_3 = 0.5;
        employee1.m5_4 = 0;
        employee1.m5_5 = 1;
        employee1.m5_6 = 0;
        employee1.m5_7 = 0;
        employee1.m5_8 = 0.3;
        employee1.m5_9 = 0.4;
        employee1.m5_10 = 0.4;
        employee1.m5_11 = 0.4;
        employee1.m5_12 = 0;
        employee1.m5_13 = 0.1;
        employee1.m5_14 = 0;

        employee1.m6_1 = 0;
        employee1.m6_2 = 0;
        employee1.m6_3 = 0.6;
        employee1.m6_4 = 0.8;
        employee1.m6_5 = 0;

        employee1.m7_1 = 1.2;
        employee1.m7_2 = 0.8;
        employee1.m7_3 = 0;
        employee1.m7_4 = 0;
        employee1.m7_5 = 0;

        employee1.m8_1 = 0;
        employee1.m8_2 = -0.6;
        employee1.m8_3 = -0.6;
        employee1.m8_4 = 0;
        employee1.m8_5 = 0;
        employee1.m8_6 = -0.6;
        employee1.m8_7 = 0;
        employee1.m8_8 = 0;
        employee1.m8_9 = 0;
        employee1.m8_10 = 0;
        employee1.m8_11 = 0;
        employee1.m8_12 = 0;
        employee1.m8_13 = 0;

        employee1.m9_1 = -0.5;
        employee1.m9_2 = 0.8;
        employee1.m9_3 = 0;
        employee1.m9_4 = -1;
        employee1.m9_5 = 0.6;
        employee1.m9_6 = 0;
        employee1.m9_7 = 0.6;
        employee1.m9_8 = 0;
        employee1.m9_9 = 0;

        employee1.m10_1 = 0;
        employee1.m10_2 = 1;
        employee1.m10_3 = 0;
        employee1.m10_4 = 0.5;
        employee1.m10_5 = 0.35;
        employee1.m10_6 = 0;
        employee1.m10_7 = 0;
        employee1.m10_8 = 0;
        employee1.m10_9 = 0.6;
        employee1.m10_10 = 0;
        employee1.m10_11 = 0.2;
        employee1.m10_12 = 0;
        employee1.m10_13 = 0;
        employee1.m10_14 = 0;
        employee1.m10_15 = 0.2;
        employee1.m10_16 = 0;

        employee1.m11_1 = -0.5;
        employee1.m11_2 = 0;
        employee1.m11_3 = 0;
        employee1.m11_4 = 0;
        employee1.m11_5 = 0;
        employee1.m11_6 = 0;
        employee1.m11_7 = 0;

        employee1.m12_1 = 0;
        employee1.m12_2 = -0.6;
        employee1.m12_3 = 0.5;
        employee1.m12_4 = 0;
        employee1.m12_5 = 0;
        employee1.m12_6 = 0.3;
        employee1.m12_7 = 0;
        employee1.m12_8 = 0;

        employee1.m13_1 = 0.9;
        employee1.m13_2 = 0.6;
        employee1.m13_3 = 0;
        employee1.m13_4 = 0;
        employee1.m13_5 = 0;
        employee1.m13_6 = 0;

        employee1.m14_1 = 4.4;
        employee1.m14_2 = 0;
        employee1.m14_3 = 0;
        employee1.m14_4 = 0;

        employee1.m15_1 = -0.4;
        employee1.m15_2 = 0.4;
        employee1.m15_3 = 0.5;
        employee1.m15_4 = 0.6;
        employee1.m15_5 = 0.7;
        employee1.m15_6 = 0.9;
        employee1.m15_7 = 0;
        employee1.m15_8 = 0.3;
        employee1.m15_9 = 0;
        employee1.m15_10 = 0.5;
        employee1.m15_11 = 0.4;
        employee1.m15_12 = 0;
        employee1.m15_13 = 0;
        employee1.m15_14 = 0;

        employee1.m16_1 = 1;
        employee1.m16_2 = 0;
        employee1.m16_3 = 1.3;
        employee1.m16_4 = 0.6;
        employee1.m16_5 = 0;
        employee1.m16_6 = 0.6;


        employee1.m17_1 = 2;
        employee1.m17_2 = 0;
        employee1.m17_3 = 0;
        employee1.m17_4 = 0;
        employee1.m17_5 = -1;
        employee1.m17_6 = 0;
        employee1.m17_7 = 0;
        employee1.m17_8 = 0;
        employee1.builderId=1;
        employee1.photoUrl="build_2";



        if(newBuilds.size()==0){
            //добавлення обєктів в таблицю
            buildDao.insert(employee);
            buildDao.insert(employee1);
        }




        newBuilds.clear();
        newBuilds= buildDao.getAll();

        buildingsAdapter=new BuildingsAdapter(getContext(),newBuilds);
        recyclerView.setAdapter(buildingsAdapter);



        return view;
    }
}
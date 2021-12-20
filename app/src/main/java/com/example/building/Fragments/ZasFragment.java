package com.example.building.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.building.DB.AppDatabase;
import com.example.building.DB.BuilderDao;
import com.example.building.Adapters.BuildersAdapter;
import com.example.building.Models.NewBuilder;
import com.example.building.R;

import java.util.List;

//fragment в якому виводимо всіх забудовників
public class ZasFragment extends Fragment {
    BuildersAdapter buildersAdapter;
    RecyclerView recyclerView;
    List<NewBuilder> newBuilders;

    EditText search;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_zas, container, false);

        AppDatabase db = AppDatabase.getDbInstance(getContext());
        BuilderDao builderDao = db.builderDao();
        search=view.findViewById(R.id.et_search);
        recyclerView=view.findViewById(R.id.rv_builders);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        newBuilders=builderDao.getAll();

        //створення обєкту забудовника
        NewBuilder builder=new NewBuilder();
        builder.shrotName="РИЕЛ";
        builder.fullName="РИЕЛ №1 в Украине";
        builder.city="г.Львов, г.Киев";
        builder.street="ул. Гельгаузе, д.19, стр.1";
        builder.phone="+38 (096) 4077840";
        builder.webSite="http://riel.ua/";
        builder.yearCreating=1994;
        builder.countUseByBrends=91;
        builder.countSellFlat=170593;
        builder.countBuildingsFlat=75180;
        builder.countEndedFlat=95413;
        builder.countRegions=13;
        builder.mBuild=5784239;
        builder.mDelayBuild=418432;
        builder.mUtoch=0.92;
        builder.rigions=12;
        builder.organizations=66;
        builder.gk=71;
        builder.photoUrl="zas_1";

        NewBuilder builder2=new NewBuilder();
        builder2.shrotName="Киевгорстрой";
        builder2.fullName="Киевгорстрой №2 в Украине";
        builder2.city="г.Киев";
        builder2.street="ул. Хрещатик, д.115, стр.2";
        builder2.phone="+38 (096) 4076440";
        builder2.webSite="http://kmb.ua/";
        builder2.yearCreating=1955;
        builder2.countUseByBrends=91;
        builder2.countSellFlat=170593;
        builder2.countBuildingsFlat=75180;
        builder2.countEndedFlat=95413;
        builder2.countRegions=13;
        builder2.mBuild=5784239;
        builder2.mDelayBuild=418432;
        builder2.mUtoch=0.92;
        builder2.rigions=12;
        builder2.organizations=66;
        builder2.gk=71;
        builder2.photoUrl="zas_2";


        if(newBuilders.size()==0){
            //добавлення обєкта в таблицю
            builderDao.insert(builder);
            builderDao.insert(builder2);
        }

        newBuilders.clear();
        newBuilders=builderDao.getAll();

        buildersAdapter=new BuildersAdapter(getContext(),newBuilders);
        recyclerView.setAdapter(buildersAdapter);


        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                newBuilders.clear();
                newBuilders =builderDao.searchByBuilder("%"+search.getText().toString().trim()+"%");
                buildersAdapter=new BuildersAdapter(getContext(),newBuilders);
                recyclerView.setAdapter(buildersAdapter);
            }
        });



        return view;
    }
}
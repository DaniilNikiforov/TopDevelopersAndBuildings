package com.example.building.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.building.Adapters.SubBuildAdapter;
import com.example.building.DB.AppDatabase;
import com.example.building.DB.BuilderDao;
import com.example.building.Models.NewBuild;
import com.example.building.Models.NewBuilder;
import com.example.building.R;

import java.util.List;
//activity в якому відображаємо конкретного забудовника
public class ShowBuilderActivity extends AppCompatActivity {

    TextView shortName,fullName,adress,phone,web,yearStart,brands,selling,building,selled,regionsSell,regionsBuild;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_builder);

        AppDatabase db = AppDatabase.getDbInstance(this);
        BuilderDao employeeDao = db.builderDao();

        Bundle extras = getIntent().getExtras();
        long id=0;
        if (extras != null) {
            id = extras.getLong("id",0);
        }

        RecyclerView recyclerView = findViewById(R.id.rv_buildings_sub);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        NewBuilder newBuilder=employeeDao.getById(id);
        List<NewBuild> newBuildList=employeeDao.getBuilderById(id);
        SubBuildAdapter subBuildAdapter=new SubBuildAdapter(this,newBuildList);
        recyclerView.setAdapter(subBuildAdapter);


        shortName=findViewById(R.id.tv_name_show);
        fullName=findViewById(R.id.tv_fullName_show);
        adress=findViewById(R.id.tv_adress_show);
        phone=findViewById(R.id.tv_phone_show);
        web=findViewById(R.id.tv_web_show);
        yearStart=findViewById(R.id.tv_year_show);
        brands=findViewById(R.id.tv_brands_show);
        selling=findViewById(R.id.tv_sellling_show);
        building=findViewById(R.id.tv_building_show);
        selled=findViewById(R.id.tv_sell_show);
        regionsSell=findViewById(R.id.tv_reg_show);
        regionsBuild=findViewById(R.id.tv_regions_show);
        imageView=findViewById(R.id.iv_zas);

        shortName.setText(newBuilder.shrotName);
        fullName.setText(newBuilder.fullName);
        adress.setText(newBuilder.city+", "+newBuilder.street);
        phone.setText(newBuilder.phone);
        web.setText(newBuilder.webSite);
        yearStart.setText(newBuilder.yearCreating+"");
        brands.setText(newBuilder.countUseByBrends+"");
        selling.setText(newBuilder.countSellFlat+"");
        building.setText(newBuilder.countBuildingsFlat+"");
        selled.setText(newBuilder.countEndedFlat+"");
        regionsSell.setText(newBuilder.countRegions+"");
        regionsBuild.setText(newBuilder.rigions+"");

        int idImage = getResources().getIdentifier("com.example.building:drawable/" + newBuilder.photoUrl, null, null);
        imageView.setImageResource(idImage);

    }
}
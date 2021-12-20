package com.example.building.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.building.Fragments.BuildingsFragment;
import com.example.building.Fragments.ZasFragment;
import com.example.building.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
//activity в якому знаходить frame і bottom meu
public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;
    ZasFragment zasFragment=new ZasFragment();
    BuildingsFragment buildingsFragment=new BuildingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.zas);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.zas:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, zasFragment).commit();
                return true;

            case R.id.build:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, buildingsFragment).commit();
                return true;
        }
        return false;
    }
}
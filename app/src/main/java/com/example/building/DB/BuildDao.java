package com.example.building.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.building.Models.NewBuild;
import com.example.building.Models.NewBuilder;

import java.util.List;

//для роботи з таблицями
@Dao
public interface BuildDao {
        @Query("SELECT * FROM newbuild")
        List<NewBuild> getAll();

        @Query("SELECT * FROM newbuild WHERE id = :id")
        NewBuild getById(long id);

        @Insert
        void insert(NewBuild employee);


        @Query("SELECT * FROM newbuilder WHERE id = :id")
        NewBuilder getBuilderById(long id);
}
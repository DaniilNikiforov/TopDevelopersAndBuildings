package com.example.building.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.building.Models.NewBuild;
import com.example.building.Models.NewBuilder;

import java.util.List;

//для роботи з таблицями
@Dao
public interface BuilderDao {
    @Query("SELECT * FROM newbuilder")
    List<NewBuilder> getAll();

    @Query("SELECT * FROM newbuilder WHERE id = :id")
    NewBuilder getById(long id);

    @Insert
    void insert(NewBuilder employee);


    @Query("SELECT * FROM newbuilder WHERE shrotName LIKE :search")
    List<NewBuilder> searchByBuilder(String search);

    @Query("SELECT * FROM newbuild WHERE builderId = :id")
    List<NewBuild> getBuilderById(long id);
}

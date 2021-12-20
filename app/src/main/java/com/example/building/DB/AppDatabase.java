package com.example.building.DB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.building.Models.NewBuild;
import com.example.building.Models.NewBuilder;

@Database(entities = {NewBuild.class, NewBuilder.class}, version = 8)
public abstract class AppDatabase  extends RoomDatabase{
    public abstract BuildDao employeeDao();
    public abstract BuilderDao builderDao();


    public static AppDatabase INSTANCE;

    public static AppDatabase getDbInstance(Context context){

        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"database")
                    .fallbackToDestructiveMigration().allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

}
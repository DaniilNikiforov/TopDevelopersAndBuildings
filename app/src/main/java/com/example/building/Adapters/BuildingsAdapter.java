package com.example.building.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.building.Models.NewBuild;
import com.example.building.R;
import com.example.building.Activities.ShowBuildongActivity;

import java.util.List;

public class BuildingsAdapter  extends RecyclerView.Adapter<BuildingsAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<NewBuild> states;

    public BuildingsAdapter(Context context, List<NewBuild> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public BuildingsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_newbuilds, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BuildingsAdapter.ViewHolder holder, int position) {
        NewBuild state = states.get(position);

        holder.name.setText(state.nameBuild);
        holder.group.setText(state.brand);
        holder.adress.setText(state.city+","+state.street);
        String metro=state.metro;
        holder.metro.setText(metro);
        holder.countSell.setText("Квартир в продаже:"+state.countSell);
        holder.floar.setText("Етажей ЖК:"+state.floarCount);
        holder.square.setText("Площадь:"+state.square);
        holder.dedline.setText("Начало сторительства:"+state.yearStart);
        holder.markz.setText("Оценка ЕРЗ:"+state.markERZ);
        holder.price.setText("Цена от 1 млн");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(inflater.getContext(), ShowBuildongActivity.class);
                i.putExtra("id",state.id);
                inflater.getContext().startActivity(i);
            }
        });


        int idImage = inflater.getContext().getResources().getIdentifier("com.example.building:drawable/" + state.photoUrl, null, null);
        holder.imageView.setImageResource(idImage);


    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, group,adress,metro,countSell,floar,square,dedline,markz,price;
        ImageView imageView;
        ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.tv_name_gk_item);
            group = view.findViewById(R.id.tv_group_name_item);
            adress = view.findViewById(R.id.tv_adress_item);
            metro = view.findViewById(R.id.tv_metro_item);
            countSell = view.findViewById(R.id.tv_count_sell_item);
            floar = view.findViewById(R.id.tv_floar_gk_item);
            square = view.findViewById(R.id.tv_square_item);
            dedline = view.findViewById(R.id.tv_dedline_item);
            markz = view.findViewById(R.id.tv_mark_erz_item);
            price = view.findViewById(R.id.tv_price_item);
            imageView = view.findViewById(R.id.iv_build_photo);
        }
    }
}
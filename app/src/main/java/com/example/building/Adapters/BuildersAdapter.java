package com.example.building.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.building.Models.NewBuilder;
import com.example.building.R;
import com.example.building.Activities.ShowBuilderActivity;

import java.util.List;

public class BuildersAdapter  extends RecyclerView.Adapter<BuildersAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<NewBuilder> builders;

    public BuildersAdapter(Context context, List<NewBuilder> builders) {
        this.builders = builders;
        this.inflater = LayoutInflater.from(context);
    }

    //вказуємо макет який буде відображатися
    @Override
    public BuildersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = inflater.inflate(R.layout.item_builder, parent, false);
        return new ViewHolder(view);
    }

    //заповнення макету
    @Override
    public void onBindViewHolder(BuildersAdapter.ViewHolder holder, int position) {
        NewBuilder builder = builders.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(inflater.getContext(), ShowBuilderActivity.class);
                i.putExtra("id",builder.id);
                inflater.getContext().startActivity(i);
            }
        });


        holder.place.setText((position+1)+" Место");
        holder.nameAndCity.setText(builder.shrotName+" "+builder.city);
        holder.countBuilds.setText(builder.mBuild+"");
        holder.delay.setText(builder.mDelayBuild+"");
        holder.persantage.setText((builder.mDelayBuild*100)/builder.mBuild+"");
        holder.month.setText(builder.mUtoch+"");
        holder.regions.setText(builder.rigions+"");
        holder.zas.setText(builder.organizations+"");
        holder.gk.setText(builder.gk+"");
    }

    @Override
    public int getItemCount() {
        return builders.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView place,erz_rating,nameAndCity,countBuilds,delay,persantage,month,regions,zas,gk;
        ViewHolder(View view){
            super(view);
            place = view.findViewById(R.id.tv_place_b);
            erz_rating = view.findViewById(R.id.tv_erz_rating_b);
            nameAndCity = view.findViewById(R.id.tv_name_city_b);
            countBuilds = view.findViewById(R.id.tv_count_build_b);
            delay = view.findViewById(R.id.tv_count_delay_build_b);
            persantage = view.findViewById(R.id.tv_persantage_b);
            month = view.findViewById(R.id.tv_month_b);
            regions = view.findViewById(R.id.tv_count_regions_b);
            zas = view.findViewById(R.id.tv_count_zas_b);
            gk = view.findViewById(R.id.tv_gk_b);
        }
    }
}
package com.example.building.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.building.Models.NewBuild;
import com.example.building.R;
import com.example.building.Activities.ShowBuildongActivity;

import java.util.List;

public class SubBuildAdapter  extends RecyclerView.Adapter<SubBuildAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<NewBuild> states;

    public SubBuildAdapter(Context context, List<NewBuild> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public SubBuildAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_sub, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SubBuildAdapter.ViewHolder holder, int position) {
        NewBuild state = states.get(position);

        holder.name.setText(state.nameBuild);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(inflater.getContext(), ShowBuildongActivity.class);
                i.putExtra("id",state.id);
                inflater.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.tv_name_sub_build);
        }
    }
}
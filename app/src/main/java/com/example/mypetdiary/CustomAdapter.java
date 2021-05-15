package com.example.mypetdiary;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    Activity activity;
    private ArrayList id, name, gender, breed;

    int position;

    CustomAdapter(Activity activity, Context context, ArrayList id, ArrayList name, ArrayList gender, ArrayList breed) {
        this.activity = activity;
        this.context = context;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this. breed = breed;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
        this.position = position;

        holder.pet_id.setText(String.valueOf(id.get(position)));
        holder.name_txt.setText(String.valueOf(name.get(position)));
        holder.gender_txt.setText(String.valueOf(gender.get(position)));
        holder.breed_txt.setText(String.valueOf(breed.get(position)));
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("id", String.valueOf(id.get(position)));
                intent.putExtra("name", String.valueOf(name.get(position)));
                intent.putExtra("gender", String.valueOf(gender.get(position)));
                intent.putExtra("breed", String.valueOf(breed.get(position)));
                activity.startActivityForResult(intent,1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView pet_id, name_txt, gender_txt, breed_txt;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            pet_id = itemView.findViewById(R.id.pet_id);
            name_txt = itemView.findViewById(R.id.name_txt);
            gender_txt = itemView.findViewById(R.id.gender_txt);
            breed_txt = itemView.findViewById(R.id.breed_txt);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}

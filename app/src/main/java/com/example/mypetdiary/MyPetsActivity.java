package com.example.mypetdiary;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MyPetsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageButton newpet_btn;
    ImageView empty_imageview;
    TextView no_data;

    DBHelper myDB;
    ArrayList<String> id, name, gender, breed;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pets);

        recyclerView = findViewById(R.id.recyclerView);
        newpet_btn = findViewById(R.id.newpet_btn);
        empty_imageview = findViewById(R.id.empty_imageview);
        no_data = findViewById(R.id.no_data);
        newpet_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MyPetsActivity.this, NewPetActivity.class);
                startActivity(intent);
            }
        });

        myDB = new DBHelper(MyPetsActivity.this);
        id = new ArrayList<>();
        name = new ArrayList<>();
        gender = new ArrayList<>();
        breed = new ArrayList<>();

        storeDataInArrays();

        customAdapter = new CustomAdapter(MyPetsActivity.this, this, id, name, gender, breed);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MyPetsActivity.this));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            recreate();
        }
    }

    void storeDataInArrays(){
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() == 0){
            empty_imageview.setVisibility(View.VISIBLE);
            no_data.setVisibility(View.VISIBLE);
            Toast.makeText(this,"No pets.", Toast.LENGTH_SHORT).show();
        }else {
            while (cursor.moveToNext()){
                id.add(cursor.getString(0));
                name.add(cursor.getString(1));
                gender.add(cursor.getString(2));
                breed.add(cursor.getString(3));
            }
            empty_imageview.setVisibility(View.GONE);
            no_data.setVisibility(View.GONE);
        }
    }
}
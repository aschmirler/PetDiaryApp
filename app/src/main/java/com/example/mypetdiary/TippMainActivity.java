package com.example.mypetdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TippMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipp_main);
    }

    public void launchDogTippMainActivity(View v){
        Intent i = new Intent(this, DogTippMainActivity.class);
        startActivity(i);
    }
    public void launchCatTippMainActivity(View v){
        Intent i = new Intent(this, DogTippMainActivity.class);
        startActivity(i);
    }


}
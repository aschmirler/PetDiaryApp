package com.example.mypetdiary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchNewPet(View v){
        Intent i = new Intent(this, NewPetActivity.class);
        startActivity(i);
    }
    public void launchMyPets(View v){
        Intent i = new Intent(this, MyPetsActivity.class);
        startActivity(i);
    }
    public void launchTraining(View v){
        Intent i = new Intent(this, TrainingMainActivity.class);
        startActivity(i);
    }
    public void launchTipps(View v){
        Intent i = new Intent(this, DogTippMainActivity.class);
        startActivity(i);
    }


}
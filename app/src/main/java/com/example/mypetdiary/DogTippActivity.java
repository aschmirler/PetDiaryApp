package com.example.mypetdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class DogTippActivity extends AppCompatActivity {

    private TextView dTippName;
    private TextView dTipp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_tipp);

        dTippName = (TextView)findViewById(R.id.text_dogtipp);
        dTipp = (TextView)findViewById(R.id.dogtipp);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("DogTippName");
        String DogTipp = intent.getExtras().getString("DogTipp");

        dTippName.setText(Title);
        dTipp.setText(DogTipp);

    }
}
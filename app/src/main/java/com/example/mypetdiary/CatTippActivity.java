package com.example.mypetdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class CatTippActivity extends AppCompatActivity {

    private TextView cTippName;
    private TextView cTipp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_tipp);

        cTippName = (TextView)findViewById(R.id.text_cattipp);
        cTipp = (TextView)findViewById(R.id.cattipp);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("CatTippName");
        String CatTipp = intent.getExtras().getString("CatTipp");

        cTippName.setText(Title);
        cTipp.setText(CatTipp);

    }
}
package com.example.mypetdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class TrainingActivity extends AppCompatActivity {

    private TextView mTrainingName;
    private TextView mPrerequisites;
    private TextView mTrainingMethodTitle;
    private TextView mTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        mTrainingName = (TextView)findViewById(R.id.text_training);
        mPrerequisites = (TextView)findViewById(R.id.prerequisites);
        mTrainingMethodTitle = (TextView)findViewById(R.id.method);
        mTraining = (TextView)findViewById(R.id.training);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("TrainingName");
        String Prerequisites = intent.getExtras().getString("Prerequisites");
        String MethodTitle = intent.getExtras().getString("RecipeMethodTitle");
        String Training = intent.getExtras().getString("Training");

        mTrainingName.setText(Title);
        mPrerequisites.setText(Prerequisites);
        mTrainingMethodTitle.setText(MethodTitle);
        mTraining.setText(Training);

    }
}
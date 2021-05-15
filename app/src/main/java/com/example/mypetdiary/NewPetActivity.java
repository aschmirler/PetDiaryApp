package com.example.mypetdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewPetActivity extends AppCompatActivity {

    EditText name, gender, breed;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pet);

        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        breed = findViewById(R.id.breed);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper myDB = new DBHelper(NewPetActivity.this);
                myDB.addPet(name.getText().toString().trim(),
                        gender.getText().toString().trim(),
                        breed.getText().toString().trim());
            }
        });
    }
}
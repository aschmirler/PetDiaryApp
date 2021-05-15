package com.example.mypetdiary;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    EditText name2, gender2, breed2;
    Button update_button, delete_button;

    String id, name, gender, breed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        name2 = findViewById(R.id.name2);
        gender2 = findViewById(R.id.gender2);
        breed2 = findViewById(R.id.breed2);
        update_button = findViewById(R.id.update_button);
        delete_button = findViewById(R.id.delete_button);

        getAndSetIntentData();

        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle(name);
        }

        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper myDB = new DBHelper(UpdateActivity.this);
                name = name2.getText().toString().trim();
                gender = gender2.getText().toString().trim();
                breed = breed2.getText().toString().trim();
                myDB.updateData(id,name,gender,breed);
            }
        });

        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmDialog();
            }
        });
    }

    void getAndSetIntentData(){
        if (getIntent().hasExtra("id") && getIntent().hasExtra("name") && getIntent().hasExtra("gender") && getIntent().hasExtra("breed")){
            id = getIntent().getStringExtra("id");
            name = getIntent().getStringExtra("name");
            gender = getIntent().getStringExtra("gender");
            breed = getIntent().getStringExtra("breed");

            //Setting Intent Data
            name2.setText(name);
            gender2.setText(gender);
            breed2.setText(breed);
            Log.d("stev", name+" "+gender+" "+breed);

        }else {
            Toast.makeText(this,"No data.", Toast.LENGTH_SHORT).show();
        }
    }

    void confirmDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete " + name + "?");
        builder.setMessage("Are you sure you want to delete " + name + "?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                DBHelper myDB = new DBHelper(UpdateActivity.this);
                myDB.deleteOneRow(id);
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.create().show();
    }
}
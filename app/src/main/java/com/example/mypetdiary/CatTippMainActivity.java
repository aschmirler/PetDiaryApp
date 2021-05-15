package com.example.mypetdiary;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;

public class CatTippMainActivity extends AppCompatActivity {

    RecyclerView myCatRecyclerView;
    RecyclerViewAdapterCat myAdapter;

    List<CatTipps> cattipps1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_tipp_main);

        cattipps1 = new ArrayList<>();
        cattipps1.add(new CatTipps("Leash Walk","Step 1: Introduce the puppy to the collar or harness and leash.\n\n",R.drawable.cat_health_tipps));


        myCatRecyclerView = (RecyclerView)findViewById(R.id.recyclerView_cat);

        myAdapter = new RecyclerViewAdapterCat(this,cattipps1);

        myCatRecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myCatRecyclerView.setAdapter(myAdapter);

    }

}
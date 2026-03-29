package com.example.bt9_recyclerview;

import android.os.Bundle;
import android.widget.Adapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recylerData;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewLandscape = findViewById(R.id.recylerLand);

        recylerData = getDataForRecylerView();

        landScapeAdapter = new LandScapeAdapter(this, recylerData);

        recyclerViewLandscape.setAdapter(landScapeAdapter);
        recyclerViewLandscape.setLayoutManager(new LinearLayoutManager(this));
    }

    ArrayList<LandScape> getDataForRecylerView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();

        LandScape landScape1 = new LandScape("cotco_hanoi", "Cột cờ Hà Nội");
        LandScape landScape2 = new LandScape("hoguom_hanoi", "Hồ Gươm");
        LandScape landScape3 = new LandScape("lang_hcm", "Lăng Hồ Chí Minh");

        dsDuLieu.add(landScape1);
        dsDuLieu.add(landScape2);
        dsDuLieu.add(landScape3);

        return dsDuLieu;
    }
}
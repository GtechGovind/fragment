package com.gtech.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gtech.fragment.Adapter.StationAdapter;
import com.gtech.fragment.Model.Station;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView RecyclerDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerDestination = findViewById(R.id.RecyclerDestination);
        RecyclerDestination.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        List<Station> stations = new ArrayList<>();
        Station station1 = new Station("Ghatkopar");
        Station station2 = new Station("versova");
        Station station3 = new Station("dn nagar");
        Station station4 = new Station("marol");

        stations.add(station1);
        stations.add(station2);
        stations.add(station3);
        stations.add(station4);

        StationAdapter stationAdapter = new StationAdapter(stations);

        RecyclerDestination.setAdapter(stationAdapter);





    }
}
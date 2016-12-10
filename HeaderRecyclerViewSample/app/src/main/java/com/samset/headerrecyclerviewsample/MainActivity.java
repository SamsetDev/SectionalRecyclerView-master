package com.samset.headerrecyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.samset.headerrecyclerviewsample.adapter.SectionalAdapter;
import com.samset.headerrecyclerviewsample.model.model.CountryState;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        SectionalAdapter adapter = new SectionalAdapter(getData());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);
    }

    public List<CountryState> getData() {
        List<CountryState> list = new ArrayList<>();

        list.add(new CountryState("India", null, CountryState.COUNTRY_TYPE));
        list.add(new CountryState("Allahabad", "1", CountryState.CITY_TYPE));
        list.add(new CountryState("Bharatpur", "2", CountryState.CITY_TYPE));
        list.add(new CountryState("Patna", "3", CountryState.CITY_TYPE));
        list.add(new CountryState("Mumbai", "4", CountryState.CITY_TYPE));
        list.add(new CountryState("Jaipur", "5", CountryState.CITY_TYPE));

        list.add(new CountryState("Pakistan", null, CountryState.COUNTRY_TYPE));
        list.add(new CountryState("Karachi", "6", CountryState.CITY_TYPE));
        list.add(new CountryState("Ishlamabad", "7", CountryState.CITY_TYPE));
        list.add(new CountryState("Bluechistan", "8", CountryState.CITY_TYPE));
        list.add(new CountryState("Sindhu", "9", CountryState.CITY_TYPE));

        list.add(new CountryState("Russiya", null, CountryState.COUNTRY_TYPE));
        list.add(new CountryState("Mascow", "10", CountryState.CITY_TYPE));
        list.add(new CountryState("Abaza", "11", CountryState.CITY_TYPE));
        list.add(new CountryState("Baley", "12", CountryState.CITY_TYPE));
        list.add(new CountryState("Barysh", "13", CountryState.CITY_TYPE));
        list.add(new CountryState("Bely", "14", CountryState.CITY_TYPE));
        list.add(new CountryState("Bobrov", "15", CountryState.CITY_TYPE));
        list.add(new CountryState("Dolinsk", "16", CountryState.CITY_TYPE));

        return list;
    }
}

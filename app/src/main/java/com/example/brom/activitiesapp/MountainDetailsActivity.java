package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MountainDetailsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.mountainName);
        String location = intent.getStringExtra(MainActivity.mountainLocation);
        int height = intent.getIntExtra(MainActivity.mountainHeight, 0);

        TextView nameTextView = (TextView) findViewById(R.id.mtnName);
        nameTextView.setText(name);
        TextView locationTextView = (TextView) findViewById(R.id.mtnLoc);
        locationTextView.setText(location);
        TextView heightTextView = (TextView) findViewById(R.id.mtnHeight);
        heightTextView.setText(height+" Meters");
    }
}

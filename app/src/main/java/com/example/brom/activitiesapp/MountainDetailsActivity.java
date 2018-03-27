package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.ImageView;

import org.w3c.dom.Text;


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
        String locationPrefix = locationTextView.getText().toString();
        String locationText = locationPrefix+location;
        locationTextView.setText(locationText);

        TextView heightTextView = (TextView) findViewById(R.id.mtnHeight);
        String heightPrefix = heightTextView.getText().toString();
        String heightText = heightPrefix+height+" Meters";
        heightTextView.setText(heightText);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        switch (name) {
            case "Matterhorn":
                imageView.setImageResource(R.drawable.matterhorn);
                break;

            case "Mont Blanc":
                imageView.setImageResource(R.drawable.mont_blanc);
                break;

            case "Denali":
                imageView.setImageResource(R.drawable.denali);
                break;

            case "Mt. Everest":
                imageView.setImageResource(R.drawable.mt_everest);
                break;

            case "K2":
                imageView.setImageResource(R.drawable.k2);
                break;

            case "Kangchenjunga":
                imageView.setImageResource(R.drawable.kangchenjunga);
                break;

            case "Lhotse":
                imageView.setImageResource(R.drawable.lhotse);
                break;

            case "Makalu":
                imageView.setImageResource(R.drawable.makalu);
                break;

            case "Cho Oyu":
                imageView.setImageResource(R.drawable.cho_oyu);
                break;

            case "Dhaulagiri":
                imageView.setImageResource(R.drawable.dhaulagiri);
                break;
        }

    }
}

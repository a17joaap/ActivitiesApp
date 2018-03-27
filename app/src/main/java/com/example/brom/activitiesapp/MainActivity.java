package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public static final String mountainName = "Mountain_Name";
    public static final String mountainLocation = "Mountain_Location";
    public static final String mountainHeight = "Mountain_Height";
    private String[] mountainNames = {"Matterhorn", "Mont Blanc", "Denali", "Mt. Everest", "K2", "Kangchenjunga", "Lhotse", "Makalu", "Cho Oyu", "Dhaulagiri"};
    private String[] mountainLocations = {"Alps", "Alps", "Alaska", "Nepal", "Pakistan", "Nepal", "Nepal", "Nepal", "Nepal", "Nepal"};
    private int[] mountainHeights = {4478, 4808, 6190, 8848, 8611, 8586, 8516, 8485, 8201, 8167};
    // Create ArrayLists from the raw data above and use these lists when populating your ListView.
    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.mtnList);
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.list_item_textview, R.id.itemTextView, mountainNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(getApplicationContext(), MountainDetailsActivity.class);
                        intent.putExtra(mountainName, mountainNames[i]);
                        intent.putExtra(mountainLocation, mountainLocations[i]);
                        intent.putExtra(mountainHeight, mountainHeights[i]);
                        startActivity(intent);
                    }
                }
        );

        // 1. Create a ListView as in previous assignment
        // 2. Create a new activity named "MountainDetailsActivity
        // 3. Create a new Layout file for the MountainDetailsActivity called
        //    "activity_mountaindetails". MountainDetailsActivity must have MainActivity as its
        //    ´parent activity.
        // 4. The layout file created in step 3 must have a LinearLayout
        // 5. The layout file created in step 3 must be able to display
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 6. When tapping on a list item: create an Intent that includes
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 7. Display the MountainDetailsActivity with the data from the Intent created in step
        //    6
        // 8. From the MountainDetailsActivity you should have an option to "go back" using an
        //    left arro button. This is done by letting the MainActivity be the parent activity to
        //    MountainDetailsActivity.
    }
}

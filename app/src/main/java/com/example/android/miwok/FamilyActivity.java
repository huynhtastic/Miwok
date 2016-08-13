package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set to new activity category
        setContentView(R.layout.activity_category);
        // get fragman
        getSupportFragmentManager()
        // begin transaction
        .beginTransaction()
        // set rootview and fragment
        .replace(R.id.container, new FamilyFragment())
        // commit transaction
        .commit();
    }

}

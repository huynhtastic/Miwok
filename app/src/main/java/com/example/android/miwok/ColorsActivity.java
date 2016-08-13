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

public class ColorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set layout to inflate activity category layout
        setContentView(R.layout.activity_category);
        // get fragment manager
        getSupportFragmentManager()
                // start a transaction
                .beginTransaction()
                // specify rootview and fragment
                .replace(R.id.container, new ColorsFragment())
                // commit fragment transaction
                .commit();
    }

}

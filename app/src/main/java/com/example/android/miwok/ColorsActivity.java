package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set layout to inflate word list
        setContentView(R.layout.word_list);

        // create wordlist array
        ArrayList<Word> words = new ArrayList<>();

        // add words
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));

        // create adapter
        WordAdapter wordAdapter = new WordAdapter(this, words);

        // find listview
        ListView listView = (ListView) findViewById(R.id.list);

        // setadadapter
        listView.setAdapter(wordAdapter);
    }
}

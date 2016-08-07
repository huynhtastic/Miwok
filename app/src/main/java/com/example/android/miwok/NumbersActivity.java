package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//        String[] words = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";

//        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
//        Log.v("NumbersActivity", "Word at index 1: " + words[1]);
//        Log.v("NumbersActivity", "Word at index 2: " + words[2]);
//        Log.v("NumbersActivity", "Word at index 3: " + words[3]);
//        Log.v("NumbersActivity", "Word at index 4: " + words[4]);
//        Log.v("NumbersActivity", "Word at index 5: " + words[5]);
//        Log.v("NumbersActivity", "Word at index 6: " + words[6]);
//        Log.v("NumbersActivity", "Word at index 7: " + words[7]);
//        Log.v("NumbersActivity", "Word at index 8: " + words[8]);
//        Log.v("NumbersActivity", "Word at index 9: " + words[9]);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten));

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        int index = 0;
//        while (index < words.size()) {
//            TextView textView = new TextView(this);
//            textView.setText(words.get(index));
//            rootView.addView(textView);
//            index++;
//        }
//        for (int i = 0; i < words.size(); i++) {
//            TextView textView = new TextView(this);
//            textView.setText(words.get(i));
//            rootView.addView(textView);
//        }

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

//        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
//        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
//        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
//        Log.v("NumbersActivity", "Word at index 3: " + words.get(2));
//        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
//        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
//        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
//        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
//        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
//        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));

    }
}

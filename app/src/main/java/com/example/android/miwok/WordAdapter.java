package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Richard Huynh on 8/6/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate view if not reused (probably for first time inflation?)
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // get word from list
        Word word = getItem(position);
        // where does getItem come from?
        // could come from ArrayAdapter; knows to getItem from the arrayitem that is passed in

        // get miwokTextView
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // set miwok word
        miwokTextView.setText(word.getMiwokTranslation());

        // get defaultTextView
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.translation_text_view);
        // set translation word
        defaultTextView.setText(word.getDefaultTranslation());

        return listItemView;


    }
}

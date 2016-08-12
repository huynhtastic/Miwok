package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Richard Huynh on 8/6/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;


    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColorResourceId = color;
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
        // set the background color
//        miwokTextView.setBackgroundColor(mColorResourceId);

        // get defaultTextView
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.translation_text_view);
        // set translation word
        defaultTextView.setText(word.getDefaultTranslation());
        // set background color
//        defaultTextView.setBackgroundColor(mColorResourceId);

        // check if word has an associated image resource id
        ImageView imageview = (ImageView) listItemView.findViewById(R.id.image);
        if (word.hasImage()) {
            imageview.setVisibility(View.VISIBLE);
            imageview.setImageResource(word.getImageResourceId());
        } else {
            imageview.setVisibility(View.GONE);
        }

        // set color
        View textContainer = listItemView.findViewById(R.id.list_item_container);
        // find color mapping
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;


    }
}

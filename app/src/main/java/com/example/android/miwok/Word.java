package com.example.android.miwok;

/**
 * Created by Richard Huynh on 8/6/2016.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the miwok translation of the word
     * @return the miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of the word
     * @return the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

}

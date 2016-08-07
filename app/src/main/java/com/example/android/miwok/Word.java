package com.example.android.miwok;

/**
 * Created by Richard Huynh on 8/6/2016.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
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

    /**
     * Get the image resource id associated with this word
     * @return the image resource id (int)
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Returns whether or not there is an image provided with this word
     * @return true if the word has an associated image; false if otherwise
     */
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

}

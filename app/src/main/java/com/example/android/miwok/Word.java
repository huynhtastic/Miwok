package com.example.android.miwok;

/**
 * Created by Richard Huynh on 8/6/2016.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * @param defaultTranslation the word to translate from miwok to
     * @param miwokTranslation the miwok translation of a word
     * @param audioResourceId the audio id to reference from R.raw
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     *
     * @param defaultTranslation the word to translate from miwok to
     * @param miwokTranslation the miwok translation of a word
     * @param imageResourceId the image id to reference from R.drawable
     * @param audioResourceId the audio id to reference from R.raw
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    /**
     * Get the audio resource id associated with this word
     * @return the audio resource id (int)
     */
    public int getAudioResourceId() { return mAudioResourceId; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}

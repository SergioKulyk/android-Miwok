package com.example.android.miwok;

/**
 * Created by SergeyMajor on 01.04.2018.
 */

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDER = -1;
    /**
     * Image for illustrate what a word means
     */
    private int mImageResourceId = NO_IMAGE_PROVIDER;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int mImageView) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = mImageView;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     *  Return true if word has image.z
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDER;
    }
}

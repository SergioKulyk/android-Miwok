package com.example.android.miwok;

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image for illustrate what a word means
     */
    private int mImageResourceId = NO_IMAGE_PROVIDER;

    private static final int NO_IMAGE_PROVIDER = -1;

    /**
     *  Sound resource ID
     */
    private int soundResourceId;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.soundResourceId = soundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int mImageView, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = mImageView;
        this.soundResourceId = soundResourceId;
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

    /**
     *  Return sound resource ID
     */
    public int getSoundResourceId() {
        return soundResourceId;
    }

    /**
     *  Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", soundResourceId=" + soundResourceId +
                '}';
    }
}

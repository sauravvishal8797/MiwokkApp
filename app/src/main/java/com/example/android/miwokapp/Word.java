package com.example.android.miwokapp;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by saurav on 12/1/17.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokkTransaltion;


    public Word(String DefaultTranslation, String MiwokkTranslation){

        mDefaultTranslation = DefaultTranslation;
        mMiwokkTransaltion = MiwokkTranslation;

    }


    public String getDefaultTranslation(){

        return mDefaultTranslation;

    }

    public String getMiwokkTransaltion(){

        return mMiwokkTransaltion;
    }
}

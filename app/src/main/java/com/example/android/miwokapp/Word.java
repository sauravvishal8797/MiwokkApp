package com.example.android.miwokapp;

import android.widget.Button;
import android.widget.ImageView;

import static android.os.Build.VERSION_CODES.M;
import static android.os.Build.VERSION_CODES.N;

/**
 * Created by saurav on 12/1/17.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokkTransaltion;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAuaioREsourceId;


    public Word(String DefaultTranslation, String MiwokkTranslation, int AudioREsourceId){

        mDefaultTranslation = DefaultTranslation;
        mMiwokkTransaltion = MiwokkTranslation;
        mAuaioREsourceId = AudioREsourceId;

    }

    public Word(String DefaultTranslation, String MiwokkTranslation, int imageid, int AudioResourceId){

        mDefaultTranslation = DefaultTranslation;
        mMiwokkTransaltion = MiwokkTranslation;
        mImageResourceId = imageid;
        mAuaioREsourceId = AudioResourceId;

    }


    public String getDefaultTranslation(){

        return mDefaultTranslation;

    }

    public String getMiwokkTransaltion(){

        return mMiwokkTransaltion;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    public int getmAuaioREsourceId() {
        return mAuaioREsourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
            "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                    ", mMiwokTranslation='" + mMiwokkTransaltion + '\'' +
                    ", mAudioResourceId=" + mAuaioREsourceId +
                    ", mImageResourceId=" + mImageResourceId +
                    '}';
        }
    }


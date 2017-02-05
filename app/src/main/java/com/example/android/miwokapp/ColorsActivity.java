package com.example.android.miwokapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "wetetti", R.drawable.color_red));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "takaakki", R.drawable.color_brown));
        words.add(new Word("gray", "topoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow", "topisse", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwitta", R.drawable.color_mustard_yellow));



        // Verify the contents of the array by printing out each array element to the logs
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                mMediaplayer = MediaPlayer.create(ColorsActivity.this, R.raw.number_one);
                mMediaplayer.start();
                Toast.makeText(ColorsActivity.this, "The audio is playing", Toast.LENGTH_SHORT).show();

            }
        });





    }
}




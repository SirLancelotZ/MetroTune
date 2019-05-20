package com.example.metrotune.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.metrotune.R;

public class ChordlistMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chordlist_main);

        ChordlistMainActivity.this.setTitle("Guitar Chord List");

    }
}

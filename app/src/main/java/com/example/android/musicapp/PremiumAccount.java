package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PremiumAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium_account);

        // Find views
        TextView recently_played = (TextView) findViewById(R.id.text_view_recently_played);
        TextView playlists = (TextView) findViewById(R.id.text_view_playlists);
        TextView main = (TextView) findViewById(R.id.text_view_main);

        // Set a click listeners on these views
        // RecentlyPlayed
        recently_played.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(PremiumAccount.this, RecentlyPlayed.class);
                startActivity(numbersIntent);
            }
        });
        // Playlists
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(PremiumAccount.this, Playlists.class);
                startActivity(numbersIntent);
            }
        });
        // Main Activity
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(PremiumAccount.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}

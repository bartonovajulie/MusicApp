package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicapp.R.string.playlists;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Find views
        TextView recently_played = (TextView) findViewById(R.id.text_view_recently_played);
        TextView main = (TextView) findViewById(R.id.text_view_main);
        TextView premium_account = (TextView) findViewById(R.id.text_view_premium_account);

        // Set a click listeners on these views
        // RecentlyPlayed
        recently_played.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Playlists.this, RecentlyPlayed.class);
                startActivity(numbersIntent);
            }
        });
        // Main Activity
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Playlists.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
        // PremiumAccount
        premium_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Playlists.this, PremiumAccount.class);
                startActivity(numbersIntent);
            }
        });
    }
}

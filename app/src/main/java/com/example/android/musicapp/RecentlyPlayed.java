package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecentlyPlayed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        // Find views
        TextView main = (TextView) findViewById(R.id.text_view_main);
        TextView playlists = (TextView) findViewById(R.id.text_view_playlists);
        TextView premium_account = (TextView) findViewById(R.id.text_view_premium_account);

        // Set a click listeners on these views
        // Main Activity
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(RecentlyPlayed.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
        // Playlists
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(RecentlyPlayed.this, Playlists.class);
                startActivity(numbersIntent);
            }
        });
        // PremiumAccount
        premium_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(RecentlyPlayed.this, PremiumAccount.class);
                startActivity(numbersIntent);
            }
        });
    }
}

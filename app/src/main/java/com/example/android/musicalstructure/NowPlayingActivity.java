package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the Recently Played view
        TextView recentlyPlayed = (TextView) findViewById(R.id.recently_played);

        // Set a ClickListener on the Recently Played view
        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentlyPlayedIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(recentlyPlayedIntent);
            }
        });
    }
}

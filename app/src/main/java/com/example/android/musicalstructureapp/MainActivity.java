package com.example.android.musicalstructureapp;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView playerCardView;
    CardView playlistsCardView;
    CardView albumsCardView;
    CardView settingsCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerCardView = (CardView) findViewById(R.id.menuPlayer);
        playlistsCardView = (CardView) findViewById(R.id.menuPlaylists);
        albumsCardView = (CardView) findViewById(R.id.menuAlbums);
        settingsCardView = (CardView) findViewById(R.id.menuSettings);

        playerCardView.setOnClickListener(playerTextViewOnClickListener);
        playlistsCardView.setOnClickListener(playlistsTextViewOnClickListener);
        albumsCardView.setOnClickListener(albumsTextViewOnClickListener);
        settingsCardView.setOnClickListener(settingsTextViewOnClickListener);

    }

    final View.OnClickListener playlistsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openPlaylistsList(playlistsCardView);
        }
    };

    final View.OnClickListener playerTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openPlayerList(playerCardView);
        }
    };

    final View.OnClickListener albumsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openAlbumsList(albumsCardView);
        }
    };

    final View.OnClickListener settingsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openSettingsList(settingsCardView);
        }
    };

    public void openAlbumsList(View view) {
        Intent intent = new Intent(this, com.example.android.musicalstructureapp.AlbumsActivity.class);
        startActivity(intent);
    }

    public void openPlayerList(View view) {
        Intent intent = new Intent(this, com.example.android.musicalstructureapp.PlayerActivity.class);
        startActivity(intent);
    }

    public void openPlaylistsList(View view) {
        Intent intent = new Intent(this, com.example.android.musicalstructureapp.PlaylistsActivity.class);
        startActivity(intent);
    }

    public void openSettingsList(View view) {
        Intent intent = new Intent(this, com.example.android.musicalstructureapp.SettingsActivity.class);
        startActivity(intent);
    }

}

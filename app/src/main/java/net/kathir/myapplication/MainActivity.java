package net.kathir.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button lifecycleView,musicPlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecycleView = (Button)findViewById(R.id.lifecycle_view);
        musicPlayerView = (Button)findViewById(R.id.musicplayer_lifecycle);

        lifecycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,LifeCycleViewActivity.class);
                startActivity(intent);

            }
        });

        musicPlayerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MusicPlayerLifeCycleActivity.class);
                startActivity(intent);

            }
        });
    }
}

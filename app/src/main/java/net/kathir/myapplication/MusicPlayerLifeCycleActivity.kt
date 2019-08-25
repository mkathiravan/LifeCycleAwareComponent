package net.kathir.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MusicPlayerLifeCycleActivity : AppCompatActivity()
{
    val TAG = "MusicPlayerActivity"
    lateinit var musicTextview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.musicplayer_view)
        musicTextview = findViewById(R.id.lifecycle_statement) as TextView

        lifecycle.addObserver(MusicObserver(this))

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Owner onStart")
        musicTextview.setText("Music Player Started")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Owner onPause")
        musicTextview.setText("Music Player Paused")

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Owner onResume")
        musicTextview.setText("Music Player onResumed")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Owner onStop")
        musicTextview.setText("Music Player Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Owner onDestroy")
        musicTextview.setText("Music Player Destroyed")

    }

}
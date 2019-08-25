package net.kathir.myapplication

import android.content.Context
import android.media.MediaPlayer

class MusicManager(context: Context)
{
    private var mediaPlayer : MediaPlayer = MediaPlayer.create(context,R.raw.appangal)

    fun start()
    {
        mediaPlayer.start()
    }

    fun pause()
    {
        mediaPlayer.pause()
    }

    fun stop()
    {
        mediaPlayer.stop()
        mediaPlayer.release()
    }
}
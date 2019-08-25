package net.kathir.myapplication;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class VideoPlayer implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void play(){
        //play logic
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause(){
        //pause logic
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop(){
        //stop logic
    }
}



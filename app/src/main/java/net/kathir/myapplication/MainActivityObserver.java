package net.kathir.myapplication;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {

    private static final String TAG = MainActivityObserver.class.getSimpleName();


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreateEvent()
    {
        Log.d(TAG, "Observer ON_CREATE CALLED");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStartEvent()
    {
        Log.d(TAG, "Observer ON_START CALLED");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResumeEvent()
    {
        Log.d(TAG, "Observer ON_RESUME CALLED");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPauseEvent()
    {
        Log.d(TAG,"Observer ON_PAUSE CALLED");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStopEvent()
    {
        Log.d(TAG,"Observer ON_STOP CALLED");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroyEvent()
    {
        Log.d(TAG,"Observer ON_DESTROY CALLED");
    }



}

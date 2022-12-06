package com.example.jetpackapp;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent() {
        Log.d("Event", "Observer onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent() {
        Log.d("Event", "Observer onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent() {
        Log.d("Event", "Observer onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent() {
        Log.d("Event", "Observer onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent() {
        Log.d("Event", "Observer onStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent() {
        Log.d("Event", "Observer onDestroy");
    }


}

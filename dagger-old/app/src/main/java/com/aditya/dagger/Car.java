package com.aditya.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        // @Inject annotation is Constructor Injection
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        // @Inject annotation is Method Injection
        remote.setListener(this);
    }
    public void drive() {
        Log.d(TAG, "Car is driving.");
    }
}

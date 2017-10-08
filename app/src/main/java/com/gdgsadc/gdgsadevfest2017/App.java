package com.gdgsadc.gdgsadevfest2017;

import android.app.Application;
import android.content.Context;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by dan on 07/10/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Persist data offline
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }


}

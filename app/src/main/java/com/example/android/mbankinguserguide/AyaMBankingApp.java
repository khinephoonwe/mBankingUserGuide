package com.example.android.mbankinguserguide;

import android.app.Application;
import android.content.Context;

/**
 * Created by Phaung on 3/7/2016.
 */
public class AyaMBankingApp extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}

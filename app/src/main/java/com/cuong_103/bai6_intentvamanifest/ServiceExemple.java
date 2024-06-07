package com.cuong_103.bai6_intentvamanifest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServiceExemple extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.e("Cuong_103", "service da duoc khoi tao");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();

        Log.e("Cuong_103", "Service da duoc xoa bo");
    }
}

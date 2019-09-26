package com.gebeya.maqoya.framework.util;

import android.util.Log;

public final class Util {
    private static final String TAG = "MAQOYA-TAG-DEBUG";

    public static void d(Object source,String message)
    {
      String name = source.getClass().getSimpleName();
      String output = name + ":" + message;
      Log.d(TAG,output);

    }
}

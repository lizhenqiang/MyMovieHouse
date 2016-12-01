package com.example.hasee.mymoviehouse.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by lzq on 2016/11/30.
 */
public class MyApplication extends Application {
    public static Context context;
    public static Handler handler;
    public static Thread mainThread;
    public static int mainThreadId;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        handler = new Handler();
        mainThread = Thread.currentThread();//当前用于初始化Application的线程，即为主线程
        mainThreadId = android.os.Process.myTid();//获取当前主线程的id
    }
}

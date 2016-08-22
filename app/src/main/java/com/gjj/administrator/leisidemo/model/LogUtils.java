package com.gjj.administrator.leisidemo.model;

import android.util.Log;

/**
 * Created by Administrator on 2016/8/4.
 */
public class LogUtils {
    public static final int VERBOSE=1;
    public static final int DEBUG=2;
    public static final int NOTHING=6;
    public static final int LEVER=VERBOSE;

    public static void v(String tag,String msg){
        if(LEVER<=VERBOSE){
            Log.v("---"+tag,msg);
        }
    }
    public static void d(String tag,String msg){
        if(LEVER<=DEBUG){
            Log.d("---"+tag,msg);
        }
    }
}

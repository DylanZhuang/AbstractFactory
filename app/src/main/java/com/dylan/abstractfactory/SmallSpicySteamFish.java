package com.dylan.abstractfactory;

import android.util.Log;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/2-下午10:05
 */

public class SmallSpicySteamFish extends SteamFish {
    @Override
    void cook() {
        Log.d(MainActivity.TAG, "微辣--->蒸鱼");
    }
}

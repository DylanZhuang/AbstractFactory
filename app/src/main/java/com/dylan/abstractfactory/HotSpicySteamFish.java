package com.dylan.abstractfactory;

import android.util.Log;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/3-下午7:40
 */

public class HotSpicySteamFish extends SteamFish {
    @Override
    void cook() {
        Log.d(MainActivity.TAG, "特辣--->蒸鱼");
    }
}

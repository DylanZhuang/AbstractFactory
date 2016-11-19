package com.dylan.abstractfactory;

import android.util.Log;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/2-下午10:07
 */

public class SpicySteamFish extends SteamFish {
    @Override
    void cook() {
        Log.d(MainActivity.TAG, "中辣--->蒸鱼");
    }
}

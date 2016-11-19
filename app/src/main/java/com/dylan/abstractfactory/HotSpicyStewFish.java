package com.dylan.abstractfactory;

import android.util.Log;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/3-下午7:42
 */

public class HotSpicyStewFish extends StewFish {
    @Override
    void cook() {
        Log.d(MainActivity.TAG, "特辣--->炖鱼");

    }
}

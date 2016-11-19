package com.dylan.abstractfactory;

import android.util.Log;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/2-下午10:08
 */

public class SmallSpicyStewFish extends StewFish {
    @Override
    void cook() {
        Log.d(MainActivity.TAG, "微辣--->炖鱼");
    }
}

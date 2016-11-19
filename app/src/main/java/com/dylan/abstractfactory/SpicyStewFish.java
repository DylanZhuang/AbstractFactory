package com.dylan.abstractfactory;

import android.util.Log;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/2-下午10:09
 */

public class SpicyStewFish extends StewFish {
    @Override
    void cook() {
        Log.d(MainActivity.TAG, "中辣--->炖鱼");
    }
}

package com.dylan.abstractfactory;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/2-下午10:10
 */

public interface CookFishFactory {
    SteamFish getSteamFish();

    StewFish getStewFish();
}

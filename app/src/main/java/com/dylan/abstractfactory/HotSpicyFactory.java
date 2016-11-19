package com.dylan.abstractfactory;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/3-下午7:43
 */

public class HotSpicyFactory implements CookFishFactory {
    @Override
    public SteamFish getSteamFish() {
        return new HotSpicySteamFish();
    }

    @Override
    public StewFish getStewFish() {
        return new HotSpicyStewFish();
    }
}

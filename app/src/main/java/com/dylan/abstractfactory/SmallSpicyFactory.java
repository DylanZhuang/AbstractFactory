package com.dylan.abstractfactory;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/11/2-下午10:11
 */

public class SmallSpicyFactory implements CookFishFactory {
    @Override
    public SteamFish getSteamFish() {
        return new SmallSpicySteamFish();
    }

    @Override
    public StewFish getStewFish() {
        return new SmallSpicyStewFish();
    }
}

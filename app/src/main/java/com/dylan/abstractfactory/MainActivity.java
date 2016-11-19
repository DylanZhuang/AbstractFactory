package com.dylan.abstractfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cook();
    }

//    private void cook() {
//        SmallSpicyFactory smallSpicyFactory = new SmallSpicyFactory();
//        SteamFish smallSpicySteamFish = smallSpicyFactory.getSteamFish();
//        smallSpicySteamFish.cook();
//
//        StewFish smallSpicyStewFish = smallSpicyFactory.getStewFish();
//        smallSpicyStewFish.cook();
//    }

//    private void cook() {
//        SpicyFactory spicyFactory = new SpicyFactory();
//        SteamFish spicySteamFish = spicyFactory.getSteamFish();
//        spicySteamFish.cook();
//
//        StewFish spicyStewFish = spicyFactory.getStewFish();
//        spicyStewFish.cook();
//    }

    private void cook() {
        HotSpicyFactory hotSpicyFactory = new HotSpicyFactory();
        SteamFish hotSpicySteamFish = hotSpicyFactory.getSteamFish();
        hotSpicySteamFish.cook();

        StewFish hotSpicyStewFish = hotSpicyFactory.getStewFish();
        hotSpicyStewFish.cook();
    }
}

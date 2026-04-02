package com.example.basio3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;

public class BatteryManager {

    private Context context;

    public BatteryManager(Context context) {
        this.context = context;
    }

    public int getBatteryLevel() {
        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = context.registerReceiver(null, ifilter);

        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        return (int) (((float) level / (float) scale) * 100);
    }

    public String getBatteryHealth() {
        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = context.registerReceiver(null, ifilter);

        int health = batteryStatus.getIntExtra(BatteryManager.EXTRA_HEALTH, -1);

        switch (health) {
            case BatteryManager.BATTERY_HEALTH_GOOD:
                return "Good";
            case BatteryManager.BATTERY_HEALTH_OVERHEAT:
                return "Overheat";
            case BatteryManager.BATTERY_HEALTH_DEAD:
                return "Dead";
            case BatteryManager.BATTERY_HEALTH_UNKNOWN:
            default:
                return "Unknown";
        }
    }

    public boolean isCharging() {
        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = context.registerReceiver(null, ifilter);

        int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        return status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL;
    }
}
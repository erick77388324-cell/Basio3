package com.example.basio3;

import android.content.Context;
import android.util.Log;

public class StorageManager {

    private static final String TAG = "StorageManager";
    private Context context;

    public StorageManager(Context context) {
        this.context = context;
    }

    public long getAvailableRAM() {
        // Logic to get available RAM
        long availableRAM = Runtime.getRuntime().freeMemory();
        Log.d(TAG, "Available RAM: " + availableRAM + " bytes");
        return availableRAM;
    }

    public long getUsedStorage() {
        // Logic to get used storage
        File path = Environment.getDataDirectory();
        StatFs stat = new StatFs(path.getPath());
        long totalBytes = stat.getTotalBytes();
        long availableBytes = stat.getAvailableBytes();
        long usedBytes = totalBytes - availableBytes;
        Log.d(TAG, "Used Storage: " + usedBytes + " bytes");
        return usedBytes;
    }

    // Additional methods for managing storage and RAM can be added here
}
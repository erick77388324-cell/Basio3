package com.example.basio3;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class PermissionsManager {
    // Request codes for permissions
    public static final int PERMISSION_REQUEST_CALL_PHONE = 1;
    public static final int PERMISSION_REQUEST_SEND_SMS = 2;
    public static final int PERMISSION_REQUEST_READ_CONTACTS = 3;
    public static final int PERMISSION_REQUEST_WRITE_CONTACTS = 4;
    public static final int PERMISSION_REQUEST_READ_PHONE_STATE = 5;
    public static final int PERMISSION_REQUEST_ACCESS_FINE_LOCATION = 6;
    public static final int PERMISSION_REQUEST_CAMERA = 7;
    public static final int PERMISSION_REQUEST_RECORD_AUDIO = 8;
    public static final int PERMISSION_REQUEST_READ_EXTERNAL_STORAGE = 9;
    public static final int PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE = 10;

    // Method to check if a specific permission is granted
    public static boolean isPermissionGranted(@NonNull Activity activity, @NonNull String permission) {
        return ContextCompat.checkSelfPermission(activity, permission) == PackageManager.PERMISSION_GRANTED;
    }

    // Request permissions in runtime
    public static void requestPermissions(Activity activity, String[] permissions, int requestCode) {
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }

    // Handle the result of permission requests
    public static void handlePermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_REQUEST_CALL_PHONE:
                // Handle CALL_PHONE permission result
                break;
            case PERMISSION_REQUEST_SEND_SMS:
                // Handle SEND_SMS permission result
                break;
            case PERMISSION_REQUEST_READ_CONTACTS:
                // Handle READ_CONTACTS permission result
                break;
            case PERMISSION_REQUEST_WRITE_CONTACTS:
                // Handle WRITE_CONTACTS permission result
                break;
            case PERMISSION_REQUEST_READ_PHONE_STATE:
                // Handle READ_PHONE_STATE permission result
                break;
            case PERMISSION_REQUEST_ACCESS_FINE_LOCATION:
                // Handle ACCESS_FINE_LOCATION permission result
                break;
            case PERMISSION_REQUEST_CAMERA:
                // Handle CAMERA permission result
                break;
            case PERMISSION_REQUEST_RECORD_AUDIO:
                // Handle RECORD_AUDIO permission result
                break;
            case PERMISSION_REQUEST_READ_EXTERNAL_STORAGE:
                // Handle READ_EXTERNAL_STORAGE permission result
                break;
            case PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE:
                // Handle WRITE_EXTERNAL_STORAGE permission result
                break;
        }
    }
}
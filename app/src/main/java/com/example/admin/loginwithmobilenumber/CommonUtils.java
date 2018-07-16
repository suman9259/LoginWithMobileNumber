package com.example.admin.loginwithmobilenumber;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

public class CommonUtils {
    private static CommonUtils instance;
    private CommonUtils() {
    }

    public static CommonUtils getInstance(){
        if (instance==null){
            instance=new CommonUtils();
        }
        return instance;
    }
    public boolean isNotNull(Object object){
        if (object!=null){
            return true;
        }
        return false;
    }
    public  boolean isNotNullAndSitringGreaterThenZero(String string){
        if (string!=null && string.trim().length()>0){
            return true;
        }
        return false;
    }
    public String getDeviceId(Context context){
        return Settings.Secure.getString(context.getContentResolver(),Settings.Secure.ANDROID_ID);
    }
    public String getAppVersionName(Context context){
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(),0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

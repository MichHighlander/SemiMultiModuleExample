package com.example.lib1;

import android.app.Application;

import com.example.baselib.BaseLibClass;
import com.secneo.sdk.Helper;

import dji.sdk.sdkmanager.DJISDKManager;

public class Lib1Class extends BaseLibClass {

    public Lib1Class(String addonString, int addonInt, Application application) {
        super(addonString, addonInt, application);
        Helper.install(application);
    }

    @Override
    public String talk() {
        return this.getClass().getName() + " " + this.addonString + " - " + DJISDKManager.getInstance().getSDKVersion();
    }
}

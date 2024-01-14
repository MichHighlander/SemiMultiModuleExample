package com.example.lib2;

import android.app.Application;

import com.example.baselib.BaseLibClass;
import com.secneo.sdk.Helper;

import dji.v5.manager.SDKManager;

public class Lib2Class extends BaseLibClass {

    public Lib2Class(String addonString, int addonInt, Application application) {
        super(application);
        Helper.install(application);
    }

    @Override
    public String talk() {
        return this.getClass().getName() + " - " + SDKManager.getInstance().getSDKVersion();
    }
}
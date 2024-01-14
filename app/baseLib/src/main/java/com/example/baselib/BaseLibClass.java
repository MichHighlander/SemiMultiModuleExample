package com.example.baselib;

import android.app.Application;

public abstract class BaseLibClass implements LibInterface {
    protected String addonString;
    protected int addonInt;
    public BaseLibClass(String addonString, int addonInt, Application application) {
        this.addonString = addonString;
        this.addonInt = addonInt;
    }
}

package com.example.baselib;

import android.app.Application;

public abstract class BaseLibClass implements LibInterface {
    protected final Application application;
    public BaseLibClass(Application application) {
        this.application = application;
    }
}

package com.example.baselib;

import android.app.Activity;
import android.app.Application;
import android.view.View;

import java.lang.reflect.Constructor;

public class LibBroker implements LibInterface {
    private BaseLibClass agent;
    private static LibBroker instance;

    private LibBroker() {
    }

    public static LibBroker getInstance() {
        if (instance == null) instance = new LibBroker();
        return instance;
    }

    public void createAgent(LibType libType, Application application) throws Exception {
        Class<?> runtimeClass = Class.forName(libType.getClassName());
        Constructor<?> constructor = runtimeClass.getDeclaredConstructor(Application.class);
        this.agent = (BaseLibClass) constructor.newInstance(application);
    }

    @Override
    public String talk() {
        return this.agent.talk();
    }

    @Override
    public View getLayoutView() {
        return this.agent.getLayoutView();
    }

    @Override
    public void initLibTxtView(Activity activity) {
        this.agent.initLibTxtView(activity);
    }

    @Override
    public void stam() {
        agent.stam();
    }
}

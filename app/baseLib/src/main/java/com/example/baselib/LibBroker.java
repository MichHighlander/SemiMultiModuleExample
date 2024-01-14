package com.example.baselib;

import android.app.Application;
import android.util.Log;

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
        Constructor<?> constructor = runtimeClass.getDeclaredConstructor(String.class, int.class, Application.class);
        this.agent = (BaseLibClass) constructor.newInstance("This is addon", 3, application);
    }

    @Override
    public String talk() {
        return this.agent.talk();
    }
}

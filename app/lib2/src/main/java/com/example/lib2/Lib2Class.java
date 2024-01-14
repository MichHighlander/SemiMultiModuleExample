package com.example.lib2;

import android.app.Activity;
import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.baselib.BaseLibClass;
import com.secneo.sdk.Helper;

import dji.v5.manager.SDKManager;

public class Lib2Class extends BaseLibClass {

    public Lib2Class(Application application) {
        super(application);
        Helper.install(application);
    }

    /*
    Functional
     */
    @Override
    public String talk() {
        return this.getClass().getName() + " - " + SDKManager.getInstance().getSDKVersion();
    }

    /*
     * UI
     */
    @Override
    public View getLayoutView() {
        LayoutInflater inflater = LayoutInflater.from(application);  // 'this' could be your Activity or Context
        return inflater.inflate(R.layout.lib2layout, null);
    }

    @Override
    public void initLibTxtView(Activity activity) {
        TextView libTxt = activity.findViewById(R.id.lib_txt);
        libTxt.setText("This is Lib2 - After init lib txt");
    }
}
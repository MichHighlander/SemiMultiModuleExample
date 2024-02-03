package com.example.lib1;

import android.app.Activity;
import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.baselib.BaseLibClass;
import com.secneo.sdk.Helper;

import dji.sdk.sdkmanager.DJISDKManager;

public class Lib1Class extends BaseLibClass {

    public Lib1Class(Application application) {
        super(application);
        Helper.install(application);
    }

    @Override
    public String talk() {
        return this.getClass().getName() + " - " + DJISDKManager.getInstance().getSDKVersion();
    }

    @Override
    public View getLayoutView() {
        LayoutInflater inflater = LayoutInflater.from(application);  // 'this' could be your Activity or Context
        return inflater.inflate(R.layout.lib1layout, null);
    }

    @Override
    public void initLibTxtView(Activity activity) {
        TextView libTxt = activity.findViewById(R.id.lib_txt);
        libTxt.setText("This is Lib1 - After init lib txt");
    }

    @Override
    public void stam() {

    }
}

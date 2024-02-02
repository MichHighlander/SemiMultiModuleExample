package com.example.baselib;

import android.app.Activity;
import android.view.View;

public interface LibInterface {
    String talk();
    View getLayoutView();
    void initLibTxtView(Activity activity);
    void stam();
}

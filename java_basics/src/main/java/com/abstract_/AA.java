package com.abstract_;

import com.design_mode.Template;

public class AA extends Template {
    @Override
    public void job() {
        //重写弗雷Template的job方法
        long num = 0;
        for (int i = 1; i <= 800000; i++) {
            num *= i;
        }
    }
}

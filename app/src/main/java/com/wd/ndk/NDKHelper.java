package com.wd.ndk;

public class NDKHelper {
    static {
        System.loadLibrary("main");
    }
    public  native  String getNdkPrint();
}

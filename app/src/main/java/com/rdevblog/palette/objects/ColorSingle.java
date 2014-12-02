package com.rdevblog.palette.objects;

/**
 * Created by TomSingleton on 01/12/14.
 */
public class ColorSingle {

    private String mName;
    private String mHexcode;

    public ColorSingle(String name, String hexcode) {

        this.mName = name;
        this.mHexcode = hexcode;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmHexcode() {
        return mHexcode;
    }

    public void setmHexcode(String mHexcode) {
        this.mHexcode = mHexcode;
    }
}

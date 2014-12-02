package com.rdevblog.palette;

import com.rdevblog.palette.objects.ColorSingle;

import java.util.ArrayList;

/**
 * Created by TomSingleton on 01/12/14.
 */
public class ColorArray {
    private static ColorArray ourInstance = new ColorArray();

    ArrayList<ColorSingle> colorSingleArrayList = new ArrayList<>();

    public static ColorArray getInstance() {
        return ourInstance;
    }

    private ColorArray() {

    }

    public ArrayList<ColorSingle> getColorSingleArrayList() {
        return colorSingleArrayList;
    }

    public void addColor(ColorSingle colorSingle){
        colorSingleArrayList.add(colorSingle);
    }

    public void removeColor(ColorSingle colorSingle){
        colorSingleArrayList.remove(colorSingle);
    }

    public ColorSingle getColor(int i){
        return colorSingleArrayList.get(i);
    }

}

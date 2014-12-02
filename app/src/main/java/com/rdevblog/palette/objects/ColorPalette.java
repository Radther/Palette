package com.rdevblog.palette.objects;

import java.util.ArrayList;

/**
 * Created by TomSingleton on 01/12/14.
 */
public class ColorPalette {

    ArrayList<ColorSingle> colorPaletteArray;

    public ColorPalette() {
        colorPaletteArray = new ArrayList<ColorSingle>();
    }

    public ArrayList<ColorSingle> getColorPaletteArray() {
        return colorPaletteArray;
    }

    public void addColor(ColorSingle color){
        colorPaletteArray.add(color);
    }

    public void removeColor(ColorSingle color){
        colorPaletteArray.remove(color);
    }

}

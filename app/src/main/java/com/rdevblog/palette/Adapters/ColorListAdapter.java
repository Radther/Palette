package com.rdevblog.palette.Adapters;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rdevblog.palette.ColorArray;
import com.rdevblog.palette.R;
import com.rdevblog.palette.objects.ColorSingle;

import java.util.ArrayList;

/**
 * Created by TomSingleton on 01/12/14.
 */
public class ColorListAdapter extends RecyclerView.Adapter<ColorListAdapter.ColorViewHolder> {

    ArrayList<ColorSingle> colorSingleArrayList;

    @Override
    public void onBindViewHolder(ColorViewHolder holder, int position) {
        String hexcode = "#"+ColorArray.getInstance().getColor(position).getmHexcode();
        holder.colorShapeView.setBackgroundColor(Color.parseColor(hexcode));
        holder.colorHexText.setText(hexcode);
    }

    public ColorListAdapter() {
    }

    @Override
    public int getItemCount() {
        return ColorArray.getInstance().getColorSingleArrayList().size();
    }

    @Override
    public ColorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.palette_card_item, parent, false);

        return new ColorViewHolder(view);
    }



    public static class ColorViewHolder extends RecyclerView.ViewHolder{

        public ImageView colorShapeView;
        public TextView colorHexText;

        public ColorViewHolder(View itemView) {
            super(itemView);
            colorShapeView = (ImageView)itemView.findViewById(R.id.color_shape_view);
            colorHexText = (TextView)itemView.findViewById(R.id.color_hex_text);
        }
    }
}
package com.rdevblog.palette;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.rdevblog.palette.Adapters.ColorListAdapter;
import com.rdevblog.palette.objects.ColorSingle;


public class MainActivity extends ActionBarActivity {

    Toolbar toolbar;
    RecyclerView mColorRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        for(int i=0; i<16; i++){
            ColorSingle colorSingle;
            switch (i){
                case 10:
                    colorSingle = new ColorSingle(String.valueOf(i), "1231"+"aa");
                    ColorArray.getInstance().addColor(colorSingle);
                    break;

                case 11:
                    colorSingle = new ColorSingle(String.valueOf(i), "1231"+"bb");
                    ColorArray.getInstance().addColor(colorSingle);
                    break;

                case 12:
                    colorSingle = new ColorSingle(String.valueOf(i), "1231"+"cc");
                    ColorArray.getInstance().addColor(colorSingle);
                    break;

                case 13:
                    colorSingle = new ColorSingle(String.valueOf(i), "1231"+"dd");
                    ColorArray.getInstance().addColor(colorSingle);

                case 14:
                    colorSingle = new ColorSingle(String.valueOf(i), "1231"+"ee");
                    ColorArray.getInstance().addColor(colorSingle);
                    break;

                case 15:
                    colorSingle = new ColorSingle(String.valueOf(i), "1231"+"ff");
                    ColorArray.getInstance().addColor(colorSingle);
                    break;
                default:
                    colorSingle = new ColorSingle(String.valueOf(i), "1231"+String.valueOf(i)+String.valueOf(i));
                    ColorArray.getInstance().addColor(colorSingle);

            }

        }

        mColorRecyclerView = (RecyclerView)findViewById(R.id.color_recycler_view);
        mColorRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mColorRecyclerView.setItemAnimator(new DefaultItemAnimator());

        ColorListAdapter mColorAdapter = new ColorListAdapter();
        mColorRecyclerView.setAdapter(mColorAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_plus) {
            Intent intent = new Intent(this, NewColorActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

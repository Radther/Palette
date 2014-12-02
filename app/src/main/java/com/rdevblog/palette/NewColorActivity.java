package com.rdevblog.palette;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.rdevblog.palette.R;

public class NewColorActivity extends ActionBarActivity {

    ImageView colorPreview;
    EditText nameColorEdit;
    EditText hexColorEdit;
    TextView invalidColorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_color);
        colorPreview = (ImageView)findViewById(R.id.color_preview);
        nameColorEdit = (EditText)findViewById(R.id.color_name_edit);
        hexColorEdit = (EditText)findViewById(R.id.color_hex_edit);
        invalidColorText = (TextView)findViewById(R.id.invalid_text_view);

        hexColorEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                try{
                    Log.d("Valid?", String.valueOf(s));
                    colorPreview.setBackgroundColor(Color.parseColor("#"+String.valueOf(s)));
                    invalidColorText.setVisibility(View.INVISIBLE);
                } catch (IllegalArgumentException e){
                    colorPreview.setBackgroundColor(Color.parseColor("#000000"));
                    invalidColorText.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_color, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

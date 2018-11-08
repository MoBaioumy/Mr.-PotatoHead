package com.example.moham.mrpotatoheadv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v){
        Log.d("Potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;

        String checkBoxText = checkbox.getText().toString();
        Log.d("Checkbox text", checkBoxText);
        // Log.d("Equal??", checkBoxText.equals(""));
        boolean boxValue = checkbox.isChecked();
        // Log.d("box value", boxValue);

        if (checkBoxText.equals("arms") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.arms);
            image.setVisibility(View.VISIBLE);
        }

        if (checkBoxText.equals("ears") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.ears);
            image.setVisibility(View.VISIBLE);
        }

        if (checkBoxText.equals("mouth") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.mouth);
            image.setVisibility(View.VISIBLE);
        }

        if (checkBoxText.equals("mus") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.mus);
            image.setVisibility(View.VISIBLE);
        }

        if (checkBoxText.equals("shoes") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.shoes);
            image.setVisibility(View.VISIBLE);
        }

        if (checkBoxText.equals("glass") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.glass);
            image.setVisibility(View.VISIBLE);
        }

        if (checkBoxText.equals("eyes") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.eyes);
            image.setVisibility(View.VISIBLE);
        }

        if (checkBoxText.equals("nose") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.nose);
            image.setVisibility(View.VISIBLE);
        }
        if (checkBoxText.equals("hat") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.hat);
            image.setVisibility(View.VISIBLE);
        }
        if (checkBoxText.equals("brows") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.brows);
            image.setVisibility(View.VISIBLE);
        }




    }

}

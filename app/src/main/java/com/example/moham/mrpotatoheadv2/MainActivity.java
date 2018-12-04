package com.example.moham.mrpotatoheadv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    // add log in screen
    // add mrs potato head
    // make a slick background

    Boolean isBodyPartLists [] = {false};

    ArrayList<Boolean> isBodyPartList = new ArrayList<Boolean>();
    ArrayList<Integer> idBodyPartList = new ArrayList<Integer>();
    ArrayList<String> bodyPartList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.arms);
        bodyPartList.add("arms");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.nose);
        bodyPartList.add("nose");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.eyes);
        bodyPartList.add("eyes");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.ears);
        bodyPartList.add("ears");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.mus);
        bodyPartList.add("mus");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.mouth);
        bodyPartList.add("mouth");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.glass);
        bodyPartList.add("glass");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.hat);
        bodyPartList.add("hat");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.shoes);
        bodyPartList.add("shoes");

        isBodyPartList.add(false);
        idBodyPartList.add(R.id.brows);
        bodyPartList.add("brows");
    }

    public void checkClicked(View v){
        CheckBox checkbox = (CheckBox) v;
        String checkBoxText = checkbox.getText().toString();
        boolean boxValue = checkbox.isChecked();

        for (int i = 0; i < idBodyPartList.size(); i++){

            if (boxValue && checkBoxText.equals(bodyPartList.get(i))){
                ImageView image = (ImageView) findViewById(idBodyPartList.get(i));
                image.setVisibility(View.VISIBLE);
                isBodyPartList.set(i, true);

            }
            else if ((!boxValue && checkBoxText.equals(bodyPartList.get(i)))){
                ImageView image = (ImageView) findViewById(idBodyPartList.get(i));
                image.setVisibility(View.INVISIBLE);
                isBodyPartList.set(i, false);
            }

        }

    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        for (int i = 0; i < idBodyPartList.size(); i++){
            outState.putBoolean(bodyPartList.get(i), isBodyPartList.get(i));
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        for (int i = 0; i < idBodyPartList.size(); i++) {
            isBodyPartList.set(i, savedInstanceState.getBoolean(bodyPartList.get(i)));
        }

        for (int i = 0; i < idBodyPartList.size(); i++){
            if (isBodyPartList.get(i)){
                ImageView image = (ImageView) findViewById(idBodyPartList.get(i));
                image.setVisibility(View.VISIBLE);
            }
        }

    }

}

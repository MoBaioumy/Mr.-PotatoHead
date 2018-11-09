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

    String checkBoxText;

    boolean is_nose = false;
    boolean is_mus = false;
    boolean is_glass = false;
    boolean is_shoes = false;
    boolean is_mouth = false;
    boolean is_ears = false;
    boolean is_brows = false;
    boolean is_hat = false;
    boolean is_arms = false;
    boolean is_eyes = false;


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
            is_arms = true;
        }
        else if (checkBoxText.equals("arms") && boxValue == false){
            ImageView image = (ImageView) findViewById(R.id.arms);
            image.setVisibility(View.INVISIBLE);
            is_arms = false;
        }

        if (checkBoxText.equals("ears") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.ears);
            image.setVisibility(View.VISIBLE);
            is_ears = true;
        }

        else if (checkBoxText.equals("ears") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.ears);
            image.setVisibility(View.INVISIBLE);
            is_ears = false;
        }

        if (checkBoxText.equals("mouth") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.mouth);
            image.setVisibility(View.VISIBLE);
            is_mouth = true;
        }

        else if (checkBoxText.equals("mouth") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.mouth);
            image.setVisibility(View.INVISIBLE);
            is_mouth = false;
        }

        if (checkBoxText.equals("mus") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.mus);
            image.setVisibility(View.VISIBLE);
            is_mus = true;
        }

        else if (checkBoxText.equals("mus") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.mus);
            image.setVisibility(View.INVISIBLE);
            is_mus = false;
        }

        if (checkBoxText.equals("shoes") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.shoes);
            image.setVisibility(View.VISIBLE);
            is_shoes = true;
        }

        else if (checkBoxText.equals("shoes") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.shoes);
            image.setVisibility(View.INVISIBLE);
            is_shoes = false;
        }

        if (checkBoxText.equals("glass") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.glass);
            image.setVisibility(View.VISIBLE);
            is_glass = true;
        }

        else if (checkBoxText.equals("glass") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.glass);
            image.setVisibility(View.INVISIBLE);
            is_glass = false;
        }

        if (checkBoxText.equals("eyes") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.eyes);
            image.setVisibility(View.VISIBLE);
            is_ears = true;
        }

        else if (checkBoxText.equals("eyes") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.eyes);
            image.setVisibility(View.INVISIBLE);
            is_ears = false;
        }

        if (checkBoxText.equals("nose") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.nose);
            image.setVisibility(View.VISIBLE);
            is_nose = true;
        }

        else if (checkBoxText.equals("nose") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.nose);
            image.setVisibility(View.INVISIBLE);
            is_nose = false;

        }

        if (checkBoxText.equals("hat") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.hat);
            image.setVisibility(View.VISIBLE);
            is_hat = true;
        }

        else if (checkBoxText.equals("hat") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.hat);
            image.setVisibility(View.INVISIBLE);
            is_hat = false;
        }

        if (checkBoxText.equals("brows") && boxValue == true){
            ImageView image = (ImageView) findViewById(R.id.brows);
            image.setVisibility(View.VISIBLE);
            is_brows = true;
        }

        else if (checkBoxText.equals("brows") && boxValue == false) {
            ImageView image = (ImageView) findViewById(R.id.brows);
            image.setVisibility(View.INVISIBLE);
            is_brows = false;
        }

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        outState.putBoolean("is_arms", is_arms);
        outState.putBoolean("is_ears", is_ears);
        outState.putBoolean("is_brows", is_brows);
        outState.putBoolean("is_hat", is_hat);
        outState.putBoolean("is_glass", is_glass);
        outState.putBoolean("is_nose", is_nose);
        outState.putBoolean("is_eyes", is_eyes);
        outState.putBoolean("is_mus", is_mus);
        outState.putBoolean("is_mouth", is_mouth);
        outState.putBoolean("is_shoes", is_shoes);
        // outState.putString("name", value);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        is_arms = savedInstanceState.getBoolean("is_arms");

        if (is_arms){
            ImageView image = (ImageView) findViewById(R.id.arms);
            image.setVisibility(View.VISIBLE);
        }

        is_ears = savedInstanceState.getBoolean("is_ears");

        if (is_ears){
            ImageView image = (ImageView) findViewById(R.id.ears);
            image.setVisibility(View.VISIBLE);
        }

        is_eyes = savedInstanceState.getBoolean("is_eyes");

        if (is_ears){
            ImageView image = (ImageView) findViewById(R.id.eyes);
            image.setVisibility(View.VISIBLE);
        }

        is_brows = savedInstanceState.getBoolean("is_brows");

        if (is_brows){
            ImageView image = (ImageView) findViewById(R.id.brows);
            image.setVisibility(View.VISIBLE);
        }

        is_glass = savedInstanceState.getBoolean("is_glass");

        if (is_glass){
            ImageView image = (ImageView) findViewById(R.id.glass);
            image.setVisibility(View.VISIBLE);
        }

        is_mus = savedInstanceState.getBoolean("is_mus");
        if (is_mus){
            ImageView image = (ImageView) findViewById(R.id.mus);
            image.setVisibility(View.VISIBLE);
        }

        is_mouth = savedInstanceState.getBoolean("is_mouth");
        if (is_mouth){
            ImageView image = (ImageView) findViewById(R.id.mouth);
            image.setVisibility(View.VISIBLE);
        }

        is_shoes = savedInstanceState.getBoolean("is_shoes");
        if (is_shoes){
            ImageView image = (ImageView) findViewById(R.id.shoes);
            image.setVisibility(View.VISIBLE);
        }

        is_hat = savedInstanceState.getBoolean("is_hat");
        if (is_hat){
            ImageView image = (ImageView) findViewById(R.id.hat);
            image.setVisibility(View.VISIBLE);
        }

        is_nose = savedInstanceState.getBoolean("is_nose");
        if (is_nose){
            ImageView image = (ImageView) findViewById(R.id.nose);
            image.setVisibility(View.VISIBLE);
        }
        
    }

}

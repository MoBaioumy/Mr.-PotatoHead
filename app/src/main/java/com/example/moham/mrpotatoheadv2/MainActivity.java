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

    final int lightPink = 0xFFD81B60;
    final int black = 0xFF000000;

    // create bodyPart object for all 10 parts
    bodyPart arms = new bodyPart("arms", R.id.arms, R.id.armsCheckBox);
    bodyPart eyes = new bodyPart("eyes", R.id.eyes, R.id.eyesCheckBox );
    bodyPart hat = new bodyPart("hat", R.id.hat, R.id.hatCheckBox);
    bodyPart ears = new bodyPart("ears", R.id.ears, R.id.earsCheckBox);
    bodyPart shoes = new bodyPart("shoes", R.id.shoes, R.id.shoesCheckBox);
    bodyPart glass = new bodyPart("glass", R.id.glass, R.id.glassCheckBox);
    bodyPart mouth = new bodyPart("mouth", R.id.mouth, R.id.mouthCheckBox);
    bodyPart mus = new bodyPart("mus", R.id.mus, R.id.musCheckBox);
    bodyPart nose = new bodyPart("nose", R.id.nose, R.id.noseCheckBox);
    bodyPart brows = new bodyPart("brows", R.id.brows, R.id.browsCheckBox);

    // add all the parts to an array
    bodyPart[] bodyPartList = {arms, eyes, hat, ears, shoes, glass, mouth, mus, nose, brows};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v){
        /**
        This function will get called when ANY of the checkboxes is checked. Depending on that
        the corresponding picture of the bodyPart will be visible and the text will be colored.
         */

        // convert view to checkbox and get its value
        CheckBox checkbox = (CheckBox) v;
        String checkBoxText = checkbox.getText().toString();
        boolean boxValue = checkbox.isChecked();

        // loop over all the body parts and sets to visible and colored if checked
        for (int i = 0; i < bodyPartList.length; i++){

            if (boxValue && checkBoxText.equals(bodyPartList[i].getName())){
                ImageView image = (ImageView) findViewById(bodyPartList[i].getId());
                image.setVisibility(View.VISIBLE);
                bodyPartList[i].setVisable(true);
                // sets the text to a pink color
                checkbox.setTextColor(lightPink);

            }
            else if ((!boxValue && checkBoxText.equals(bodyPartList[i].getName()))){
                ImageView image = (ImageView) findViewById(bodyPartList[i].getId());
                image.setVisibility(View.INVISIBLE);
                bodyPartList[i].setVisable(false);
                // restores the text to original black
                checkbox.setTextColor(black);
            }
        }
    }

    public void clearAll(View w){
        /**
         * Thie function will remove all the body parts. It's equivalent to unchecking
         * all the checkboxes at once.
         */
        for (int i = 0; i < bodyPartList.length; i++){
            ImageView image = (ImageView) findViewById(bodyPartList[i].getId());
            image.setVisibility(View.INVISIBLE);
            bodyPartList[i].setVisable(false);
            CheckBox checkbox = findViewById(bodyPartList[i].getCheckboxId());
            checkbox.setTextColor(black);
            checkbox.setChecked(false);
        }
    }

    public void dressAll(View w){
        /**
         * dressAll function is will add all the body parts. It's equivalent to checking
         * all the checkboxes at once.
         */
        for (int i = 0; i < bodyPartList.length; i++){

            ImageView image = (ImageView) findViewById(bodyPartList[i].getId());
            image.setVisibility(View.VISIBLE);
            bodyPartList[i].setVisable(true);
            CheckBox checkbox = findViewById(bodyPartList[i].getCheckboxId());
            checkbox.setTextColor(lightPink);
            checkbox.setChecked(true);
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // save all the checkedboxes in the 'visible' attribute of the bodyPart object
        for (int i = 0; i < bodyPartList.length; i++){
           outState.putBoolean(bodyPartList[i].getName(), bodyPartList[i].getVisable());
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


        for (int i = 0; i < bodyPartList.length; i++){
            // restore the saved value in the bodyPart object
            bodyPartList[i].setVisable(savedInstanceState.getBoolean(bodyPartList[i].getName()));

            // in case the saved value was true(box checked), make the image visible and color text
            if (bodyPartList[i].getVisable()){
                ImageView image = (ImageView) findViewById(bodyPartList[i].getId());
                image.setVisibility(View.VISIBLE);
                bodyPartList[i].setVisable(true);
                CheckBox checkbox = findViewById(bodyPartList[i].getCheckboxId());
                checkbox.setTextColor(lightPink);
            }
        }
    }
}

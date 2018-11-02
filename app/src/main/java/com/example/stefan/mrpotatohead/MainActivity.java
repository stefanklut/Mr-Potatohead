package com.example.stefan.mrpotatohead;

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
        // If any parts of the potatohead were visible restore their visibility after app changes
        if (savedInstanceState != null) {
            ((ImageView) findViewById(R.id.imageArms)).setVisibility(savedInstanceState.getInt("arms"));
            ((ImageView) findViewById(R.id.imageNose)).setVisibility(savedInstanceState.getInt("nose"));
            ((ImageView) findViewById(R.id.imageEars)).setVisibility(savedInstanceState.getInt("ears"));
            ((ImageView) findViewById(R.id.imageEyebrows)).setVisibility(savedInstanceState.getInt("eyebrows"));
            ((ImageView) findViewById(R.id.imageEyes)).setVisibility(savedInstanceState.getInt("eyes"));
            ((ImageView) findViewById(R.id.imageGlasses)).setVisibility(savedInstanceState.getInt("glasses"));
            ((ImageView) findViewById(R.id.imageHat)).setVisibility(savedInstanceState.getInt("hat"));
            ((ImageView) findViewById(R.id.imageMouth)).setVisibility(savedInstanceState.getInt("mouth"));
            ((ImageView) findViewById(R.id.imageMustache)).setVisibility(savedInstanceState.getInt("mustache"));
            ((ImageView) findViewById(R.id.imageShoes)).setVisibility(savedInstanceState.getInt("shoes"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save the visibility of the parts of the potatohead to use if there is an app switch
        outState.putInt("arms", ((ImageView) findViewById(R.id.imageArms)).getVisibility());
        outState.putInt("nose", ((ImageView) findViewById(R.id.imageNose)).getVisibility());
        outState.putInt("ears", ((ImageView) findViewById(R.id.imageEars)).getVisibility());
        outState.putInt("eyebrows", ((ImageView) findViewById(R.id.imageEyebrows)).getVisibility());
        outState.putInt("eyes", ((ImageView) findViewById(R.id.imageEyes)).getVisibility());
        outState.putInt("glasses", ((ImageView) findViewById(R.id.imageGlasses)).getVisibility());
        outState.putInt("hat", ((ImageView) findViewById(R.id.imageHat)).getVisibility());
        outState.putInt("mouth", ((ImageView) findViewById(R.id.imageMouth)).getVisibility());
        outState.putInt("mustache", ((ImageView) findViewById(R.id.imageMustache)).getVisibility());
        outState.putInt("shoes", ((ImageView) findViewById(R.id.imageShoes)).getVisibility());
    }

    public void checkClicked(View v){
        // Cast the view object to a checkbox object
        CheckBox checkbox = (CheckBox) v;

        // Sent to log what button was clicked
        String checkboxString = checkbox.getText().toString();
        Log.d("potato", "checkClicked: " + checkboxString);

        // The status of the checkbox
        boolean checked = checkbox.isChecked();

        // Switch statement to see what checkbox was changed and change the visibility accordingly
        switch (checkboxString){
            case "Arms":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageArms)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageArms)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Ears":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageEars)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageEars)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Eyebrows":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageEyebrows)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageEyebrows)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Eyes":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageEyes)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageEyes)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Glasses":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageGlasses)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageGlasses)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Hat":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageHat)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageHat)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Mouth":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageMouth)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageMouth)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Nose":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageNose)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageNose)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Mustache":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageMustache)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageMustache)).setVisibility(View.INVISIBLE);
                }
                break;
            case "Shoes":
                if (checked) {
                    ((ImageView) findViewById(R.id.imageShoes)).setVisibility(View.VISIBLE);
                } else {
                    ((ImageView) findViewById(R.id.imageShoes)).setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}

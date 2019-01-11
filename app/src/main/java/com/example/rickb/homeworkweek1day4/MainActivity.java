package com.example.rickb.homeworkweek1day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {

        //switch handles all the different cases for each of the five words
        switch (view.getId()){

            case R.id.italian:
                lang=((TextView) view).getText().toString();
                break;
            case R.id.spanish:
                lang=((TextView) view).getText().toString();
                break;
            case R.id.german:
                lang=((TextView) view).getText().toString();
                break;
            case R.id.french:
                lang=((TextView) view).getText().toString();
                break;
            case R.id.japanese:
                lang=((TextView) view).getText().toString();
                break;
                //the following case handles the case of the button being pushed and switching to
                //the next activity.
            case R.id.btnSwitchActivity:

                Intent intent = new Intent( this, NextActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("language", lang);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

        }
    }
}

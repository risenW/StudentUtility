package myapplication.risenapps.com.studentutility;

import android.os.Bundle;
import android.app.Activity;

//This is the basic calculator activity

public class BasicCalculator extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator); //Here it calls the xml file for display
    }

}

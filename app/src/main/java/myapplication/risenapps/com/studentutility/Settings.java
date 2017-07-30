package myapplication.risenapps.com.studentutility;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

//This is the settings Activity

public class Settings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings); //Here it calls the xml file for display


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

        switch (id){
            //Launches any of the Selected Activity from the drop down menu when clicked
            case R.id.basic:
                Intent intentBasic = new Intent(this,BasicCalculator.class);
                startActivity(intentBasic);
                break;
            case R.id.about:
                Intent intentAbout = new Intent(this,About.class);
                startActivity(intentAbout);
                break;
            case R.id.constants:
                Intent intentConstants = new Intent(this,Constants.class);
                startActivity(intentConstants);
                break;
            case R.id.cgpaCalculator:
                Intent intentTimeTable = new Intent(this,CgpaCalculator.class);
                startActivity(intentTimeTable);
                break;
            case R.id.converter:
                Intent intentConverter = new Intent(this,UnitCoverter.class);
                startActivity(intentConverter);
                break;

            default:
                return super.onOptionsItemSelected(item);


        }
        return true;


    }
}
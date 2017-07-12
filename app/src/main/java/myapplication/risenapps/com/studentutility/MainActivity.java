package myapplication.risenapps.com.studentutility;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    //private static final int MainActivityCode = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scientific_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);   //Sets the top tool bar
        setSupportActionBar(toolbar);






    }
    //This method starts the Settings activity from the MainActivity
     public void launchSettings(View view) {

                Intent i = new Intent(this, Settings.class);
                startActivity(i);
               // startActivityForResult(i, MainActivityCode);

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
            case R.id.action_settings:
                Intent intentSettings = new Intent(this,Settings.class);
                startActivity(intentSettings);
                break;
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
            case R.id.timetable:
                Intent intentTimeTable = new Intent(this,TimeTable.class);
                startActivity(intentTimeTable);
                break;
            case R.id.converter:
                Intent intentConverer = new Intent(this,Converter.class);
                startActivity(intentConverer);
                break;

           default:
               return super.onOptionsItemSelected(item);


        }
        return true;


    }
}

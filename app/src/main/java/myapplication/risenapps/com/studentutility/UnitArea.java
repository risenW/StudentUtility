package myapplication.risenapps.com.studentutility;

/**
 * Created by Risen on 7/15/2017.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class UnitArea extends AppCompatActivity {

    private EditText e1,e2;
    private Spinner s1,s2;
    private int count1=0;
    private ConvertingUnits.Area ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_area);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        e1=(EditText)findViewById(R.id.item1);
        e2=(EditText)findViewById(R.id.item2);
        s1=(Spinner)findViewById(R.id.spinner1);
        s2=(Spinner)findViewById(R.id.spinner2);

        ca=new ConvertingUnits.Area();
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.num0:
                e1.setText(e1.getText()+"0");
                break;

            case R.id.num1:
                e1.setText(e1.getText()+"1");
                break;

            case R.id.num2:
                e1.setText(e1.getText()+"2");
                break;

            case R.id.num3:
                e1.setText(e1.getText()+"3");
                break;

            case R.id.num4:
                e1.setText(e1.getText()+"4");
                break;

            case R.id.num5:
                e1.setText(e1.getText()+"5");
                break;

            case R.id.num6:
                e1.setText(e1.getText()+"6");
                break;

            case R.id.num7:
                e1.setText(e1.getText()+"7");
                break;

            case R.id.num8:
                e1.setText(e1.getText()+"8");
                break;

            case R.id.num9:
                e1.setText(e1.getText()+"9");
                break;

            case R.id.dot:
                if (count1==0)
                {
                    e1.setText(e1.getText()+".");
                    count1++;
                }
                break;

            case R.id.clear:
                e1.setText("");
                e2.setText("");
                count1=0;
                break;

            case R.id.backSpace:
                if(e1.length()!=0)
                {
                    String text=e1.getText().toString();
                    if(text.endsWith("."))
                        count1=0;
                    String newText=text.substring(0,text.length()-1);
                    e1.setText(newText);
                }
                break;

            case R.id.equal:
                int item1=s1.getSelectedItemPosition();
                int item2=s2.getSelectedItemPosition();
                double value1=Double.parseDouble(e1.getText().toString());
                double result=evaluate(item1,item2,value1);
                e2.setText(result+"");
                break;
            case R.id.HomeKey:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                finishAfterTransition();
                break;
            case R.id.Tempkey:
                Intent intentT = new Intent(this,UnitTemperature.class);
                startActivity(intentT);
                break;
            case R.id.weightKey:
                Intent intentW = new Intent(this,UnitWeight.class);
                startActivity(intentW);
                break;
            case R.id.lenghtKey:
                Intent intentL = new Intent(this,UnitLength.class);
                startActivity(intentL);
                break;
        }
    }

    public double evaluate(int item1,int item2,double value)
    {
        double temp=0.0;
        if(item1==item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:
                    temp=ca.sqMilliToMeter(value);
                    break;
                case 1:
                    temp=ca.sqCentiToMeter(value);
                    break;
                case 2:
                    temp=value;
                    break;
                case 3:
                    temp=ca.sqKiloToMeter(value);
                    break;
                case 4:
                    temp=ca.AcreToMeter(value);
                    break;
                case 5:
                    temp=ca.HectareToMeter(value);
                    break;
            }

            switch (item2)
            {
                case 0:
                    temp= ca.sqMeterToMilli(temp);
                    break;
                case 1:
                    temp= ca.sqMeterToCenti(temp);
                    break;
                case 3:
                    temp= ca.sqMeterToKilo(temp);
                    break;
                case 4:
                    temp= ca.sqMeterToAcre(temp);
                    break;
                case 5:
                    temp= ca.sqMeterToHectare(temp);
                    break;
            }
            return temp;
        }
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
                Intent intentConverter = new Intent(this,UnitCoverter.class);
                startActivity(intentConverter);
                break;

            default:
                return super.onOptionsItemSelected(item);


        }
        return true;


    }
}


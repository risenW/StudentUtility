package myapplication.risenapps.com.studentutility;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Risen on 7/23/2017.
 */

public class CgpaCalculator extends AppCompatActivity {

    public EditText col1,col2,col3,col4,col5,col6,col7,col8,col9,col10,col11,col12,
                        col13,col14,col15,col16,col17,col18,col19,col20;

    public Spinner unit1,unit2,unit3,unit4,unit5,unit6,unit7,unit8,unit9,unit10,
                    unit11,unit12,unit13,unit14,unit15,unit16,unit17,unit18,unit19,unit20;

    public Spinner grade1,grade2,grade3,grade4,grade5,grade6,grade7,grade8,grade9,grade10,grade11,grade12,grade13,
                    grade14,grade15,grade16,grade17,grade18,grade19,grade20;

    public TextView displayResult;


    public String debugTag = "CGPACalculator";

    public int temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8,temp9,temp10,temp11,temp12,
            temp13,temp14,temp15,temp16,temp17,temp18,temp19,temp20;

    public int gradeTemp1,gradeTemp2,gradeTemp3,gradeTemp4,gradeTemp5,gradeTemp6,gradeTemp7,gradeTemp8,
            gradeTemp9,gradeTemp10,gradeTemp11,gradeTemp12,gradeTemp13,gradeTemp14,gradeTemp15,gradeTemp16,
            gradeTemp17,gradeTemp18,gradeTemp19,gradeTemp20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calculator);

        col1 = (EditText)findViewById(R.id.firstRowCourse);
        col2 = (EditText)findViewById(R.id.secondRowCourse);
        col3 = (EditText)findViewById(R.id.thirdRowCourse);
        col4 = (EditText)findViewById(R.id.fourthRowCourse);
        col5 = (EditText)findViewById(R.id.fifthRowCourse);
        col6 = (EditText)findViewById(R.id.sixthRowCourse);
        col7 = (EditText)findViewById(R.id.seventhRowCourse);
        col8 = (EditText)findViewById(R.id.eightRowCourse);
        col9 = (EditText)findViewById(R.id.ninthRowCourse);
        col10 = (EditText)findViewById(R.id.tenthRowCourse);
        col11 = (EditText)findViewById(R.id.eleventhRowCourse);
        col12 = (EditText)findViewById(R.id.twelfthRowCourse);
        col13 = (EditText)findViewById(R.id.thirteenRowCourse);
        col14 = (EditText)findViewById(R.id.fourteenRowCourse);
        col15 = (EditText)findViewById(R.id.fifteenRowCourse);
        col16 = (EditText)findViewById(R.id.sixteenRowCourse);
        col17 = (EditText)findViewById(R.id.seventeenRowCourse);
        col18 = (EditText)findViewById(R.id.eighteenRowCourse);
        col19 = (EditText)findViewById(R.id.nineteenRowCourse);
        col20 = (EditText)findViewById(R.id.twentyRowCourse);

        unit1 = (Spinner)findViewById(R.id.firstRowSpinner1);
        unit2 = (Spinner)findViewById(R.id.secondRowSpinner1);
        unit3 = (Spinner)findViewById(R.id.thirdRowSpinner1);
        unit4 = (Spinner)findViewById(R.id.fourthRowSpinner1);
        unit5 = (Spinner)findViewById(R.id.fifthRowSpinner1);
        unit6 = (Spinner)findViewById(R.id.sixthRowSpinner1);
        unit7 = (Spinner)findViewById(R.id.seventhRowSpinner1);
        unit8 = (Spinner)findViewById(R.id.eightRowSpinner1);
        unit9 = (Spinner)findViewById(R.id.ninthRowSpinner1);
        unit10 = (Spinner)findViewById(R.id.tenthRowSpinner1);
        unit11 = (Spinner)findViewById(R.id.eleventhRowSpinner1);
        unit12 = (Spinner)findViewById(R.id.twelfthRowSpinner1);
        unit13 = (Spinner)findViewById(R.id.thirteenRowSpinner1);
        unit14 = (Spinner)findViewById(R.id.fourteenRowSpinner1);
        unit15 = (Spinner)findViewById(R.id.fifteenRowSpinner1);
        unit16 = (Spinner)findViewById(R.id.sixteenRowSpinner1);
        unit17 = (Spinner)findViewById(R.id.seventeenRowSpinner1);
        unit18 = (Spinner)findViewById(R.id.eighteenRowSpinner1);
        unit19 = (Spinner)findViewById(R.id.nineteenRowSpinner1);
        unit20 = (Spinner)findViewById(R.id.twentyRowSpinner1);



        grade1 = (Spinner)findViewById(R.id.firstRowSpinner2);
        grade2 = (Spinner)findViewById(R.id.secondRowSpinner2);
        grade3 = (Spinner)findViewById(R.id.thirdRowSpinner2);
        grade4 = (Spinner)findViewById(R.id.fourthRowSpinner2);
        grade5 = (Spinner)findViewById(R.id.fifthRowSpinner2);
        grade6 = (Spinner)findViewById(R.id.sixthRowSpinner2);
        grade7 = (Spinner)findViewById(R.id.seventhRowSpinner2);
        grade8 = (Spinner)findViewById(R.id.eightRowSpinner2);
        grade9 = (Spinner)findViewById(R.id.ninthRowSpinner2);
        grade10 = (Spinner)findViewById(R.id.tenthRowSpinner2);
        grade11 = (Spinner)findViewById(R.id.eleventhRowSpinner2);
        grade12 = (Spinner)findViewById(R.id.twelfthRowSpinner2);
        grade13 = (Spinner)findViewById(R.id.thirteenRowSpinner2);
        grade14 = (Spinner)findViewById(R.id.fourteenRowSpinner2);
        grade15 = (Spinner)findViewById(R.id.fifteenRowSpinner2);
        grade16 = (Spinner)findViewById(R.id.sixteenRowSpinner2);
        grade17 = (Spinner)findViewById(R.id.seventeenRowSpinner2);
        grade18 = (Spinner)findViewById(R.id.eighteenRowSpinner2);
        grade19 = (Spinner)findViewById(R.id.nineteenRowSpinner2);
        grade20 = (Spinner)findViewById(R.id.twentyRowSpinner2);


        displayResult = (TextView)findViewById(R.id.displayResult);

        disableSubjects();



    }

    public void onClick(View v){
        switch (v.getId()){

            case R.id.editCourse:
                enableSubjects();


                break;
            case R.id.calculateCourse:

                Log.d(debugTag,"" + totalGradeByUnit());

                double gradeByUnitTemp = totalGradeByUnit();  //gets the current value of the grade multiplied by the units

                double result = gradeByUnitTemp/getTotalUnits();    //Divides the total grade which has been multiplied with the corresponding units by the total units
                String stringResult = String.format("%4.2f",result);   //converts the result to 2 d.p

                Log.d(debugTag,"" + gradeByUnitTemp);
                Log.d(debugTag,"" + getTotalUnits());



                displayResult.setText(stringResult);
                disableSubjects();

                break;


        }




    }

    public void disableSubjects(){

        col1.setEnabled(false);
        col2.setEnabled(false);
        col3.setEnabled(false);
        col4.setEnabled(false);
        col5.setEnabled(false);
        col6.setEnabled(false);
        col7.setEnabled(false);
        col8.setEnabled(false);
        col9.setEnabled(false);
        col10.setEnabled(false);
        col11.setEnabled(false);
        col12.setEnabled(false);
        col13.setEnabled(false);
        col14.setEnabled(false);
        col15.setEnabled(false);
        col16.setEnabled(false);
        col17.setEnabled(false);
        col18.setEnabled(false);
        col19.setEnabled(false);
        col20.setEnabled(false);



    }

    public void enableSubjects(){

        col1.setEnabled(true);
        col2.setEnabled(true);
        col3.setEnabled(true);
        col4.setEnabled(true);
        col5.setEnabled(true);
        col6.setEnabled(true);
        col7.setEnabled(true);
        col8.setEnabled(true);
        col9.setEnabled(true);
        col10.setEnabled(true);
        col11.setEnabled(true);
        col12.setEnabled(true);
        col13.setEnabled(true);
        col14.setEnabled(true);
        col15.setEnabled(true);
        col16.setEnabled(true);
        col17.setEnabled(true);
        col18.setEnabled(true);
        col19.setEnabled(true);
        col20.setEnabled(true);



    }

    //This method gets the current unit from the spinners and adds them to get the total units
    public double getTotalUnits(){

        double totalUnits = 0;



        temp1 = getUnits(unit1.getSelectedItemPosition());
        temp2 = getUnits(unit2.getSelectedItemPosition());
        temp3 = getUnits(unit3.getSelectedItemPosition());
        temp4 = getUnits(unit4.getSelectedItemPosition());
        temp5 = getUnits(unit5.getSelectedItemPosition());
        temp6 = getUnits(unit6.getSelectedItemPosition());
        temp7 = getUnits(unit7.getSelectedItemPosition());
        temp8 = getUnits(unit8.getSelectedItemPosition());
        temp9 = getUnits(unit9.getSelectedItemPosition());
        temp10 = getUnits(unit10.getSelectedItemPosition());
        temp11 = getUnits(unit11.getSelectedItemPosition());
        temp12 = getUnits(unit12.getSelectedItemPosition());
        temp13 = getUnits(unit13.getSelectedItemPosition());
        temp14 = getUnits(unit14.getSelectedItemPosition());
        temp15 = getUnits(unit15.getSelectedItemPosition());
        temp16 = getUnits(unit16.getSelectedItemPosition());
        temp17 = getUnits(unit17.getSelectedItemPosition());
        temp18 = getUnits(unit18.getSelectedItemPosition());
        temp19 = getUnits(unit19.getSelectedItemPosition());
        temp20 = getUnits(unit20.getSelectedItemPosition());



        totalUnits = temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7 + temp8 + temp9
                        + temp10 + temp11 + temp12 + temp13 + temp14 + temp15 + temp16 +temp17 + temp18
                            + temp19 + temp20;




       return totalUnits;
    }

    ////This method gets the current grade and multiplies it with the selected units to get the total grade by unit
    public double totalGradeByUnit(){
        double gradeByUnit = 0.0;


        gradeTemp1 = getGradeValue(grade1.getSelectedItemPosition());
        gradeTemp2 = getGradeValue(grade2.getSelectedItemPosition());
        gradeTemp3 = getGradeValue(grade3.getSelectedItemPosition());
        gradeTemp4 = getGradeValue(grade4.getSelectedItemPosition());
        gradeTemp5 = getGradeValue(grade5.getSelectedItemPosition());
        gradeTemp6 = getGradeValue(grade6.getSelectedItemPosition());
        gradeTemp7 = getGradeValue(grade7.getSelectedItemPosition());
        gradeTemp8 = getGradeValue(grade8.getSelectedItemPosition());
        gradeTemp9 = getGradeValue(grade9.getSelectedItemPosition());
        gradeTemp10 = getGradeValue(grade10.getSelectedItemPosition());
        gradeTemp11 = getGradeValue(grade11.getSelectedItemPosition());
        gradeTemp12 = getGradeValue(grade12.getSelectedItemPosition());
        gradeTemp13 = getGradeValue(grade13.getSelectedItemPosition());
        gradeTemp14 = getGradeValue(grade14.getSelectedItemPosition());
        gradeTemp15 = getGradeValue(grade15.getSelectedItemPosition());
        gradeTemp16 = getGradeValue(grade16.getSelectedItemPosition());
        gradeTemp17 = getGradeValue(grade17.getSelectedItemPosition());
        gradeTemp18 = getGradeValue(grade18.getSelectedItemPosition());
        gradeTemp19 = getGradeValue(grade19.getSelectedItemPosition());
        gradeTemp20 = getGradeValue(grade20.getSelectedItemPosition());


        gradeByUnit = (temp1 * gradeTemp1) + (temp2 * gradeTemp2) + (temp3 * gradeTemp3) + (temp4 * gradeTemp4)
                        + (temp5 * gradeTemp5) + (temp6 * gradeTemp6) + (temp7 * gradeTemp7) + (temp8 * gradeTemp8)
                            + (temp9 * gradeTemp9) + (temp10 * gradeTemp10) + (temp11 * gradeTemp11) + (temp12 * gradeTemp12)
                                + (temp13 * gradeTemp13) + (temp14 * gradeTemp14) + (temp15 * gradeTemp15) + (temp16 * gradeTemp16) + (temp17 * gradeTemp17)
                                    + (temp18 * gradeTemp18) + (temp19 * gradeTemp19) + (temp20 * gradeTemp20);







      return  gradeByUnit;
    }

    //This method converts the selected spinner objects to their appropriate values
    public int getUnits(int spinnerUnits) {

        int temp2 = 0;

        switch (spinnerUnits) {

            case 0:
                temp2 = 0;

                break;
            case 1:
                temp2 = 1;

                break;

            case 2:
                temp2 = 2;

                break;

            case 3:
                temp2 = 3;

                break;

            case 4:
                temp2 = 4;

                break;
            case 5:
                temp2 = 5;

                break;
            case 6:
                temp2 = 6;

                break;


        }
        return temp2;
    }

    //This method converts the selected grade to their appropriate values: A = 5,B = 4,C = 3, D = 2, E = 1, F = 0, nil = 0
    public int getGradeValue(int spinnerGrade){

        int temp = 0;

        switch (spinnerGrade){

            case 0:
                temp = 0;

                break;
            case 1:
                temp = 5;

                break;
            case 2:
                temp = 4;

                break;
            case 3:
                temp = 3;

                break;
            case 4:
                temp = 2;

                break;
            case 5:
                temp = 1;

                break;
            case 6:
                temp = 0;

                break;

        }


        return temp;
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


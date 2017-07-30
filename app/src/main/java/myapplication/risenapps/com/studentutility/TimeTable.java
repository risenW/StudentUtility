//package myapplication.risenapps.com.studentutility;
//
//import android.app.Activity;
//import android.app.TimePickerDialog;
//import android.content.Intent;
//import android.icu.util.Calendar;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.TimePicker;
//
//public class TimeTable extends Activity {
//
//    public TextView timeLeft1,timeRight1;
//    public EditText mSubject1,mSubject2,mSubject3,mSubject4;
//    public String formatedTime;
//    final  Calendar c = Calendar.getInstance();
//    int hour = c.get(Calendar.HOUR_OF_DAY);
//    int minute = c.get(Calendar.MINUTE);
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_time_table);
//
//        timeLeft1 = (TextView) findViewById(R.id.timeLeft1);
//        timeRight1 = (TextView)findViewById(R.id.timeRight1);
//        mSubject1 = (EditText)findViewById(R.id.mSubject1);
//        mSubject2 = (EditText)findViewById(R.id.Msubject2);
//        mSubject3 = (EditText)findViewById(R.id.Msubject3);
//        mSubject4 = (EditText)findViewById(R.id.Msubject4);
//
//
////        }
//    }
//
//
//    public void onClick(View v) {
//
//        switch (v.getId()) {
//
//            case R.id.saveButton:
//
////
//                break;
//
//            case R.id.timeLeft1:
//
//                final TimePickerDialog timePickerDialog = new TimePickerDialog(this,new TimePickerDialog.OnTimeSetListener() {
//
//
//                    @Override
//                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
//
//                        formatedTime = minute == 0? minute + "0":minute + "";
//                        timeLeft1.setText(hour + ":" + formatedTime );
//
//                    }
//                }, hour, minute,true);
//
//                timePickerDialog.setTitle("Select a time");
//                timePickerDialog.show();
//
//                break;
//            case R.id.timeRight1:
//                final TimePickerDialog timePickerDialog2 = new TimePickerDialog(this,new TimePickerDialog.OnTimeSetListener() {
//
//                    @Override
//                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
//
//                        formatedTime = minute == 0? minute + "0":minute + "";
//                        timeRight1.setText(hour + ":" + minute);
//                    }
//                }, hour, minute,true);
//
//                timePickerDialog2.setTitle("Select a time");
//                timePickerDialog2.show();
//
//                break;
//
//
//        }
//    }
//
//
//
//
//
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        switch (id){
//            //Launches any of the Selected Activity from the drop down menu when clicked
//            case R.id.action_settings:
//                Intent intentSettings = new Intent(this,Settings.class);
//                startActivity(intentSettings);
//                break;
//            case R.id.basic:
//                Intent intentBasic = new Intent(this,BasicCalculator.class);
//                startActivity(intentBasic);
//                break;
//            case R.id.about:
//                Intent intentAbout = new Intent(this,About.class);
//                startActivity(intentAbout);
//                break;
//            case R.id.constants:
//                Intent intentConstants = new Intent(this,Constants.class);
//                startActivity(intentConstants);
//                break;
//            case R.id.converter:
//                Intent intentConverter = new Intent(this,UnitCoverter.class);
//                startActivity(intentConverter);
//                break;
//
//            default:
//                return super.onOptionsItemSelected(item);
//
//
//        }
//        return true;
//
//
//    }
//}

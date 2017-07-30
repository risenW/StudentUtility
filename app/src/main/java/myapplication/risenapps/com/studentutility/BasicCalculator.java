package myapplication.risenapps.com.studentutility;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.fathzer.soft.javaluator.DoubleEvaluator;

//This is the basic calculator activity

public class BasicCalculator extends AppCompatActivity {


    private EditText e1, e2;
    private int count = 0;
    private String expression = "";
    public String text = "";
    public Double result = 0.0;
    public int integerResult;
    public ScientificCalculator mScientificCalculator;
    //private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_basic_calculator); //Here it calls the xml file for display


        e1 = (EditText) findViewById(R.id.BasictextViewUp);
        e2 = (EditText) findViewById(R.id.BasictextViewDown);



    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BasicButton0:
                if (e2.getText().toString().equals("")){
                    e2.setText("");

                } else
                    e2.setText(e2.getText() + "0");
                break;

            case R.id.BasicButton1:
                e2.setText(e2.getText() + "1");
                break;

            case R.id.BasicButton2:
                e2.setText(e2.getText() + "2");
                break;

            case R.id.BasicButton3:
                e2.setText(e2.getText() + "3");
                break;


            case R.id.BasicButton4:
                e2.setText(e2.getText() + "4");
                break;

            case R.id.BasicButton5:
                e2.setText(e2.getText() + "5");
                break;

            case R.id.Button6:
                e2.setText(e2.getText() + "6");
                break;

            case R.id.Button7:
                e2.setText(e2.getText() + "7");
                break;

            case R.id.BasicButton8:
                e2.setText(e2.getText() + "8");
                break;

            case R.id.BasicButton9:
                e2.setText(e2.getText() + "9");
                break;

            case R.id.BasicButton00:

                if (e2.getText().toString().equals("")){
                    e2.setText("");

                } else
                    e2.setText(e2.getText() + "00");


                break;

            case R.id.BasicPointButton:
                if (count == 0 && e2.length() != 0) {
                    e2.setText(e2.getText() + ".");
                    count++;
                }
                break;

            case R.id.ScientificClearButton:
                e1.setText("");
                e2.setText("");
                count = 0;
                expression = "";
                break;

            case R.id.backSpace:
                text = e2.getText().toString();
                if (text.length() > 0) {
                    if (text.endsWith(".")) {
                        count = 0;
                    }
                    String newText = text.substring(0, text.length() - 1);
                    //to delete the data contained in the brackets at once
                    if (text.endsWith(")")) {
                        char[] a = text.toCharArray();
                        int pos = a.length - 2;
                        int counter = 1;
                        //to find the opening bracket position
                        for (int i = a.length - 2; i >= 0; i--) {
                            if (a[i] == ')') {
                                counter++;
                            } else if (a[i] == '(') {
                                counter--;
                            }
                            //if decimal is deleted b/w brackets then count should be zero
                            else if (a[i] == '.') {
                                count = 0;
                            }
                            //if opening bracket pair for the last bracket is found
                            if (counter == 0) {
                                pos = i;
                                break;
                            }
                        }
                        newText = text.substring(0, pos);
                    }
                    //if e2 edit text contains only - sign or sqrt at last then clear the edit text e2
                    if (newText.equals("-") || newText.endsWith("sqrt")) {
                        newText = "";
                    }
                    //if pow sign is left at the last
                    else if (newText.endsWith("^"))
                        newText = newText.substring(0, newText.length() - 1);

                    e2.setText(newText);
                }
                break;

            case R.id.BasicButtonPlus:
                operationClicked("+");
                break;

            case R.id.BasicButtonMinus:
                operationClicked("-");
                break;

            case R.id.BasicButtonDiv:
                operationClicked("/");
                break;

            case R.id.BasicButtonMultiply:
                operationClicked("*");
                break;

            case R.id.BasicEqualsButton:

                /*This segment uses the Javaluator class to calculate the value of an expression/*/

                if (e2.length() != 0) {
                    text = e2.getText().toString();
                    expression = e1.getText().toString() + text;
                }
                e1.setText(expression);
                if (expression.length() == 0)
                    expression = "0";
                DoubleEvaluator evaluator = new DoubleEvaluator();
                try {
                    //evaluate the expression
                    result = evaluator.evaluate(expression);
                    //insert expression and result in sqlite database if expression is valid and not 0.0
                    if (!expression.equals("0.0"))

                        // dbHelper.insert("STANDARD",expression+" = "+result);

                        //coverts the result to integer if it ends with .0


                        e2.setText(removeTrailingZero(result + "")); //calls the method from ScientificCalculator class to remove the ending Zero from an integer calculation
                        //e2.setText(result + "");



                } catch (Exception e) {
                    e2.setText("");
                    e1.setText("");
                    expression = "";
                    e.printStackTrace();
                }
                break;


           /* case R.id.history:
                Intent i=new Intent(this,History.class);
                i.putExtra("calcName","STANDARD");
                startActivity(i);
                break; */
        }

    }

    public String removeTrailingZero(String formattingInput){
        if(!formattingInput.contains(".")){
            return formattingInput;
        }
        int dotPosition = formattingInput.indexOf(".");
        String newValue = formattingInput.substring(dotPosition, formattingInput.length());
        if(newValue.equals(".0")){
            return formattingInput.substring(0, dotPosition);
        }
        return formattingInput;
    }

    private void operationClicked(String op) {
        if (e2.length() != 0) {
            String text = e2.getText().toString();
            e1.setText(e1.getText() + text + op);
            e2.setText("");
            count = 0;
        } else {
            String text = e1.getText().toString();
            if (text.length() > 0) {
                String newText = text.substring(0, text.length() - 1) + op;
                e1.setText(newText);
            }
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
            case R.id.scientific:
                Intent intentSci = new Intent(this,ScientificCalculator.class);
                startActivity(intentSci);
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


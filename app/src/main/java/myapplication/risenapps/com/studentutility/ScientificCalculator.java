package myapplication.risenapps.com.studentutility;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Risen on 7/14/2017.
 */

public class ScientificCalculator extends AppCompatActivity implements View.OnClickListener {

    public EditText outputResult,expression;
    public String lastResultObtain = "";
    public String currentDisplayedInput = "";
    public String inputToBeParsed = "";
    public Calculator mCalculator;
    public Button button0, button1, button2,button3,button4,button5,button6,button7,
            button8,button9,buttonClear, buttonDivide,buttonMultiply,buttonSubtract,
            buttonAdd,buttonAbs, buttonEqual, buttonDecimal, closeParenthesis, openParenthesis, buttonAnswer,
            buttonSingleDelete, buttonExp, ButtonFactorial,PiButton,InverseSin,InverseCos,InverseTan,CubeRoot,Exponential,pointButton;
    public Button buttonSin, buttonLn,buttonCos, buttonLog, buttonTan, buttonSquareRoot,  buttonXSquare, buttonYPowerX,
            buttonRnd, buttonPercentage,sinhButton,tanhButton,coshButton,divBy1Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scientific_calculator); //Here it calls the xml file for display

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mCalculator = new Calculator();
        outputResult = (EditText) findViewById(R.id.textViewDown);
        outputResult.setText("");
        expression = (EditText)findViewById(R.id.textViewUp);
        expression.setText("");

        button0 = (Button)findViewById(R.id.Button0);
        button1 = (Button)findViewById(R.id.Button1);
        button2 = (Button)findViewById(R.id.Button2);
        button3 = (Button)findViewById(R.id.Button3);
        button4 = (Button)findViewById(R.id.Button4);
        button5 = (Button)findViewById(R.id.Button5);
        button6 = (Button)findViewById(R.id.Button6);
        button7 = (Button)findViewById(R.id.Button7);
        button8 = (Button)findViewById(R.id.Button8);
        button9 = (Button)findViewById(R.id.Button9);
        pointButton = (Button)findViewById(R.id.pointButton);
        buttonDivide = (Button)findViewById(R.id.ButtonDiv);
        buttonMultiply = (Button)findViewById(R.id.ButtonMultiply);
        buttonSubtract = (Button)findViewById(R.id.ButtonMinus);
        buttonAdd = (Button)findViewById(R.id.ButtonPlus);
        buttonPercentage = (Button)findViewById(R.id.percentageButton);
        buttonDecimal = (Button)findViewById(R.id.pointButton);
        closeParenthesis = (Button)findViewById(R.id.rightParenthesis);
        openParenthesis = (Button)findViewById(R.id.leftParenthesis);
        buttonExp = (Button)findViewById(R.id.exponentButton);
        buttonSquareRoot = (Button)findViewById(R.id.sqrtButton);
        buttonXSquare = (Button)findViewById(R.id.squareButton);
        buttonYPowerX = (Button)findViewById(R.id.xPowerNButton);
        buttonSin = (Button)findViewById(R.id.sinButton);
        buttonCos = (Button)findViewById(R.id.cosButton);
        buttonTan = (Button)findViewById(R.id.tanButton);
        buttonLn = (Button)findViewById(R.id.lnButton);
        buttonLog = (Button)findViewById(R.id.log);
        buttonRnd = (Button)findViewById(R.id.randomBtn);
        buttonAbs = (Button)findViewById(R.id.abs);
        buttonClear = (Button)findViewById(R.id.clearButton);
        buttonSingleDelete = (Button)findViewById(R.id.backSpace);
        buttonEqual = (Button)findViewById(R.id.equalsBtn);
        buttonAnswer = (Button)findViewById(R.id.ans);
        ButtonFactorial = (Button) findViewById(R.id.xFactorial);
        PiButton = (Button) findViewById(R.id.piButton);
        CubeRoot = (Button)findViewById(R.id.cubeRootButton);
        InverseSin = (Button)findViewById(R.id.SinInverseButton);
        InverseCos = (Button)findViewById(R.id.CosInverseButton);
        InverseTan = (Button)findViewById(R.id.TanInverseButton);
        Exponential = (Button)findViewById(R.id.exponentButton);
        sinhButton = (Button)findViewById(R.id.SinhButton);
        tanhButton = (Button)findViewById(R.id.SinhButton);
        coshButton = (Button)findViewById(R.id.SinhButton);
        divBy1Button = (Button)findViewById(R.id.divBy1Button);


        divBy1Button.setOnClickListener(this);
        buttonRnd.setOnClickListener(this);
        sinhButton.setOnClickListener(this);
        tanhButton.setOnClickListener(this);
        coshButton.setOnClickListener(this);
        InverseCos.setOnClickListener(this);
        InverseSin.setOnClickListener(this);
        InverseTan.setOnClickListener(this);
        Exponential.setOnClickListener(this);
        PiButton.setOnClickListener(this);
        ButtonFactorial.setOnClickListener(this);
        button0.setOnClickListener(this);
        ButtonFactorial.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        closeParenthesis.setOnClickListener(this);
        openParenthesis.setOnClickListener(this);
        buttonSingleDelete.setOnClickListener(this);
        buttonExp.setOnClickListener(this);
        buttonSquareRoot.setOnClickListener(this);
        buttonXSquare.setOnClickListener(this);
        buttonYPowerX.setOnClickListener(this);
        buttonSin.setOnClickListener(this);
        buttonCos.setOnClickListener(this);
        buttonTan.setOnClickListener(this);
        buttonLn.setOnClickListener(this);
        buttonLog.setOnClickListener(this);
        buttonRnd.setOnClickListener(this);
        buttonAbs.setOnClickListener(this);
        buttonAnswer.setOnClickListener(this);
        pointButton.setOnClickListener(this);

    }
    private void obtainInputValues(String input){
        switch (input){
            case "0":
                currentDisplayedInput += "0";
                inputToBeParsed += "0";
                break;
            case "1":
                    currentDisplayedInput += "1";
                    inputToBeParsed += "1";
                break;
            case "3":
                currentDisplayedInput += "3";
                inputToBeParsed += "3";
                break;

            case "π":
                currentDisplayedInput += "π";
                inputToBeParsed += "pi";
                break;

            case "2":
                    currentDisplayedInput += "2";
                    inputToBeParsed += "2";
                break;

            case "e":
                currentDisplayedInput += "e";
                inputToBeParsed += "e";
                break;

            case "\u207FC\u2098":
                currentDisplayedInput += "c(n,m)";
                inputToBeParsed += "comb(";
                break;
            case ",":
                currentDisplayedInput += ",";
                inputToBeParsed += ",";
                break;

            case "x!":
                    currentDisplayedInput += "!(";
                    inputToBeParsed += "!(";
                break;
            case "4":
                    currentDisplayedInput += "4";
                    inputToBeParsed += "4";

                break;
            case "5":
                    currentDisplayedInput += "5";
                    inputToBeParsed += "5";

                break;

            case "\u207FP\u2098":
                currentDisplayedInput += "p(n,m)";
                inputToBeParsed += "permu(";
                break;

            case "6":
                    currentDisplayedInput += "6";
                    inputToBeParsed += "6";

                break;
            case "7":
                currentDisplayedInput += "7";
                inputToBeParsed += "7";
                break;
            case "8":
                currentDisplayedInput += "8";
                inputToBeParsed += "8";
                break;
            case "9":
                currentDisplayedInput += "9";
                inputToBeParsed += "9";
                break;
            case "\u2219":
                currentDisplayedInput += ".";
                inputToBeParsed += ".";
                break;
            case "+":
                currentDisplayedInput += "+";
                inputToBeParsed += "+";
                break;
            case "-":
                currentDisplayedInput += "-";
                inputToBeParsed += "-";
                break;
            case "÷":
                currentDisplayedInput += "÷";
                inputToBeParsed += "/";
                break;
            case "x":
                currentDisplayedInput += "x";
                inputToBeParsed += "*";
                break;
            case "(":
                currentDisplayedInput += "(";
                inputToBeParsed += "(";
                break;
            case ")":
                currentDisplayedInput += ")";
                inputToBeParsed += ")";
                break;
            case "1/x":
                currentDisplayedInput += "1÷";
                inputToBeParsed += "1/";
                break;
            case "%":
                    currentDisplayedInput += "%";
                    inputToBeParsed += "%";
                break;

            case "e\u207F":
                currentDisplayedInput += "e^";
                inputToBeParsed += "e^";
                break;

            case "ln":

                    currentDisplayedInput += "ln(";
                    inputToBeParsed += "ln(";

                break;
            case "log":
                    currentDisplayedInput += "log(";
                    inputToBeParsed += "log(";

                break;
            case "10\u207F":
                currentDisplayedInput += "10^";
                inputToBeParsed += "10^";

                break;
            case "16\u207F":
                currentDisplayedInput += "16^";
                inputToBeParsed += "16^";

                break;
            case "8\u207F":
                currentDisplayedInput += "8^";
                inputToBeParsed += "8^";

                break;

            case "2\u207F":
                currentDisplayedInput += "2^";
                inputToBeParsed += "2^";

                break;

            case "√":
                    currentDisplayedInput += "√(";
                    inputToBeParsed += "sqrt(";

                break;
            case "sin":
                    currentDisplayedInput += "sin(";
                    inputToBeParsed += "sin(";

                break;
            case "sin\u207B\u00B9":
                currentDisplayedInput += "asin(";
                inputToBeParsed += "asin(";
                break;

            case "cos\u207B\u00B9":
                currentDisplayedInput += "acos(";
                inputToBeParsed += "acos(";
                break;

            case "tan\u207B\u00B9":
                currentDisplayedInput += "atan(";
                inputToBeParsed += "atan(";
                break;
            case "x\u207F":
                currentDisplayedInput += "^";
                inputToBeParsed += "^";
                break;
            case "\u221B":
                currentDisplayedInput += "3√(";
                inputToBeParsed += "crt(";
                break;

            case "sinh":
                currentDisplayedInput += "sinh(";
                inputToBeParsed += "sinh(";

                break;
            case "cosh":
                currentDisplayedInput += "cosh(";
                inputToBeParsed += "cosh(";

                break;
            case "tanh":
                currentDisplayedInput += "tanh(";
                inputToBeParsed += "tanh(";

                break;


            case "cos":
                    currentDisplayedInput += "cos(";
                    inputToBeParsed += "cos(";

                break;
            case "tan":
                    currentDisplayedInput += "tan(";
                    inputToBeParsed += "tan(";

                break;
            case "exp":
                currentDisplayedInput += "E";
                inputToBeParsed += "E0";
                break;

            case "rand":
                double ran = Math.random();
                currentDisplayedInput += String.valueOf(ran);
                inputToBeParsed += String.valueOf(ran);
                break;
            case "abs":
                currentDisplayedInput += "abs(";
                inputToBeParsed += "abs(";
                break;
           /* case "MR":
                String mValue = getStoredPreferenceValue(MainActivity.this);
                String result = removeTrailingZero(mValue);
                if(!result.equals("0")){
                    currentDisplayedInput += result;
                    inputToBeParsed += result;
                }
                break;
            case "MS":
                clearMemoryStorage(MainActivity.this);
                break;
            case "M+":
                if (isInverse){
                    double inputValueMinus  = isANumber(outputResult.getText().toString());
                    if(!Double.isNaN(inputValueMinus)){
                        subtractMemoryStorage(MainActivity.this, inputValueMinus);
                    }
                }else{
                    double inputValue  = isANumber(outputResult.getText().toString());
                    if(!Double.isNaN(inputValue)){
                        addToMemoryStorage(MainActivity.this, inputValue);
                    }
                }
                toggleInverse();
                toggleShiftButton();
                break;*/
        }
        outputResult.setText(currentDisplayedInput);
    }
    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String data = button.getText().toString();
        //Toast.makeText(this, "Click " + data, Toast.LENGTH_LONG).show();
        if(data.equals("c")){
            outputResult.setText("");
            expression.setText("");
            currentDisplayedInput = "";
            inputToBeParsed = "";
        }
        else if(data.equals("⌫")){
            String enteredInput = outputResult.getText().toString();
            if(enteredInput.length() > 0){
                enteredInput = enteredInput.substring(0, enteredInput.length() - 1);
                currentDisplayedInput = enteredInput;
                inputToBeParsed = enteredInput;
                outputResult.setText(currentDisplayedInput);
            }
        }else if(data.equals("=")){
            String enteredInput = outputResult.getText().toString();
            // call a function that will return the result of the calculate.

            String resultObject = mCalculator.getResult(currentDisplayedInput, inputToBeParsed);
            outputResult.setText(removeTrailingZero(resultObject));
            expression.setText(inputToBeParsed);
        }else if(data.equals("Ans")){
            String enteredInput = outputResult.getText().toString();
            enteredInput += lastResultObtain;
            outputResult.setText(enteredInput)
            ;
        } else{
            obtainInputValues(data);
        }
    }
    private String removeTrailingZero(String formattingInput){
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
   /* private void toggleInverse(){
        if(isInverse){
            isInverse = false;
        }
    }
    private void toggleShiftButton(){
        if(isInverse){
            shiftDisplay.setText("SHIFT");
        }else{
            shiftDisplay.setText("");
        }
    }*/

    private double isANumber(String numberInput){
        double result = Double.NaN;
        try{
            result = Double.parseDouble(numberInput);
        }catch(NumberFormatException nfe){
        }
        return result;
    }
   /* private void addToMemoryStorage(Context context, double inputToStore){
        float returnPrefValue = getPreference(context);
        float newValue = returnPrefValue + (float)inputToStore;
        setPreference(context, newValue);
    }
    private void subtractMemoryStorage(Context context, double inputToStore){
        float returnPrefValue = getPreference(context);
        float newValue = returnPrefValue - (float)inputToStore;
        setPreference(context, newValue);
    }
    private void clearMemoryStorage(Context context){
        setPreference(context, 0);
    }
    private String getStoredPreferenceValue(Context context){
        float returnedValue = getPreference(context);
        return String.valueOf(returnedValue);
    }
    static public boolean setPreference(Context c, float value) {
        SharedPreferences settings = c.getSharedPreferences(PREFS_NAME, 0);
        settings = c.getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putFloat("key", value);
        return editor.commit();
    }
    static public float getPreference(Context c) {
        SharedPreferences settings = c.getSharedPreferences(PREFS_NAME, 0);
        settings = c.getSharedPreferences(PREFS_NAME, 0);
        float value = settings.getFloat("key", 0);
        return value;
    }

    } */






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

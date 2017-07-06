package myapplication.risenapps.com.studentutility;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//This is the Converter activity
public class Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter); //Here it calls its xml file

        Button units = (Button)findViewById(R.id.Units);
        units.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
                ft1.add(R.id.units,new unitsFragment());
                ft1.commit();

            }
        });



    }

}

package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.alumno.myapplication.models.XPath;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<XPath> myList = new ArrayList<>();

        XPath myPath = new XPath(-72.2831726, 42.9271271);
        myList.add(myPath);

        XPath myPath1 = new XPath(-72.2841597, 42.9234033);
        myList.add(myPath1);

        XPath myPath2 = new XPath(-72.278173, 42.9240789);
        myList.add(myPath2);

        XPath myPath3 = new XPath(-72.2831941, 42.9271271);
        myList.add(myPath3);

        //message
        Toast.makeText(this,String.format("Hay %s elementos", myList.size()),
                Toast.LENGTH_LONG).show();

        String url = "https://www.keene.edu/campus/maps/tool/?coordinates=";

        String Ruta = "";

        int i = 1;

        for (XPath current_object: myList)
        {
            Ruta += current_object.longitud + "%2C%20" + current_object.latitud;

            if (i < myList.size())
            {
                Ruta += "%0A";
            }
            i++;
        }

        Log.v("Franz", url + Ruta);

        setContentView(R.layout.activity_main);
    }
}

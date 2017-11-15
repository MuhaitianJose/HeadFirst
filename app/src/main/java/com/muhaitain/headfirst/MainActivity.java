package com.muhaitain.headfirst;

import android.os.Bundle;
import android.os.FileObserver;
import android.util.Log;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.muhaitain.headfirstlibrary.chapter_first.Duck;
import com.muhaitain.headfirstlibrary.chapter_first.MallardDuck;
import com.muhaitain.headfirstlibrary.chapter_second.CurrentConditionsDisplay;
import com.muhaitain.headfirstlibrary.chapter_second.WeatherData;
import com.muhaitain.headfirstlibrary.chapter_third.Beverage;
import com.muhaitain.headfirstlibrary.chapter_third.DarkRoast;
import com.muhaitain.headfirstlibrary.chapter_third.Espresso;
import com.muhaitain.headfirstlibrary.chapter_third.HouseBlend;
import com.muhaitain.headfirstlibrary.chapter_third.Milk;
import com.muhaitain.headfirstlibrary.chapter_third.Mocha;
import com.muhaitain.headfirstlibrary.chapter_third.Soy;
import com.muhaitain.headfirstlibrary.chapter_third.Whip;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        testDuck();
        testWeather();
        testStarbucks();
    }

    private void testDuck() {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }

    private void testWeather() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(45, 89, 27);
    }

    private void testStarbucks() {
        Beverage beverage = new Espresso();
        Log.d(TAG, "testStarbucks: " + beverage.getDescription() + "$ " + beverage.cost());
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        Log.d(TAG, "testStarbucks: " + beverage1.getDescription() + "$ " + beverage1.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        Log.d(TAG, "testStarbucks: " + beverage2.getDescription() + "$ " + beverage2.cost());
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}

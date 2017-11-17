package com.muhaitain.headfirst;

import android.os.Bundle;
import android.util.Log;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.muhaitain.headfirstlibrary.chapter_first.Duck;
import com.muhaitain.headfirstlibrary.chapter_first.MallardDuck;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizzastore.CaliforniaPizzaStore;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizzastore.NYPizzaStore;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizzastore.PizzaStore;
import com.muhaitain.headfirstlibrary.chapter_second.CurrentConditionsDisplay;
import com.muhaitain.headfirstlibrary.chapter_second.WeatherData;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.Amplifier;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.CdPlayer;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.DvdPlayer;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.HomeTheaterFacade;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.PopcornPopper;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.Projector;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.Screen;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.TheaterLights;
import com.muhaitain.headfirstlibrary.chapter_seventh.appearance.Tuner;
import com.muhaitain.headfirstlibrary.chapter_seventh.duck.TurkeyAdapter;
import com.muhaitain.headfirstlibrary.chapter_seventh.duck.WildTurkey;
import com.muhaitain.headfirstlibrary.chapter_sixth.SimpleRemoteControl;
import com.muhaitain.headfirstlibrary.chapter_sixth.command.GarageDoorCloseCommand;
import com.muhaitain.headfirstlibrary.chapter_sixth.command.GarageDoorOpenCommand;
import com.muhaitain.headfirstlibrary.chapter_sixth.command.ICommand;
import com.muhaitain.headfirstlibrary.chapter_sixth.command.LightOffCommand;
import com.muhaitain.headfirstlibrary.chapter_sixth.command.LightOnCommand;
import com.muhaitain.headfirstlibrary.chapter_sixth.command.StereoOffWithCDCommand;
import com.muhaitain.headfirstlibrary.chapter_sixth.command.StereoOnWithCDCommand;
import com.muhaitain.headfirstlibrary.chapter_sixth.model.GarageDoor;
import com.muhaitain.headfirstlibrary.chapter_sixth.model.Light;
import com.muhaitain.headfirstlibrary.chapter_sixth.model.Stereo;
import com.muhaitain.headfirstlibrary.chapter_third.Beverage;
import com.muhaitain.headfirstlibrary.chapter_third.DarkRoast;
import com.muhaitain.headfirstlibrary.chapter_third.Espresso;
import com.muhaitain.headfirstlibrary.chapter_third.HouseBlend;
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
//        testDuck();
//        testWeather();
//        testStarbucks();
//        testFactory();
//        testCommand();
        testAdapter();
        testAmplifier();
    }

    /**
     * 策略模式
     */
    private void testDuck() {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }

    /**
     * 观察者模式
     */
    private void testWeather() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(45, 89, 27);
    }

    /**
     * 装饰者模式
     */
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

    /**
     * 工厂模式
     */
    private void testFactory() {
        PizzaStore pizzaStore = new CaliforniaPizzaStore();
        pizzaStore.orderPizza("Cheese");
        PizzaStore pizzaStore1 = new NYPizzaStore();
        pizzaStore1.orderPizza("Cheese");
    }

    /**
     * 命令模式
     */
    private void testCommand() {

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light livingRoomLight = new Light("livingRoomlight");
        Light kitchenLight = new Light("kitchenLight");
        GarageDoor garageDoor = new GarageDoor("GarageDoor");
        Stereo stereo = new Stereo("Stereo");

        ICommand liveonCommand = new LightOnCommand(livingRoomLight);
        ICommand liveoffCommand = new LightOffCommand(livingRoomLight);
        simpleRemoteControl.setCommand(0, liveonCommand, liveoffCommand);


        ICommand kitchenonCommand = new LightOnCommand(kitchenLight);
        ICommand kitchenoffCommand = new LightOffCommand(kitchenLight);
        simpleRemoteControl.setCommand(1, kitchenonCommand, kitchenoffCommand);


        GarageDoorOpenCommand openCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand closeCommand = new GarageDoorCloseCommand(garageDoor);
        simpleRemoteControl.setCommand(2, openCommand, closeCommand);

        StereoOnWithCDCommand onWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand offWithCDCommand = new StereoOffWithCDCommand(stereo);
        simpleRemoteControl.setCommand(3, onWithCDCommand, offWithCDCommand);

        simpleRemoteControl.onButtonWasPressed(0);
        simpleRemoteControl.offButtonWasPressed(0);

        simpleRemoteControl.onButtonWasPressed(1);
        simpleRemoteControl.offButtonWasPressed(1);

        simpleRemoteControl.onButtonWasPressed(2);
        simpleRemoteControl.offButtonWasPressed(2);

        simpleRemoteControl.onButtonWasPressed(3);
        simpleRemoteControl.offButtonWasPressed(3);

    }

    /**
     * 适配器模式
     */
    public void testAdapter() {
        com.muhaitain.headfirstlibrary.chapter_seventh.duck.MallardDuck duck = new com.muhaitain.headfirstlibrary.chapter_seventh.duck.MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        Log.d(TAG, "testAdapter: MallardDuck");
        wildTurkey.gobble();
        wildTurkey.fly();
        Log.d(TAG, "testAdapter: wildTurkey");
        testDuck(duck);
        Log.d(TAG, "testAdapter: turkeyAdapter");
        testDuck(turkeyAdapter);
    }

    public void testDuck(com.muhaitain.headfirstlibrary.chapter_seventh.duck.Duck duck) {
        duck.quack();
        duck.fly();
    }

    /**
     * 外观模式
     */
    public void testAmplifier() {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
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

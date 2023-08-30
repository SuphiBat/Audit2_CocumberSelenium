package com.devbook.stepDefinitions;

import com.devbook.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before // JAVA
    public void setUp() {
        //System.out.println("\tThis is coming from Before method");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After //JAVA
    public void tearDown(Scenario scenario) {
        //System.out.println("\tThis is coming from After method");
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }
    @Before ("@db")
    public void setUpDB(){
        //System.out.println("\tConnection DB");
    }
    @After ("@db")
    public void teatDownDB(){
        //System.out.println("Disconnection DB");
    }


}

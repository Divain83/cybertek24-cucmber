package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * similar to TestBase.java in TestNG framework
 * We open close browsers here etc
 */

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("BEFORE - setUp method is running before the scenario ");
    }
    //    @After
//    public void tearDownScenario(){
//        System.out.println("AFTER - tearDown scenario is running after the scenario");
//        Driver.closeDriver();
    //  }
    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName()); // keeping all screenshots
        }

        System.out.println("After - tearDown method is running after the scenario: " + scenario.getName());
        Driver.closeDriver();


    }
//    @AfterStep()
//    public void tearDownStep(Scenario scenario) {
//        byte[] image=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//        scenario.attach(image, "image/png", scenario.getName());
//    }
}

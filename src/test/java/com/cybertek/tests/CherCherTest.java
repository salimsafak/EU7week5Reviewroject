package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class CherCherTest {
   /*
     1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
            2. Click on "Click me, to Open an alert after 5 seconds"
            3. Explicitly wait until alert is present
    4. Then handle the Javascript alert
*/
   WebDriver driver;
         @BeforeMethod
    public void setup(){

        driver = WebDriverFactory.getDriver("chrome");

    }



    @AfterMethod
    public void tearDown(){


    }
    @Test
    public void test1(){}
}

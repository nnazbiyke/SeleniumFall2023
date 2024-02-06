package org.fall23;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import javax.swing.*;

public abstract class BaseTest {

    protected static WebDriver driver;
    protected Faker fakerData;
    protected Actions actions;


    @BeforeClass
    public void setUp(){
        driver = WebDriverManager.initChromeDriver();
        fakerData = new Faker();
        actions = new Actions(driver);

    }

    @AfterClass
    public void tearDown(){
        WebDriverManager.closeBrowser();
    }
}

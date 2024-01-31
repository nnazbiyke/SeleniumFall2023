package org.fall23;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    protected static WebDriver driver;


    @BeforeClass
    public void setUp(){
        driver = WebDriverManager.initChromeDriver();
    }

    @AfterClass
    public void tearDown(){
        WebDriverManager.closeBrowser();
    }
}

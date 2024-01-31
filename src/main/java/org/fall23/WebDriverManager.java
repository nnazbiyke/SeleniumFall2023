package org.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


import java.time.Duration;

public class WebDriverManager {

    public static WebDriver driver;

    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    public static void  closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();
    }

//    public static void scrollDownThePage(WebElement element){
//        select = new Select(element);
//        select.selectByVisibleText("30");
//    }

    // create method that scroll down

}

package org.fall23.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirFoxWebDriver {

    public static WebDriver loadFireFoxDriver() {
        System.setProperty("webdriver.firefox.driver","src/main/resources/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}

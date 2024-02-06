package org.fall23.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeWebDriver {

    public static WebDriver loadChromeDriver() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}

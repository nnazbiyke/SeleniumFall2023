package org.fall23.locators;

import org.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.fall23.WebElementManager.findByPartialLinkText;
import static org.fall23.WebElementManager.openTheSite;

public class PartialLinkTextTest extends BaseTest {
    @Test
    void demo(){
        openTheSite("https://demoqa.com/links");
        //WebElement Unauth = driver.findElement(By.partialLinkText("Unauth"));
        findByPartialLinkText("Unauth").click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");
       // Unauth.click();
    }
}

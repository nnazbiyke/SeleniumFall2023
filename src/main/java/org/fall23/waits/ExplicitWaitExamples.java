package org.fall23.waits;

import org.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.fall23.WebElementManager.openTheSite;

public class ExplicitWaitExamples extends BaseTest {

    @Test
    void waitForElementToBeClickAble(){
        openTheSite("https://demoqa.com/dynamic-properties");
        WebElement willEnableAfter5SecondBtn = driver.findElement(By.id("enableAfter"));


        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
        wait.until(ExpectedConditions.elementToBeClickable(willEnableAfter5SecondBtn));

        WebElement dangerColor = driver.findElement(By.id("colorChange"));
        wait.until(ExpectedConditions.attributeContains(dangerColor,"class","danger"));
        System.out.println(dangerColor.getAttribute("class"));

    }
}

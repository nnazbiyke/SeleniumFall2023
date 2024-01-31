package org.fall23.locators;

import org.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.fall23.WebElementManager.openTheSite;

public class ByClassNameTestDemo extends BaseTest {

    @Test
    void demo1(){
        openTheSite("https://demoqa.com/text-box");

        WebElement usernameInput = driver.findElement(By.id("userName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn = driver.findElement(By.className("btn-primary"));

        usernameInput.sendKeys("John");
        emailInput.sendKeys("John@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet 123");
    }
}

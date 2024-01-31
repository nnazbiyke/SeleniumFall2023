package org.fall23.locators;

import org.fall23.BaseTest;
import org.testng.annotations.Test;

import static org.fall23.WebElementManager.*;

public class ByID extends BaseTest {

    @Test
    void byIdTest() {
        openTheSite("https://demoqa.com/text-box");

        findById("userName").sendKeys("John");
        findById("currentAddress").sendKeys("John@gmail.com");
        findById("permanentAddress").sendKeys("WallStreet 555");
        findById("permanentAddress").sendKeys("Sovet 123");

        scrollDownWebPage();
        findById("submit").click();

    }
}

//        WebElement emailInput = driver.findElement(By.id("userEmail"));
//        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
//        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
//        WebElement submitBtn = driver.findElement(By.id("submit"));
//
//        emailInput.sendKeys("John@gmail.com");
//        currentAddressInput.sendKeys("WallStreet 555");
//        permanentAddressInput.sendKeys("Sovet 123");

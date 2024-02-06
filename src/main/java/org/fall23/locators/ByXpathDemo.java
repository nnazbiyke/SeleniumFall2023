package org.fall23.locators;

import org.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.fall23.WebElementManager.findByXpath;
import static org.fall23.WebElementManager.openTheSite;

public class ByXpathDemo extends BaseTest {

    @Test
    void textBox(){
        openTheSite("https://demoqa.com/text-box");
        WebElement fullNameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        fullNameInput.sendKeys("John Doe");

        WebElement emailInput = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
        emailInput.sendKeys("John@gmail.com");




        //textarea[@placeholder="Current Address"]
        //findByXpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input").sendKeys("JohnDoe");


    }


}

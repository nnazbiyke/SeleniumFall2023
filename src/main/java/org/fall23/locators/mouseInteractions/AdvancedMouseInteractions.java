package org.fall23.locators.mouseInteractions;

import org.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import static org.fall23.WebElementManager.openTheSite;
import static org.testng.Assert.assertEquals;

public class AdvancedMouseInteractions extends BaseTest {

    @Test
    void buttonClickDouble() throws InterruptedException {
        openTheSite("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickBtn).perform();
        String actualDoubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
        assertEquals(actualDoubleClickMessage, "You have done a double click");
        Thread.sleep(500);
    }

    @Test
    void rightClickTest() throws InterruptedException {
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();
        String actualContextClick = driver.findElement(By.id("rightClickMessage")).getText();
        assertEquals(actualContextClick,"You have done a right click");
        Thread.sleep(5000);
    }

    @Test
    void dynamicIdClickTest() throws InterruptedException {
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[text() ='Click Me']"));
        actions.click(rightClickBtn).perform();
        String actualDynamicClick = driver.findElement(By.id("dynamicClickMessage")).getText();
        assertEquals(actualDynamicClick,"You have done a dynamic click");
        Thread.sleep(5000);
    }







}

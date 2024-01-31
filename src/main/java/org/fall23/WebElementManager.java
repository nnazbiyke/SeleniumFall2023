package org.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebElementManager extends BaseTest{

    protected static Actions actions;

    public static void openTheSite(String URL){
        driver.get(URL);
    }
    public static WebElement findById(String ID){
        return driver.findElement(By.id(ID));
    }
    public static WebElement findByLinkText(String linkText){
        return driver.findElement(By.linkText(linkText));
    }
    public static WebElement findByPartialLinkText(String partialText){
        return driver.findElement(By.partialLinkText(partialText));
    }

    public static void scrollDownWebPage(){
        actions = new Actions(driver);
        actions.scrollByAmount(0, 500).perform();
    }
    public static WebElement findByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }
}

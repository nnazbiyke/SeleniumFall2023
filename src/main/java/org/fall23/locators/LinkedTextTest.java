package org.fall23.locators;

import org.fall23.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.fall23.WebElementManager.*;

public class LinkedTextTest extends BaseTest {
    @Test
    void demo1(){
        openTheSite("https://demoqa.com/links");

        findByLinkText("Created").click();

       // String actualResult = driver.findElement(By.xpath("//p[@id='linkResponse']")).getText();

        String expectedResult = "Link has responded with staus 201 and status text Created";
        Assert.assertEquals(findByXpath("//p[@id='linkResponse']").getText(),expectedResult);

        findByLinkText("Home").click();
//
//        WebElement home = driver.findElement(By.linkText("Home"));
//        home.click();

//        WebElement homeWithDynamicLink = driver.findElement(By.xpath("(//a[@href=\"https://demoqa.com\"])[3]"));
//        homeWithDynamicLink.click();

        findByXpath("(//a[@href=\"https://demoqa.com\"])[3]").click();
    }

}

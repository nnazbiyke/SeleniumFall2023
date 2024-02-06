package org.fall23.demoqa;

import org.fall23.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.fall23.WebElementManager.openTheSite;

public class DownloadFileTest extends BaseTest {

    @Test
    void downloadTest(){
        openTheSite("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("/Users/nazbiikenishaeva/Desktop/Screenshot 2024-02-02 at 23.31.10.png");
        driver.findElement(By.id("downloadButton")).click();


    }

}

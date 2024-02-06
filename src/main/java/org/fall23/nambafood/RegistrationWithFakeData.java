package org.fall23.nambafood;

import org.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.fall23.WebElementManager.openTheSite;

public class RegistrationWithFakeData extends BaseTest {

    @Test
    void registrationForm(){
        openTheSite("https://nambafood.kg/?language=en");
        WebElement login_button = driver.findElement(By.cssSelector("#login--button"));
        login_button.click();



    }
}

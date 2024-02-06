package org.fall23.locators;

import org.fall23.BaseTest;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class OrangeHRMLogin extends BaseTest {


    @Test()
    public  void loginPageTest() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String actualLoginText = driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        String username = "Admin";
        String password = "admin123";

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        String actualUsernameText = usernameInputField.getAttribute("value");
        String expectedUsernameText = "Admin";
        Assert.assertEquals(actualUsernameText, expectedUsernameText, "Username text does not match");

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualDashboardText = driver.findElement(By.tagName("h6")).getText();
        String expectedDashboardText = "Dashboard";
        Assert.assertEquals(actualDashboardText, expectedDashboardText);

    }

    @Test(dataProvider = "loginPageData")
    void loginPageTestWithNegative(String username, String password) {

        String actualLoginText = driver.findElement(By.tagName("h5")).getText();
        String expectedLoginText = "Login";
        Assert.assertEquals(actualLoginText, expectedLoginText);

        WebElement usernameInputField = driver.findElement(By.name("username"));
        WebElement passwordInputField = driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualMessageInvalidCredentials = driver.findElement(By.xpath("//div[@role=\"alert\"]")).getText();
        String expectedMessageInvalidCredentials = "Invalid credentials";
        Assert.assertEquals(actualMessageInvalidCredentials,expectedMessageInvalidCredentials);

    }


    @DataProvider(name = "loginPageData")
    public Object[][] negativeDataForLoginPage() {
        return new Object[][]{
                {"John", "1234"},
                {"h2334", "890"},
                {"Test", "Test789"}
        };
    }

    @Test
    public void forgotYourPassword() {
        WebElement forgotPasswordBtn = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotPasswordBtn.click();
        String name = "John";

        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys(name);

        WebElement resetPassword = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        resetPassword.click();

        String actualMessage = driver.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[3]")).getText();
        String expectedMessage = "If the email does not arrive, please contact your OrangeHRM Administrator.";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

}
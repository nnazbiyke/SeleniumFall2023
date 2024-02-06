package org.fall23.ui.pages.elements;

import org.fall23.drivers.Driver;
import org.fall23.helper.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    public TextBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitButton;

    WebElementHelper webElementHelper = new WebElementHelper();

    public TextBoxPage fillUpFieldFullName(String fullName){
        webElementHelper.sendKeys(fullNameInput,fullName);
        return this;
    }

    public TextBoxPage fillUpFieldEmail(String email){
        webElementHelper.sendKeys(emailInput,email);
        return this;
    }
    public TextBoxPage fillUpFieldCurrentAddress(String currentAddress){
        webElementHelper.sendKeys(currentAddressInput,currentAddress);
        return this;
    }
    public TextBoxPage fillUpFieldPermanentAddress(String permanentAddres){
        webElementHelper.sendKeys(permanentAddressInput,permanentAddres);
        return this;
    }
    public TextBoxPage clickSubmitButton (){
        webElementHelper
                .scrollToElement(submitButton)
                .click(submitButton);
        return this;
    }


}

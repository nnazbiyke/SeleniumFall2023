package org.fall23.nambafood;

import org.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.fall23.WebElementManager.*;

public class OrderFood extends BaseTest {


    @Test
    void order(){
        openTheSite("https://nambafood.kg/?language=en");

        scrollDownWebPage(0,600);
        WebElement foodButton = driver.findElement(By.xpath("//a[@class='home--cat-item food']"));
        foodButton.click();

        scrollDownWebPage(0,700);
        WebElement pizzaButton = driver.findElement(By.xpath("//a[@href=\"/cafe/pizza?language=en\"]//div[2]"));
        pizzaButton.click();

        WebElement freshBox = driver.findElement(By.xpath("//a[@href=\"/freshbox?language=en\"]"));
        freshBox.click();

        scrollDownWebPage(0,500);
        WebElement bento_box_seoul_order = driver.findElement(By.xpath("//div[@data-item-name=\"Bento Box Seoul\"]/button"));
        bento_box_seoul_order.click();

        WebElement menu_click = driver.findElement(By.xpath("//div[@class=\"btn menu-link\" and @id=\"cart\"]"));
        menu_click.click();

        WebElement checkoutButtonClick = driver.findElement(By.xpath("//button[@class=\"order--btn order--access\"]"));
        checkoutButtonClick.click();

        WebElement nameInput = driver.findElement(By.xpath("//input[@id='food_order_client_name']"));
        WebElement addressInput = driver.findElement(By.xpath("//input[@id=\"food_order_address\"]"));
        WebElement phoneInput = driver.findElement(By.xpath("//input[@id=\"food_order_phone\"]"));
        WebElement numberDoor = driver.findElement(By.xpath("//input[@id=\"food_order_door_code\"]"));


        String firstName =fakerData.name().firstName();
        String address = fakerData.address().streetAddress();
        String number = fakerData.number().digit();
        String phoneNumber = fakerData.phoneNumber().phoneNumber();


        nameInput.sendKeys(firstName);
        addressInput.sendKeys(address);
        numberDoor.sendKeys(number);
        phoneInput.sendKeys(phoneNumber);

        String month = "March";
        String year = "2024";
        String day = "20";

        findByXpath("//label[@for=\"delivery_later\"]").click();
        findByXpath("//input[@id=\"datepicker--confirmation\"]").click();

//        while (true){
//            String textYear = findByXpath("//div[@class=\"xdsoft_select xdsoft_yearselect xdsoft_scroller_box\"]/div/div[@class=\"xdsoft_option \"]").getText();
//            if(textMonth.equals(month) && textYear.equals(year)){
//                break;
//            }
//            else{
//                findByXpath("(//button[@class=\"xdsoft_next\"])[1]").click();
//            }
//        }
        findByXpath("//div[@class=\"xdsoft_label xdsoft_month\"]").click();
        WebElement textMonth = findByXpath("//div[@class=\"xdsoft_select xdsoft_monthselect xdsoft_scroller_box\"]/div/div[@class=\"xdsoft_option \"]");

        System.out.println(textMonth.getText());


        //div[@class="xdsoft_datepicker active"]/div[2]/table/tbody/tr[4]/td[3]



    }


































    //        findByXpath("//a[@class=\"home--cat-item food\"]").click();
//        findByXpath("(//div[@class=\"cat-item--prev\"])[1]").click();
//
//        scrollDownWebPage(0,700);
//        findByXpath("(//div[@class=\"cafe-item--title\"])[8]").click();
//        scrollDownWebPage(0,500);
//        findByXpath("(//button[@class=\"status active bay_item\"])[1]").click();
//        findByXpath("//div[@class='btn menu-link']").click();
//        findByXpath("(//div[@class=\"order--actions\"])[2]").click();
//
//
//
//
////        findByXpath("//input[@placeholder=\"Name\"]").sendKeys("Aigesha");
////        findByXpath("//input[@placeholder=\"Enter delivery address\"]").sendKeys("Togolok Moldo");
////        findByXpath("//input[@placeholder=\"Apt number and floor\"]").sendKeys("3");
////        findByXpath("//input[@id=\"food_order_phone\"]").sendKeys("0555111111");
////        findByXpath("//textarea[@id=\"food_order_additional_info\"]").sendKeys("000 door code");
////        findByXpath("(//h2[@class=\"resp-accordion\"])[1]").click();
}

import org.fall23.drivers.Driver;
import org.fall23.ui.pages.elements.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxTest {

    WebDriver driver;
    TextBoxPage textBoxPage;

    @BeforeClass
    void setUpDriver(){
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
    }
    @Test
    void fillUpTheFormPositiveTest(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage
                .fillUpFieldFullName("John Doe")
                .fillUpFieldEmail("john@gmail.com")
                .fillUpFieldCurrentAddress("Mira 123")
                .fillUpFieldPermanentAddress("Sovet 321")
                .clickSubmitButton();
    }
}

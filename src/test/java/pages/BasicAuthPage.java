package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasicAuthPage extends BasePage {

    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3")
    public WebElement WelcomeMsg;

    public void login() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assertions.assertEquals("Basic Auth", WelcomeMsg.getText());
    }
}

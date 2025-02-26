package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    protected WebDriver driver;

    @FindBy(xpath = "//h3")
    public WebElement WelcomeMsg;

    @FindBy(xpath= "//ul/li/a[contains(text(), 'Basic Auth')]")
    public WebElement authLink;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assertions.assertEquals("Basic Auth", WelcomeMsg.getText());
    }
}

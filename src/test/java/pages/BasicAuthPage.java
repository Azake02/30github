package pages;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage {
    protected WebDriver driver;
    @FindBy(xpath = "//h3")
    public WebElement WelcomeMsg;

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assertions.assertEquals("Basic Auth", WelcomeMsg.getText());
    }

    public void verifyWelcomeMsg(){
        Assert.isTrue(WelcomeMsg.isDisplayed(), "Элемент WelcomeMsg не отображается");
    }
}

package pages;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.apache.commons.lang3.Validate.isTrue;

public class HoverPage {
    protected WebDriver driver;
    @FindBy(xpath = "(//div[@class='figure'])[1]")
    WebElement firstHover;

    @FindBy(xpath = "//a[@href='/users/1']")
    WebElement userNameLink;

    @FindBy(xpath = "//h1")
    WebElement title;

    public HoverPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    public void navigateAndClickOnHoversName(){
        Actions actions = new Actions(driver);
        actions.moveToElement(firstHover).perform();
        userNameLink.click();
        Assertions.assertTrue(title.isDisplayed());
    }

}

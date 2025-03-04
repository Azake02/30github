package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HoverPage extends BasePage{
    public HoverPage (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "(//div[@class='figure'])[1]")
    WebElement firstHover;

    @FindBy(xpath = "//a[@href='/users/1']")
    WebElement userNameLink;

    @FindBy(xpath = "//h1")
    WebElement title;

    public void navigateAndClickOnHoversName(){
        Actions actions = new Actions(driver);
        actions.moveToElement(firstHover).perform();
        userNameLink.click();
        Assertions.assertTrue(title.isDisplayed());
    }

}

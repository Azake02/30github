package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DOMPage extends BasePage{

    public DOMPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@class='button']")
    WebElement bazBtn;

    @FindBy(xpath = "//canvas[@id='canvas']")
    WebElement canvasAnswer;

    public void clickOnBuz(){
        bazBtn.click();
    }

    public void getBazNummer(){
        Assert.isTrue(canvasAnswer.isDisplayed(), "There is no canvas");
    }
}

package pages;

import dev.failsafe.internal.util.Assert;
import io.restassured.internal.common.assertion.Assertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DOMPage {
    protected WebDriver driver;

    public DOMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "//a[@id='9fe770a0-d80e-013d-006f-46d8c6d661bc']")
    WebElement bazBtn;

    @FindBy(id = "//canvas[@id='canvas']")
    WebElement canvasAnswer;

    public void clickOnBuz(){
        bazBtn.click();
    }

    public void getBazNummer(){
        Assert.isTrue(canvasAnswer.isDisplayed(), "There is no canvas");
    }
}

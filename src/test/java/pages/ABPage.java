package pages;

import dev.failsafe.internal.util.Assert;
import io.restassured.internal.common.assertion.Assertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABPage {
    protected WebDriver driver;

    public ABPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h3[contains(text(),\"A/B Test Control\")]")
    WebElement ABHeader;

    public void headerExist(){
        Assert.isTrue(ABHeader.isDisplayed(),"Элемент A/B Test не отображается");
    }
}

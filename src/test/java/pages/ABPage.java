package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABPage extends BasePage {
    public ABPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h3[contains(text(),\"A/B Test Control\")]")
    WebElement ABHeader;

    public void headerExist(){
        Assert.isTrue(ABHeader.isDisplayed(),"Элемент A/B Test не отображается");
    }
}

package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementsPage extends BasePage{
    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[@onclick='addElement()']")
    WebElement addElementBtn;

    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    WebElement deleteElementBtn;

    public void clickOnAddElBtn(){
        addElementBtn.click();
    }

    public void deleteElBtnExist(){
        Assert.isTrue(deleteElementBtn.isDisplayed(), "There is no button");
    }
}

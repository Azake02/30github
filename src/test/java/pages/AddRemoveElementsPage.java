package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {
    protected WebDriver driver;

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

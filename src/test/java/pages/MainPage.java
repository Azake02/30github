package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),\"A/B Testing\")]")
    WebElement AbTesting;

    @FindBy(xpath = "//a[contains(text(),\"Challenging DOM\")]")
    WebElement DOM;

    @FindBy(xpath = "//a[contains(text(),\"Add/Remove Elements\")]")
    WebElement addRemoveElements;

    @FindBy(xpath = "//a[contains(text(),\"Drag and Drop\")]")
    WebElement dragAndDrop;

    @FindBy (xpath = "//a[contains(text(),\"Hovers\")]")
    WebElement hover;

    @FindBy (xpath = "//a[contains(text(),\"Key Presses\")]")
    WebElement keyPresses;

    public void clickOnAbLink(){
        AbTesting.click();
    }

    public void clickOnDomLnk(){
        DOM.click();
    }

    public void clickOnAddRemoveLink(){
        addRemoveElements.click();
    }

    public void clickOnDragAndDropBtn(){
        dragAndDrop.click();
    }

    public void clickOnHoverLink(){
        hover.click();
    }

    public void clickOnKeyPressesLink(){
        keyPresses.click();
    }
}

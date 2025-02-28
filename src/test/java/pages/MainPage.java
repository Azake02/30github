package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    protected WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),\"A/B Testing\")]")
    WebElement AbTesting;

    @FindBy(xpath = "//a[contains(text(),\"Challenging DOM\")]")
    WebElement DOM;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAbLink(){
        AbTesting.click();
    }

    public void clickOnDomLnk(){
        DOM.click();
    }

}

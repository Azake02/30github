package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    protected WebDriver driver;

    @FindBy(xpath = "///a[contains(text(),'Sign in')]")
    private WebElement signInBtn;

    @FindBy(id = "//a[@data-qa='loginGoogleButton']")
    private WebElement lgnGgl;

    @FindBy(xpath = "//input[@id='idToken2']")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login() {
        signInBtn.click();
        lgnGgl.click();
    }
}

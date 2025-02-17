package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage {
    private static final Logger log = LoggerFactory.getLogger(LoginPage.class);
    protected WebDriver driver;

    @FindBy(xpath = "//input[@id='idToken1']")
    private WebElement usernameField;

    @FindBy(id = "idToken2")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='idToken2']")
    private WebElement loginBtn;


    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement dashboard;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogInBtn(){
        dashboard.click();
    }
    public void login(String username, String password) {
        usernameField.click();
        usernameField.sendKeys(username);
        passwordField.click();
        passwordField.sendKeys(password);
        loginBtn.click();
    }
}

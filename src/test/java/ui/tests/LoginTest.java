package ui.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://saucelabs.com/");
        loginPage = new LoginPage(driver);
    }


    @Test
    void testLogin() {
        loginPage.clickOnLogInBtn();
        loginPage.login("user", "azat@gmail.com");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}


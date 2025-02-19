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
import utils.Config;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(Config.BASE_URL);
        driver.wait(5000);
        loginPage = new LoginPage(driver);
    }


    @Test
    void testLogin() {
        loginPage.login();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}


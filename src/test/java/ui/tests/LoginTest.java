package ui.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.MainPage;
import utils.Config;

public class LoginTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    private WebDriver driver;
    private MainPage loginPage;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get(Config.BASE_URL);
        loginPage = new MainPage(driver);
    }


    @Test
    void testLogin() {
        loginPage.login();
    }

    @AfterEach
    void tearDown() {
//        driver.quit();
    }
}


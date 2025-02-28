package ui.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasicAuthPage;
import pages.MainPage;
import posts.BaseTest;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    private WebDriver driver;
    public BasicAuthPage loginPage;


    @Test
    void testLogin() {
        loginPage.login();

    }

}


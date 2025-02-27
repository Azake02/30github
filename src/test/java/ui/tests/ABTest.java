package ui.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ABPage;
import pages.MainPage;
import posts.BaseTest;

public class ABTest extends BaseTest {

    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
        abPage = new ABPage(driver);
    }

    public ABPage abPage;
    public MainPage mainPage;
    @Test
    void AbTest() {
        mainPage.clickOnAbLink();
        abPage.headerExist();
    }
}

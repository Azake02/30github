package ui.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ABPage;
import pages.DOMPage;
import pages.MainPage;
import posts.BaseTest;

public class DOMTest extends BaseTest {

    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
        domPage = new DOMPage(driver);
    }

    public DOMPage domPage;
    public MainPage mainPage;
    @Test
    void getBazNmr() {
        mainPage.clickOnDomLnk();
        domPage.clickOnBuz();
        domPage.getBazNummer();
    }
}

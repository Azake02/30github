package ui.tests;

import org.junit.jupiter.api.Test;
import pages.DOMPage;
import pages.MainPage;
import posts.BaseTest;

public class DOMTest extends BaseUITest {

    public DOMPage domPage = new DOMPage(driver);
    @Test
    void getBazNmr() {
        mainPage.clickOnDomLnk();
        domPage.clickOnBuz();
        domPage.getBazNummer();
    }
}

package ui.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.DOMPage;
import pages.MainPage;
import posts.BaseTest;

public class AddRemoveElementsTest extends BaseTest {
    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
    }

    public DOMPage domPage;
    public MainPage mainPage;
    @Test
    void getBazNmr() {
        mainPage.clickOnAddRemoveLink();
    }
}

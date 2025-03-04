package ui.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HoverPage;
import pages.MainPage;
import posts.BaseTest;

public class HoverTest extends BaseTest {
    MainPage mainPage;
    HoverPage hoverPage;

    @BeforeEach
    void setUp(){
        mainPage = new MainPage(driver);
        hoverPage = new HoverPage(driver);
    }

    @Test
    void testDragAndDrop(){
        mainPage.clickOnHoverLink();
        hoverPage.navigateAndClickOnHoversName();
    }
}

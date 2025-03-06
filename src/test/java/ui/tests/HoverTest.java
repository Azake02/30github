package ui.tests;

import org.junit.jupiter.api.Test;
import pages.HoverPage;

public class HoverTest extends BaseUITest {
    HoverPage hoverPage = new HoverPage(driver);

    @Test
    void testDragAndDrop(){
        mainPage.clickOnHoverLink();
        hoverPage.navigateAndClickOnHoversName();
    }
}

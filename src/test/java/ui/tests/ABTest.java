package ui.tests;

import org.junit.jupiter.api.Test;
import pages.ABPage;


public class ABTest extends BaseUITest {


    public ABPage abPage = new ABPage(driver);
    @Test
    void AbTest() {
        mainPage.clickOnAbLink();
        abPage.headerExist();
    }
}

package ui.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.AddRemoveElementsPage;
import pages.DOMPage;
import pages.MainPage;
import posts.BaseTest;

public class AddRemoveElementsTest extends BaseTest {
    public MainPage mainPage;
    public AddRemoveElementsPage addRemoveElementsPage;
    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
    }


    @Test
    void delBtnExist() {
        mainPage.clickOnAddRemoveLink();
        addRemoveElementsPage.clickOnAddElBtn();
        addRemoveElementsPage.deleteElBtnExist();
    }
}

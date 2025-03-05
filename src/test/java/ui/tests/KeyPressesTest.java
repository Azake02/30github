package ui.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import posts.BaseTest;

public class KeyPressesTest extends BaseTest {
    MainPage mainPage;
    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
    }
    @Test
    void keyPresses(){
        mainPage.clickOnKeyPressesLink();
    }
}

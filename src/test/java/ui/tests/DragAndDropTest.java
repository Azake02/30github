package ui.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.DOMPage;
import pages.DragAndDropPage;
import pages.MainPage;
import posts.BaseTest;

public class DragAndDropTest extends BaseTest {
    MainPage mainPage;
    DragAndDropPage dragAndDropPage;
    @BeforeEach
    void setUp() {
        mainPage = new MainPage(driver);
        dragAndDropPage = new DragAndDropPage(driver);
    }

    @Test
    void testDragAndDrop(){
        mainPage.clickOnDragAndDropBtn();
        dragAndDropPage.dragAToB();
    }
}

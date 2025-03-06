package ui.tests;

import org.junit.jupiter.api.Test;
import pages.DragAndDropPage;


public class DragAndDropTest extends BaseUITest {
    DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);

    @Test
    void testDragAndDrop(){
        mainPage.clickOnDragAndDropBtn();
        dragAndDropPage.dragAToB();
    }
}

package pages;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DragAndDropPage {
    protected WebDriver driver;
    public DragAndDropPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "column-a")
    WebElement columnA;

    @FindBy(id = "column-b")
    WebElement columnB;

    public void dragAToB(){
        Point positionA_Before = columnA.getLocation();
        Point positionB_Before = columnB.getLocation();
        Actions actions = new Actions(driver);
        actions.clickAndHold(columnA)
                .moveToElement(columnB)
                .release()
                .build()
                .perform();
        Point positionA_After = columnA.getLocation();
        Point positionB_After = columnB.getLocation();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(columnA, "(271, 88)", positionA_After.toString())));
        assertNotEquals(positionA_Before, positionA_After);
        assertNotEquals(positionB_Before, positionB_After);
    }

}

package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement columnA;

    @FindBy(id = "column-b")
    WebElement columnB;

    public void dragAToB(){
        Point positionA_Before = columnA.getLocation();
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(columnA, columnB).perform();

        fluentWait.until(driver -> !columnA.getLocation().equals(positionA_Before));

        System.out.println(columnA.getLocation());
        System.out.println(positionA_Before);
    }

}

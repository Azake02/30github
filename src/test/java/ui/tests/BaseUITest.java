package ui.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class BaseUITest {
    protected static WebDriver driver;
    protected static MainPage mainPage;

    @BeforeAll
    static void setUp() {
        driver = new ChromeDriver(); // или другой WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        mainPage = new MainPage(driver);
    }
}

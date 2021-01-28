package ikea;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    protected static WebDriver driver;
    protected static HomePage homePage;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\test\\java\\chromedriver1.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.ikea.com/us/en/");

        String actualTitle = driver.getTitle();

        String expectedTitle = "IKEA US - Furniture and Home Furnishings - IKEA";

        Assert.assertEquals(expectedTitle, actualTitle);

    }

//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }


}

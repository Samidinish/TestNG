import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by asus on 8/23/2016.
 */
public class TestMain {
    WebDriver driver = null;
    @BeforeClass
    public void setUp1() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\asus\\Desktop\\Selenium Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to("http://amazon.com");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown1() throws Exception {
        driver.close();
    }

    @Test
    public void test1() {
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Laptops", Keys.ENTER);
        WebElement element = driver.findElement(By.cssSelector("#nav-prime-try"));
        System.out.println(element.getText());
        // System.out.println(driver.getPageSource());
    }

}

package Tests;
//Omar Mohammed
//2022170911
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise1 {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test(priority = 1)
    public void signUp() {
        System.out.println("Step 1: Signing Up");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("Step 2: Logging In");
    }

    @Test(priority = 3)
    public void addToCart() {
        System.out.println("Step 3: Adding to Cart");
    }

    @AfterTest
    public void teardown() {
        if (driver != null) driver.quit();
    }
}
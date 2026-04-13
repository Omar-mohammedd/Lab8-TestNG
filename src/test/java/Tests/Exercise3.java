package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exercise3 {
    WebDriver driver;

    @BeforeGroups("Smoke")
    public void beforeSmoke() {
        System.out.println("Starting Smoke Group");
    }

    @BeforeGroups("Regression")
    public void beforeRegression() {
        System.out.println("Starting Regression Group");
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test(groups = "Smoke")
    public void testHomepage() {
        System.out.println("Checking Homepage");
    }

    @Test(groups = "Smoke")
    public void testLoginPage() {
        System.out.println("Checking Login Page");
    }

    @Test(groups = "Regression")
    public void testValidLogin() {
        System.out.println("Testing Valid Login");
    }

    @Test(groups = "Regression")
    public void testBalance() {
        System.out.println("Checking Balance");
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }
}
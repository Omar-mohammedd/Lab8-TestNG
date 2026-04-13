package Tests;
//Omar Mohammed
//2022170911
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;

public class Exercise2 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        if (System.getenv("GITHUB_ACTIONS") != null) {
            options.addArguments("--headless");
        }
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/login.html");
    }

    @DataProvider(name = "LoginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "test@mail.com", "123", "invalid" },
                { "test@mail.com", "152", "valid" }
        };
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String pwd, String type) {
        driver.findElement(By.id("email")).sendKeys(user);
        driver.findElement(By.name("passwd")).sendKeys(pwd);
        driver.findElement(By.id("SubmitLogin")).click();
        Assert.assertNotNull(driver.getTitle());
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
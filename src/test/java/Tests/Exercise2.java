package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exercise2 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/login.html");
        driver.manage().window().maximize();
    }

    @DataProvider(name = "LoginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "fail@mail.com", "123", "valid" },
                { "test@mail.com", "152", "valid" } //both shows valid but diff data
        };
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String pwd, String type) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(user);
        driver.findElement(By.name("passwd")).sendKeys(pwd);
        driver.findElement(By.id("SubmitLogin")).click();

        if (type.equals("valid")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("success.html"));
        } else {
            Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Email and/or Password"));
        }

        Thread.sleep(3000);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
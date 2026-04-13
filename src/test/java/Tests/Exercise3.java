package Tests;
//Omar Mohammed
//2022170911
import org.testng.annotations.*;

public class Exercise3 {

    @BeforeGroups("Smoke")
    public void beforeSmoke() {
        System.out.println("Starting Smoke Group");
    }

    @Test(groups = {"Smoke"})
    public void testHomepageLoads() {
        System.out.println("Checking Homepage");
    }

    @Test(groups = {"Smoke"})
    public void testLoginPageVisible() {
        System.out.println("Checking Login Page");
    }

    @AfterGroups("Smoke")
    public void afterSmoke() {
        System.out.println("Finished Smoke Group");
    }

    @BeforeGroups("Regression")
    public void beforeRegression() {
        System.out.println("Starting Regression Group");
    }

    @Test(groups = {"Regression"})
    public void testLoginValidCreds() {
        System.out.println("Testing Valid Login");
    }

    @Test(groups = {"Regression"})
    public void testAccountBalance() {
        System.out.println("Checking Balance");
    }

    @AfterGroups("Regression")
    public void afterRegression() {
        System.out.println("Finished Regression Group");
    }
}
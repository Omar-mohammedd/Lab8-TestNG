package Tests;
//Omar Mohammed
//2022170911
import org.testng.annotations.*;

public class Exercise1 {

    @BeforeTest
    public void openWebSite() {
        System.out.println("Opening Website");
    }

    @Test(priority = 1)
    public void signUp() {
        System.out.println("Signing Up");
    }

    @Test(priority = 2)
    public void logIn() {
        System.out.println("Logging In");
    }

    @Test(priority = 3)
    public void addToCart() {
        System.out.println("Adding to Cart");
    }

    @AfterTest
    public void logOut() {
        System.out.println("Logging Out");
    }
}
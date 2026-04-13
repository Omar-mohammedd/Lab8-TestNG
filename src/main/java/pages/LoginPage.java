package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(name = "uid")
    WebElement userText;

    @FindBy(name = "password")
    WebElement passwordText;

    @FindBy(name = "btnLogin")
    WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String strUserName) {
        userText.sendKeys(strUserName);
    }

    public void setPassword(String strPassword) {
        passwordText.sendKeys(strPassword);
    }

    public void clickLogin() {
        loginBtn.click();
    }
}
//Omar Mohammed
//2022170911
package pages;
//Omar Mohammed
//2022170911
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FundTransferPage {
    WebDriver driver;

    @FindBy(name = "payersaccount")
    WebElement payersAccount;

    @FindBy(name = "payeeaccount")
    WebElement payeeAccount;

    @FindBy(name = "ammount")
    WebElement amount;

    @FindBy(name = "desc")
    WebElement description;

    @FindBy(name = "AccSubmit")
    WebElement submitBtn;

    @FindBy(className = "heading3")
    WebElement successHeading;

    public FundTransferPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
        PageFactory.initElements(factory, this);
    }

    public void setPayerAccount(String acc) {
        payersAccount.sendKeys(acc);
    }

    public void setPayeeAccount(String acc) {
        payeeAccount.sendKeys(acc);
    }

    public void setAmount(String amt) {
        amount.sendKeys(amt);
    }

    public void setDescription(String desc) {
        description.sendKeys(desc);
    }

    public void clickSubmit() {
        submitBtn.click();
    }

    public String getHeadingText() {
        return successHeading.getText();
    }
}
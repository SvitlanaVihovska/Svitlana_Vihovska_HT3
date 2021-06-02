package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

    @FindBy (xpath = "//div[contains(@class,'general-col')]/p[contains(text(),'м. \"Университет\"')]")
    private WebElement AddressBlock;


    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findAddressBlock() {
        return AddressBlock;
    }
}


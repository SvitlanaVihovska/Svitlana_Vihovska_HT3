package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartphoneAccessoriesPage extends BasePage{

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(text(),'Внешние аккумуляторы (Power Bank)')]")
    private WebElement PowerBanksBlock;

    public SmartphoneAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPowerBanksBlock() {
        PowerBanksBlock.click();
    }
}

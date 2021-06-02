package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XiaomiPage extends BasePage{

    @FindBy(xpath = "//ul[@class='category-box__list']//a[contains(text(),'Электротранспорт')]")
    private WebElement ElectricTransportFilter;

    public XiaomiPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnElectricTransportFilter() {
       ElectricTransportFilter.click();
    }
}

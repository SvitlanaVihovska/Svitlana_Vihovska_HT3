package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectricTransportPage extends BasePage{

    @FindBy(xpath = "//div[@class='prod-cart__img']")
            private WebElement goToProductPage;

    @FindBy(xpath = "//span[contains(@id,'warranty')]")
            private WebElement warrantyOfProduct;

    public ElectricTransportPage(WebDriver driver) {
        super(driver);
    }

    public void goToProductPageButton() {
        goToProductPage.click();
        }

    public WebElement elementOfWarrantyOfProduct() {
       return warrantyOfProduct;
    }
}


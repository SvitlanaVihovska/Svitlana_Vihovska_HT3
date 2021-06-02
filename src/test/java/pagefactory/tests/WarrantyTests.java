package pagefactory.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WarrantyTests extends BaseTests {

    private String EXPECTED_VALUE_IN_URL = "xiaomi";

    @Test(priority = 4)
    public void checkWarranty() {
        getHomePage().clickOnXiaomiFilter();
        getXiaomiPage().clickOnElectricTransportFilter();
        getHomePage().implicitWait(135);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_VALUE_IN_URL));
        getElectricTransportPage().goToProductPageButton();
        getElectricTransportPage().elementOfWarrantyOfProduct();
        WebElement element = getElectricTransportPage().elementOfWarrantyOfProduct();;
        String strng = element.getText();
        assertTrue(strng.contains("3") || strng.contains("6") || strng.contains("12"));
    }
}

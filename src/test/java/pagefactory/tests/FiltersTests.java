package pagefactory.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FiltersTests extends BaseTests{

    private String EXPECTED_VALUE_OF_CURVED_SCREEN = "есть";

    @Test(priority = 3)
    public void checkCurvedScreenFilter() {
        getHomePage().clickOnTVsAndAccessoriesMenu();
        getTVsAndAccessoriesPage().clickOnTVsMenu();
        getTVsPage().clickOnSamsungFilter();
        getHomePage().implicitWait(135);
        getTVsPage().clickOnCurvedScreenFilter();
        getHomePage().implicitWait(135);
        getTVsPage().clickOnThereIsCurvedScreenFilter();
        getTVsPage().clickOnOpenTVPageBlock();
        getSamsungTVPage().searchThereIsCurvedScreen();
        WebElement element = getSamsungTVPage().searchCurvedScreen();
        String strng = element.getText();
        assertEquals(EXPECTED_VALUE_OF_CURVED_SCREEN, strng);
    }
}

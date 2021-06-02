package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PowerBankTests extends BaseTests{
    private int EXPECTED_VALUE_OF_BENEFITS = 3;

    @Test(priority = 2)
    public void benefitsOfPowerBanks() {
        getHomePage().clickOnLogoButton();
        getHomePage().clickOnSmartphonesAndMobilesMenu();
        getHomePage().implicitWait(25);
        getPhonesAndAccessoriesPage().clickOnPhonesAndAccessoriesBlock();
        getSmartphoneAccessoriesPage().clickOnPowerBanksBlock();
        getPowerBanksPage().searchOfBenefits();
        assertEquals(getPowerBanksPage().getSearchResultBenefit(), EXPECTED_VALUE_OF_BENEFITS);
    }
}

package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CheckAddressTest extends BaseTests{

    private String EXPECTED_ADDRESS = "Университет";

    @Test(priority = 1)
    public void checkAddress() {
        getHomePage().clickOnContactsButton();
        getHomePage().implicitWait(35);
        getContactsPage().findAddressBlock();
        assertTrue(getContactsPage().findAddressBlock().getText().contains(EXPECTED_ADDRESS));
    }
}

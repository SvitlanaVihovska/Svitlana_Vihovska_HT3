package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pagefactory.pages.*;

import java.util.HashMap;
import java.util.Map;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTests {
    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }
    public XiaomiPage getXiaomiPage() {
        return new XiaomiPage(getDriver());
    }
    public ElectricTransportPage getElectricTransportPage () {
        return new ElectricTransportPage(getDriver());
    }
    public PowerBanksPage getPowerBanksPage () {
        return new PowerBanksPage(getDriver());
    }
    public ContactsPage getContactsPage () {return new ContactsPage(getDriver()); }
    public TVsAndAccessoriesPage getTVsAndAccessoriesPage () {return new TVsAndAccessoriesPage(getDriver()); }
    public TVsPage getTVsPage () {return new TVsPage(getDriver()); }
    public SamsungTVPage getSamsungTVPage () {return new SamsungTVPage(getDriver()); }
    public PhonesAndAccessoriesPage getPhonesAndAccessoriesPage () {return new PhonesAndAccessoriesPage(getDriver()); }
    public SmartphoneAccessoriesPage getSmartphoneAccessoriesPage () {return new SmartphoneAccessoriesPage(getDriver()); }
}

package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'partners-section')]//img[@alt='Xiaomi']")
            private WebElement XiaomiFilter;
    @FindBy(xpath = "//div[@class='header-bottom__logo']")
            private WebElement LogoButton;
    @FindBy(xpath = "//li[@class='parent js_sidebar-item']/a[@href=\"https://avic.ua/telefonyi-i-aksessuaryi\"] ")
            private WebElement SmartphonesAndPhonesMenu;
    @FindBy (xpath = "//ul[contains(@class,'header-top__list')]//a[contains(text(),'Контакты')]")
            private WebElement ContactsButton;
    @FindBy(xpath = "//img[@alt='Телевизоры и аксессуары']")
            private WebElement TVsAndAccessoriesMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnXiaomiFilter () {
        XiaomiFilter.click();
    }
    public void clickOnLogoButton() {
        LogoButton.click();
    }
    public void clickOnSmartphonesAndMobilesMenu() {
        SmartphonesAndPhonesMenu.click();
    }
    public void clickOnContactsButton() {
        ContactsButton.click();
    }
    public void clickOnTVsAndAccessoriesMenu(){
        TVsAndAccessoriesMenu.click();
    }
}



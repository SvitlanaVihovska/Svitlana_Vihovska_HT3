package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVsPage extends BasePage{
    @FindBy(xpath = "//div[@class='filter-area js_filter_parent']//a[contains(text(),'Samsung')]")
    private WebElement SamsungFilter;
    @FindBy(xpath = "//p[contains(text(),'Изогнутый экран')]/span[@class='symbol']")
    private WebElement CurvedScreenFilter;
    @FindBy(xpath = "//label[@for='fltr-izognutyj-ekran-est']")
    private WebElement ThereIsCurvedScreenFilter;
    @FindBy(xpath = "//div[@class='prod-cart__img']")
    private WebElement OpenTVPage;

    public TVsPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnSamsungFilter() {
        SamsungFilter.click();
    }
    public void clickOnCurvedScreenFilter () {CurvedScreenFilter.click();}
    public void clickOnThereIsCurvedScreenFilter() {ThereIsCurvedScreenFilter.click();}
    public void clickOnOpenTVPageBlock() {OpenTVPage.click();}
}


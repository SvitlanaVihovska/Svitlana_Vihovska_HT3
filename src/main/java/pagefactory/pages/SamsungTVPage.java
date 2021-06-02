package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamsungTVPage extends BasePage{

    @FindBy(xpath = "//td[contains(text(),'есть')]")
    private WebElement ThereIsCurvedScreen;
    @FindBy(xpath = "//div[contains(@class,'hidden-mob')]//td[contains(text(),'Изогнутый экран')]/following-sibling::td")
    private WebElement SearchCurvedScreen;

    public SamsungTVPage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchThereIsCurvedScreen() {return ThereIsCurvedScreen;}
    public WebElement searchCurvedScreen() {return SearchCurvedScreen; }
}

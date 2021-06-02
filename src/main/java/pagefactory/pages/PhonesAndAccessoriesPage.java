package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonesAndAccessoriesPage extends BasePage{

    @FindBy(xpath = "//div[@class='brand-box__title']/a[@href=\"https://avic.ua/aksessuary-dlya-smartfonov\"]")
    private WebElement PhonesAndAccessoriesBlock;

    public PhonesAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPhonesAndAccessoriesBlock() {
        PhonesAndAccessoriesBlock.click();
    }
}

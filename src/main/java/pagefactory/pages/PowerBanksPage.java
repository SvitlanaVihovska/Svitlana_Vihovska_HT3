package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PowerBanksPage extends HomePage{

    @FindBy(xpath = "//div[contains(@class,'bg-orange')]")
    private List<WebElement> BenefitMark;

    public PowerBanksPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> searchOfBenefits() {
        return BenefitMark;
    }
    public int getSearchResultBenefit() {
        return getBenefitMark().size();
    }
    public List<WebElement> getBenefitMark() {
        return BenefitMark;
    }
}

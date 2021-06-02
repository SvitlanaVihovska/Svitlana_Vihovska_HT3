package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVsAndAccessoriesPage extends BasePage{

@FindBy(xpath = "//img[@alt='Телевизоры']")
private WebElement TVsMenu;

    public TVsAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTVsMenu() {
        TVsMenu.click();
    }
}

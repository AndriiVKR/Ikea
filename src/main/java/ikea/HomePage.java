package ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
       super(driver);
    }

    @FindBy(css = ".svg-icon.hnf-svg-icon")
    private List<WebElement> myProfileButton;

    @FindBy(css = ".loyalty-modal-content__link-page__header-bottom__subtext-text")
    public List<WebElement> createAnAccountButton;


    public void clickMyProfileButton() {
        wait.until(ExpectedConditions.elementToBeClickable(myProfileButton.get(6)));
        myProfileButton.get(6).click();
    }

    public void clickCreateAnAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createAnAccountButton.get(0)));
        createAnAccountButton.get(0).click();
    }
}

package ikea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CreatePage extends BasePage {

    public CreatePage(WebDriver driver) {
        super(driver);
         }

         @FindBy(css = "#family-signup-form-submit")
    private List<WebElement> createProfileButton;

    @FindBy(css = "#family-signup-form-firstName-error")
    private List<WebElement> firstNameErrorMessage;

    @FindBy(css = "#family-signup-form-lastName-error")
    private List<WebElement> lastNameErrorMessage;

    @FindBy(css = ".profile__inline-text")
    private List<WebElement> errorMessages;
    /*
    [0] - first name;
    [1] - last name;
    [2] - phone number;
    [3] - mm-dd-yy;
    [4] - street address;
    [5] - city;
    [6] - zip code;
    [7] - state;
    [8] - store;
    [9] - email;
    [10] - password;
    [11] - terms & conditions;
     */


    public void clickCreateProfileButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createProfileButton.get(0)));
        createProfileButton.get(0).click();
    }

    public String fieldFirstNameErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameErrorMessage.get(0)));
        return firstNameErrorMessage.get(0).getText();
    }

    public String fieldLastNameErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameErrorMessage.get(0)));
        return lastNameErrorMessage.get(0).getText();
    }

    public String phoneNumberErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(2)));
        return errorMessages.get(2).getText();
    }

    public String monthErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(3)));
        return errorMessages.get(3).getText();
    }

    public String streetAddressErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(4)));
        return errorMessages.get(4).getText();
    }

    public String cityErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(5)));
        return errorMessages.get(5).getText();
    }

    public String zipCodeErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(6)));
        return errorMessages.get(6).getText();
    }
    public String stateErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(7)));
        return errorMessages.get(7).getText();
    }

    public String storeErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(8)));
        return errorMessages.get(8).getText();
    }

    public String emailErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(9)));
        return errorMessages.get(9).getText();
    }

    public String passwordErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(10)));
        return errorMessages.get(10).getText();
    }

    public String termsErrorMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(errorMessages.get(11)));
        return errorMessages.get(11).getText();
    }

}

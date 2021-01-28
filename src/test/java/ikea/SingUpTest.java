package ikea;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class SingUpTest extends BaseTest {

    Logger log = Logger.getLogger(SingUpTest.class.getName());


    @Test
    public void testSingUp() {
        homePage = new HomePage(driver);
        log.info("User open the home page");
        homePage.clickMyProfileButton();
        log.info("User click my profile sign on home page");
//        driver.switchTo().frame(driver.findElement(By.cssSelector()))

        homePage.clickCreateAnAccountButton();
        log.info("User click create account button on home page");
        CreatePage createPage = new CreatePage(driver);
        log.info("next, Create page was open");
        createPage.clickCreateProfileButton();
        log.info("User click create profile button on the create page");
        String actualFirstName  = createPage.fieldFirstNameErrorMessage();
        log.info("I created new variable, and put inside error message under first name field");
        String expectedFirstName = "Your first name is required.";
        log.info("I created new variable, and put inside error message");
        Assert.assertEquals(expectedFirstName, actualFirstName);
        log.info("Compare expected and actual results from first name field");
        String actualLastName  = createPage.fieldLastNameErrorMessage();
        log.info("");
        String expectedLastName = "Your last name is required.";
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals("Your mobile is required.", createPage.phoneNumberErrorMessage());
        Assert.assertEquals("Your mm-dd-yyyy is required.", createPage.monthErrorMessage());
        Assert.assertEquals("Your street address is required.", createPage.streetAddressErrorMessage());
        Assert.assertEquals("Your city is required.", createPage.cityErrorMessage());
        Assert.assertEquals("Your zip code is required.", createPage.zipCodeErrorMessage());
        Assert.assertEquals("Your state is required.", createPage.stateErrorMessage());
        Assert.assertEquals("You must select a store.", createPage.storeErrorMessage());
        Assert.assertEquals("Your email (username) is required.", createPage.emailErrorMessage());
        Assert.assertEquals("Your password is required.", createPage.passwordErrorMessage());
        Assert.assertEquals("You must have read and accepted the Terms & Conditions and Privacy Policy.",
                createPage.termsErrorMessage());




    }
}

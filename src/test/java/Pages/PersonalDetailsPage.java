package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class PersonalDetailsPage extends BasePage {

    public PersonalDetailsPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "givenNameET")
    private MobileElement givenNameET;

    @AndroidFindBy(id = "familyNameET")
    private MobileElement familyNameET;

    @AndroidFindBy(id = "dateOfBirthET")
    private MobileElement dateOfBirthET;

    @AndroidFindBy(id = "nextButton")
    private MobileElement nextButton;

    public String getMessage() {
        return driver.findElementById("personalDetailsHeadingLabel").getText();
    }

    public void EnterGivenName() {
        givenNameET.sendKeys("Tim");
    }

    public void EnterFamilyName() {
        familyNameET.sendKeys("Mardon");
    }

    public void EnterDOB() {
        dateOfBirthET.sendKeys("01/01/1990");
    }

    public void SelectDoneButton() {
        nextButton.click();
    }
}
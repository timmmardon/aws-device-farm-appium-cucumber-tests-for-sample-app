package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Keys;


public class PersonalDetailsPage extends BasePage {

    public PersonalDetailsPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "mygovid.registration.personaldetails.givennames.value")
    @AndroidFindBy(id = "givenNameET")
    private MobileElement givenNameET;

    @iOSFindBy(accessibility = "mygovid.registration.personaldetails.familyname.value")
    @AndroidFindBy(id = "familyNameET")
    private MobileElement familyNameET;

    @iOSFindBy(accessibility = "mygovid.registration.personaldetails.dateofbirth.value")
    @AndroidFindBy(id = "dateOfBirthET")
    private MobileElement dateOfBirthET;

    @iOSFindBy(accessibility = "mygovid.registration.personaldetails.done")
    @AndroidFindBy(id = "nextButton")
    private MobileElement nextButton;

    @iOSFindBy(accessibility = "Done")
    private MobileElement personalDetailsKeyboardDoneButton;

    @iOSFindBy(accessibility = "mygovid.registration.personaldetails.heading")
    @AndroidFindBy(id = "personalDetailsHeadingLabel")
    private MobileElement personalDetailsHeadingLabel;

    public String getMessage() {
        return personalDetailsHeadingLabel.getText();
    }

    public void EnterGivenName() {
        givenNameET.sendKeys("Tim");
        givenNameET.sendKeys(Keys.ENTER);
    }

    public void EnterFamilyName() {
        familyNameET.sendKeys("Mardon");
        familyNameET.sendKeys(Keys.ENTER);
    }

    public void EnterDOB() {
        dateOfBirthET.click();
        dateOfBirthET.clear();
        dateOfBirthET.setValue("01/01/1990");
        dateOfBirthET.sendKeys(Keys.ENTER);
    }

    public void SelectDoneButton() {
        nextButton.click();
    }

    public void SelectKeyboardDoneButton() {
        personalDetailsKeyboardDoneButton.click();
    }
}
package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;


public class CreateAccountPage extends BasePage {

    public CreateAccountPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "mygovid.registration.createamygovid")
    @AndroidFindBy(id = "registerButton")
    private MobileElement createMyGovIDButton;

    @iOSFindBy(accessibility = "Not now")
    @AndroidFindBy(id = "closeButton")
    private MobileElement updateAlertCloseButton;

    @iOSFindBy(accessibility = "mygovid.registration.existingmygovid")
    //@AndroidFindBy(id = "closeButton")
    private MobileElement existingUserButton;

    @iOSFindBy(accessibility = "mygovid.alert.continue")
    @AndroidFindBy(id = "nextButton")
    private MobileElement alertNextButton;

    public void SelectCreateAmyGovID() {
        createMyGovIDButton.click();
    }

    public void SelectAlertNextButton() {
        alertNextButton.click();
    }

    public void SelectExistingUserButton() {
        existingUserButton.click();
    }

    public void SelectUpdateAlertCloseButton() {
        updateAlertCloseButton.click();
    }

}
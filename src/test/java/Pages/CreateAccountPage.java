package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "registerButton")
    private MobileElement createMyGovIDButton;

    @AndroidFindBy(id = "closeButton")
    private MobileElement updateAlertCloseButton;

    public void SelectCreateAmyGovID() {
        createMyGovIDButton.click();
    }

    public void SelectUpdateAlertCloseButton() {
        updateAlertCloseButton.click();
    }

}
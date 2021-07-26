package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;


public class EmailPage extends BasePage {

    public EmailPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "mygovid.registration.emailaddress.enteryouremail.value")
    @AndroidFindBy(id = "emailAddressET")
    private MobileElement emailAddressET;

    @iOSFindBy(accessibility = "mygovid.registration.emailaddress.getcode")
    @AndroidFindBy(id = "nextButton")
    private MobileElement getCodeButton;

    @iOSFindBy(accessibility = "mygovid.registration.emailaddress.heading")
    @AndroidFindBy(id = "EmailTitleLabel")
    private MobileElement emailTitleLabel;

    @iOSFindBy(accessibility = "Done")
    @AndroidFindBy(id = "EmailTitleLabel")
    private MobileElement emailKeyboardDoneButton;

    public String getMessage() {
        return emailTitleLabel.getText();
    }

    public void SelectGetCodeButton() {
        getCodeButton.click();
    }

    public void SelectKeyboardDoneButton() {
        emailKeyboardDoneButton.click();
    }

    public void EnterEmailAddress() {
        emailAddressET.sendKeys("tim@test.com");
    }
}
package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CreatePasswordPage extends BasePage {

    public CreatePasswordPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "mygovid.registration.createapassword.password.value")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    private MobileElement Password;

    @iOSFindBy(accessibility = "mygovid.registration.createapassword.confirmpassword.value")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Confirm password']")
    private MobileElement ConfirmPassword;

    @iOSFindBy(accessibility = "mygovid.registration.createapassword.next")
    @AndroidFindBy(id = "nextButton")
    private MobileElement passwordNextbutton;

    @iOSFindBy(accessibility = "Done")
    private MobileElement passwordKeyboardDoneButton;

    @iOSFindBy(accessibility = "mygovid.registration.createapassword.heading")
    @AndroidFindBy(id = "capturePasswordHeadingLabel")
    private MobileElement capturePasswordHeadingLabel;

    public String getMessage() {
        return capturePasswordHeadingLabel.getText();
    }

    public void SelectPasswordNextButton() {
        passwordNextbutton.click();
    }

    public void SelectPasswordKeyboardDoneButton() {
        passwordKeyboardDoneButton.click();
    }

    public void EnterPassword() {
        Password.sendKeys("Password!1");
    }

    public void EnterConfirmPassword() {
        ConfirmPassword.sendKeys("Password!1");
    }

}
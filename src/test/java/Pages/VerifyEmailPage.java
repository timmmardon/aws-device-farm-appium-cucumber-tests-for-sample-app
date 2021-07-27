package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Keys;


public class VerifyEmailPage extends BasePage {

    public VerifyEmailPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "mygovid.registration.verifyyouremail.codeentry.value")
    @AndroidFindBy(id = "verificationCode")
    private MobileElement verificationCodeInput;

    @iOSFindBy(accessibility = "mygovid.registration.verifyyouremail.next")
    @AndroidFindBy(id = "nextButton")
    private MobileElement verifyEmailNextButton;

    @iOSFindBy(accessibility = "Done")
    private MobileElement verifyEmailKeyboardDoneButton;

    @iOSFindBy(accessibility = "mygovid.registration.verifyyouremail.heading")
    @AndroidFindBy(id = "emailVerificationHeading")
    private MobileElement emailVerificationHeading;

    public String getMessage() {
        return emailVerificationHeading.getText();
    }

    public void EnterVerificationCode() throws InterruptedException {
        verificationCodeInput.sendKeys("111111");
        Thread.sleep(1000);
        // verificationCodeInput.sendKeys(Keys.ENTER);
        // Thread.sleep(1000);
    }

    public void SelectVerifyEmailNextButton() {
        verifyEmailNextButton.click();
    }

    public void SelectVerifyEmailKeyboardDoneButton() {
        verifyEmailKeyboardDoneButton.click();
    }
}
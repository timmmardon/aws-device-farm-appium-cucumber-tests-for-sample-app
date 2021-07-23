package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class VerifyEmailPage extends BasePage {

    public VerifyEmailPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "verificationCode")
    private MobileElement verificationCodeInput;

    @AndroidFindBy(id = "nextButton")
    private MobileElement verifyEmailNextButton;

    public String getMessage() {
        return driver.findElementById("emailVerificationHeading").getText();
    }

    public void EnterVerificationCode() {
        verificationCodeInput.sendKeys("111111");
    }

    public void SelectNextButton() {
        verifyEmailNextButton.click();
    }
}
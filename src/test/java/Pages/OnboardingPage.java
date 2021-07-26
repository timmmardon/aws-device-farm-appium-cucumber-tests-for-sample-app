package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.TouchAction;


public class OnboardingPage extends BasePage {

    public OnboardingPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "mygovid.registration.onboarding.pageindicator")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Page 4 of 4']")
    private MobileElement onboardingSlider;

    @iOSFindBy(accessibility = "mygovid.registration.onboarding.heading")
    @AndroidFindBy(id = "helpOverlayContentTitle")
    private MobileElement onboardingHeading;

    public void SelectOnboardingSlider() {
        onboardingSlider.click();
    }

    @iOSFindBy(accessibility = "mygovid.registration.onboarding.startnow")
    @AndroidFindBy(id = "nextButton")
    private MobileElement startNowButton;

    public String getMessage() {
        return onboardingHeading.getText();
    }

    public void SelectStartNowButton() {
        startNowButton.click();
    }

    // public void ScrollFromRightToLeft() throws InterruptedException {
    //         TouchAction touchActions = new TouchAction(driver);
    //         touchActions.press(600, 500).moveTo(100, 500).release().perform();
    //         Thread.sleep(100);          
    //     }
}
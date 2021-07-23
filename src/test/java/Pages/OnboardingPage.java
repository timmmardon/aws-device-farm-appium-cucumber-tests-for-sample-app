package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class OnboardingPage extends BasePage {

    public OnboardingPage(AppiumDriver driver) {
        super(driver);
    }

    // @AndroidBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='Page 4 of 4']")
    // private MobileElement onboardingSlider;

    // MobileElement onboardingSlider = MobileElement driver.findElementsByAccessibilityId("Page 4 of 4");

    // public void SelectOnboardingSlider() {
    //     onboardingSlider.click();
    // }

    @AndroidFindBy(id = "nextButton")
    private MobileElement startNowButton;

    public String getMessage() {
        return driver.findElementById("helpOverlayContentTitle").getText();
    }

    public void SelectStartNowButton() {
        startNowButton.click();
    }

    // public static void ScrollFromRightToLeft()
    //     {
    //         TouchAction touchActions = new TouchAction(driver);
    //         touchActions.Press(2, starty).Wait(200).MoveTo(1, 5).Release().Perform();
    //         Thread.sleep(500);            
    //     }

    // public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
    //     Dimension size = driver.manage().window().getSize();
    //     int anchor = (int) (size.width * anchorPercentage);
    //     int startPoint = (int) (size.height * startPercentage);
    //     int endPoint = (int) (size.height * endPercentage);
       
    //     new TouchAction(driver)
    //     .press(point(anchor, startPoint))
    //     .waitAction(waitOptions(ofMillis(1000)))
    //     .moveTo(point(anchor, endPoint))
    //     .release().perform();
    //     }
}
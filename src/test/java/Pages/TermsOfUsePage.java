package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;


public class TermsOfUsePage extends BasePage {

    public TermsOfUsePage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "mygovid.registration.termsofuse.accept")
    @AndroidFindBy(id = "nextButton")
    private MobileElement acceptTermsOfUseButton;

    public void SelectAcceptTermsOfUseButton() {
        acceptTermsOfUseButton.click();
    }
}
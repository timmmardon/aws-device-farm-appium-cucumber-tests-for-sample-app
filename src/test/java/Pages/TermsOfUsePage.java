package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class TermsOfUsePage extends BasePage {

    public TermsOfUsePage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "nextButton")
    private MobileElement acceptTermsOfUseButton;

    public void SelectAcceptTermsOfUseButton() {
        acceptTermsOfUseButton.click();
    }
}
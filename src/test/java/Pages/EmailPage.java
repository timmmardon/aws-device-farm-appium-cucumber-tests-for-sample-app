package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class EmailPage extends BasePage {

    public EmailPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "emailAddressET")
    private MobileElement emailAddressET;

    @AndroidFindBy(id = "nextButton")
    private MobileElement getCodeButton;

    public String getMessage() {
        return driver.findElementById("EmailTitleLabel").getText();
    }

    public void SelectGetCodeButton() {
        getCodeButton.click();
    }

    public void EnterEmailAddress() {
        emailAddressET.sendKeys("tim@test.com");
    }
}
package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatePasswordPage extends BasePage {

    public CreatePasswordPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[contains(text(),'Password')]")
    private MobileElement Password;

    @AndroidFindBy(xpath = "//*[contains(text(),'Confirm password')]")
    private MobileElement ConfirmPassword;

    @AndroidFindBy(id = "nextButton")
    private MobileElement passwordNextbutton;

    public String getMessage() {
        return driver.findElementById("capturePasswordHeadingLabel").getText();
    }

    public void SelectNextButton() {
        passwordNextbutton.click();
    }

    public void EnterPassword() {
        Password.sendKeys("Password!1");
    }

    public void EnterConfirmPassword() {
        ConfirmPassword.sendKeys("Password!1");
    }

}
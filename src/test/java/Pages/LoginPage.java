package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A login page
 */
public class LoginPage extends BasePage {
    private static final int KEYBOARD_ANIMATION_DELAY = 1000;

    /**
     * The login button
     */
    @AndroidFindBy(id = "continueButton")
    private MobileElement continueButton;

    /**
     * The user name input
     */
    @AndroidFindBy(id = "enableFastForwardToDashboard")
    private MobileElement fastForwardButton;

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean login(String username, String password) throws InterruptedException {
        fastForwardButton.click();
        continueButton.click();
        Thread.sleep(KEYBOARD_ANIMATION_DELAY);

        return true;
    }

    /**
     *
     * @return the dashboard identity strength message
     */
    public String getMessage() {
        return driver.findElementById("identityStrengthTitle").getText();
    }

    /**
     * Checks to see if back at login page
     *
     * @return is back at login
     */
    public boolean checkIfBackAtLogin() {
        return continueButton.isDisplayed() && fastForwardButton.isDisplayed();
    }

    /**
     * Presses the logout/try again button
     */
    public void pressAltButton() {
        //driver.findElementById("Alt Button").click();
    }
}

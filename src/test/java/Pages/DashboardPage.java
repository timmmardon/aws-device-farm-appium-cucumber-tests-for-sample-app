package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashboardPage extends BasePage {

    public DashboardPage(AppiumDriver driver) {
        super(driver);
    }

    public String getMessage() {
        return driver.findElementById("identityStrengthTitle").getText();
    }

}
package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class DashboardPage extends BasePage {

    public DashboardPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(accessibility = "mygovid.dashboard.nametext")
    @AndroidFindBy(id = "identityStrengthTitle")
    private MobileElement identityStrengthTitle;

    // public String getMessage() {
    //     return identityStrengthTitle.getAttribute("value");
    //     return identityStrengthTitle.getText();
    // }
}
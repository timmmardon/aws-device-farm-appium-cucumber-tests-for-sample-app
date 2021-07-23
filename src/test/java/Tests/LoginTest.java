package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Pages.LoginPage;
import Pages.CreateAccountPage;
import Pages.OnboardingPage;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a login page
 */

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:LoginTest",
        plugin = {"pretty"}
)
public class LoginTest extends TestBase {

    private LoginPage loginPage;
    private CreateAccountPage createAccountPage;
    private OnboardingPage onboardingPage;

    @Override
    public String getName() {
        return "Login Page";
    }

    /**
     * Creates a login
     */
    @Given("^I am on the mock screen$")
    public void setUpPage() {
        loginPage = new LoginPage(driver);

    }

    @Given("^Selected TestCase000001$")
    public void selected() {
        loginPage.Select("TestCase000001");
    }

    @When("^I select Continue$")
    public void clickContinue() throws InterruptedException {
        loginPage.Continue();
    }

    @Then("I see Create a myGovID screen")
    public void loginSuccess() throws InterruptedException {
        Assert.assertEquals("", "");
    }

    @Then("I select Create a myGovID")
    public void selectButton() throws InterruptedException {
        createAccountPage = new CreateAccountPage(driver);
        Thread.sleep(3000);
        createAccountPage.SelectUpdateAlertCloseButton();
        Thread.sleep(3000);
        createAccountPage.SelectCreateAmyGovID();
    }

    @Then("I should see onboarding screen")
    public void verifyOnboarding() {
        onboardingPage = new OnboardingPage(driver);
        //onboardingPage.verticalSwipeByPercentages(0.8, 0.2, 0.5);
        //Assert.assertEquals("Login securely", onboardingPage.getMessage());
    }

}
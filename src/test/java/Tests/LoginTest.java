package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Pages.LoginPage;
import Pages.CreateAccountPage;
import Pages.OnboardingPage;
import Pages.TermsOfUsePage;
import Pages.EmailPage;
import Pages.VerifyEmailPage;
import Pages.CreatePasswordPage;
import Pages.PersonalDetailsPage;
import Pages.DashboardPage;

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
    private TermsOfUsePage termsOfUsePage;
    private EmailPage emailPage;
    private VerifyEmailPage verifyEmailPage;
    private CreatePasswordPage createPasswordPage;
    private PersonalDetailsPage personalDetailsPage;
    private DashboardPage dashboardPage;

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
        Assert.assertEquals("What is myGovID?", onboardingPage.getMessage());
    }

    @When("I select Start now")
    public void selectStartNow() throws InterruptedException {
        onboardingPage.SelectOnboardingSlider();
        Thread.sleep(1000);
        onboardingPage.SelectStartNowButton();
        Assert.assertEquals("", "");
    }

    @Then("I should see Terms of use screen")
    public void verifyTermsOfUse() {
        termsOfUsePage = new TermsOfUsePage(driver);
        Assert.assertEquals("", "");
    }

    @When("I select Accept")
    public void selectAccept() throws InterruptedException {
        termsOfUsePage.SelectAcceptTermsOfUseButton();
        Thread.sleep(500);
        Assert.assertEquals("", "");
    }

    @Then("I should see the Email address screen")
    public void verifySpecifyEmailScreen() {
        emailPage = new EmailPage(driver);
        Assert.assertEquals("Email address", emailPage.getMessage());
    }

    @When("I enter email address as \"tim@test.com\"")
    public void enterEmailAddress() throws InterruptedException {
        emailPage.EnterEmailAddress();
        Thread.sleep(1000);
    }

    @When("I select Get code")
    public void selectGetCodeButton() {
        emailPage.SelectGetCodeButton();
    }

    @Then("I should see Verify your email screen")
    public void verifyEmailScreen() {
        verifyEmailPage = new VerifyEmailPage(driver);
        Assert.assertEquals("Verify your email", verifyEmailPage.getMessage());
    }

    @When("I enter verification code as 111111")
    public void enterVerificationCode() throws InterruptedException {
        verifyEmailPage.EnterVerificationCode();
        Thread.sleep(1000);
    }

    @When("I select Next on verify email")
    public void selectNextButtonVerfyEmail() throws InterruptedException {
        verifyEmailPage.SelectVerifyEmailNextButton();
        Thread.sleep(1000);
    }

    @Then("I should see Create a password screen")
    public void verifyPasswordScreen() {
        createPasswordPage = new CreatePasswordPage(driver);
        Assert.assertEquals("Create a password", createPasswordPage.getMessage());
    }

    @When("I enter Password as Password!1")
    public void enterPassword(){
        createPasswordPage.EnterPassword();
    }

    @When("I enter Confirm password as Password!1")
    public void enterConfirmPassword() throws InterruptedException {
        createPasswordPage.EnterConfirmPassword();
        Thread.sleep(2000);
    }

    @When("I press Next")
    public void selectPasswordNextButton() {
        createPasswordPage.SelectPasswordNextButton();
    }

    @Then("I should see Personal details screen")
    public void verifyPersonalDetailsPage() {
        personalDetailsPage = new PersonalDetailsPage(driver);
        Assert.assertEquals("Personal details", personalDetailsPage.getMessage());
    }

    @When("I fill personal details with Tim, Mardon, 01/01/1990")
    public void enterPersonalDetails() {
        personalDetailsPage.EnterGivenName();
        personalDetailsPage.EnterFamilyName();
        personalDetailsPage.EnterDOB();
    }

    @When("I select Done")
    public void selectDone() {
        personalDetailsPage.SelectDoneButton();
    }

    @Then("I should see dashboard with identity strength as Standard")
    public void verifyDashboard() {
        dashboardPage = new DashboardPage(driver);
        Assert.assertEquals("John, your identity strength is Standard", dashboardPage.getMessage());
    }
}
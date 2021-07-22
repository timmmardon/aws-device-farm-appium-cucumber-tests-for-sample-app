package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Pages.LoginPage;
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
    private static final String DASHBOARD_IDENTITY_STRENGTH_MESSAGE = "John, your identity strength is Basic";

    private LoginPage loginPage;

    @Override
    public String getName() {
        return "Login Page";
    }

    /**
     * Creates a login
     */
    @Given("^I navigate to the login page$")
    public void setUpPage() {
        loginPage = new LoginPage(driver);
    }

    /**
     * Tests logging in with valid credentials by verifying if the login message is correct
     */
    @Given("^username is correct$")
    public void loginSuccess() throws InterruptedException {
        Assert.assertTrue(loginPage.login("", ""));
        Assert.assertEquals(loginPage.getMessage(), DASHBOARD_IDENTITY_STRENGTH_MESSAGE);
    }

    /**
     * After each test method, logout or try again
     */
    @Then("^log out$")
    public void logOut() {
        //loginPage.pressAltButton();
        // Assert.assertTrue(loginPage.checkIfBackAtLogin());
    }
}

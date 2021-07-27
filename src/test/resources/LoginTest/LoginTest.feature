Feature: This test verifies user registration
    We want the user registration to work

    Scenario: User successfully registrates
        Given I am on the mock screen
        And Selected TestCase000001
        When I select Continue
        Then I see Create a myGovID screen
        # When I select Create a myGovID
        # Then I should see onboarding screen
        # When I select Start now
        When I select I am an existing user
        Then I should see Terms of use screen
        When I select Accept
        Then I should see the Email address screen
        When I enter email address as "tim@test.com"
        When I select Get code
        Then I should see Verify your email screen
        When I enter verification code as 111111
        When I select Next on verify email
        Then I should see Create a password screen
        When I enter Password as Password!1
        When I enter Confirm password as Password!1
        When I press Next
        Then I should see Personal details screen
        When I fill personal details with Tim, Mardon, 01/01/1990
        When I select Done
        Then I should see dashboard with identity strength as Standard
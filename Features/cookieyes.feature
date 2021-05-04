Feature: CookieYes login

  Scenario: Validate login
    Given Go to login page
    When Enter credentials
    Then Validate the login session
    And close browser

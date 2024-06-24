Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @sanity @smoke @regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @smoke @regression
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see error message "<errorMessage>"
    Examples:
      | email             | password   | errorMessage                                                                                |
      | abcd123@gmail.com | xyz123     | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com  | xyzsdfd123 | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | qwqe123@gmail.com | qwewe123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  @regression
  Scenario: Verify that user should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "prime123@gmail.com"
    And I enter password "prime123"
    And I click on login button
    Then I should see logout link

  @regression
  Scenario: Verify that user should logout successfully
    Given I am on homepage
    When I click on login link
    And I enter email "prime123@gmail.com"
    And I enter password "prime123"
    And I click on login button
    And I click on logout link
    Then I should see login link
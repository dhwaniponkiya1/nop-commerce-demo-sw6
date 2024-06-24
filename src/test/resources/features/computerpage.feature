Feature: Computer Feature

  @sanity @smoke @regression
  Scenario: Verify user should navigate to computer page successfully
    Given I am on homepage
    When I click on computer link
    Then Verify Computers text

  @smoke @regression
  Scenario: Verify user should navigate to desktops page successfully
    Given I am on homepage
    When I click on computer link
    And I click on desktops link
    Then Verify Desktops text

  @regression
  Scenario Outline: Verify user should build your own computer and add them to cart successfully
    Given I am on homepage
    When I click on computer link
    And I click on desktops link
    And I click on build your own computer
    And I select processor "<processor>"
    And I Select RAM "<ram>"
    And I Select HDD "<hdd>"
    And I Select OS "<os>"
    And I Select Software "<software>"
    And I Click on ADD TO CART Button
    Then Verify message "The product has been added to your shopping cart"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |


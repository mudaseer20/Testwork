
@tag1
Feature:login

 
  Scenario: Title of your scenario
    Given User launch chrome
    
    When user opens url https://admin-demo.nopcommerce.com/login
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then page title should be "  Dashboard / nopCommerce administration"
    When user click on Logout link
    Then Page title should be "Your store. Login"
    And close the browser


Feature: As a user, I want to Add Product

  @ValidLogin
  Scenario: Successful login using valid account
    Given Login from login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button
@ValidLogin
  Scenario: Successful login using valid account
    Given Login from login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button
    @ValidLogin
  Scenario: Successful login using valid account
    Given Login from login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button
    @ValidLogin
  Scenario: Successful login using valid account
    Given Login from login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button
    @ValidLogin
  Scenario: Successful login using valid account
    Given Login from login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button
    @ValidLogin
  Scenario: Successful login using valid account
    Given Login from login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button
    @ValidLogin
  Scenario: Successful login using valid account
    Given Login from login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button
    @ValidLogin
  Scenario: Successful login using valid account
    Given Login from login page
    When Submit email using "admin@ojas-it.com" and password using "Admin@123"
    Then Success login to home page with displaying account button
  @AddProduct
  Scenario: Add product in Intermediary Details
    Given Login from login page
    When Submit email and password
    And Success login to home page with displaying account button
    And Click on Intermediary Details and Select Products
    And Create new product using Create product
    Then Click on AddProduct
    
 @AddCoverage @Sanity
  Scenario: Add Coverage in Intermediary Product
    Given Login from login page
    When Submit Email and Password
    And Success login to home page with displaying account button
    And Click on Intermediary Details and Select Products
    And Search Product and Click on Show Menu
    And Add new coverage using add coverage
    Then Add Coverage scucess
    
  @DeleteProduct @Sanity
  Scenario: Delete Product in Intermediary Details
    Given Login from login page
    When Submit Email and Password
    And Success login to home page with displaying account button
    And Click on Intermediary Details and Select Products
    And Search Product and Click on Show Menu
    And Delete product using delete option
    Then Confirm delete product
    
    
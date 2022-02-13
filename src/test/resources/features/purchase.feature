Feature: Adidas Order Placement Functionalities
  Agile Story: As a user, I should be able to place order from website so that
  I can shop online

  Background:
    Given User is on the homepage

  Scenario: Placing a successful order
    When User adds some "Sony vaio i5" from "Laptops"
    And User adds some "Dell i7 8gb" from "Laptops"
    And User navigates to cart and removes "Dell i7 8gb"
    And User clicks on place order
    And User fills the form for order and clicks on purchase button
    Then Order ID and order amount should be as expected

  @wip
  Scenario: Verify all the products exist in the products pages
    Then Under "Phones" category user should be able to see the list of following products
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
      | Nexus 6           |
      | Samsung galaxy s7 |
      | Iphone 6 32gb     |
      | Sony xperia z5    |
      | HTC One M9        |

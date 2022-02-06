Feature: Adidas Order Placement Functionalities
  Agile Story: As a user, I should be able to place order from website so that
              I can shop online
  @wip
  Scenario: Placing a successful order
    Given User is on the homepage
    When User adds some "Sony vaio i5" from "Laptops"
    And User adds some "Dell i7 8gb" from "Laptops"
    And User navigates to cart and removes "Dell i7 8gb"
    And User clicks on place order



Feature: Code Assessment

  @wip
  Scenario: Code Assessment - User searches for an item, then adds it the cart, then removes it.
    Given User navigates to "www.webstaurantstore.com"
    Then Validate User is on the homepage
    When User searches for "stainless work table"
    Then User searches through the results for "Table" in the title and goes to the product page
    Then User adds product to the cart
#    When User navigates to the cart
#    Then User validates item is in the cart
#    Then User removes item from the cart and validates there are no items in the cart



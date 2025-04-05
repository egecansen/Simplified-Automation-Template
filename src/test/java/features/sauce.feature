Feature: Sauce

  @Web-UI @SCN-Sauce-1
  Scenario: Add 2 items and checkout
    * Navigate to url: https://www.saucedemo.com/
    * Save accepted usernames to context
    * Verify presence of element userNameInput on the LoginPage
    * Click the userNameInput on the LoginPage
    * Fill form input on the LoginPage
      | Input Element | Input         |
      | userNameInput | standard_user |
      | passwordInput | secret_sauce  |
    * Click the loginButton on the LoginPage
    * Wait for element pageTitle on the ProductPage to be visible
    #* Select component named Sauce Labs Bike Light from productCards component list on the ProductPage and click the addToCartButton element
    #* Select component named Test.allTheThings() T-Shirt (Red) from productCards component list on the ProductPage and click the addToCartButton element
    * Select component by productTitle named Sauce Labs Bike Light from productCards component list on the ProductPage and click the addToCartButton element
    * Save the price for product named Sauce Labs Bike Light
    * Select component by productTitle named Test.allTheThings() T-Shirt (Red) from productCards component list on the ProductPage and click the addToCartButton element
    * Save the price for product named Test.allTheThings() T-Shirt (Red)
    * Click component element shoppingCart of MainNavigation component on the ProductPage
    * Wait for element cartQuantityLabel on the ShoppingCartPage to be visible
    * Click the checkOutButton on the ShoppingCartPage
    * Fill form input on the YourInformationPage
      | Input Element   | Input  |
      | firstNameInput  | Egecan |
      | lastNameInput   | Sen    |
      | postalCodeInput | 999    |
    * Click the continueButton on the YourInformationPage
    * Validate the total amount
    * Wait 4 seconds

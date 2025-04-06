package steps;

import context.ContextStore;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AllProductsPage;
import pages.ProductPage;

import java.util.*;

public class ProductPageSteps {
    ProductPage productPage = new ProductPage();


    @Given("Save the selected product price to context")
    public void saveProductPrice() {
        ContextStore.put(productPage.productTitle.getText() + " Price", productPage.productPrice.getText().replaceAll("\\$", ""));
        productPage.log.info("Product price for " + productPage.productTitle.getText() + " saved as " + ContextStore.get(productPage.productTitle.getText() + " Price"));
    }

}

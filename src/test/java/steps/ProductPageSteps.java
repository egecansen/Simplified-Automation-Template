package steps;

import context.ContextStore;
import io.cucumber.java.en.Given;
import pages.ProductPage;
import pages.components.ProductCard;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @Given("Save the price for product named {}")
    public void saveProductPrice(String productName) {
        for (ProductCard productCard : productPage.productCards)
            if (productCard.productTitle.getText().equals(productName))
                ContextStore.put(productName + " Price", productCard.price.getText().replaceAll("\\$", ""));
        productPage.log.info("Product price for " + productName + " saved as " + ContextStore.get(productName + " Price"));
    }

}

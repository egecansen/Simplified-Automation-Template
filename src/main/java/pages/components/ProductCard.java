package pages.components;

import com.github.webdriverextensions.WebComponent;
import common.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends WebComponent {

    @FindBy(css = "[class='btn btn_primary btn_small btn_inventory ']")
    public WebElement addToCartButton;

    @FindBy(css = "[data-test='inventory-item-price']")
    public WebElement price;

    @FindBy(css = ".inventory_item_label a")
    public WebElement productTitle;

}

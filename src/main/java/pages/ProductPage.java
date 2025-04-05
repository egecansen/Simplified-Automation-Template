package pages;

import common.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.MainNavigation;
import pages.components.ProductCard;
import pickleib.web.interactions.WebInteractions;

import java.util.List;

public class ProductPage extends PageObject {

    @FindBy(css = ".primary_header")
    public WebElement pageTitle;

    @FindBy(css = ".primary_header")
    public MainNavigation mainNavigation;

    @FindBy(css = "[data-test='inventory-item']")
    public List<ProductCard> productCards;

}

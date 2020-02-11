package spa.vue.io.github.skyronic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spa.vue.io.github.skyronic.utility.Utils;

public class Ipad4MiniPage extends Utils {
    @FindBy(xpath = "//div[@class='product-title']")
    WebElement _verifyIpad4MiniText;

    @FindBy(xpath = "//div[@class='inventory']")
    WebElement _stockValue;
    @FindBy(xpath = "//button[@class='add-button']")
    WebElement _addToCartButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[2]")
    WebElement _cartValue;


    public String verifyIpad4MiniProductPage() {
        return getTextFromElement(_verifyIpad4MiniText);
    }

    public String getStockValue() {
        return getTextFromElement(_stockValue);
    }

    public boolean checkAddToCartButton() {
        return verifyThatElementIsDisplayed(_addToCartButton);
    }

    public void clickOnAddToCart() {
        clickOnElement(_addToCartButton);
    }

    public String getCartValue() {
        return getTextFromElement(_cartValue);
    }

    public void checkOutOfStock() {

        for (int i = 1; i <= 2; i++) {
            clickOnAddToCart();
        }

    }
    public boolean outOfStockButton(){
        return verifyThatElementIsEnabled(_addToCartButton);
    }

}

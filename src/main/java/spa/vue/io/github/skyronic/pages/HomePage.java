package spa.vue.io.github.skyronic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spa.vue.io.github.skyronic.utility.Utils;

public class HomePage extends Utils {
    //When the page loads, 3 items should be displayed Ipad 4 Mini, H&M T-Shirt White and Charli XCX - Sucker CD
    // in exact order and have the following prices: $ 500.01, $ 10.99 $ 19.99 respectively.

    @FindBy(xpath = "//a[contains(text(),'iPad 4 Mini')]")
    WebElement _ipad4MiniLink;
    @FindBy(xpath = "//a[contains(text(),'H&M T-Shirt White')]")
    WebElement _handmTshirtLink;
    @FindBy(xpath = "//a[contains(text(),'Charli XCX - Sucker CD')]")
    WebElement _charliLink;
    @FindBy(xpath = "//span[contains(text(),'$ 500.01')]")
    WebElement _ipad4MiniPrice;
    @FindBy(xpath = "//span[contains(text(),'$ 10.99')]")
    WebElement _handmTshirtPrice;
    @FindBy(xpath = "//span[contains(text(),'$ 19.99')]")
    WebElement _charliPrice;

    //If User click on Ipad 4 Mini, the product detail page should be displayed.
    // With the “In stock” value of 2. There should be a button “Add to cart”

    public void clickOnIpad4Mini(){
    clickOnElement(_ipad4MiniLink);
    }

    public void verifyIpad4Mini(){
        verifyThatElementIsDisplayed(_ipad4MiniLink);
    }
    public String checkIpad4MiniPrice(){
        return getTextFromElement(_ipad4MiniPrice);
    }
    public void verifyHandMShirt(){
        verifyThatElementIsDisplayed(_handmTshirtLink);
    }
    public String checkHandMShirtPrice(){
        return getTextFromElement(_handmTshirtPrice);
    }
    public void verifyCharli(){
        verifyThatElementIsDisplayed(_charliLink);
    }
    public String checkCharliPrice(){
        return getTextFromElement(_charliPrice);
    }
}

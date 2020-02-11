package spa.vue.io.github.skyronic.testsuites;

import org.testng.Assert;
import org.testng.annotations.Test;
import spa.vue.io.github.skyronic.pages.HomePage;
import spa.vue.io.github.skyronic.pages.Ipad4MiniPage;
import spa.vue.io.github.skyronic.testbase.TestBase;

public class RunAllTestHere extends TestBase {

    //When the page loads, 3 items should be displayed Ipad 4 Mini, H&M T-Shirt White and Charli XCX - Sucker CD in exact order
    // and have the following prices: $ 500.01, $ 10.99 $ 19.99 respectively.
    @Test
    public void test1() {
        HomePage homePage = new HomePage();
        homePage.verifyIpad4Mini();
        Assert.assertEquals("$ 500.01", homePage.checkIpad4MiniPrice());
        homePage.verifyHandMShirt();
        Assert.assertEquals("$ 10.99", homePage.checkHandMShirtPrice());
        homePage.verifyCharli();
        Assert.assertEquals("$ 19.99", homePage.checkCharliPrice());
    }

    @Test
    public void test2() {
        //If User click on Ipad 4 Mini, the product detail page should be displayed.
        HomePage homePage = new HomePage();
        Ipad4MiniPage ipad4MiniPage = new Ipad4MiniPage();
        homePage.clickOnIpad4Mini();
        Assert.assertEquals("iPad 4 Mini", ipad4MiniPage.verifyIpad4MiniProductPage());

        //Verify  “In stock” value of 2.
        Assert.assertEquals("In Stock: 2", ipad4MiniPage.getStockValue());

        //There should be a button “Add to cart”
        Assert.assertTrue(ipad4MiniPage.checkAddToCartButton());
    }

    //If an item is added to cart, the number items in card in header should be updated
    @Test
    public void test3() {
        HomePage homePage = new HomePage();
        Ipad4MiniPage ipad4MiniPage = new Ipad4MiniPage();
        homePage.clickOnIpad4Mini();
        ipad4MiniPage.clickOnAddToCart();
        Assert.assertEquals("Cart (1)", ipad4MiniPage.getCartValue());

    }

    //It should not be possible to add more items into cart than there is in stock.
    @Test
    public void test4() {
        HomePage homePage = new HomePage();
        Ipad4MiniPage ipad4MiniPage = new Ipad4MiniPage();
        homePage.clickOnIpad4Mini();
        ipad4MiniPage.checkOutOfStock();
        Assert.assertEquals("In Stock: 0", ipad4MiniPage.getStockValue());
        Assert.assertFalse(ipad4MiniPage.outOfStockButton());

    }
}

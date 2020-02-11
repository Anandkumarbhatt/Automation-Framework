package spa.vue.io.github.skyronic.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import spa.vue.io.github.skyronic.basepage.BasePage;
import spa.vue.io.github.skyronic.browserselector.BrowserSelector;
import spa.vue.io.github.skyronic.loadproperty.LoadProperty;

public class TestBase extends BasePage {
    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        browserSelector.selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDown() {

        driver.quit();

    }
}

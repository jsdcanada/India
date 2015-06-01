package Gujarat;

import PageObjects.BasePage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Jagdish on 21/05/2015.
 */
public class BaseTest extends BasePage {
    String url=LoadProperties.getProperty("URL");

    @BeforeClass
    public  void openBrowser() {
        driver=new FirefoxDriver();
        driver.get(url);
        Utils.waitForPageToLoad(5);
        Utils.maximize();
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}

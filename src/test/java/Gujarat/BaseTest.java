package Gujarat;

import PageObjects.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Jagdish on 21/05/2015.
 */
public class BaseTest extends BasePage {
    ComputersPage computersPage = new ComputersPage();
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    RegisterPage registerPage = new RegisterPage();
    ProductPage productPage = new ProductPage();
    CameraPhotoPage cameraPhotoPage=new CameraPhotoPage();
    PaymentPage paymentPage=new PaymentPage();
    ShoppinCartPage shoppinCartPage=new ShoppinCartPage();


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

//    @Test
//    public void verifyAddCartButtonPresentInEachProduct() {
//        homePage.goToElectronicPage();
//        homePage.goToCameraPhotoPage();
//        productPage.addTocartButtoncheck();
//    }
//    @Test
//    public void verifyAddCartButtonPresentInEachProduct1(){
//        homePage.goToComputersPage();
//        homePage.goToDesktopPage();
//        productPage.addTocartButtoncheck();
//    }
}

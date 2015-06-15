package Gujarat;

import PageObjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.testng.Assert.assertTrue;


/**
 * Created by Jagdish on 21/05/2015.
 */
public class SmokeTestSuite extends BaseTest {
    //product selection data
    String highvalueproduct = LoadProperties.getProperty("highvalueproduct");
    String desktoptext = LoadProperties.getProperty("desktoptext");

    //register test data
    String firstname = LoadProperties.getProperty("firstname");
    String lastname = LoadProperties.getProperty("lastname");
    String birthday = LoadProperties.getProperty("birthday");
    String birthmonth = LoadProperties.getProperty("birthmonth");
    String birthyear = LoadProperties.getProperty("birthyear");
    String email = LoadProperties.getProperty("email") + Utils.randomDate() + "@gamil.com";
    String company = LoadProperties.getProperty("company");
    String password = LoadProperties.getProperty("password");
    String confirmpassword = LoadProperties.getProperty("confirmpassword");
    String registrationsuccessmessage = LoadProperties.getProperty("registrationsuccessmessage");

    //user1 login test data
    String user1email = LoadProperties.getProperty("user1email");

    //email friend test data
    String friendemail = LoadProperties.getProperty("friendemail");
    String personalmesssage = LoadProperties.getProperty("personalmesssage");
    String emailsuccessmessage = LoadProperties.getProperty("emailsuccessmessage");

    //Buying product test data
    String itemqty=LoadProperties.getProperty("itemqty");

    //shipping estimate data
    String shipcountry= LoadProperties.getProperty("shipcountry");

    //billing address test data
    String billcountry=LoadProperties.getProperty("billcountry");
    String city=LoadProperties.getProperty("city");
    String address1=LoadProperties.getProperty("address1");
    String postcode=LoadProperties.getProperty("postcode");
    String mobilenumber=LoadProperties.getProperty("mobilenumber");

    //payment card test data
    String cardtype=LoadProperties.getProperty("cardtype");
    String cardholdername=LoadProperties.getProperty("cardholdername");
    String cardnumber=LoadProperties.getProperty("cardnumber");
    String expmonth=LoadProperties.getProperty("expmonth");
    String expyear=LoadProperties.getProperty("expyear");
    String cvv=LoadProperties.getProperty("cvv");
    String buyingsuccessmessage=LoadProperties.getProperty("buyingsuccessmessage");

    //locators caputre emailid
    By useremail = By.xpath("//a[@class='account']");

    //creating objects to use method of each page
    ComputersPage computersPage = new ComputersPage();
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    RegisterPage registerPage = new RegisterPage();
    ProductPage productPage = new ProductPage();
    CameraPhotoPage cameraPhotoPage=new CameraPhotoPage();
    PaymentPage paymentPage=new PaymentPage();
    ShoppinCartPage shoppinCartPage=new ShoppinCartPage();

   //@Test
    public void verifyUserCanRegisterSuccesully() {
        homePage.goToRegisterPage();
        registerPage.userRegistration(firstname, lastname, birthday, birthmonth, birthyear, email, company, password, confirmpassword);
        assertTrue(Utils.isTextPresent(registrationsuccessmessage));
        String username = Utils.getText(useremail);
        homePage.logout();
        homePage.login(username, password);
        assertTrue(Utils.isTextPresent(username));
        homePage.logout();
    }

   @Test
    public void userCanemailproductTofreind() {
        homePage.goToRegisterPage();
        registerPage.userRegistration(firstname, lastname, birthday, birthmonth, birthyear, email, company, password, confirmpassword);
        assertTrue(Utils.isTextPresent(registrationsuccessmessage));
        homePage.goToComputersPage();
        computersPage.goToDesktopsPage();
        desktopsPage.addHighValueProductToCart(highvalueproduct);
        productPage.emailFriend(friendemail, personalmesssage);
        assertTrue(Utils.isTextPresent(emailsuccessmessage));
        homePage.logout();
    }
   // @Test
    public void verifyUsercanBuyProductSuccessfully(){
        homePage.goToRegisterPage();
        registerPage.userRegistration(firstname, lastname, birthday, birthmonth, birthyear, email, company, password, confirmpassword);
        assertTrue(Utils.isTextPresent(registrationsuccessmessage));
        homePage.goToComputersPage();
        computersPage.goToDesktopsPage();
        desktopsPage.addHighValueProductToCart(highvalueproduct);
        homePage.goToElectronicPage();
        homePage.goToCameraPhotoPage();
        cameraPhotoPage.addToCartCameraPhoto();
        homePage.goToShoppingCartPage();
        shoppinCartPage.updateCart(itemqty, shipcountry);
        paymentPage.checkout(billcountry, city, address1, postcode, mobilenumber);
        paymentPage.payment(cardtype, cardholdername, cardnumber, expmonth, expyear, cvv);
        paymentPage.confirmation();
        assertTrue(Utils.isTextPresent(buyingsuccessmessage));
    }
    @Test
    public void verifyAddCartButtonPresentInEachProduct(){
        homePage.goToComputersPage();
        homePage.goToDesktopPage();
        productPage.addTocartButtoncheck();
    }
    @Test
    public void verifyBuyitnownumberofproduts(){
        driver=new FirefoxDriver();
        driver.get("http://www.ebay.co.uk");
        Utils.waitForPageToLoad(5);
        Utils.enterText(By.id("gh-ac"), "Galaxy s2");
        Utils.click(By.id("gh-btn"));

    }

}

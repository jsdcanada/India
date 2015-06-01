package PageObjects;

import Gujarat.Utils;
import org.openqa.selenium.By;

/**
 * Created by Jagdish on 28/05/2015.
 */
public class PaymentPage extends BasePage {
    //locators for billing address
    By billingcountryfield=By.id("BillingNewAddress_CountryId");
    By billingcityfield=By.id("BillingNewAddress_City");
    By billingaddress1field=By.id("BillingNewAddress_Address1");
    By billingpsotcodefield=By.id("BillingNewAddress_ZipPostalCode");
    By billingphonefield=By.id("BillingNewAddress_PhoneNumber");
    By billcontinuefield=By.xpath("//input[@value='Continue']");
    By shipaddcontinuefield=By.xpath("(//input[@value='Continue'])[2]");
    By shipoptionfield=By.id("shippingoption_1");
    By shipoptcontinuefield=By.xpath("(//input[@value='Continue'])[3]");

    //locators for checkout process
    By paymentmethodfield=By.id("paymentmethod_1");
    By paymethodcontinuefield=By.xpath("(//input[@value='Continue'])[4]");
    By cardtypefield=By.id("CreditCardType");
    By cardnamefield=By.id("CardholderName");
    By cardnumberfield=By.id("CardNumber");
    By cardexpmonthfield=By.id("ExpireMonth");
    By cardexpyearfield=By.id("ExpireYear");
    By cvvfield=By.id("CardCode");
    By cardcontinuefield=By.xpath("(//input[@value='Continue'])[5]");
    By confirmfield=By.xpath("//input[@value='Confirm']");
    By buyingsuccesselmentfield=By.cssSelector("strong");



    public void checkout(String billcountry,String city,String address1,String postcode,String mobilenumber) {
        Utils.selectFromListByText(billingcountryfield, billcountry);
        Utils.enterText(billingcityfield, city);
        Utils.enterText(billingaddress1field, address1);
        Utils.enterText(billingpsotcodefield, postcode);
        Utils.enterText(billingphonefield, mobilenumber);
        Utils.click(billcontinuefield);
        Utils.waitForPageToLoad(5);
        Utils.click(shipaddcontinuefield);
        Utils.click(shipoptionfield);
        Utils.click(shipoptcontinuefield);

    }
    public void payment(String cardype,String cardholdername,String cardnumber,String expmonth,String expyear,String cvv) {
        Utils.click(paymentmethodfield);
        Utils.click(paymethodcontinuefield);
        Utils.selectFromListByText(cardtypefield, cardype);
        Utils.enterText(cardnamefield, cardholdername);
        Utils.enterText(cardnumberfield, cardnumber);
        Utils.selectFromListByText(cardexpmonthfield, expmonth);
        Utils.selectFromListByText(cardexpyearfield, expyear);
        Utils.enterText(cvvfield, cvv);
        Utils.click(cardcontinuefield);
    }
    public void confirmation(){
        Utils.click(confirmfield);
        Utils.waitForElement(buyingsuccesselmentfield,10);
    }
}

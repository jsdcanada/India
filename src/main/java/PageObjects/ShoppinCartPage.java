package PageObjects;

import Gujarat.Utils;
import org.openqa.selenium.By;

/**
 * Created by Jagdish on 27/05/2015.
 */
public class ShoppinCartPage extends BasePage {
    //locators for shopping cartpage
    By removecart1field=By.xpath("(//input[@name='removefromcart'])[3]");
    By changevaluefiled=By.xpath("//td[5]/input");
    By updatecartfield=By.name("updatecart");
    By shipcountryfield=By.id("CountryId");
    By termsfield=By.id("termsofservice");
    By shopceckoutfield=By.id("checkout");

    public void updateCart(String itemqty,String shipcountry) {
        Utils.click(removecart1field);
        Utils.enterText(changevaluefiled, itemqty);
        Utils.click(updatecartfield);
        Utils.selectFromListByText(shipcountryfield, shipcountry);
        Utils.click(termsfield);
        Utils.click(shopceckoutfield);
    }

}

package PageObjects;

import Gujarat.LoadProperties;
import Gujarat.Utils;
import org.openqa.selenium.By;

/**
 * Created by Jagdish on 21/05/2015.
 */
public class DesktopsPage extends BasePage{
    //locators for product selection
    By sortByField=By.id("products-orderby");
    By productfiled=By.linkText("HP Pavilion Elite M9150F Desktop PC");
    By desktop1field=By.xpath("//input[@value='Add to cart']");

    public void addHighValueProductToCart(String text){
        Utils.selectFromListByText(sortByField, text);
        Utils.click(productfiled);
        Utils.click(desktop1field);
    }



}

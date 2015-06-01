package PageObjects;

import Gujarat.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;


/**
 * Created by Jagdish on 26/05/2015.
 */
public class CameraPhotoPage extends BasePage {
    //locators for camaraphotopage
    By camera1field=By.xpath("//input[@value='Add to cart']");
    By camera2field=By.xpath("(//input[@value='Add to cart'])[3]");

    public void addToCartCameraPhoto(){
        Utils.click(camera1field);
        Utils.click(camera2field);
    }
}

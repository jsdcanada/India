package PageObjects;

import Gujarat.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;

/**
 * Created by Jagdish on 25/05/2015.
 */
public class ProductPage extends BasePage {
    //email a product to friend locators

    By emailfriendfield=By.xpath("//input[@value='Email a friend']");
    By friendemailfield=By.id("FriendEmail");
    By personalmessagefield=By.id("PersonalMessage");
    By sendmailfield=By.xpath("//input[@value='Send email']");

    //addtocart button checking locators

    By itemBoxesfield=By.className("item-box");
    By addcartButtonfield=By.cssSelector("[type='button'][value='Add to cart']");
    By productnamefield=By.cssSelector("h2.product-title > a");

    //email friend method

    public void emailFriend(String friendemail,String personalmessage){
        Utils.click(emailfriendfield);
        Utils.enterText(friendemailfield, friendemail);
        Utils.enterText(personalmessagefield,personalmessage);
        Utils.click(sendmailfield);
    }

    public void addTocartButtoncheck() {

        List<WebElement> webElementList=driver.findElements(itemBoxesfield);
        int count=0,nobutton=0;
        for (WebElement element : webElementList) {

            if (element.findElements(addcartButtonfield).size() == 1) {
                count++;

            }
            if (element.findElements(addcartButtonfield).size() != 1)
            {
                nobutton++;
                System.out.println(Utils.getText(productnamefield) + "   NO ADD TO CART BUTTON ");
            }
        }
       assertEquals(webElementList.size(), count);
    }

}

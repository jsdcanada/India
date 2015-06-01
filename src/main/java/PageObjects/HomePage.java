package PageObjects;

import Gujarat.Utils;
import org.openqa.selenium.By;

/**
 * Created by Jagdish on 21/05/2015.
 */
public class HomePage extends BasePage {
    //locators for registration
    By registerfield=By.linkText("Register");
    By logoutfield=By.linkText("Log out");
    By loginfield=By.linkText("Log in");
    By loginemailfield=By.id("Email");
    By loginpasswordfield=By.id("Password");
    By loginbuttonfield=By.xpath("//input[@value='Log in']");

    //locators for navigate to different pages
    By electronicsfiled=By.linkText("Electronics");
    By cameraphoteifeld=By.linkText("Camera, photo");
    By desktopfield=By.linkText("Desktops");
    By computersField=By.linkText("Computers");
    By jwelleryfield=By.linkText("Jwellery");
    By shoppingcartfield=By.linkText("Shopping cart");

    public void goToComputersPage(){
        Utils.click(computersField);
    }
    public void goToRegisterPage(){
        Utils.click(registerfield);
    }
    public void logout(){
        Utils.click(logoutfield);
    }
    public void login(String username, String password) {
        Utils.click(loginfield);
        Utils.enterText(loginemailfield, username);
        Utils.enterText(loginpasswordfield, password);
        Utils.click(loginbuttonfield);
    }
    public void goToElectronicPage(){
        Utils.click(electronicsfiled);
    }
    public void goToCameraPhotoPage(){
        Utils.click(cameraphoteifeld);
    }
    public void goToJwelleryPage(){
        Utils.click(jwelleryfield);
    }
    public void goToDesktopPage(){
        Utils.click(desktopfield);
    }

    public void goToShoppingCartPage(){
        Utils.click(shoppingcartfield);
    }
}


package PageObjects;

import Gujarat.Utils;
import org.openqa.selenium.By;

/**
 * Created by Jagdish on 21/05/2015.
 */
public class ComputersPage extends BasePage {
    //locators
    By desktopField=By.linkText("Desktops");

    public void goToDesktopsPage(){
        Utils.click(desktopField);

    }
}

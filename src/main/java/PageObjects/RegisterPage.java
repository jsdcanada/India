package PageObjects;

import Gujarat.Utils;
import org.openqa.selenium.By;

/**
 * Created by Jagdish on 25/05/2015.
 */
public class RegisterPage extends BasePage {
    //locators for registration process
    By genderfield=By.id("gender-male");
    By firstNameField=By.id("FirstName");
    By lastNameField=By.id("LastName");
    By birthdayfield=By.name("DateOfBirthDay");
    By birthmonthfield=By.name("DateOfBirthMonth");
    By birthyearfield=By.name("DateOfBirthYear");
    By emailfield=By.id("Email");
    By companyfield=By.id("Company");
    By passwordfield=By.id("Password");
    By confirmpasswordfield=By.id("ConfirmPassword");
    By registerbuttonfield=By.id("register-button");
    By continuefield=By.xpath("//input[@valuse='Continue']");

    public void userRegistration(String firstname,String lastname, String birthday,String birthmonth, String birthyear, String email,String company,String password, String confirmpassword) {
        Utils.click(genderfield);
        Utils.enterText(firstNameField, firstname);
        Utils.enterText(lastNameField, lastname);
        Utils.selectFromListByText(birthdayfield, birthday);
        Utils.selectFromListByText(birthmonthfield, birthmonth);
        Utils.selectFromListByText(birthyearfield, birthyear);
        Utils.enterText(emailfield, email);
        Utils.enterText(companyfield, company);
        Utils.enterText(passwordfield, password);
        Utils.enterText(confirmpasswordfield, confirmpassword);
        Utils.click(registerbuttonfield);
    }
}

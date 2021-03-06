package Gujarat;

import PageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.rmi.CORBA.Util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jagdish on 21/05/2015.
 */
public class Utils extends BasePage {
    //locators

        public static void maximize()
        {
            driver.manage().window().maximize();
        }
        public static void waitForPageToLoad(int time){
            driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        }
        public static void clickLink(String text)
        {
            driver.findElement(By.linkText(text)).click();
        }
        public static void selectFromListByText(By element,String text){
            Select select=new Select(driver.findElement(element));
            select.selectByVisibleText(text);
        }

        public static void waitForElement(By by,int time){
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        public static boolean isTextPresent(String text){
            return driver.findElement(By.tagName("body")).getText().contains(text);
        }
        public static void click(By by){
            driver.findElement(by).isDisplayed();
            driver.findElement(by).click();
        }
        public static boolean isElementpresent(By element)
        {
            return driver.findElement(element).isDisplayed();
        }
        public static void enterText(By element, String text) {
            driver.findElement(element).clear();
            driver.findElement(element).sendKeys(text);
        }
        public static String getValue(By by){
            return driver.findElement(by).getAttribute("value");
        }
        public static String randomDate(){
        DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
        return  format.format(new Date());
        }
         public static String getText(By by){
        return driver.findElement(by).getText();
    }


    }

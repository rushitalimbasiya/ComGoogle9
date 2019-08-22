package Com.Google9;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util extends BasePage {

    public static void clickOnElement (By by)
    {
        driver.findElement(by).click();        // for click method
    }

    public static void clearOnElement(By by)
    {
        driver.findElement(by).clear();        // for clear method
    }

    public static void sendKeyMethod(By by,String sendkey)
    {
        driver.findElement(by).sendKeys(sendkey);
    }

    public static String GetCurrentDateStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat(
                "ddmmyyyy");// dd/MM/yyyy
        Date today = new Date();
        String strDate = sdfDate.format(today);
        return strDate;
    }
    }

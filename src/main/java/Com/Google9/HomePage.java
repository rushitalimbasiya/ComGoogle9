package Com.Google9;

import org.openqa.selenium.By;

import static Com.Google9.BrowserSelector.browserSelection;

//9.  Create a google account and confirm you are in the inbox.

public class HomePage extends Util {
    public static void main(String[]args){

        Loadprop loadprop = new Loadprop();
        BrowserSelector browserSelector = new BrowserSelector();
        browserSelection();

        //open the url
        driver.get(loadprop.getProperty("url"));
        //click on Google Account
        clickOnElement(By.xpath("//a[@data-stats-id='Google Account']/img"));
        //click on Create a Google Account
        clickOnElement(By.xpath("//a[contains(text(),'Create a Google Account')]"));
        //click on Step 1: CREATE A GOOGLE ACCOUNT
        clickOnElement(By.xpath("//a[contains(text(),'CREATE A GOOGLE ACCOUNT')]"));

        // new teb open so you can'n put your name so driver need to switch to the new tab or need window.
        for (String winHandle:driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        //for first name
        clickOnElement(By.xpath("//div[@class='Xb9hP']/input[@id='firstName']"));
        sendKeyMethod(By.xpath("//div[@class='Xb9hP']/input[@id='firstName']"),loadprop.getProperty("FirstName"));
        //for last name
        clickOnElement(By.cssSelector("#lastName"));
        sendKeyMethod(By.cssSelector("#lastName"),loadprop.getProperty("lastName"));
        //for user email
        clickOnElement(By.cssSelector("#username"));
        sendKeyMethod(By.cssSelector("#username"),"abcd"+GetCurrentDateStamp());
         //for password
        clickOnElement(By.xpath("//div[@id='passwd']/div[1]/div/div[1]/input"));
        sendKeyMethod(By.xpath("//div[@id='passwd']/div[1]/div/div[1]/input"),loadprop.getProperty("password"));
        //for confirm password
        clickOnElement(By.xpath("//div[@id='confirm-passwd']/div[1]/div/div[1]/input"));
        sendKeyMethod(By.xpath("//div[@id='confirm-passwd']/div[1]/div/div[1]/input"),loadprop.getProperty("confirm-passwd"));

        //click on next button
        clickOnElement(By.xpath("//div[@class='OZliR']/div/span"));

        //for phone number
        clickOnElement(By.cssSelector("#phoneNumberId"));
        sendKeyMethod(By.cssSelector("#phoneNumberId"),loadprop.getProperty("phoneNumber"));

        String expectedTitle="https://accounts.google.com/signup/v2/webgradsidvphone?flowName=GlifWebSignIn&flowEntry=SignUp";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Valid Webpage");
        }else {
            System.out.println("Invalid Webpage");
        }
        //for phone number
        clickOnElement(By.cssSelector("#phoneNumberId"));
        sendKeyMethod(By.cssSelector("#phoneNumberId"),loadprop.getProperty("phoneNumber"));





        clickOnElement(By.xpath("//div[@class='OZliR']/div/span"));



    }

}

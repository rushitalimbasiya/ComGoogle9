package Com.Google9;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Util {

    public static void browserSelection() {

        Loadprop loadprop = new Loadprop();
        System.out.println(loadprop.getProperty("browser"));
        String browser= loadprop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver","src\\test\\resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            // driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","src\\test\\resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();

        } else if (browser.equalsIgnoreCase("InternetExplorer")) {
            System.setProperty("webdriver.ie.driver","src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();

        }  else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","src\\test\\resources\\BrowserDriver\\msedgedriver.exe");
            driver = new EdgeDriver();



        } else
            System.out.println("no such browser name");
    }



}




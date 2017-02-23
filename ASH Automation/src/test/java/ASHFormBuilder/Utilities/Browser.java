package ASHFormBuilder.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

/**
 * Created by biswajeet.tripathy on 08-02-2017.
 */
public class Browser
{

       //public WebDriver driver;

        public WebDriver runbrowser(WebDriver driver, String browsersheet) throws IOException
        {

            if (browsersheet.equals("ie")) {
                System.setProperty("webdriver.ie.driver", "D:\\IEDriver\\IEDriverServer.exe\\");
                driver = new InternetExplorerDriver();
                driver.manage().window().maximize();
                //driver.get("https://www.northgateps.com/");

            } else if (browsersheet.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe\\");
                driver = new ChromeDriver();
                driver.manage().window().maximize();

            } else if (browsersheet.equals("firefox")) {
                System.setProperty("webdriver.firefox.marionette","D:\\geckodriver-v0.9.0-win64\\geckodriver.exe\\");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                //driver.get("https://www.northgateps.com/");
            }
            return driver;
        }
 }

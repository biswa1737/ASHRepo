package ASHFormBuilder.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by biswajeet.tripathy on 08-02-2017.
 */
public class awardLoginLogout
{
        //WebDriver driver;

        public void Login_to_BridgeGrantAward(WebDriver driver)
        {

            //driver.get("http://rav-vm-srv-106/Awards-Form-Builder/Award/FormBuilder/412");
            driver.get("http://rav-vm-srv-106/awards/form-designer/template/edit/412");
            driver.findElement(By.xpath("//*[@id=\"LoginTextBox\"]")).sendKeys("m.v.huisman@lumc.nl");
            driver.findElement(By.xpath("//*[@id=\"PasswordTextBox\"]")).sendKeys("ash2017");
            driver.findElement(By.xpath("//*[@id=\"SubmitButton\"]")).click();
        }
        public void Logout(WebDriver driver)
        {
            driver.findElement(By.xpath("//*[@id='signout']")).click();
        }
}

package ASHFormBuilder.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by anoop.singh on 2/6/2017.
 */
public class clsCommon {

    WebElement element;//=driver.findElement(By.id(strAddress_ID));
    public WebElement returnElement(WebDriver driver,String strlocatorType,String strAddress_ID) throws InterruptedException, Exception
    {
        try
        {

            if(strlocatorType.equals("ID"))
            {
                element = driver.findElement(By.id(strAddress_ID));
            }
            if(strlocatorType.equals("XPATH"))
            {
                element = driver.findElement(By.xpath(strAddress_ID));
            }
            if(strlocatorType.equals("ClassName"))
            {
                element = driver.findElement(By.className(strAddress_ID));
            }
            if(strlocatorType.equals("cssSelector"))
            {
                element = driver.findElement(By.cssSelector(strAddress_ID));
            }
            if(strlocatorType.equals("Name"))
            {
                element = driver.findElement(By.name(strAddress_ID));
            }
            if(strlocatorType.equals("PartialLinkText"))
            {
                element = driver.findElement(By.partialLinkText(strAddress_ID));
            }

        }
        catch(Exception e)
        {

            System.out.print("Unable to find the element with "+strAddress_ID+"using locatortype"+strlocatorType);
        }
        return element;
    }
}

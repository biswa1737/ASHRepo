package ASHFormBuilder.Steps;

import ASHFormBuilder.Utilities.Browser;
import com.relevantcodes.extentreports.*;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by biswajeet.tripathy on 06-02-2017.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber"},
        features ={"D:\\ASH Automation\\ASH Automation\\src\\test\\java\\ASHFormBuilder\\Features\\scenario.feature"}
//,glue = "resources",dryRun = true,strict = true)
//,tags= {"@needtoexecute:2"}
//,tags={"~@nottoexecute"})
//Cucumber --tags @billing --tags @important
,tags={"@test"})
public class Runner extends AbstractTestNGCucumberTests {

        public static ExtentReports extent;
        public static ExtentTest extest;

        private static long millis = System.currentTimeMillis();
        public static String reportLocation = "testsummary-reports/detailTestReport_" + millis + ".html";
        //private static ExtentHtmlReporter htmlReporter;
        public static FileInputStream fis;

        @BeforeClass
        public static void init() throws IOException
        {
            extent = new ExtentReports(reportLocation,false, DisplayOrder.OLDEST_FIRST, NetworkMode.ONLINE);
            extent.startReporter(ReporterType.DB, (new File(reportLocation)).getParent() + File.separator);
        }
        public static String takeScreenshot(WebDriver driver)
        {
            String imageLocation = null;
            long millis = System.currentTimeMillis();
            String imageName = "reportImage_" + millis;
            // Take screenshot and store as a file format
            File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                //Get test script data to read.
                String resourceImageFilePath = "reports/reportImages/";
                String resourceImageURL = new File(resourceImageFilePath).getAbsolutePath();
                // now copy the  screenshot to desired location using copyFile //method
                FileUtils.copyFile(src, new File(resourceImageURL +"\\"+ imageName+".png"));
                imageLocation = resourceImageURL +"\\" + imageName+".png";
            }
            catch (IOException e)
            {
                // log.error("Error in capturing screenshot: " + e);
            }
            return imageLocation;
        }
    public static void Highlight(WebDriver driver,WebElement Element)
    {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style','background:green; border:4px solid red;')",Element);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        js.executeScript("arguments[0].setAttribute('style','border:6px white;')",Element);
    }


}

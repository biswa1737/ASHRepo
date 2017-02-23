package ASHFormBuilder.Steps;

import ASHFormBuilder.PageObjects.poMasterControl;
import ASHFormBuilder.PageObjects.poProject;
import ASHFormBuilder.Utilities.awardLoginLogout;
import ASHFormBuilder.Utilities.Browser;
import ASHFormBuilder.Utilities.FormLabels;
import ASHFormBuilder.Utilities.clsCommon;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by biswajeet.tripathy on 06-02-2017.
 */
public class Steps
{
    //Create class objects
    WebDriver driver;
    clsCommon element = new clsCommon();
    poProject obj = new poProject();
    awardLoginLogout login = new awardLoginLogout();
    Browser browser = new Browser();
    poMasterControl destination = new poMasterControl();
    FormLabels labeltext = new FormLabels();
    String titleLabelText , projectStartDateText;

    @Before
    public void setUp() throws IOException {
        driver=browser.runbrowser(driver,"chrome");
        driver.manage().deleteAllCookies();
    }

    @Given("^User should be logged in to formbuilder application$")
    public void user_should_be_logged_in_to_formbuilder_application() throws Exception {

        login.Login_to_BridgeGrantAward(driver);
    }

    @When("^I drag and drop project control to tab1 of formbuilder$")
    public void i_drag_and_drop_project_control_to_tab1_of_formbuilder() throws Exception {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       /* WebElement deletemasterControl = driver.findElement(By.xpath("//*[@id='frmb-0-fld-1']"));

        if(deletemasterControl.isDisplayed())
        {
            destination.btn_Remove(deletemasterControl).click();
        }*/

        List<WebElement> MasterControlItems = destination.MasterControl_Items(driver,0);

        WebElement MasterControl_Project = null;

        for (int i = 0; i < MasterControlItems.size(); i++)
        {
            String project = MasterControlItems.get(i).getAttribute("type");

            if (project.equalsIgnoreCase("applicant-project")) {

                MasterControl_Project = MasterControlItems.get(i);
                break;
            }
        }
        Actions action = new Actions(driver);
        action.dragAndDrop(MasterControl_Project, destination.to_Destination(driver,1)).build().perform();
    }

    @And("^I edit controls in tab1 of formbuilder$")
    public void i_edit_controls_in_tab1_of_formbuilder() throws Exception {

        //edit the first section
        WebElement btn_edit_first_section = destination.innerElementEdit(driver,0,0);
        btn_edit_first_section.click();
        labeltext.labelText(driver,"title","Title");

        //edit the second section
        WebElement btn_edit_second_section = destination.innerElementEdit(driver,0,2);
        btn_edit_second_section.click();
        labeltext.labelText(driver,"Project start date","start date");

        //edit the third section
       /* WebElement btn_edit_third_section = destination.innerElementEdit(driver,0,3);
        btn_edit_third_section.click();
        String projectEndDateText = labeltext.labelText(driver,"Project end date","project end date");*/
        }
     @And("^I rename tab1 as Project$")
     public void i_rename_tab1_as_Project()

        {
            System.out.println("rename");
        }
    @And("^I Click on Save and go to Preview$")
     public void i_click_on_save_and_go_to_Preview() throws InterruptedException {
            destination.btn_Save(driver).click();
            Thread.sleep(10000);
           // WebDriverWait wait = new WebDriverWait(driver,30);
           // wait.until(ExpectedConditions.elementToBeClickable(destination.btn_PopupOK(driver)));
           // wait.until(ExpectedConditions.presenceOfElementLocated(destination.btn_PopupOK(driver));
            System.out.println("save clicked");
            destination.btn_PopupOK(driver).click();
        }
    @Then("^I verify in the Preview tab$")
    public void i_verify_in_the_Preview_tab()
        {
            //extest = extent.startTest("TC-1", "Verify preview title after adding project mastercontrol in FormBuilder page").assignCategory("TestCase-1");
            String pParentWindow = driver.getWindowHandle();
            List <String> allOuterLabels = labeltext.allOuterLabelsList(driver);

            //click 'Preview' button in formbuilder page
            destination.btn_Preview(driver).click();

            ArrayList<String> tabs = new ArrayList <String> (driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            WebElement projectlabel = destination.previewFormLabel(driver);
           // String projectlabeltext = projectlabel.getText();
            List<WebElement> previewLabels = destination.previewLabels(driver);
            for(int j = 1;j < previewLabels.size();j++)
            {
                String previewlabelText = previewLabels.get(j).getText();
               // System.out.println("previewlabelText : " + previewlabelText);
                String newlabelText = previewlabelText.replace('*',' ').trim();
               // System.out.println("newlabelText : " + newlabelText + "  , j value:" +j);
               // System.out.println("allOuterLabels : " + allOuterLabels.get(j-1));

                if(newlabelText.equalsIgnoreCase(allOuterLabels.get(j-1)))
                {
                    System.out.println(" " + allOuterLabels.get(j-1) + " field verified successfully");
                    //extest.log(LogStatus.PASS, "Title field in Preview Page verified successfully");
                }
                else if(newlabelText.contains(" "))
                {
                   System.out.println("No field exists ");
                   // extest.log(LogStatus.FAIL, "Title field does not exist","Image captured:" +extest.addScreenCapture(takeScreenshot(driver)));
                }

            }

            driver.switchTo().window(pParentWindow);
            //extent.endTest(extest);
           // extent.flush();
        }
    @And("^Logout of the application$")
    public void logout_of_the_application()
        {
            System.out.println("logout entered");
           // login.Logout(driver);
        }
   @After
    public void tearDown()
        {

           // driver.close();
        }

}

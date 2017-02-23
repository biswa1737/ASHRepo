package ASHFormBuilder.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by amey.rajapure on 2/8/2017.
 */
public class poMasterControl {

    private static WebElement element = null;
    private static List<WebElement> elementList;


    //Add New Step link
    public WebElement lnk_AddNewStep(WebDriver driver){
        //public String add_New_Step ="//li[@id='add-page-tab']/a/span";
        element = driver.findElement(By.id("add-page-tab"));
        return element;
    }

    //Container for Master Control at all New Tabs
    public List<WebElement> MasterControl_Items(WebDriver driver, int tabNo){
        String sElementXpath = "//*[@id='frmb-" +tabNo+ "-cb-wrap']/ul/descendant::li";
        elementList = driver.findElements(By.xpath(sElementXpath));
        return elementList;
    }

    //Container for Page at each Tab (Destination for dropping the controls)
    public WebElement to_Destination(WebDriver driver, int pageNo) {
        String elementsID = "//*[@id='page-" +pageNo+ "']";
        element = driver.findElement(By.xpath(elementsID));
        return element;
    }

    //Label & Type of all the Elements in a form
    public static List<WebElement> frm_AllElements(WebDriver driver, int iFormNo){
        String sElementXpath = ".//*[@id='frmb-" +iFormNo+ "-fld-1']/descendant::li";
        elementList = driver.findElements(By.xpath(sElementXpath));
        return elementList;
    }

    //Label of mastercontrol item in form
    public WebElement lbl_MasterControlItem(WebDriver driver, int iNo,int fNo){
        String sElementXpath = ".//*[@id='frmb-" +iNo+ "-fld-" +fNo+ "']/div[2]/h3/label";
        element = driver.findElement(By.xpath(sElementXpath));
        return element;
    }
    //New Step Tabs
    public WebElement lbl_TabName(WebDriver driver, int tabNo){
        String sElementXpath = ".//*[@id='tabs']/li[" +tabNo+ "]";
        element = driver.findElement(By.xpath(sElementXpath));
        //element = element.findElement(By.xpath("li"));
        return element;
    }

    //Tab - Delete button
    public WebElement btn_TabDelete(WebDriver driver, int tabNo){
        String sElementXpath = ".//*[@id='tabs']/li[" +tabNo+ "]/a/span[2]";
        element = driver.findElement(By.xpath(sElementXpath));
        return element;
    }

    //Tab - Edit button
    public WebElement btn_TabEdit(WebDriver driver, int tabNo){
        String sElementXpath = ".//*[@id='tabs']/li[" +tabNo+ "]/a/span[3]";
        element = driver.findElement(By.xpath(sElementXpath));
        return element;
    }

    //Tab label popup - Label
    public WebElement txt_TabLabelPopup_Label(WebDriver driver){
        element = driver.findElement(By.xpath(".//div[contains(@id,\"ui-id-\") and contains(@class,\"popup-content-details\")]/div[2]/div[1]/div[2]/input"));
        return element;
    }

    //Tab label popup - Save button
    public WebElement btn_TabLabelPopup_Save(WebDriver driver){
        element = driver.findElement(By.xpath(".//div[contains(@id,\"ui-id-\") and contains(@class,\"popup-content-details\")]/div[3]/div/input[1]"));
        return element;
    }

    //Tab label popup - Cancel button
    public WebElement btn_TabLabelPopup_Cancel(WebDriver driver){
        element = driver.findElement(By.xpath(".//div[contains(@id,\"ui-id-\") and contains(@class,\"popup-content-details\")]/div[3]/div/input[2]"));
        return element;
    }

     //Access all inner elements on clicking Edit button
    public List <WebElement> getInnerElements(WebElement weOuterElement){
        elementList = weOuterElement.findElements(By.xpath("//div[3]/div/div"));
        return elementList;
    }

    //Labels of all the inner elements on clicking Edit button
    public WebElement getLabel_InnerElement(WebElement weOuterElement){
        element = weOuterElement.findElement(By.xpath("label"));
        return element;
    }

    //Edit, checkbox tick actions on all the inner elements on clicking Edit button
    public WebElement getElement_InnerElement(WebElement weOuterElement){
        element = weOuterElement.findElement(By.xpath("input"));
        return element;
    }

    //Close button of each element
    public WebElement btn_Close(WebElement sOuterElementXpath){
        element = sOuterElementXpath.findElement(By.xpath("//div[3]/div")).findElement(By.tagName("a"));
        return element;
    }

    //Form Save Button
    public WebElement btn_Save(WebDriver driver){
        element = driver.findElement(By.id("save-template"));
        return element;
    }

    //Popup Save-OK button
    public WebElement btn_PopupOK(WebDriver driver){
        element = driver.findElement(By.id("popup_ok"));
        return element;
    }

    //Form Preview Button
    public WebElement btn_Preview(WebDriver driver){
        element = driver.findElement(By.id("preview-template"));
        return element;
    }
    //Remove Element
    public WebElement btn_Remove(WebElement sOuterElementXpath){
        element = sOuterElementXpath.findElement(By.xpath("//*[@id='del_frmb-0-fld-1']"));
        return element;
    }
    //outerelements
    public WebElement outerElement(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[contains(@id,'frmb-0-fld')]"));
        return element;
    }
    //innerelements

    //outerelement label
    public List <WebElement> outerElementLabel(WebDriver driver)
    {
        List <WebElement> elementList = driver.findElements(By.xpath("//*[contains(@id,'frmb-0-fld')]/label"));
        return elementList;
    }

    //edit button for individual inner element
    public WebElement btn_Edit(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[contains(@id,'frmb-0-fld-2-0-edit')]"));
        return element;
    }

   //Edit button for individual inner element
    public WebElement innerElementEdit(WebDriver driver,int iFormNo, int lblId) {

        //System.out.println("iformno: " + iFormNo + " , iblID :" +lblId);
        element = driver.findElement(By.xpath("//*[contains(@id,'frmb-" +iFormNo+ "-fld-2-" +lblId+ "-edit')]"));
        return element;
    }

    //Parent label in preview page
    public WebElement previewFormLabel(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"tab-0\"]/div/h1"));
        return element;
    }
    //All form labels in preview page
    public List<WebElement> previewLabels(WebDriver driver)
    {
        List <WebElement> elementList = driver.findElements(By.xpath("//*[@id=\"tab-0\"]/div/div"));
        return elementList;
    }
}

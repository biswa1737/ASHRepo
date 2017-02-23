package ASHFormBuilder.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by biswajeet.tripathy on 06-02-2017.
 */
public class poProject
{
    public String frm_destination = "page-1";
    public String mastercontrol_id = "frmb-0-cb-wrap";
   // public String mastercontrolitems = "//*[contains(@class,\"section-set-control\")]";
    public String lbl_Project = "//*[@id=\"frmb-0-control-box\"]/li[1]/div/div/div";
    public String lbl_afterdragdrop_Project = "//*[@id=\"frmb-0-fld-1\"]/div[2]/h3/label";

   // public String lbl_ProjectTitle = "//*[@id=\"frmb-0-fld-4\"]/div[2]/h3/label";
    public String lbl_ProjectTitle = "//*[@id=\"frmb-0-fld-2-0\"]/label";
    public String txt_ProjectTitle = "//*[@id=\"frmb-0-fld-5-2\"]/div[2]/input";

    public String lbl_ProjectStartDate = "//*[@id=\"frmb-0-fld-8-2\"]/label";
    public String txt_ProjectStartDate = "//*[@id=\"frmb-0-fld-8-2\"]/div[2]/input";

    public String lbl_ProjectEndDate = "//*[@id=\"frmb-0-fld-8-3\"]/label";
    public String txt_ProjectEndDate = "//*[@id=\"frmb-0-fld-8-3\"]/div[2]/input";

    public String lbl_InstitutionName = "//*[@id=\"frmb-0-fld-8-4\"]/label";
    public String txt_InstitutionName = "//*[@id=\"frmb-0-fld-8-4\"]/div[2]/input";

    public String lbl_Country = "//*[@id=\"frmb-0-fld-8-7\"]/label";
    public String drpDnList_Country = "//*[@id=\"frmb-0-fld-8-7\"]/div[2]/select";

    public String lbl_addrLine1 = "//*[@id=\"frmb-0-fld-8-8\"]/label";
    public String txt_addrLine1 = "//*[@id=\"frmb-0-fld-8-8\"]/div[2]/input";

    public String lbl_addrLine2 = "//*[@id=\"frmb-0-fld-8-9\"]/label";
    public String txt_addrLine2 = "//*[@id=\"frmb-0-fld-8-9\"]/div[2]/input";

    public String lbl_City = "//*[@id=\"frmb-0-fld-8-10\"]/label";
    public String txt_City = "//*[@id=\"frmb-0-fld-8-10\"]/div[2]/input";

    public String lbl_State = "//*[@id=\"frmb-0-fld-8-11\"]/label";
    public String drpDnList_State = "//*[@id=\"frmb-0-fld-8-11\"]/div[2]/select";

    public String lbl_Zip = "//*[@id=\"frmb-0-fld-8-12\"]/label";
    public String txt_Zip = "//*[@id=\"frmb-0-fld-8-12\"]/div[2]/input";

    public String lbl_workEmail = "//*[@id=\"frmb-0-fld-8-13\"]/label";
    public String txt_workEmail = "//*[@id=\"frmb-0-fld-8-13\"]/div[2]/input";

    public String lbl_workPhone = "//*[@id=\"frmb-0-fld-8-14\"]/label";
    public String txt_workPhone = "//*[@id=\"frmb-0-fld-8-14\"]/div[2]/input";

    public String lbl_supervisorName = "//*[@id=\"frmb-0-fld-8-15\"]/label";
    public String txt_supervisorName = "//*[@id=\"frmb-0-fld-8-15\"]/div[2]/input";

    public String lbl_projectDetails = "//*[@id=\"frmb-0-fld-8-16\"]/label";
    public String txt_projectDetails = "//*[@id=\"frmb-0-fld-8-16\"]/div[2]/input";

    public String lbl_researchCategory = "//*[@id=\"frmb-0-fld-8-17\"]/label";
    public String txt_researchCategory = "//*[@id=\"frmb-0-fld-8-17\"]/div[2]/input";

    public String lbl_researchFocus = "//*[@id=\"frmb-0-fld-8-18\"]/label";
    public String txt_researchFocus = "//*[@id=\"frmb-0-fld-8-18\"]/div[2]/input";

    public String lbl_workArea = "//*[@id=\"frmb-0-fld-8-19\"]/label";
    public String txt_workArea = "//*[@id=\"frmb-0-fld-8-19\"]/div[2]/input";

    public String lbl_researchArea = "//*[@id=\"frmb-0-fld-8-20\"]/label";
    public String txt_researchArea = "//*[@id=\"frmb-0-fld-8-20\"]/div[2]/input";

}

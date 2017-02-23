package ASHFormBuilder.Utilities;

import ASHFormBuilder.PageObjects.poMasterControl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by biswajeet.tripathy on 15-02-2017.
 */
public class FormLabels {

    poMasterControl masterControl = new poMasterControl();

    public void labelText(WebDriver driver, String outerLabel, String editText) {
        WebElement outerelement = masterControl.outerElement(driver);

        List<WebElement> innerLabelList = masterControl.getInnerElements(outerelement);

        List<WebElement> outerLabelList = masterControl.outerElementLabel(driver);


        for (int k = 0; k < outerLabelList.size(); k++) {
            String outerLabelText = outerLabelList.get(k).getText().toString();   //get individual innerlabels text in form page title,project start date etc
            System.out.println("outerLabelsText :" + outerLabelText + ", outerLabel :" + outerLabel);

            if (outerLabelText.trim().equalsIgnoreCase(outerLabel)) {
                for (int i = 0; i < innerLabelList.size(); i++) {
                    WebElement innerLabelElement = innerLabelList.get(i);
                    // System.out.println("innerElement:" +innerLabelElement);
                    String innerLabelElementText = innerLabelElement.getText();
                    //String innerLabelElementText = masterControl.getLabel_InnerElement(innerLabelElement).getText();
                    System.out.println("inElements :" + innerLabelElementText);

                    if (innerLabelElementText.trim().equalsIgnoreCase("Label")) {
                        masterControl.getElement_InnerElement(innerLabelElement).clear();
                        masterControl.getElement_InnerElement(innerLabelElement).sendKeys(editText);
                        // System.out.println("inLabelElement:" +innerLabelElementText);
                    }

                    if (innerLabelElementText.trim().equalsIgnoreCase("Help Text")) {
                        masterControl.getElement_InnerElement(innerLabelElement).clear();
                        masterControl.getElement_InnerElement(innerLabelElement).sendKeys(editText);
                        // System.out.println("inLabelElement:" +innerLabelElementText);

                    }

                    if (innerLabelElementText.equalsIgnoreCase("Placeholder")) {
                        masterControl.getElement_InnerElement(innerLabelElement).clear();
                        masterControl.getElement_InnerElement(innerLabelElement).sendKeys(editText);
                        // System.out.println("inLabelElement:" +innerLabelElementText);

                    }
                }
                if (masterControl.btn_Close(outerelement).isDisplayed()) {
                    masterControl.btn_Close(outerelement).click();
                }
            }
        }
        //masterControl.btn_Close(outerelement).click();
    }


    public List<String> allOuterLabelsList(WebDriver driver)
    {
        List<WebElement> outerLabelList = masterControl.outerElementLabel(driver);
        List<String> sAllOuterLabels = new ArrayList<String>();

        for (int k = 0; k < outerLabelList.size(); k++)
        {
            sAllOuterLabels.add(outerLabelList.get(k).getText().toString()); //add individual outerlabels text in form page title,project start date etc
        }
        return sAllOuterLabels;
    }

}


    /* List<WebElement> weListAllLabels = MasterControl.lbl_AllElements(driver,0);
    List<String> sAllLabels = new ArrayList<String>();

for (int i =0; i<weListAllLabels.size(); i++)
        {
        sAllLabels.add(weListAllLabels.get(i).getText());
        }

        for(int i=0; i<=weListAllLabels.size() ;i++)
        {
        if(sAllLabels.get(i).equalsIgnoreCase("First Name"))
        {
        WebElement editbtn = MasterControl.innerElementEdit(driver,0,i);
        editbtn.click();
        break;
        }
        }*/

   /*public String labelText(WebDriver driver) {
       String pParentWindow = driver.getWindowHandle();
       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(1));

       List<WebElement> previewLabels = masterControl.previewLabels(driver);
       for (int j = 0; j < previewLabels.size(); j++) {
           String previewlabelText = previewLabels.get(j).getText();
           String newlabelText = previewlabelText.replace('*', ' ');

           driver.switchTo().window(pParentWindow);
           String titleLabelText = labelText(driver, "title");
       }
       return titleLabelText;
   }*/









/*
        masterControl.outerElement(driver);
        WebElement outerelement = masterControl.outerElement(driver);
        List<WebElement> innerElements = masterControl.getInnerElements(outerelement);

        for (int i = 0; i < innerElements.size(); i++)
        {
            WebElement innerElement = innerElements.get(i);
            String innerlabelText = masterControl.getLabel_InnerElement(innerElement).getText();
            //System.out.println("inner fields:" +innerlabeltext);
            //String innerinputext = masterControl.getElement_InnerElement(innerElement).getAttribute("value");
            if(innerlabelText.equalsIgnoreCase("Label"))
            {
                masterControl.btn_Close(outerelement).click();
                break;
            }

        }
        return innerlabelText;
    }

}*/
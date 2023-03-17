package StepDefination;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepDashboardPage extends PageObject {
    public void clickVerify(){
       // String dashboardTitle = $(By.xpath("//div[@class='sweet-alert showSweetAlert visible']")).getText();
//        String dashboardTitle = $(By.id("select2-country-container")).getText();
//        Assert.assertTrue(dashboardTitle,true);
        String msg = $(By.xpath("//select[@id='countries']")).getAttribute("validationMessage");
        System.out.println(msg);
     Assert.assertEquals("Please select an item in the list.",msg);
       // System.out.println(msg);


    }

}

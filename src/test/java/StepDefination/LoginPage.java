package StepDefination;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PageObject {

//WebDriver driver;

    @Step("Enter fill In Registration Page")
    public void fillInRegistrationPage(){
        $(By.xpath("//input[@placeholder='First Name']")).sendKeys("salvi");

        $(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sunil");

        $(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("123,surat");
        $(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abc@gmail.com");
        $(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");
        $(By.xpath("//input[@value='Male']")).click();
        $(By.xpath("//input[@value='Movies']")).click();

       //select language
        $(By.xpath("//div[@id='msdd']" )).click();
        $(By.xpath("//div[@id='msdd']/../div[2]/ul/li/a[contains(text(),'Hindi')]")).click();


        //select class skills
        Select skills = new Select($(By.id("Skills")));
        skills.selectByVisibleText("Analytics");

        //select Country

        Select country = new Select($(By.xpath("//select[@id='countries']")));
        country.selectByVisibleText("Select Country");
      //  driver.switchTo().alert().sendKeys("Please select an item in the list.");

         //Select Country
        $(By.xpath("//span[@role='combobox']")).click();
        $(By.xpath("//input[@role='textbox']")).sendKeys("India");
        $(By.xpath("//li[@role='treeitem']")).click();

        //$(By.xpath("//li[normalize-space()='India']")).click();
        //Select selectCountry = new Select($(By.xpath("//label[@for='usr']")));

       // selectCountry.selectByVisibleText("India");




        //select class dropdown
        Select year  = new Select($(By.id("yearbox")));
        year.selectByVisibleText("1996");
        //select month
        Select month = new Select($(By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("January");
        //select day
        Select day = new Select($(By.id("daybox")));
        day.selectByVisibleText("6");


        $(By.xpath("//input[@id='firstpassword']")).sendKeys("sunil@123");
        $(By.xpath("//input[@id='secondpassword']")).sendKeys("sunil@123");


    }
    @Step("Submit")
    public void submitForm(){
        $(By.xpath("//button[@id='submitbtn']")).submit();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }






}

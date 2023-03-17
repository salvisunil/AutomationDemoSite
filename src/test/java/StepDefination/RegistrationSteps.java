package StepDefination;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;


public class RegistrationSteps {

    @Steps
    LoginPage loginPage;
    @Steps
    StepDashboardPage msg;

    //StepDashboardPage stepDashboardPage;






    @Given("I am on the registration page")
    public void registrationPage() {
        loginPage.open();

        System.out.println("Page is open");
    }

    @When("I fill in the registration page")
    public void fillInRegistrationPage() {
        System.out.println("Enter fill details");
        loginPage.fillInRegistrationPage();

    }

    @When("I submit the form")
    public void submitForm() {
        loginPage.submitForm();


    }

    @Then("I should see a success message")
    public void verifySuccessMessage() {
      //  stepDashboardPage.clickVerify();
        msg.clickVerify();


    }

}

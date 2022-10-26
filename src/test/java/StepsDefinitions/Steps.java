package StepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Before
    public void setUp(){
        System.out.println("==============================================");
        System.out.println("Before Hook");
        System.out.println("----------------------------------------------");
    }

    @BeforeStep
    public void stepSetUp(){
        System.out.println("**********************************************");
        System.out.println("Before Step");
    }

    @After
    public void tearDown(){
        System.out.println("----------------------------------------------");
        System.out.println("After Hook");
        System.out.println("==============================================");
    }

    @AfterStep
    public void stopTearDown(){
        System.out.println("After Step");
        System.out.println("**********************************************");

    }

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("The user is on login page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Entered username and password");
    }
    @When("hits submit")
    public void hits_submit() {
        System.out.println("Clicked on submit");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("Yeah I'm logged in");
    }

    @When("the user enters invalid credentials")
    public void theUserEntersInvalidCredentials() {
        System.out.println("Entered invalid credentials");
    }

    @Then("an invalid credentials error message should be displayed to the user")
    public void anInvalidCredentialsErrorMessageShouldBeDisplayedToTheUser() {
        System.out.println("error display::: Username or Password invalid");
    }

    @And("login should be unsuccessful")
    public void loginShouldBeUnsuccessful() {
        System.out.println("User was not logged in");
    }

    @Then("the Company logo should be present in the login form")
    public void theCompanyLogoShouldBePresentInTheLoginForm() {
        System.out.println("The company logo is present in the login form");
    }

    @When("the user clicks on Forgot Username")
    public void theUserClicksOnForgotUsername() {
        System.out.println("The user clicked on Forgot Username link ::::::::::");
    }

    @Then("the user should be navigated to the first page of forgot username flow")
    public void theUserShouldBeNavigatedToTheFirstPageOfForgotUsernameFlow() {
        System.out.println("The user is on verify email address page to recover password");
    }
}

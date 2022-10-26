package StepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Before
    public void setUp(){
        System.out.println("==============================================");
    }

    @After
    public void tearDown(){
        System.out.println("==============================================");
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

    @When("he enters user id as {string}")
    public void heEntersUserIdAs(String str) {
        System.out.println("The user ID is :: " + str);
    }

    @And("he enters user password as {string}")
    public void heEntersUserPasswordAs(String str) {
        System.out.println("The user password is :: " + str);
    }
}

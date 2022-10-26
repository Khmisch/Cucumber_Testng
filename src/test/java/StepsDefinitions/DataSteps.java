package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DataSteps {
    @When("he enters user id as {string}")
    public void heEntersUserIdAs(String str) {
        System.out.println("The user ID is :: " + str);
    }

    @When("he enters user password as {string}")
    public void heEntersUserPasswordAs(String str) {
        System.out.println("The user password is :: " + str);
    }

}

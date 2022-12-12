package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    @Given("navigating to the login page")
    public void navigatingToTheLoginPage() {
    }

    @And("entering the username as {string} and password as {string}")
    public void enteringTheUsernameAsAndPasswordAs(String username, String password) {


    }

    @And("Clicking the login button")
    public void clickingTheLoginButton() {
    }

    @Then("you are supposed to see the user form page")
    public void youAreSupposedToSeeTheUserFormPage() {
    }
}

package Steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;


public class MyStepdefs {
    @Given("navigating to the login page")
    public void navigatingToTheLoginPage() {
    }


    @And("Clicking the login button")
    public void clickingTheLoginButton() {
    }

    @Then("you are supposed to see the user form page")
    public void youAreSupposedToSeeTheUserFormPage() {
    }

    @And("entering the following details for the login")
    public void enteringTheFollowingDetailsForTheLogin(DataTable data) {
        System.out.println("The value is : " + data.cell(1, 0));
        System.out.println("The value is : " + data.cell(1, 1));

        List<List<String>> cells = data.cells();

        System.out.println("The value is : " + cells.get(1).get(0));
        System.out.println("The value is : " + cells.get(1).get(1));

    }
}

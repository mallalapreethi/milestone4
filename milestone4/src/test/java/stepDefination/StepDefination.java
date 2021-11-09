package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusableComponents.Base;

/*
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;*/

@RunWith(Cucumber.class)
public class StepDefination extends Base {

    @Given("^Browser initialized$")
    public void browser_initialized() throws Throwable {
        throw new PendingException();
    }

    @When("^user search for \"([^\"]*)\"$")
    public void user_search_for_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^System seaches for item$")
    public void system_seaches_for_item() throws Throwable {
        throw new PendingException();
    }

    @And("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        throw new PendingException();
    }

    @And("^Counts the number of matches$")
    public void counts_the_number_of_matches() throws Throwable {
        throw new PendingException();
    }

    @And("^driver closed$")
    public void driver_closed() throws Throwable {
        throw new PendingException();
    }

}
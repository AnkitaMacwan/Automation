package ca.test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

    @Given("^this is my given statement$")
    public void this_is_my_given_statement() {
        System.out.println("This is my given statement");

    }

    @When("^this is my when statement$")
    public void this_is_my_when_statement()  {
        System.out.println("This is my when statement");

    }

    @Then("^this is my then statement$")
    public void this_is_my_then_statement()  {
        System.out.println("This is my then statement");

    }


}

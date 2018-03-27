package ca.test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2Steps {
    @Given("^Enter valid Username and Password$")
    public void enter_valid_Username_and_Password()  {
        System.out.println("Enter Valid Username and Password");
    }

    @When("^Click on Login Button$")
    public void click_on_Login_Button()  {
        System.out.println("Click on Login Button") ;
    }

    @Then("^Login to Accounts$")
    public void login_to_Accounts()  {
        System.out.println("Click on Login Button");
    }

    @Given("^Type the URL$")
    public void type_the_URL() {
        System.out.println("Type the URL");
    }

    @When("^Loading the page$")
    public void loading_the_page() {
        System.out.println("Loading the page") ;
    }

    @Then("^Open the Browser$")
    public void open_the_Browser() {
        System.out.println("Open the browser");
    }

}

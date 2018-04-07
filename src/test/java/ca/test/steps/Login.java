package ca.test.steps;

import ca.test.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class Login extends LoginPage{
WebDriver driver;
    @Given("^Open Browser$")
    public void open_Browser()  {
        Login obj1 = new Login();
        obj1.Firefoxbrowseropening();
    }

    @Given("^Enter login credential$")
    public void enter_login_credential()  {
       Login obj1 = new Login();
       obj1.username();
       obj1.password();
    }

    @When("^click login$")
    public void click_login()  {
        Login obj1 = new Login();
        obj1.Loginbutton();
    }

    @Then("^Open Projecttracker$")
    public void open_Projecttracker()  {
        Login obj1 = new Login();
        obj1.Quit();
    }

}




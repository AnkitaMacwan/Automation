package ca.test.steps;

import ca.test.pages.LoginPage;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;


public class Login{

    LoginPage loginPage = new LoginPage(KnowsTestContext.driver);
    ConfigReader obj1 = new ConfigReader();


    @Given("^Open Browser$")
    public void open_Browser() throws IOException {
        System.setProperty("webdriver.gecko.driver" , "Drivers/geckodriver.exe");
        KnowsTestContext.driver = new FirefoxDriver();
        KnowsTestContext.driver.get(obj1.properties().getProperty("url"));
        //loginPage.clickb();
    }

    @Given("User enters username '(.*)' and password '(.*)'")
    public void enter_login_credential(String username , String password)  {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
    }

    @When("^click login$")
    public void click_login()  {
        loginPage.clickLoginBtn();
    }

    @Then("^Open Projecttracker$")
    public void open_Projecttracker()  {
        loginPage.Quit();
    }

}




package ca.test.steps;

import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSteps {


//    @Given("^this is my given statement$")
//    public void this_is_my_given_statement() {
//        System.out.println("This is my given statement");
//
//    }
//
//    @When("^this is my when statement$")
//    public void this_is_my_when_statement()  {
//        System.out.println("This is my when statement");
//
//    }
//
//    @Then("^this is my then statement$")
//    public void this_is_my_then_statement()  {
//        System.out.println("This is my then statement");
//
//    }

//    @Given("^I launch url \"([^\"]*)\"$")
//    public void i_launch_url(String url)  {
//        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.20.0-win32\\geckodriver.exe");
//        KnowsTestContext.driver = new FirefoxDriver();
//        KnowsTestContext.driver.get(url);
//    }
//
    //(.*) is to pass data from feature file so that we can use as argument
    @Given("I launch url '(.*)'")
        public void url(String url) {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.20.0-win32\\geckodriver.exe");
        KnowsTestContext.driver = new FirefoxDriver();
        KnowsTestContext.driver.get(url);
        String title = KnowsTestContext.driver.getTitle().trim();
        String expectedTitle = "ATS - Specification Information System";
        Assert.assertEquals(expectedTitle, title);

    }
   @When("Enter valid username '(.*)' and password '(.*)'")
     public void enter_valid_Username_and_Password(String username, String password)  {
        KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"modal-login-button\"]")).click();
     KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"usernameLogin\"]")).sendKeys(username);
     KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"rawPwdLogin\"]")).sendKeys(password);
     KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"btn_login\"]")).click();
     KnowsTestContext.driver.quit();
     String url =  KnowsTestContext.driver.getCurrentUrl();
     Assert.assertEquals("https://atsspec.net/indexhttps://atsspec.net/index", url);


 }




}

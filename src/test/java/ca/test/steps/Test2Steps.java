package ca.test.steps;

import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2Steps {
       // WebDriver driver;

//        @Given("^Open the Browser$")
//        public void open_the_Browser() {
//                System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.20.0-win32\\geckodriver.exe");
//                driver = new FirefoxDriver();
//                driver.get("https://atsspec.net/");
//        }
//
////        @When("^Enter valid Username and Password$")
////        public void enter_valid_Username_and_Password() {
////            boolean value = driver.findElement(By.xpath("//*[@id=\"modal-login-button\"]")).isEnabled();
////            Assert.assertTrue(value);
////                driver.findElement(By.xpath("//*[@id=\"modal-login-button\"]")).click();
////                driver.findElement(By.xpath("//*[@id=\"usernameLogin\"]")).sendKeys("Rebeca@atsspec.co");
////                driver.findElement(By.xpath("//*[@id=\"rawPwdLogin\"]")).sendKeys("Zaq12wsX");
////        }
//
//        @Then("^Click on Login Button$")
//        public void click_on_Login_Button() {
//                driver.findElement(By.xpath("//*[@id=\"btn_login\"]")).click();
//                driver.quit();

        @Given("Type the URL '(.*)'")
        public void url(String url){
            System.setProperty("webdriver.gecko.driver" , "C:\\Selenium\\geckodriver-v0.20.0-win32\\geckodriver.exe");
            KnowsTestContext.driver = new FirefoxDriver();
            KnowsTestContext.driver.get(url);
        }

        @When("Enter Credential")
        public void login() throws InterruptedException {
            KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"modal-login-button\"]")).click();
            KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"usernameLogin\"]")).sendKeys("rebeca@atsspec.co");
            KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"rawPwdLogin\"]")).sendKeys("Zaq12wsX");
            KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"btn_login\"]")).click();

            Thread.sleep(8000);
    }


        @And("Open Project Tracker")
         public void PT() throws InterruptedException {
          KnowsTestContext.driver.findElement(By.xpath("//*[@id=\"solutions_link\"]")).click();
          KnowsTestContext.driver.findElement(By.xpath("/html/body/div[4]/nav/div[2]/div/div[2]/div[4]/a[2]")).click();
          Thread.sleep(20000);
         // KnowsTestContext.driver.get("https://atsspec.net/app/crm/jobs");
            KnowsTestContext.driver.get("https://atsspec.net/app/crm/jobs");
        }
}



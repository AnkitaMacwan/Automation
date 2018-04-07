package ca.test.pages;

//store locators and respective methods

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

   public WebDriver driver;
    By username = By.id("modal-login-button"); // By = inbuilt class which has id method and we are passing the locator and saving it in to username variable
    By password = By.id("rawPwdLogin");
    By loginbutton = By.id("btn_login");

//    public LoginPage(WebDriver driver){
//        this.driver = driver;
//    }


    public void Firefoxbrowseropening() {
        System.setProperty("WebDriver.gecko.driver","C:\\Selenium\\geckodriver-v0.20.0-win32\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://atsspec.net/");

    }

    public void username() {
        driver.findElement(username).sendKeys("abc");

    }

    public void password() {
        driver.findElement(password).sendKeys("def");

    }

    public void Loginbutton(){
        driver.findElement(loginbutton).click();
    }

    public void Quit(){
        driver.quit();
    }
}

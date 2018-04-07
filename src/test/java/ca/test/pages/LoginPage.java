package ca.test.pages;

//store locators and respective methods

import ca.test.utils.CommonUtils;
import ca.test.utils.KnowsTestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    CommonUtils commonUtils = new CommonUtils();

    @FindBy(id = "modal-login-button")
    public WebElement login;

    @FindBy(id="usernameLogin")
    public WebElement username;

    @FindBy(id="rawPwdLogin")
    public WebElement password;

    @FindBy(id="btn_login")
    public WebElement loginbutton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickb(){
        commonUtils.waitForElements(login , KnowsTestContext.timeout ,KnowsTestContext.driver);
        login.click();
    }

    public void enterUserName(String user) {
        commonUtils.waitForElements(username, KnowsTestContext.timeout, KnowsTestContext.driver);
        username.sendKeys(user);

    }

    public void enterPassword(String pass) {
        commonUtils.waitForElements(password, KnowsTestContext.timeout,KnowsTestContext.driver);
        password.sendKeys(pass);

    }

    public void clickLoginBtn(){
        loginbutton.click();
    }

    public void Quit(){
        KnowsTestContext.driver.quit();
    }


}

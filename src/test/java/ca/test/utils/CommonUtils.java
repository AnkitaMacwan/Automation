package ca.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {

    public void waitForElements(WebElement e, int timeout, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver , timeout);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
}

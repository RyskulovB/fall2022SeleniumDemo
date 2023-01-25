package org.example.intro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {

//    private static WebDriver driver;

    public static void pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void JSClick(WebDriver driver, WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
    public static void scrollDown(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }
    public static void waitForElementToBeDisplayed (WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(15000)).
                until(ExpectedConditions.visibilityOf(element));
    }

}

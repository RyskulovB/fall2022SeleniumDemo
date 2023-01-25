package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumExceptions extends BaseTest {

    @Test
    public void demo1() {
        // no such element exception
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("userName1")).sendKeys("Hello World");
        Helper.pause(5000);
    }

    @Test
    public void noSuchWindowExceptionTest() {
        //noSuchWindowException
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().window("YouTube");
        Helper.pause(5000);
    }

    @Test
    public void noSuchFrameExceptionTest() {
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().frame(5);
    }

    @Test
    public void soSuchAlertExceptionTest() {
        browserHelper.openURL("https://demoqa.com/text-box");
        alertHelper.acceptAlert();
    }

    @Test
    public void invalidSelectorException() {
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("//button[@type='button'][100]"));
    }

    @Test
    public void noSuchSessionException() {
        driver.findElement(By.xpath("sfdgsdfg"));
        browserHelper.openURL("https://demoqa.com/text-box");
    }

    @Test
    public void staleElementReferenceExceptionTest() {
        browserHelper.openURL("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul/li/span/a"));
        int c = 0;
        for (WebElement e : allBrands) {
            c++;
            if (e.getText().contains("SAMSUNG")) {
                driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul/li/span/a/div/label/i)" + "[" + c + "]")).click();
//                break;
            }
        }
    }
    @Test
    public void timeOutExceptionTest() {
        browserHelper.openURL("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).click();
    }

    @Test
    public void elementNotInteractable() {
        browserHelper.openURL("https://demoqa.com/radio-button");
        driver.findElement(By.id("noRadio")).sendKeys("sfgd");
    }
    @Test
    public void elementClickInterceptedException() {
        browserHelper.openURL("https://demoqa.com/radio-button");
        driver.findElement(By.id("noRadio")).click();
    }
    @Test
    public void elementNotVisibleException() {
        browserHelper.openURL("https://demoqa.com/radio-button");
    }
    @Test
    public void noSuchAttributeException() {
        browserHelper.openURL("https://demoqa.com/text-box");
        WebElement fff = driver.findElement(By.id("userName"));
        String ddd = fff.getAttribute("fgff");
    }
    @Test
    public void ElementNotSelectableException() {
//        browserHelper.openURL();
    }

}

package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserDemo extends BaseTest {



    @Test
    public void Test1() {

        browserHelper.openURL("https://demoqa.com/browser-windows");
        WebElement newTab = driver.findElement(By.id("tabButton"));
        newTab.click();
        Helper.pause(5000);
        browserHelper.switchToWindow(1);
//        Helper.pause(3000);
        browserHelper.switchToParent();
        Helper.pause(5000);
    }


    @Test
    public void Test2() {
        browserHelper.openURL("https://www.etsy.com/");

        WebElement careersLink = driver.findElement(By.xpath("//a[@href='https://www.etsy.com/careers?ref=ftr']"));
        Helper.JSClick(driver, careersLink);
        Helper.pause(10000);
    }
    @Test
    public void Test3() {
        browserHelper.openURL("https://www.etsy.com/");

        WebElement politics = driver.findElement(By.xpath("//a[@href = 'https://www.etsy.com/legal?ref=ftr']"));
        Helper.scrollDown(driver, politics);
        politics.click();
    }

    @Test
    public void Test4() {

        browserHelper.openURL("https://www.w3schools.com/css/css_selectors.asp");

        WebElement cssSelector = driver.findElement(By.cssSelector(""));
    }

    @Test
    public void Test5() {

        browserHelper.openURL("https://nambafood.kg/?language=ru");

        WebElement cssSelector = driver.findElement(By.cssSelector("div.login"));
        cssSelector.click();
        Helper.pause(5000);
    }


}

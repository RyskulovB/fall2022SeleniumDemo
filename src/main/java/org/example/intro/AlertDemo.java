package org.example.intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDemo extends BaseTest{


    @Test
    public void testAlert () {
        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Helper.pause(5000);
    }

    @Test
    public void testExplicitWaitAlert() {
        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
        alertButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Helper.pause(5000);
    }

    @Test
    public void testConfirmBox () {
        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("confirmButton"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        WebElement expText = driver.findElement(By.id("confirmResult"));


        Assert.assertEquals(expText.getText(),"You selected Cancel");

        Helper.pause(10000);

    }

    @Test
    public void testPromptBox () {
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.xpath("//div/button[@id = 'promtButton']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        String actualText = "Bekzhan";
        alert.sendKeys(actualText);
        alert.accept();
        WebElement expText = driver.findElement(By.id("promptResult"));

        Assert.assertTrue(expText.getText().contains(actualText));

        Helper.pause(15000);

    }

}

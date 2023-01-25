package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables extends BaseTest {


    @Test
    public void testWebTable () {

        driver.navigate().to("https://demoqa.com/webtables");

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("lastName")).sendKeys("Fall");
        driver.findElement(By.id("userEmail")).sendKeys("TestFall2022@gmail.com");
        driver.findElement(By.id("age")).sendKeys("1488");
        driver.findElement(By.id("salary")).sendKeys("8888888");
        driver.findElement(By.id("department")).sendKeys("SDET");
        driver.findElement(By.id("submit")).click();

        List<WebElement> listOfWebTables = driver.findElements(By.xpath("//div[@class = 'rt-tbody']"));
        for (WebElement e : listOfWebTables) {

            System.out.println(e.getText());

        }
        Helper.pause(10000);

    }

}

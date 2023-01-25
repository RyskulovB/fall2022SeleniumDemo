package org.example.intro;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class GlovoTest extends BaseTest {

    WebDriver driver;
    Faker faker;


    @Test
    public void glovoTest() {

        driver.get("https://glovoapp.com/");

        WebElement getStarted = driver.findElement(By.xpath("(//span[@class = 'helio-button__content'])[2]"));
        getStarted.click();
        WebElement inputFirstName = driver.findElement(By.xpath("(//input[@class='el-input__inner'])[2]"));
        inputFirstName.sendKeys("Bekzhan");
        String expFirstName = inputFirstName.getText();

        WebElement inputEmail = driver.findElement(By.xpath("(//input[@class='el-input__inner'])[3]"));
        inputEmail.sendKeys("ryskulov1488@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath("(//input[@class='el-input__inner'])[4]"));
        inputPassword.sendKeys("ryskulov44R");

        WebElement clickSignUp = driver.findElement(By.xpath("(//span[@class='helio-button__content'])[7]"));
        clickSignUp.click();


    }


}

package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Etsy extends BaseTest {

    @Test
    public void etsyTest1 () {

        driver.navigate().to("https://www.etsy.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement signIn = driver.findElement(By.xpath("///button[contains(text(), 'Войти')]"));
        wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
//        signIn.click();

//        WebElement email = driver.findElement(By.id("join_neu_email_field"));
//        email.sendKeys("rsss1488@gmail.com");
//        WebElement pswrd = driver.findElement(By.id("join_neu_password_field"));
//        pswrd.sendKeys("8585858");
//        WebElement sign = driver.findElement(By.id("//button[contains(text(), 'Войти в аккаунт')]"));
//        sign.click();






    }

}

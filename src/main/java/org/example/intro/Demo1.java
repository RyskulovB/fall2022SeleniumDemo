package org.example.intro;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest {


    static Faker faker = new Faker();

    @Test
    public void testDemo1() {

        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        String name = faker.name().firstName();
        fullNameInputField.sendKeys(name);

        WebElement userEmailInputField = driver.findElement(By.id("userEmail"));
        String email = faker.internet().emailAddress();
        userEmailInputField.sendKeys(email);

        WebElement currentAddressInputField = driver.findElement(By.id("currentAddress"));
        String address = faker.address().fullAddress();
        currentAddressInputField.sendKeys(address);

        WebElement permanentAddressInputField = driver.findElement(By.id("permanentAddress"));
        String permanentAddress = faker.address().fullAddress();
        permanentAddressInputField.sendKeys(permanentAddress);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement actualNameInputField = driver.findElement(By.id("name"));
        String actualName = actualNameInputField.getText().replaceAll("Name:", "");
        Assert.assertEquals(actualName, name);
        Assert.assertTrue(actualName.contains(name));

        WebElement actualEmailInputField = driver.findElement(By.id("email"));
        String actualEmail = actualEmailInputField.getText().replaceAll("Email:", "");
        Assert.assertEquals(email,actualEmail);

//        WebElement actualCurrentAddressInputField = driver.findElement(By.cssSelector("p#currentAddress"));
        WebElement actualCurrentAddressInputField = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        String actualCurrentAddress = actualCurrentAddressInputField.getText().replaceAll("Current Address :", "");
        Assert.assertEquals(address,actualCurrentAddress);

        WebElement actualPermanentAddressInputField = driver.findElement(By.cssSelector("p#permanentAddress"));
        String actualPermanentAddress = actualPermanentAddressInputField.getText().replaceAll("Permananet Address :","");
        Assert.assertEquals(permanentAddress, actualPermanentAddress);

//        WebElement expectedNameInputField = driver.findElement(By.cssSelector("#userName"));
//        String expName = expectedNameInputField.getText();
//        Assert.assertEquals(fullNameInputField.getText(), fullNameInputField1.getText());


    }
}
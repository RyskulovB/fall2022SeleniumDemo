package org.example.intro;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest {

    @Test
    public void testRadioButton () {
        driver.get("https://demoqa.com/radio-button");

        WebElement yesRadio = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
        yesRadio.click();

        Assert.assertTrue(yesRadio.isEnabled());
    }

    @Test
    public void commands () {

        driver.get("https://demoqa.com/checkbox");

        WebElement cmmnd = driver.findElement(By.xpath("(//button[@title = 'Toggle'])[1]"));
        cmmnd.click();
        WebElement cmmnd2 = driver.findElement(By.xpath("(//button[@title = 'Toggle'])[2]"));
        cmmnd2.click();
        WebElement cmnd3 = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]"));
        cmnd3.click();
        Assert.assertTrue(cmnd3.isEnabled());

    }

    @Test
    public void testRightAndDoubleClick () {
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();
        Helper.pause(3000);
        Assert.assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(), "You have done a double click");

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform();
        Helper.pause(3000);
        Assert.assertEquals(driver.findElement(By.id("rightClickMessage")).getText(), "You have done a right click");

        WebElement clickMe = driver.findElement(By.xpath(".//button[text()='Click Me']"));
        actions.click(clickMe).perform();
        Helper.pause(3000);
        WebElement clickMessage = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertEquals(clickMessage.getText(), "You have done a dynamic click");

//        WebElement downloadBtn = driver.findElement(By.id("downloadButton"));
    }

    @Test
    public void TestMove () {
        driver.get("https://www.imoving.com/");

        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));

        Select select = new Select(houseTypeSelectMenu);
        select.selectByValue("1080");
        Helper.pause(3000);
        select.selectByVisibleText("My Apartment");
        Helper.pause(3000);
        select.selectByIndex(1);
        Helper.pause(3000);

    }





}

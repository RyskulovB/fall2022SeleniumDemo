package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Moving extends BaseTest {

    @Test
    public void test1 () {

        driver.get("https://www.imoving.com/");

        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSelectMenu);
        select.selectByVisibleText("My Apartment");


        WebElement moveSizeTypeSelectMenu = driver.findElement(By.id("hp-nav-select-house"));
        Select selectMS = new Select(moveSizeTypeSelectMenu);
        selectMS.selectByVisibleText("Just a few Items");

        WebElement compare = driver.findElement(By.xpath(" //div/button[@class = 'btn btn-white quickQuoteLink']"));
        compare.click();
        WebElement cont = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/a[2]/span[1]"));
        cont.click();
//        WebElement saveAndContinue = driver.findElement(By.xpath("//div/button[@id='closeSaveModal']"));
//        saveAndContinue.click();
        Helper.pause(2000);
        WebElement gotIt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/a"));
        gotIt.click();
//        Helper.pause(4000);
        WebElement ok = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/section[1]/div/a[1]"));
        ok.click();

        WebElement dresser = driver.findElement(By.xpath("(//div[@class = 'item'])[1]"));
        WebElement dresserDrop = driver.findElement(By.xpath("//div/a[@class = 'btn btn-blue'][1]"));
        dresserDrop.click();
        WebElement addMoreDresser = driver.findElement(By.xpath("(//button[@class = 'quantity-plus'])[1]"));
        addMoreDresser.click();


        Actions bed = new Actions(driver);
        WebElement bed1 = driver.findElement(By.xpath("(//div[@class = 'item'])[1]"));
        bed.moveToElement(bed1).perform();
        WebElement bedDrop = driver.findElement(By.xpath("(//a[@class = 'btn btn-blue'])[1]"));
        bedDrop.click();
        WebElement addMoreBed = driver.findElement(By.xpath("(//button[@class = 'quantity-plus'])[3]"));
//        bed.doubleClick(addMoreBed).perform();
        addMoreBed.click();
        addMoreBed.click();



        Actions tv = new Actions(driver);
        WebElement tv1 = driver.findElement(By.xpath("(//div[@class = 'item'])[1]"));
        tv.moveToElement(tv1).perform();
        WebElement tvDrop = driver.findElement(By.xpath("(//a[@class = 'btn btn-blue'])[1]"));
        tvDrop.click();
        WebElement addMoreTv = driver.findElement(By.xpath("(//button[@class = 'quantity-plus'])[5]"));
        addMoreTv.click();
        addMoreTv.click();
        addMoreTv.click();



        WebElement expectedItems = driver.findElement(By.xpath("//span[@class='room-counter']"));
        String exp = expectedItems.getText();
        Assert.assertEquals(exp, "9 items");

        WebElement strelochka = driver.findElement(By.xpath("(//div[@class = 'arrowOpenRightNavigation leftArrowNavi'])[2]"));
        strelochka.click();

        WebElement dd = driver.findElement(By.xpath("(//span[@class = 'roomPanelIcon quantity-plus1'])[1]"));
        dd.click();

        WebElement dresserAssert = driver.findElement(By.xpath("//h3[text() = 'Dresser']"));
        Assert.assertEquals(dresserAssert.getText(),"Dresser");

//        WebElement


        Helper.pause(10000);








    }

}

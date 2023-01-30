package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDemo extends BaseTest {

    @Test
    public void selectTest () {

        driver.navigate().to("https://demoqa.com/select-menu");
        WebElement selectOption = driver.findElement(By.xpath("(//div[@class = ' css-tlfecz-indicatorContainer'])[1]"));
        selectOption.click();

        Select select = new Select(selectOption);
        select.selectByIndex(1);
        Helper.pause(5000);

    }

}

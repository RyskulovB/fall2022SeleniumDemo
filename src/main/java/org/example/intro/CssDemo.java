package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class CssDemo extends BaseTest {


    @Test
    public void cssTest1 ()  {

        driver.get("https://www.amazon.com/");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);


        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul/li/span/a"));
        int c = 0;
        for (WebElement e : allBrands) {
            c++;

            if (e.getText().contains("SAMSUNG")) {
                driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul/li/span/a/div/label/i)" + "[" + c + "]")).click();
                break;
            }

            }


        }


    }

package org.example.intro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadDownloadDemo extends BaseTest {

    @Test
    public void test1() {
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("/Users/bekzhanr./Desktop/PrqCxoNU.jpeg");
        driver.findElement(By.xpath("//div/a[@id = 'downloadButton']")).click();
        Helper.pause(10000);


    }
}

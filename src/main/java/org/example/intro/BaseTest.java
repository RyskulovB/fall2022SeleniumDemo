package org.example.intro;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {

    WebDriver driver;
    Faker faker;
    BrowserHelper browserHelper;
    AlertHelper alertHelper;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // подключили браузер хром
        driver = new ChromeDriver(); // создали экземпляр
        driver.manage().window().maximize(); // развернули на полный экран страницу браузера
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // если в течении 20 секунд не откроется то выдаст ошибку
        browserHelper = new BrowserHelper(driver);
        alertHelper = new AlertHelper(driver);
    }

    @AfterClass
    public void close() {
        driver.close();
        driver.quit();
    }


}

package mpack;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ThirdTest {
    @Test
    public void mOne() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://medium.com/");
        Assert.assertEquals(driver.findElement(By.cssSelector("div#root > div > div:nth-of-type(4) > div > div > div > div > div > h2")).getText(), "Trending on Medium");

        driver.close();

    }
}


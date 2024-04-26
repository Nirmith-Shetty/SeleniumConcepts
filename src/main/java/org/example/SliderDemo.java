package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        // initialize and launching the firefox/chrome application
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/horizontal_slider");

        WebElement sliderPosition= driver.findElement(By.xpath("//input[@min='0.0']"));

        Actions actions = new Actions(driver);

//        actions.clickAndHold(sliderPosition)
//                .pause(1000)
//                .sendKeys(Keys.ARROW_RIGHT)
//                .pause(1000)
//                .sendKeys(Keys.ARROW_RIGHT)
//                .pause(2000)
//                .sendKeys(Keys.ARROW_LEFT)
//                .perform();


        actions.click(sliderPosition).moveByOffset(50,0)
                .pause(1000)
                .perform();


//        driver.get("https://www.bigw.com.au");
//
//        driver.manage().window().maximize();
//
//        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("watches");
//        driver.findElement(By.xpath("//button[@type='submit' and @aria-label='search']")).click();
//        driver.findElement(By.xpath("//button[@aria-label='Price']")).click();
//
//        Actions actions = new Actions(driver);
//        actions.click(driver.findElement(By.xpath("//div[@role='slider' and @aria-label='Adjust price range to 1099']")))
//                .sendKeys(Keys.ARROW_LEFT)
//                .perform();

    }
}

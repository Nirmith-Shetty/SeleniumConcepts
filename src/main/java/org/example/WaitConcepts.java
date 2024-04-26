package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitConcepts {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // initialize and launching the firefox/chrome application
        WebDriver driver = new ChromeDriver();

        //implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//        driver.get("https://www.irctc.co.in/");
//        System.out.println(driver.findElement(By.xpath("//label[text()=' BOOK TICKET ']")).isDisplayed());

        driver.manage().window().maximize();

        driver.get("https://www.irctc.co.in/");


        //initializing webdriver wait and putting explicit wait condition
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.tagName("a")," LOGIN "));


        System.out.println(driver.findElement(By.xpath("(//img[@alt='IRCTC Logo'])[3]")).isDisplayed());


    }
}

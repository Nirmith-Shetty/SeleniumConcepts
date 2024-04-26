package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        // initialize and launching the firefox/chrome application
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");

        //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.findElement(By.id("prompt")).click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("nirmith");



        //System.out.println(driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).isDisplayed());
        //System.out.println(driver.findElement(By.xpath("//p[text()='You entered: Hello']")).isDisplayed());


    }
}

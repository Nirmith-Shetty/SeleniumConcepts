package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://the-internet.herokuapp.com/context_menu");
//
//        Actions actions = new Actions(driver);
//        //Right Click
//        actions.moveToElement(driver.findElement(By.id("hot-spot")))
//                .contextClick().perform();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        String title=driver.getTitle();
//        System.out.println(title);

        System.out.println(driver.getTitle());

        //hack to wait for certain time after page load
        Thread.sleep(10000); //10 seconds

        //findElement and //findElements

        //Enter username
        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys("Admin");


        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(By.name("username"))).perform();
    }
}

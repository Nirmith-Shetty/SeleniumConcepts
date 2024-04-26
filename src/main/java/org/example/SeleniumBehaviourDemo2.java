package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBehaviourDemo2 {

    public static void main(String[] args) throws InterruptedException {


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


        //Enter Password
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //click on Login button
        WebElement loginButton=driver.findElement(By.tagName("button"));
        loginButton.click();
















    }
}

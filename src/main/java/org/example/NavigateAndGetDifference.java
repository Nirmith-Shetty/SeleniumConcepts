package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGetDifference {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //there are default waiting period configured - 5-8 seconds to load the page
        //driver.get("https://www.saucedemo.com/v1/index.html");


        //No page load wait handled
        //It gives more capability to move forward and backward. This is basically saving the previous pages
        driver.navigate().to("https://www.amazon.in/");
        driver.findElement(By.linkText("Mobiles")).click();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();







    }


}

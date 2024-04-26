package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        // initialize and launching the firefox/chrome application
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.irctc.co.in/");

        //scroll directly to the bottom of the page
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //scroll to top of the page - Check this implementation
        //js.executeScript("window.scrollBy(0,0)");

        //Scroll till the element is visible

        WebElement international_packages_label=driver.findElement(By.xpath("//h3[text()='International Packages']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", international_packages_label);




    }
}

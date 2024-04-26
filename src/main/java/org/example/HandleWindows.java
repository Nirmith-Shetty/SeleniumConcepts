package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleWindows {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        // initialize and launching the firefox/chrome application
        WebDriver driver = new ChromeDriver();


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String parentWindow=driver.getWindowHandle();

        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
        driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();


        Set<String> windows=driver.getWindowHandles();


        for(String window:windows){

            if(!window.equalsIgnoreCase(parentWindow)){
                driver.switchTo().window(window);
               if(driver.getTitle().contains("Facebook")){
                   break;
               }
            }
        }

        driver.findElement(By.xpath("//div[@aria-label='Close']")).click();
        driver.switchTo().window(parentWindow);







    }



}

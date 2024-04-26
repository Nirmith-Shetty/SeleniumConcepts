package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/hovers");

        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]")))
                .click(driver.findElement(By.xpath("//a[@href='/users/1']")))
                .perform();




        //System.out.println(driver.findElement(By.xpath("//h5[text()='name: user1']")).isDisplayed());



//        driver.get("https://www.amazon.in/");
//
//
//        //Initialize actions object
//        //Syntax:
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.id("nav-link-amazonprime"))).perform();





    }

}

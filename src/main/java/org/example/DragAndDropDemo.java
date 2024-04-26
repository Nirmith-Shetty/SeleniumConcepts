package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // initialize and launching the firefox/chrome application
        WebDriver driver = new ChromeDriver();

//        driver.get("http://the-internet.herokuapp.com/drag_and_drop");
//
//        WebElement source=driver.findElement(By.id("column-a"));
//        WebElement target=driver.findElement(By.id("column-b"));
//
//
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(source,target).perform();

        //actions.clickAndHold(source).moveToElement(target).release().perform();



        driver.get("https://marcojakob.github.io/dart-dnd/basic/");

        WebElement source1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
        WebElement source2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
        WebElement source3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
        WebElement source4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));


        WebElement target=driver.findElement(By.xpath("//div[@class='trash']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source1,target)
                .pause(1000)
                .dragAndDrop(source2,target)
                .pause(1000)
                .dragAndDrop(source3,target)
                .pause(1000)
                .dragAndDrop(source4,target)
                .perform();


    }
}

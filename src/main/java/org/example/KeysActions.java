package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysActions {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        // initialize and launching the firefox/chrome application
        WebDriver driver = new ChromeDriver();


       driver.get("https://www.google.co.in/");

        WebElement searchBar= driver.findElement(By.id("APjFqb"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT)
                .sendKeys(searchBar,"selenium")
                .release()
                .perform();



    }
}

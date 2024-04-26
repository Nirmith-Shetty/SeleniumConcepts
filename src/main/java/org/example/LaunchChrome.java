package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(String[] args) {

        //Will handle downloading chrome/firefox exe files
        WebDriverManager.chromedriver().setup();

        // initialize and launching the firefox/chrome application
        WebDriver driver = new ChromeDriver();

        //To navigate to the website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //maximise the window
        driver.manage().window().maximize();

    }
}
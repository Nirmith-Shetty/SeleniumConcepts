package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DropDownExample2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");


        driver.findElement(By.linkText("Mobiles")).click();


        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Mobiles & Accessories, You are currently on a drop-down. To open this drop-down, Press Enter.']")))
                .build()
                .perform();

        Thread.sleep(5000);
        actions.click(driver.findElement(By.linkText("Power Banks"))).build().perform();

        //System.out.println(driver.findElement(By.id("multiasins-img-link")).isDisplayed());

        driver.quit();


//        WebElement amazonCategoryDropDown = driver.findElement(By.id("searchDropdownBox"));
//        Select select = new Select(amazonCategoryDropDown);
//        select.selectByVisibleText("Prime Video");



    }

}

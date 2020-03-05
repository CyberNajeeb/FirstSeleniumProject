package com.cbt.tests.warmUp;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //WebDriver driver = new ChromeDriver();

        String searchItem = "office chair";
        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem, Keys.ENTER);

        Thread.sleep(3000);

        System.out.println("title ends with search term " + driver.getTitle().endsWith(searchItem));
        Thread.sleep(3000);
        if (driver.getTitle().contains(searchItem)){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }
    }
}

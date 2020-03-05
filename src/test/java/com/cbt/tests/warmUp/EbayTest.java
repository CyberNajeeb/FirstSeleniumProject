package com.cbt.tests.warmUp;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTest {
    public static void main(String[] args) {
        BrowserFactory.getDriver("chrome");
        WebDriver driver = new ChromeDriver();

        String searchItem = "office chair";
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys(searchItem, Keys.ENTER);
        System.out.println(driver.findElement(By.className("srp-controls__count-heading")).getText());
        System.out.println("title contains search term = "+driver.getTitle().contains(searchItem));

    }
}

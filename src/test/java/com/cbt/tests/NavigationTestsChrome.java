package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTestsChrome {
    public static void main(String[] args) throws InterruptedException {
        BrowserFactory.getDriver("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String googlePageTitle = driver.getTitle();
        Thread.sleep(2000);

        driver.get("http://etsy.com");
        String etsyPageTitle = driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();

        StringUtility.verifyEquals(googlePageTitle, driver.getTitle());

        driver.navigate().forward();

        StringUtility.verifyEquals(etsyPageTitle, driver.getTitle());

        Thread.sleep(2000);
        driver.quit();


    }
}

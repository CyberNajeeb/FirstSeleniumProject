package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTestsFireFox {
    public static void main(String[] args) throws InterruptedException {
        BrowserFactory.getDriver("firefox");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");
        String googlePageTitle = driver.getTitle();

        driver.get("http://etsy.com");
        String etsyPageTitle = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(), googlePageTitle);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), etsyPageTitle);

        Thread.sleep(2000);
        driver.quit();
    }
}

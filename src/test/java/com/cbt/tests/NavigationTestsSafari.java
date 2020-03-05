package com.cbt.tests;

import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationTestsSafari {
    public static void main(String[] args) throws InterruptedException {

        //BrowserFactory.getDriver("safari");
        WebDriver driver = new SafariDriver();
        driver.get("http://google.com");
        String googleSafariPageTitle = driver.getTitle();
        Thread.sleep(2000);

        driver.get("http://etsy.com");
        String etsySafariPageTitle = driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();

        StringUtility.verifyEquals(driver.getTitle(), googleSafariPageTitle);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(), etsySafariPageTitle);

        Thread.sleep(2000);
        driver.quit();


    }
}

package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NavigationTestsIE {
    public static void main(String[] args) throws InterruptedException {
        //BrowserFactory.getDriver("edge");
        EdgeDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
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

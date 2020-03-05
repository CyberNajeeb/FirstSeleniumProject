package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        BrowserFactory.getDriver("chrome");
        WebDriver driver = new ChromeDriver();

        for (String webSites : urls) {
            driver.get(webSites);
            System.out.println(driver.getTitle().equals(driver.getTitle()));
            Thread.sleep(2000);
            System.out.println("url starts with "+driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com"));
        }
        driver.quit();
    }
}

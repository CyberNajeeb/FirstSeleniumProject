package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        titleVerification2();
    }

    public static void titleVerification2() throws InterruptedException {
        List<String> urls = Arrays.asList("https://wayfair.com/", "https://luluandgeorgia.com",
                "https://walmart.com", "https://westelm.com/");

        BrowserFactory.getDriver("chrome");
        driver = new ChromeDriver();

            for (String url : urls) {

                driver.get(url);
                Thread.sleep(500);
                String[] title = driver.getTitle().toLowerCase().split(" ");
                System.out.println("title = " + Arrays.toString(title));

                if (driver.getCurrentUrl().contains(title[0])) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
            }
        }
        driver.close();
    }
}
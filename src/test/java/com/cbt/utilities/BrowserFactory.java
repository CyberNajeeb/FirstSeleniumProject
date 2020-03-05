package com.cbt.utilities;

import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browserName) {
        if (browserName.equalsIgnoreCase(System.getProperty("browserName.name"))) {
            //browserName = System.getProperty("browserName.name"); }
            return null;
        } else
            if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("edge")){
                EdgeDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }else
            WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
        //return System.getProperty("os.name");

    }
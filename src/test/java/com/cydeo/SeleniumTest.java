package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1-setting up web driver manager
        WebDriverManager.chromedriver().setup();

        // 2 -Create Instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

    }

}

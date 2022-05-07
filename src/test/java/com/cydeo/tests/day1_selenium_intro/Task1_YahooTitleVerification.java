package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        /*
        TC #1: Yahoo title Verification
        1. Open Chrome browser
        2. Go to https://www.yahoo.com
        3. Verify title:
        Expected: Yahoo UK | News, email and search
         */

        // do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //Make our page fullscreen
        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        WebElement cookiesButton = driver.findElement(By.name("agree"));
        cookiesButton.click();

        Thread.sleep(2000);


        //3. Verify title
        // Expected: Yahoo UK | News, email and search
        String expectedTitle = "Yahoo UK | News, email and search";

        // actual title comes from the browser
        String actualTitle = driver.getTitle();


        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is NOT as expected. Verification FAILED!");
        }

        driver.close();






    }




}

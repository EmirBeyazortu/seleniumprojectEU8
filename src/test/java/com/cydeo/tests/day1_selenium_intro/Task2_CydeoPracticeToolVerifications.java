package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CydeoPracticeToolVerifications {

    /*
    TC#1: Cydeo practice tool verifications
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com
        3. Verify URL contains
            Expected: cydeo
        4. Verify title:
            Expected: Practice
     */


    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.get("https://practice.cydeo.com");

        String expectedURL = "cydeo";

        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("URL is as expected. Verification PASSED!");
        }else{
            System.out.println("URL is NOT as expected. Verification FAILED!");
        }

        driver.close();





    }


}

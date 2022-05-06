package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    public static void main(String[] args) throws InterruptedException{
//        TC #3: Back and forth na
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com
        driver.navigate().to("https://www.google.com");
        Thread.sleep(1000);
        WebElement acceptButton = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        acceptButton.click();
//        3- Click to Gmail from top right.

        WebElement GmailLink = driver.findElement(By.linkText("Gmail"));
        GmailLink.click();

//        4- Verify title contains:

        String expectedResult ="Gmail";
        String actualResult = driver.getTitle();

        if(actualResult.contains(expectedResult)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

//        Expected: Gmail
//        5- Go back to Google by using the .back();
        Thread.sleep(2000);
        driver.navigate().back();

//        6- Verify title equals:
//        Expected: Google

        expectedResult= "Google";
        actualResult = driver.getTitle();
        if(actualResult.equals(expectedResult)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        driver.close();
    }
}




package com.cydeo.tests.day2_locators_getText_getAttribute.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

    public static void main(String[] args) throws InterruptedException {

        //TC #3: Back and forth navigation
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        // Handle the cookies problem
        Thread.sleep(2000);
        WebElement acceptButton = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        acceptButton.click();

        //3- Click to Gmail from top right.
        WebElement gmailText = driver.findElement(By.className("gb_d"));
        gmailText.click();

        Thread.sleep(2000);

        //4- Verify title contains:
        // Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification task PASSED!");
        }else{
            System.out.println("Title verification task FAILED!!!");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google

        expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification task PASSED!");
        }else{
            System.out.println("Title verification task FAILED!!!");
        }


        driver.close();



    }



}

package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the driver
        // This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // This line will maximize the browser
        driver.manage().window().maximize();

        // maximize the screen on Mac computers
        //driver.manage().window().fullscreen();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // get the title of the page
       String currentTitle = driver.getTitle();
       System.out.println("currentTitle = " + currentTitle);


        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to():
        driver.navigate().to("https://www.google.com");
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL using Selenium
        String currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        // this will close the currently opened window
        driver.close();

        // this will close all the opened windows
        driver.quit();


    }

}

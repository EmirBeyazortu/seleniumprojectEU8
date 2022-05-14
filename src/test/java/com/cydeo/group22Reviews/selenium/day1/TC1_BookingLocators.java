package com.cydeo.group22Reviews.selenium.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_BookingLocators {

    public static void main(String[] args) {

        /*  TC#1 [Booking.com](http://Booking.com) Locators - CSS Selector & XPath
            Create a sub-package named ‘group22Reviews’ under the ‘cydeo’ package.
            Create a sub-package named ‘selenium’ under the ‘group22Reviews’ sub-package.
            Create a class named TC1_BookingLocators under the selenium sub-package.
            1- Open a chrome browser`
            2- Go to: https://www.booking.com/`
            3- Locate the Search Box of the Booking.com
            4- Write "Paris" in search box`
            5- PRESS ENTER using Keys.ENTER`
            6- Verify title:`
                Expected: Title should start with "Booking.com : Hotels in Paris . Book your hotel now!" word`
                Not:- In order to locate the search box web element please use the 'xpath' as a locator type.`
         */


        //1- Open a chrome browser
            // In order to use the chrome web browser first we have to add chromedriver() and setup() methods.
            // WebDriverManager is a class that allows us to use methods

        WebDriverManager.chromedriver().setup();

            // We are creating an object for the ChromeDriver Class by calling this ChromeDriver() constructor
            // We are creating a ChromeDriver Instance and storing it in a variable called 'driver', which is of type 'WebDriver' interface
            // This code opens the Chrome Browser

        WebDriver driver = new ChromeDriver();

            //in order to reach full-screen, we need to use these methods.

        driver.manage().window().maximize();

        //2- Go to: https://www.booking.com/`

        driver.get("https://www.booking.com");

        // 3- Locate the Search Box of the Booking.com
            // "//tagname[@attributename='attributevalue']"   xpath syntax
            // "tagname[attributename='attributevalue']"   css selector syntax

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='ss']"));

        //4- Write "Paris" in search box`
        //5- PRESS ENTER using Keys.ENTER`

        searchBox.sendKeys("Paris" + Keys.ENTER);


        //6- Verify title:`
            // Expected: Title should start with "Booking.com : Hotels in Paris . Book your hotel now!" word`

        String expectedTitle = "Booking.com : Hotels in Paris . Book your hotel now!";
        String actualTitle = driver.getTitle();

        // Create an if statement to verify expected result.
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }



    }





}

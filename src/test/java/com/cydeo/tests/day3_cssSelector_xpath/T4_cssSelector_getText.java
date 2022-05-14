package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(). getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify "Reset password" button text is as expected:
        //Expected: Reset password
        WebElement resetButton = driver.findElement(By.cssSelector("button[class='login-btn']"));


        String expectedResetButtonText = "Reset password";
        String actualResetButtonText = resetButton.getText();

        if(actualResetButtonText.equals(expectedResetButtonText)){
            System.out.println("Reset Button Text Verification PASSED!");
        }else{
            System.out.println("Reset Button Text Verification FAILED!!!");
        }

        driver.close();








    }
}

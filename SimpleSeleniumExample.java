package com.kgisl.web.servlet;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleSeleniumExample {
    public static void main(String[] args) {
       

        // Automatically set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a web page
        driver.get("https://talentx.kgisl.com/");

     WebElement dropdownElement = driver.findElement(By.id("CompanyId"));

            // Create an instance of the Select class
         Select dropdown = new Select(dropdownElement);

         dropdown.selectByValue("7");

           WebElement usernameField = driver.findElement(By.id("Username"));
            usernameField.sendKeys("dharsan.b");

         
            WebElement passwordField = driver.findElement(By.id("Password"));
            passwordField.sendKeys("Kgisl@12345");

           
        
            // Locate the login button and click it
            WebElement loginButton = driver.findElement(By.id("btnLogin"));
            loginButton.click();

    
           WebElement calendar = driver.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[2]/a"));
           calendar.click();
           driver.manage().timeouts();

        
     

       
    }
}

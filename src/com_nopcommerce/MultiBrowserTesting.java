package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;
    static String browser = "FireFox";

    public static void main(String[] args) {
        //condition for check web browser its depends on user choice
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("FireFox"))
        {
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else{
            System.out.println("Enter valid browser");
        }
        driver.get(baseUrl); //open url
        System.out.println("Title of Webpage is : " + driver.getTitle());//print title of the website
        System.out.println("Current URL of webpage is : " + driver.getCurrentUrl());//print current url of webpage
        System.out.println("Source code of current webpage is : " + driver.getPageSource());//print source code of webpage
        driver.findElement(By.id("Email")).sendKeys("aesha123@gmail.com");//it will enter email id in email field
        driver.findElement(By.name("Password")).sendKeys("aesha12345");//it will enter password in password field
        driver.close(); //it will close the browser
    }
}

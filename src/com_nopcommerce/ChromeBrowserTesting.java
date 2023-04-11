package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        WebDriver driver = new ChromeDriver(); // launch Chrome browser
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F"); //open url
        System.out.println("Title of Website is : " + driver.getTitle()); //print title of the website
        System.out.println("URL of current webpage is : " +driver.getCurrentUrl()); //print current url of webpage
        System.out.println("Source code of webpage : " +driver.getPageSource()); //print source code of webpage
        driver.findElement(By.id("Email")).sendKeys("Aesha123@gmail.com"); //it will enter email id in email field
        driver.findElement(By.id("Password")).sendKeys("Abcde12345"); //it will enter password in password field
        driver.close(); //it will close browser
    }
}

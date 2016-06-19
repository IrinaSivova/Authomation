package com.qatestlab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;


/**
 * Created by Irina on 14.02.2016.
 */
    public class SampleTest {
    WebDriver driver;

    @BeforeClass
        public void setUp() {
        driver = new FirefoxDriver();}

    @Test
    public void test () throws InterruptedException {
        log("Open main page");
        driver.get("http://prestashop.qatestlab.com.ua/en/");
        log("Find the Logo");
        try {
            WebElement element = driver.findElement(By.className("logo"));
            } catch (NoSuchElementException e) {
                log("No such element");
                 }
           }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private void log (String message) {
        Reporter.log(new Date().toString() + "\t" + message + "\n");
    }
}


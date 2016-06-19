package com.qatestlab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;


/**
 * Created by Irina on 14.02.2016.
 */
public class Count {
    WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();}

    @Test
    public void test () throws InterruptedException {
        log("Open main page");
        driver.get("http://prestashop.qatestlab.com.ua/en/");
        log("Count the elements");
        int i = driver.findElements(By.xpath(".//*[@id='homefeatured']/li/div/div/div/a/img")).size();
        Assert.assertEquals (i, 8, "Quontity of elements doesn't match 8");
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private void log (String message) {
        Reporter.log(new Date().toString() + "\t" + message + "\n");
    }
}

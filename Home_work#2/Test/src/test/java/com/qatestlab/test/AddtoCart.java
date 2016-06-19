package com.qatestlab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Irina on 12.06.2016.
 */
public class AddtoCart {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test () throws InterruptedException {
        log("Open main page");
        driver.get("http://prestashop.qatestlab.com.ua/en/");
        log("Find any good");
        driver.findElement(By.xpath(".//*[@id='homefeatured']/li/div/div/h5/a")).click();
        log("Find the quantity field");
        driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).clear();
        driver.findElement(By.xpath(".//*[@id='quantity_wanted']")).sendKeys("4");
        log("Add to the cart");
        driver.findElement(By.id("add_to_cart")).click();
        log("Get the quantity");
        String quantity = driver.findElement(By.className("ajax_cart_quantity")).getText();
        log("Compare the quantity");
        Assert.assertEquals(quantity,"4","Quantity doesn't matches");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private void log (String message) {
        Reporter.log(new Date().toString() + "\t" + message + "\n");
    }


}

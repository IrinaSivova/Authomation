package com.qatestlab.test;

/**
 * Created by Irina on 14.02.2016.
 */
    public class SampleTest {
    WebDriver driver;

    @BeforeClass
        public void setUp() {
        driver = new Firefoxdriver();}

    @Test
    public void test () throws InterruptedException {
        log("Open main page");
        driver.get("http://qatestlab.com");
        log("Click 'Estimation in 1 minute' button");
        driver.findElement (By.xpath("//a[contains(@class,'header-button') and contains (@class, 'estimation')]")).click();

        Thread.sleep(5000);

        log("Type name");
        driver.findElement (By.name("field name")).sendKeys("....");
        log("Type mail");
        driver.findElement (By.name("field name")).sendKeys("....");
        log("Type country");
        driver.findElement (By.name("field name")).sendKeys("....");

        log("Get page title");
        String pageTitle=driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(pageTitle, ".....","Unexpected page title");
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


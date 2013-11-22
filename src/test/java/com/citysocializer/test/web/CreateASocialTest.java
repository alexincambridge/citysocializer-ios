package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: alexg
 * Date: 21/11/2013
 * Time: 22:44
 * To change this template use File | Settings | File Templates.
 */

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class CreateASocialTest {


    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        //driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        baseUrl = "https://smoke.citysocializer.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



    @Test
    public void SocialTest() throws Exception {
        driver.get(baseUrl + "");
        driver.findElement(By.xpath("//*[@id='already']/a")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("agranada69@hotmail.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@id='login_form']/button")).click();
        driver.findElement(By.xpath("//div[@id='social_list']/div")).click();
        driver.findElement(By.xpath("//*[@id='main_nav_ul']/li[6]/a")).click();
        //driver.findElement(By.id("confirm_venue_later")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("Wine and Chocolate Night");
        driver.findElement(By.cssSelector("section.tags-section > #tags_input > li.tagit-new > input.tagit-input.ui-autocomplete-input")).click();
        driver.findElement(By.cssSelector("section.tags-section > #tags_input > li.tagit-new > input.tagit-input.ui-autocomplete-input")).click();
        driver.findElement(By.cssSelector("section.tags-section > #tags_input > li.tagit-new > input.tagit-input.ui-autocomplete-input")).clear();
        driver.findElement(By.cssSelector("section.tags-section > #tags_input > li.tagit-new > input.tagit-input.ui-autocomplete-input")).sendKeys("Chocolate Con Churros");
        driver.findElement(By.id("create_social_img_placeholder")).click();
        driver.findElement(By.id("create_social_img_placeholder")).click();
        driver.findElement(By.id("show_create_social_img_picker")).click();
        driver.findElement(By.xpath("//div[@id='create_social_img_picker']/div[2]/div")).click();
        driver.findElement(By.id("create_social_basics")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("description")).click();
        driver.findElement(By.name("description")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("Wellcome to the new host I hope that we can have a nice host event toguether");
        driver.findElement(By.id("venue_name")).click();
        //driver.findElement(By.id("venue_name")).clear();
        driver.findElement(By.id("venue_name")).sendKeys("Old St Labs, 43-45 Portman Square, London, W1H 6HN");
        //driver.findElement(By.id("dp1383819187146")).click();
        //Thread.sleep(3000);
        driver.findElement(By.name("to_be_confirmed")).click();
        Thread.sleep(3000);

        //*[@id="datepicker"]/div/table/tbody/tr[4]/td[2]/a
	    /*
	    driver.findElement(By.name("date")).click();
	    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")).click();

	    //driver.findElement(By.xpath("//*[@id='dp1383830808702']")).click();
	    //driver.findElement(By.name("date")).sendKeys("14/11/2013");
	    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")).click();
	    //driver.findElement(By.xpath("//*[@id='dp1383830808702']")).click();
	     */
        driver.findElement(By.cssSelector("#create_social_button > button.button.orange")).click();


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}

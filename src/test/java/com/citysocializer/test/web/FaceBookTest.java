package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: alexg
 * Date: 21/11/2013
 * Time: 22:28
 * To change this template use File | Settings | File Templates.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

import java.util.List;


import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;



import com.citysocializer.test.web.uicomponent.LoginFaceBook;
import com.citysocializer.test.web.uicomponent.MainPage;


public class FaceBookTest {

    LoginFaceBook LoginFacebook;
    WebDriver driver;
    MainPage MainPage;


    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();

    }

    @Test

    public void testFaceLogin() throws InterruptedException {


        //Test the right page
        driver.get("https://smoke.citysocializer.com/login");
        MainPage = PageFactory.initElements(driver, MainPage.class);
        MainPage.clickFaceLoginButton();
        Thread.sleep(3000);

        //driver.switchTo().alert();
        //String url = driver.getCurrentUrl();
        //assertEquals("https://smoke.citysocializer.com/login", url );

    }



    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }



    @After
    public void tearDown() throws Exception {

        driver.quit();
    }

}

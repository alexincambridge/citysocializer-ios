package com.citysocializer.test.web;


import com.citysocializer.test.web.uicomponent.LoginPage;
import com.citysocializer.test.web.uicomponent.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class LoginPageTest {

    WebDriver driver;
    MainPage Mainpage;
    LoginPage LoginPage;

    @Before
    public void setUp() throws Exception {


        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);




    }

    @Test
    public void testLogin() throws InterruptedException {


        //Test the right page
        driver.get("https://staging.citysocializer.com");
        Mainpage = PageFactory.initElements(driver, MainPage.class);
        Mainpage.clickLoginButton();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        assertEquals("https://staging.citysocializer.com/login", url );


        //Test LoginPage
        LoginPage = PageFactory.initElements(driver, LoginPage.class);
        LoginPage.enterEmail("agranada69@hotmail.com");
        LoginPage.enterPassword("12345");
        LoginPage.clickButtonLoginMe();
        Thread.sleep(5000);
        LoginPage.clickUserMenu();
        LoginPage.clickLogout();



    }

    @Test
    public void testLogin2() throws InterruptedException {


    }





    @Test
    public void testLogin4() throws InterruptedException {


    }








        @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}

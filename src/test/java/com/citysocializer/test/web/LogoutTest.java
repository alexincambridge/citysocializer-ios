package com.citysocializer.test.web;

/**
 * Created with IntelliJ IDEA.
 * User: alexg
 * Date: 21/11/2013
 * Time: 22:41
 * To change this template use File | Settings | File Templates.
 */


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.citysocializer.test.web.uicomponent.MainPage;
import com.citysocializer.test.web.uicomponent.LoginPage;

public class LogoutTest {

    WebDriver driver;
    MainPage MainPage;
    LoginPage LoginPage;

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();


    }

    @Test
    public void testLogin() throws InterruptedException {


        //Test the right page
        driver.get("https://smoke.citysocializer.com");
        MainPage = PageFactory.initElements(driver, MainPage.class);
        MainPage.clickLoginButton();
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://smoke.citysocializer.com/login", url);
        //Test LoginPage
        LoginPage = PageFactory.initElements(driver, LoginPage.class);
        LoginPage.enterEmail("agranada69@hotmail.com");
        LoginPage.enterPassword("123456");
        LoginPage.clickButtonLoginMe();

        Thread.sleep(3000);

        LoginPage.clickUserMenu();
        LoginPage.clickLogout();
        Thread.sleep(2000);

    }



    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}

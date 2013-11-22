package com.citysocializer.test.web.uicomponent;

/**
 * Created with IntelliJ IDEA.
 * User: alexg
 * Date: 21/11/2013
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginFaceBook {



    private WebDriver driver;

    //https://www.facebook.com/login.php?skip_api_login=1&api_key=359519147490184&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Foauth%3Fredirect_uri%3Dhttps%253A%252F%252Fs-static.ak.facebook.com%252Fconnect%252Fxd_arbiter.php%253Fversion%253D28%2523cb%253Df6e28d044%2526domain%253Dsmoke.citysocializer.com%2526origin%253Dhttps%25253A%25252F%25252Fsmoke.citysocializer.com%25252Ffbb2a52fc%2526relation%253Dopener%2526frame%253Df2f9f11bc%26display%3Dpopup%26scope%3Demail%252Cuser_birthday%26response_type%3Dtoken%252Csigned_request%26domain%3Dsmoke.citysocializer.com%26client_id%3D359519147490184%26ret%3Dlogin%26sdk%3Djoey&cancel_uri=https%3A%2F%2Fs-static.ak.facebook.com%2Fconnect%2Fxd_arbiter.php%3Fversion%3D28%23cb%3Df6e28d044%26domain%3Dsmoke.citysocializer.com%26origin%3Dhttps%253A%252F%252Fsmoke.citysocializer.com%252Ffbb2a52fc%26relation%3Dopener%26frame%3Df2f9f11bc%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26e2e%3D%257B%257D&display=popup

    // objects


    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailFacebook;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement password;


    //constructor of the class

    public  LoginFaceBook(WebDriver driver){
        this.driver = driver;



    }

    //methods
}

package com.citysocializer.test.web.uicomponent;

/**
 * Created with IntelliJ IDEA.
 * User: alexg
 * Date: 21/11/2013
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class CreateASocial {


    //Host socialButton
    @FindBy(xpath = "//*[@id='main_nav_ul']/li[6]/a")
    private WebElement HostSocialButton;

    @FindBy(xpath = "//*[@id='create_social_basics']/div[1]/textarea")
    private WebElement SocialName;

    @FindBy(xpath = "//*[@id='tags_input']/li/input")
    private WebElement SocialDetail;

    @FindBy(xpath = "//*[@id='show_create_social_img_picker']")
    private WebElement SelectImage;

    @FindBy(xpath = "//*[@id='create_social_img_picker']/div[18]")
    private WebElement SelectImageSocial;

    @FindBy(xpath = "//*[@id='create_social_basics']/textarea")
    private WebElement AboutSocial;

    //@FindBy(xpath = "//*[@id='social_location_chzn_o_6']")
    //private WebElement City;
    @FindBy(xpath = "//*[@id='venue_name']")
    private WebElement CityAvenue;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a")
    private WebElement Date;

    //buton post your social

    @FindBy(xpath = "//*[@id='create_social_button']/button")
    private WebElement CreateSocial;





    //Constructor

    public CreateASocial(WebDriver driver) {

    }


    //Methods of the objects

    public void clickSocialButton(){
        HostSocialButton.click();
    }

    public void NameSocial(String NameSocial){
        SocialName.sendKeys();
    }

    public void SocialDetail(String DetailSocial){
        SocialDetail.sendKeys();
    }

    public void clickSelectImage(){
        SelectImage.click();
    }

    public void clickSelectImageSocial(){
        SelectImageSocial.click();
    }

    public void AboutSocial(String AboutSocialText){
        AboutSocial.sendKeys();
    }




    public void CityAvenue(String SelectAvenue){
        CityAvenue.sendKeys();
    }


    public void clickButtonSocial(){
        CreateSocial.click();
    }



}

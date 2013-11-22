package com.citysocializer.test.web.uicomponent;

/**
 * Created with IntelliJ IDEA.
 * User: alexg
 * Date: 21/11/2013
 * Time: 22:58
 * To change this template use File | Settings | File Templates.
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SendMessage {


    private WebDriver driver;

    //declare page Elements
    //email address field
    @FindBy(xpath = "//*[@id='login_form']/input[1]")
    private WebElement email;

    @FindBy(xpath = "//*[@id='login_form']/input[2]")
    private WebElement password;

    @FindBy(xpath = "//*[@id='login_form']/button")
    private WebElement loginMeButton;

    @FindBy(xpath = "//*[@id='remember_me']")
    private WebElement rememberCheckBox;

    @FindBy(xpath = "//*[@id='user_nav_ul']/li[4]/a/span")
    private WebElement Usermenu;
    //Join in a social
    @FindBy(xpath = "//*[@id='main_nav_ul']/li[2]/a")
    private WebElement JoinSocial;
    //click in a social whatever
    @FindBy(xpath = "//*[@id='social_list']/div[2]/section[2]/div[2]/div/div[1]/article[3]/div[2]/button")
    private WebElement YouAreGoing;
    //invite a friends to a social
    @FindBy(css = "html body div#content article#social.container div#social_settings.right-col div div.actions div div.social-actions section.joining_info button#invite_to_social.button")
    private WebElement InviteSocial;
    //Find Socitysocializers
    @FindBy(xpath = "//*[@id='main_nav_ul']/li[3]/a")
    private WebElement FindSocializers;
    //invite Cs friends pop up window in a social
    @FindBy(xpath = "//*[@id='select_friends']/div[1]/input")
    private WebElement InviteFriendsFilter;
    //clear friends name
    @FindBy(xpath = "//*[@id='select_friends']/div[1]/input")
    private WebElement ClearInviteFriendsFilter;
    //choose some friends0
    @FindBy(xpath ="//*[@id='select_friends']/div[2]/div[1]/img")
    private WebElement Friend0;
    //choose some friends1
    @FindBy(xpath ="//*[@id='select_friends']/div[2]/div[8]/img[2]")
    private WebElement Friend1;
    //choose some friends2
    @FindBy(xpath ="//*[@id='select_friends']/div[2]/div[4]/img[2]")
    private WebElement Friend2;
    //choose some friends3
    @FindBy(xpath ="//*[@id='select_friends']/div[2]/div[4]/img")
    private WebElement Friend3;
    //choose some friends4
    @FindBy(xpath ="//*[@id='select_friends']/div[2]/div[5]/img")
    private WebElement Friend4;
    //choose some friend5
    @FindBy(xpath ="//*[@id='select_friends']/div[2]/div[6]/img")
    private WebElement Friend5;


    @FindBy(xpath = "//*[@id='invite_via_cs']/div[2]/div[2]/button")
    private WebElement SendInvite;




    //Cityboard
    @FindBy(xpath = "//*[@id='cityboard-drop-wrapper']/a/span[1]")
    private WebElement Cityboard;

    @FindBy(xpath = "//*[@id='cityboard-drop-wrapper']/a/span[2]")
    private WebElement MenuCity;

    @FindBy(xpath = "//*[@id='wallet_drop_wrapper']/a")
    private WebElement Credits;

    @FindBy(xpath = "//*[@id='user_nav_ul']/li[4]/a/span")
    private WebElement UserMenu;
    //settings element in the main page
    @FindBy(xpath = "//*[@id='user_nav_drop']/div/ul/li[2]/a")
    private WebElement Settings;

    //Element Message in the main page
    @FindBy(xpath ="//*[@id='messages_invites_drop_wrapper']/a/span[1]")
    private WebElement Message;
    //All Message element in the main page
    @FindBy(xpath ="//*[@id='messages_invites_drop']/div/div[1]/a[2]")
    private WebElement AllMessage;

    //Send New Message Element
    @FindBy(xpath ="/html/body/div[5]/div/div/div/a/b")
    private WebElement SendNewMessage;

    //Text Area Element
    @FindBy(css = ("textarea.big-textarea-in-popup"))
    private WebElement TextBox;

    //element send message where we can access to the writte a message
    @FindBy(css = ("textarea.big-textarea-in-popup"))
    private WebElement WritteNewMessage;
    //List of friend
    @FindBy(css = ("div.friend"))
    private WebElement SelectFriend;
    //Button to Send message
    @FindBy(id = ("send_message_btn"))
    private WebElement SendMessageButton;
    //wave button
    @FindBy(css = ("html body div#content div#people_list div.container section.right-col div.main-region div div.items div article.person-item div.person-info div.wave-button button.wave"))
    private WebElement WaveButton;

    @FindBy(css = ("html body div#content div#people_list div.container section.right-col div.main-region div div.items div article.person-item div.person-info div.wave-button button.wave"))
    private WebElement WaveButton2;

    @FindBy(css = ("html body div#content div#people_list div.container section.right-col div.main-region div div.items div article.person-item div.person-info div.wave-button button.wave"))
    private WebElement WaveButton3;

    @FindBy(css = ("html body div#content div#people_list div.container section.right-col div.main-region div div.items div article.person-item div.person-info div.wave-button button.wave"))
    private WebElement WaveButton4;

    @FindBy(css = ("html body div#content div#people_list div.container section.right-col div.main-region div div.items div article.person-item div.person-info div.wave-button button.wave"))
    private WebElement WaveButton5;

    @FindBy(css = ("html body div#content div#people_list div.container section.right-col div.main-region div div.items div article.person-item div.person-info div.wave-button button.wave"))
    private WebElement WaveButton6;




    //constructor

    public void SendMessage(WebDriver driver){

        this.driver = driver;

    }

    //methods
    public void enterEmail(String enterEmail){
        email.sendKeys(enterEmail);
    }

    public void enterPassword(String enterPassword){
        password.sendKeys(enterPassword);

    }

    public void clickButtonLoginMe(){
        loginMeButton.click();
    }

    public void clickCheckBox(){
        rememberCheckBox.click();
    }

    public boolean isCheckBoxSelected(){
        return rememberCheckBox.isSelected();

    }


    public void clickJoinSocials(){
        JoinSocial.click();
    }


    public void clickYouAreGoing(){
        YouAreGoing.click();
    }

    public void clickInviteSocial(){
        InviteSocial.click();
    }

    public void clickInviteFriends(String FilterFriend){
        InviteFriendsFilter.sendKeys(FilterFriend);
    }

    public void clickSendFriend(){
        SendInvite.click();
    }

    public void clearSendFriend(){
        ClearInviteFriendsFilter.clear();
    }

    public void clickFriend0(){
        Friend0.click();
    }


    public void clickFriend1(){
        Friend1.click();
    }


    public void clickFriend2(){
        Friend2.click();
    }


    public void clickFriend3(){
        Friend3.click();
    }

    public void clickFriend4(){
        Friend4.click();
    }

    public void clickFriend5(){
        Friend5.click();
    }


    public void clickFindSocializer(){
        FindSocializers.click();
    }


    public void clickCityboard(){
        Cityboard.click();

    }

    public void clickMenuCityBoard(){
        MenuCity.click();
    }

    public void clickCredits(){
        Credits.click();
    }

    public void clickUserMenu(){
        UserMenu.click();
    }

    public void clickSettings(){
        Settings.click();
    }

    public void clickMessage(){
        Message.click();
    }

    public void clickAllMessage(){
        AllMessage.click();
    }

    public void clickSendNewMessage(){
        SendNewMessage.click();
    }


    public void clickTextBox(){
        TextBox.click();
    }

    public void EnterMessage(String writteMessage){
        WritteNewMessage.sendKeys(writteMessage);
    }

    public void clickSelectFriend(){
        SelectFriend.click();
    }


    public void clickSendMessageButton(){
        SendMessageButton.click();
    }

    public void clickWaveButton(){
        WaveButton.click();
    }

    public void clickWaveButton2(){
        WaveButton2.click();
    }

    public void clickWaveButton3(){
        WaveButton3.click();
    }

    public void clickWaveButton4(){
        WaveButton4.click();
    }

    public void clickWaveButton5(){
        WaveButton5.click();
    }

    public void clickWaveButton6(){
        WaveButton6.click();
    }




}
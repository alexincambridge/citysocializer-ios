package com.citysocializer.test.web.uicomponent;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


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

    @FindBy(xpath = "//*[@id='user_nav_drop']/div/ul/li[3]/a")
    private WebElement Logout;

    //constructor

    public LoginPage(WebDriver driver){

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

    public void clickUserMenu(){
        Usermenu.click();
    }

    public void clickLogout(){
        Logout.click();
    }



}

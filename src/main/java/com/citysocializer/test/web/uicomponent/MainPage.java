package com.citysocializer.test.web.uicomponent;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class MainPage{

    private WebDriver driver;

    //declare page elements
    //Login Button object
    @FindBy(xpath = "//*[@id='already']/a")
    private WebElement LoginButton;


    //Login button through fb
    @FindBy(xpath = "//*[@id='fb_login_link']")
    private WebElement FaceLoginButton;

    //pop up to Login with FacebookButton
    //Login by facebook object
    @FindBy(xpath = "//*[@id='facebook']")
    private WebElement FacebookButton;

    @FindBy (xpath = "//*[@id='email']")
    private WebElement FacebookLogin;

    @FindBy (xpath = "//*[@id='pass']")
    private WebElement FacebookPassword;

    @FindBy (xpath = "//*[@id='u_0_1']")
    private WebElement FacebookLoginButton;

    //sign up with email
    @FindBy(xpath = "//*[@id='email']")
    private WebElement EmailButton;

    //pop up to Login with EmailButton
    @FindBy(xpath = "//*[@id='first_name']")
    private WebElement FirstName;

    @FindBy(xpath = "//*[@id='last_name']")
    private WebElement LastName;

    @FindBy(css = "html body#homepage div.ui-dialog div#ui-id-1.popup div div#register_box form div#register_form_step1 input#email")
    private WebElement EmailAddress;

    @FindBy(css = "html body#homepage div.ui-dialog div#ui-id-1.popup div div#register_box form div#register_form_step1 input#password")
    private WebElement Password;

    @FindBy(xpath = "//*[@id='register_form_step1']/button")
    private WebElement ContinueButton;

    //second section, just few more details
    @FindBy(xpath = "//div[@id='location_id_chzn']/a")
    private WebElement Location;

    @FindBy(id = "#location_id_chzn_o_10")
    private WebElement SelectLocation;

    //date of birthday
    @FindBy(xpath = "//*[@id=selMLQ_chzn_o_5']")
    private WebElement Day;

    @FindBy(xpath = "//*[@id='sel67H_chzn_o_6']")
    private WebElement Month;

    @FindBy(xpath = "//*[@id='selAD9_chzn_o_19']")
    private WebElement Year;

    @FindBy(xpath = "//*[@id='register_form_gender']/label[1]/input")
    private WebElement GenderM;

    @FindBy(xpath = "//*[@id='register_form_gender']/label[2]/input")
    private WebElement GenderF;

    @FindBy(xpath = "//*[@id='register_form_step2']/button")
    private WebElement GetStarted;



    //constructor
    public MainPage(WebDriver driver)
    {
        this.driver = driver;

    }


    //methods for test
    public void clickLoginButton(){
        LoginButton.click();
    }


    //methods facebook
    public void clickFaceLoginButton(){
        FaceLoginButton.click();
    }

    public void clickFacebookButton(){
        FacebookButton.click();
    }
    public void emailFacebook(){
        FacebookLogin.click();
    }
    public void emailFacebook(String enterEmailFacebook){
        FacebookLogin.sendKeys(enterEmailFacebook);
    }

    public void facebookPassword(String enterPassword){
        FacebookPassword.sendKeys(enterPassword);
    }

    public void clickFacebookLogin(){
        FacebookLoginButton.click();
    }

    //methods email objects
    public void clickEmailButton(){
        EmailButton.click();
    }

    public void FirstName(String firstName){
        FirstName.sendKeys(firstName);

    }

    public void LastName(String lastName){
        LastName.sendKeys(lastName);
    }

    public void EmailAddress(String emailUser){
        EmailAddress.clear();
        EmailAddress.sendKeys(emailUser);

    }

    public void Password(String passwordUser){
        Password.sendKeys(passwordUser);
    }

    public void ContinueButton(){
        ContinueButton.click();
    }

    public void Location(){
        Location.click();
        Location.clear();
    }

    public void selectLocation(){
        SelectLocation.sendKeys("Aachen");


    }

    public void Day(){
        Day.click();
    }

    public void Month(){
        Month.click();
    }

    public void Year(){
        Year.click();
    }

    public void GenderF(){
        GenderF.click();
    }

    public void GenderM(){
        GenderM.click();
    }
    public void GetStarted(){
        GetStarted.click();
    }



}

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DemoAutoRegister extends CommonMethods {

    PageObjects pom=new PageObjects();

    public  void demoTest(){

        CommonMethods cm=new CommonMethods();
        launchBrowser(pom.getBrowserName(),pom.getUrl());
      //  launchBrowser("chrome","http://demo.automationtesting.in/Index.html");

        //  driver.findElementById("btn2").click();
        WebElement skipButton = identifyElement(pom.getSkipButtonLocator(),pom.getSkipButtonLocatorValue());
        click(skipButton);
        WebElement firstName = identifyElement(pom.getFirstNameLocator(), pom.getFirstNameLocatorValue());
        firstName.sendKeys(pom.getFirstNameFieldData());

        // cm.type(firstName,"hello");
        WebElement lastName = identifyElement(pom.getLastNameLocator(), pom.getLastNameLocatorValue());
        //cm.type(lastName,"abcd");
        lastName.sendKeys(pom.getLastNameLocatorFieldData());
        WebElement radioBtn = identifyElement(pom.getGenderRadioButtonLocator(),pom.getGenderRadioButtonLocatorValue());
        click(radioBtn);
        WebElement checkBox = identifyElement(pom.getHobbiesCheckBoxLocator(),pom.getHobbiesCheckBoxLocatorValue());
        click(checkBox);
        WebElement skills = identifyElement(pom.getSkillsDropDownLocator(),pom.getSkillsDropDownLocatorValue());
        selectFromDropdown(skills,pom.getSkillsDropDownLocatorType(),pom.getSkillsDropDownTypeValue());
        WebElement countries = identifyElement(pom.getCountriesDropDownLocator(),pom.getCountriesDropdownLocatorValue());
        selectFromDropdown(countries,pom.getCountriesDropDownLocatorType(),pom.getCountriesDropDownTypeValue());
        WebElement pwd = identifyElement(pom.getPasswordFieldLocator(), pom.getPasswordFieldLocatorValue());
        // cm.type(pwd,"pass");
        pwd.sendKeys(pom.getPasswordFieldLocatorTextValue());
        WebElement confpwd = identifyElement(pom.getConfirmPasswordFiledLocator(),pom.getConfirmPasswordFiledLocatorValue());
        // cm.type(confpwd,"pass");
        confpwd.sendKeys(pom.getConfirmPasswordFieldLocatorTextValue());
        WebElement submit = identifyElement(pom.getSubmitButtonLocator(),pom.getSubmitButtonLocatorValue());
        click(submit);
        closeBrowser();


    }

    public static void main(String[] args) {
DemoAutoRegister dr=new DemoAutoRegister();
dr.demoTest();







 /*System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        RemoteWebDriver driver =new ChromeDriver();

        driver.navigate().to("http://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementById("btn2").click();
        driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("hello");
        driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("hello");
        driver.findElementByXPath("(//input[@type='radio'])[2]").click();
        driver.findElementById("checkbox2").click();
        WebElement skills = driver.findElementById("Skills");
        Select skillDropDown =new Select(skills);
        skillDropDown.selectByValue("Android");
        WebElement countries = driver.findElementById("countries");
        Select countryDropdown=new Select(countries);
        countryDropdown.selectByVisibleText("Algeria");
        driver.findElementById("firstpassword").sendKeys("password");
        driver.findElementById("secondpassword").sendKeys("password");
        driver.findElementById("submitbtn").click();
        driver.close();
*/




    }
}

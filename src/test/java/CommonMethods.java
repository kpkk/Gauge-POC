import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.rmi.Remote;
import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static RemoteWebDriver driver;

    public void launchBrowser(String browser,String url){

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
            driver=new ChromeDriver();
              driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(url);


        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.driver","./Drivers/geckodriver.exe");
            driver=new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(url);

        }else {
            System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
            driver=new InternetExplorerDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(url);
        }

    }
    public WebElement identifyElement(String locator, String locatorValue) {
        switch (locator) {
            case ("id"):  return driver.findElementById(locatorValue);

            case ("name"):return driver.findElementByName(locatorValue);

            case ("class"):return driver.findElementByClassName(locatorValue);

            case ("xpath"):return driver.findElementByXPath(locatorValue);

            case ("CssSelector"):return driver.findElementByCssSelector(locatorValue);

        }
return null;
    }
    public void type(WebElement ele,String text){
        ele.clear();
        ele. sendKeys();

    }
    public void click(WebElement ele){
        ele.click();
    }
    public void selectFromDropdown(WebElement ele, String typeSelector, String eleValue){
        Select options=new Select(ele);
        if(typeSelector.equalsIgnoreCase("value")){
            options.selectByValue(eleValue);
        }else {
            options.selectByVisibleText(eleValue);
        }


    }
    public void selectFromDropDownById(WebElement ele, int index){
        Select options=new Select(ele);
        options.selectByIndex(index);

    }
    public void closeBrowser(){
        driver.close();
    }

}

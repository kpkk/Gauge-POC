public class PageObjects {


    private String browserName ="chrome";

    private String url="http://demo.automationtesting.in/Index.html";

    private String skipButtonLocator="id";
    private String skipButtonLocatorValue="btn2";
    private String firstNameLocator="xpath";
    private String firstNameLocatorValue="(//input[@type='text'])[1]";
    private String firstNameFieldData="hello";
    private String lastNameLocator="xpath";
    private String lastNameLocatorValue="(//input[@type='text'])[2]";
    private String lastNameLocatorFieldData="hey!!!";
    private String genderRadioButtonLocator="xpath";
    private String genderRadioButtonLocatorValue="(//input[@type='radio'])[2]";
    private String hobbiesCheckBoxLocator="id";
    private String hobbiesCheckBoxLocatorValue="checkbox2";
    private String skillsDropDownLocator="id";
    private String skillsDropDownLocatorValue="Skills";
    private String skillsDropDownLocatorType="value";
    private String skillsDropDownTypeValue="Android";
    private String countriesDropDownLocator="id";
    private String countriesDropdownLocatorValue="countries";

    private String countriesDropDownLocatorType="VisibleText";
    private String countriesDropDownTypeValue="Algeria";
    private String passwordFieldLocator="id";
    private String passwordFieldLocatorValue="firstpassword";
    private String passwordFieldLocatorTextValue="pass";
    private String confirmPasswordFiledLocator="id";
    private String confirmPasswordFiledLocatorValue="secondpassword";
    private String confirmPasswordFieldLocatorTextValue="pass";

    private String submitButtonLocator="id";
    private String submitButtonLocatorValue ="submitbtn";

    /*public PageObjects(String browserName,String url,String locator){
        this.browserName=browserName;
        this.locator=locator;
        this.url=url;
        }
*/

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getUrl() {
        return url;
    }

    public String getSkipButtonLocator() {
        return skipButtonLocator;
    }

    public String getSkipButtonLocatorValue() {
        return skipButtonLocatorValue;
    }

    public String getFirstNameLocator() {
        return firstNameLocator;
    }

    public String getFirstNameLocatorValue() {
        return firstNameLocatorValue;
    }

    public String getFirstNameFieldData() {
        return firstNameFieldData;
    }
    public String getLastNameLocator() {
        return lastNameLocator;
    }

    public String getLastNameLocatorValue() {
        return lastNameLocatorValue;
    }

    public String getLastNameLocatorFieldData() {
        return lastNameLocatorFieldData;
    }
    public String getGenderRadioButtonLocator() {
        return genderRadioButtonLocator;
    }

    public String getGenderRadioButtonLocatorValue() {
        return genderRadioButtonLocatorValue;
    }

    public String getHobbiesCheckBoxLocator() {
        return hobbiesCheckBoxLocator;
    }

    public String getHobbiesCheckBoxLocatorValue() {
        return hobbiesCheckBoxLocatorValue;
    }

    public String getSkillsDropDownLocator() {
        return skillsDropDownLocator;
    }

    public String getSkillsDropDownLocatorValue() {
        return skillsDropDownLocatorValue;
    }

    public String getSkillsDropDownLocatorType() {
        return skillsDropDownLocatorType;
    }

    public String getSkillsDropDownTypeValue() {
        return skillsDropDownTypeValue;
    }

    public String getCountriesDropDownLocator() {
        return countriesDropDownLocator;
    }

    public String getCountriesDropdownLocatorValue() {
        return countriesDropdownLocatorValue;
    }

    public String getCountriesDropDownLocatorType() {
        return countriesDropDownLocatorType;
    }

    public String getCountriesDropDownTypeValue() {
        return countriesDropDownTypeValue;
    }

    public String getPasswordFieldLocator() {
        return passwordFieldLocator;
    }

    public String getPasswordFieldLocatorValue() {
        return passwordFieldLocatorValue;
    }

    public String getPasswordFieldLocatorTextValue() {
        return passwordFieldLocatorTextValue;
    }

    public String getConfirmPasswordFiledLocator() {
        return confirmPasswordFiledLocator;
    }

    public String getConfirmPasswordFiledLocatorValue() {
        return confirmPasswordFiledLocatorValue;
    }

    public String getConfirmPasswordFieldLocatorTextValue() {
        return confirmPasswordFieldLocatorTextValue;
    }

    public String getSubmitButtonLocator() {
        return submitButtonLocator;
    }
    public String getSubmitButtonLocatorValue() {
        return submitButtonLocatorValue;
    }

}



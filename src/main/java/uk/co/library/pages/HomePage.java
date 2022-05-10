package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptions;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobType;

    @FindBy(xpath = "//body/div[1]/div[2]/form[1]/div[2]/div[4]/button[1]")
    WebElement salaryButton;

    @FindBy(xpath = "//a[@id='tab-sal-annual']")
    WebElement annum;

    @FindBy(xpath = "//a[@id='tab-sal-daily']")
    WebElement day;

    @FindBy(xpath = "//a[@id='tab-sal-hourly']")
    WebElement hourly;


    public void enterJobTitle(String jobtitle) {
        Reporter.log("Enter jobtitle" + jobtitle + "to jobtitle field" + jobTitle.toString() + "<br>");
        sendTextToElement(jobTitle, jobtitle);
    }

    public void enterLocation(String locations) {
        Reporter.log("Enter location" + location + "to location field" + locations.toString() + "<br>");
        sendTextToElement(location, locations);
    }

    public void selectDistanceFromVisibleText(String distance) {
        Reporter.log("Select Distance" + distanceDropDown + "to location field" + distance.toString() + "<br>");
        sendTextToElement(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptions() {
        Reporter.log("Click on more search options" + moreSearchOptions + "to location field" + moreSearchOptions.toString() + "<br>");
        clickOnElement(moreSearchOptions);
    }

    public void clickOnFindJobs() {
        Reporter.log("Click on Find Jobs" + findJobs);
        clickOnElement(findJobs);
    }

    public void enterSalaryMin(String salary) {
        Reporter.log("Enter Salary" + salaryMin + "to location field" + salary.toString() + "<br>");
        sendTextToElement(salaryMin, salary);
    }

    public void enterSalaryMax(String salary) {
        Reporter.log("Enter Salary" + salaryMax + "to location field" + salary.toString() + "<br>");
        sendTextToElement(salaryMax, salary);
    }

    public void selectSalaryTypeFromVisibleText(String salary) {
        Reporter.log("Select Salary Type" + salaryType + "to location field" + salary.toString() + "<br>");
        sendTextToElement(salaryType, salary);
    }

    public void selectJobTypeFromVisibleText(String job) {
        Reporter.log("Select Job Type" + jobType + "to location field" + job.toString() + "<br>");
        sendTextToElement(jobType, job);

    }



}

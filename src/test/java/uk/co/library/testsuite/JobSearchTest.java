package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();



    }

    @Test(dataProvider =  "Multi Job Serch",dataProviderClass = JobSearchTest.class,groups = {"Sanity","Smoke","Regression"})

    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result){
//        enter job title 'jobTitle'
        homePage.enterJobTitle(jobTitle);
//        enter Location 'location'
        homePage.enterLocation(location);
//        select distance 'distance'
        homePage.selectDistanceFromVisibleText(distance);
//        click on moreSearchOptionsLink
        homePage.clickOnMoreSearchOptions();
//        enter salaryMin 'salaryMin'
        homePage.selectSalaryTypeFromVisibleText(salaryMin);
//        enter salaryMax 'salaryMax'
        homePage.selectSalaryTypeFromVisibleText(salaryMax);
//        select salaryType 'salaryType'
        homePage.selectSalaryTypeFromVisibleText(salaryType);
//        select jobType 'jobType'
        homePage.selectJobTypeFromVisibleText(jobType);
//        click on 'Find Jobs' button
        homePage.clickOnFindJobs();
//        verify the result 'result'
        resultPage.verifyText(result);


    }
    @DataProvider(name = "Multi Job Serch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"}
        };
        return data;
    }


}

package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    public ResultPage(){ PageFactory.initElements(driver,this);}

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]")
    WebElement resultText;

    public String verifyText(String result){
    return getTextFromElement(resultText);
    }
}

   /* public void verifyTheResultText(String expectedResult){
        Reporter.log("Verify the result" + resultText + "to result field" + expectedResult.toString() + "<br>");
        String actualText = getTextFromElement(resultText);
        if(actualText.equalsIgnoreCase(expectedResult)){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }

    }

}*/

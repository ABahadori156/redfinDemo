package redfin.TestScript.E2E;

import redfin.PageObjectFiles.Main_Page_Redfin;
import redfin.PageObjectFiles.Area_Search_Results;
import redfin.WebDriver.rfWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Real_Estate_Assertion_E2E {
	
	@Test
	public void Real_Estate_Assertion_Test() throws InterruptedException {
		rfWebDriver.ChromeInstance();
		Thread.sleep(1000);
		Main_Page_Redfin.rfCityToSearch("Rancho Santa Margarita");
		Main_Page_Redfin.searchCity();
		
		rfWebDriver.WaitForElement(Area_Search_Results.areaResultsId);
		Area_Search_Results.dropDowns.minAmountDropDownClicked();
		Area_Search_Results.amountChosen.minAmount375kClicked();
		Area_Search_Results.dropDowns.maxAmountDropDownClicked();
		Area_Search_Results.amountChosen.maxAmount475kClicked();

		Area_Search_Results.moreFiltersClicked();
		Area_Search_Results.dropDowns.minBedsDropDownClicked();
		Area_Search_Results.dropDowns.oneBedClicked();
		Area_Search_Results.dropDowns.maxBedsDropDownClicked();
		Area_Search_Results.dropDowns.twoBedsClicked();
		
		Area_Search_Results.plusBathsClicked();
		Area_Search_Results.applyFiltersClicked();
		
		Thread.sleep(1000);
		rfWebDriver.WaitForElement(Area_Search_Results.bedResultsId);
		Area_Search_Results.assertion.bedsAssert(Area_Search_Results.assertion.houseOneBedsResults);
		Area_Search_Results.assertion.bathsAssert(Area_Search_Results.assertion.houseOneBathsResults);
		Area_Search_Results.assertion.priceAssert(Area_Search_Results.assertion.houseOneAmountOneResults);
	}


	@AfterClass
	public void Close() {
		rfWebDriver.WebInstance.quit();
	}
}
package redfin.TestScript.E2E;

import redfin.PageObjectFiles.Main_Page_Redfin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import redfin.PageObjectFiles.Area_Search_Results;

import redfin.WebDriver.rfWebDriver;

public class Real_Estate_Assertion_E2E {
	
	@Test
	public void Real_Estate_Assertion_Test() throws InterruptedException {
		rfWebDriver.ChromeInstance();
		Thread.sleep(1000);
		System.out.println("Beginning of Real Estate Assertion test");
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
		
		rfWebDriver.WaitForElement(Area_Search_Results.bedResultsId);
		Area_Search_Results.resultsAssertion.bedsAssertion(Area_Search_Results.resultsAssertion.firstBedsResults);
		Area_Search_Results.resultsAssertion.bathsAssertion(Area_Search_Results.resultsAssertion.firstBathsResults);
		Area_Search_Results.resultsAssertion.bedsAssertion(Area_Search_Results.resultsAssertion.secondBedsResults);
		Area_Search_Results.resultsAssertion.bedsAssertion(Area_Search_Results.resultsAssertion.secondBathsResults);



	}


	@AfterClass
	public void Close() {
		// rfWebDriver.WebInstance.quit();
	
	}
}
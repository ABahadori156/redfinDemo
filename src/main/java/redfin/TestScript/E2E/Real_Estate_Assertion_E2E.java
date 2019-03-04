package redfin.TestScript.E2E;

import redfin.PageObjectFiles.Main_Page_Redfin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import redfin.PageObjectFiles.City_Search_Results_Redfin;

import redfin.WebDriver.rfWebDriver;

public class Real_Estate_Assertion_E2E {
	
	@Test
	public void Real_Estate_Assertion_Test() {
		rfWebDriver.ChromeInstance();
		System.out.println("Beginning of Real Estate Assertion test");
		Main_Page_Redfin.rfCityToSearch("Rancho Santa Margarita");
		Main_Page_Redfin.searchCity();
		City_Search_Results_Redfin.dropDowns.minAmountDropDownClicked();
		City_Search_Results_Redfin.amountChosen.minAmount375kClicked();
		City_Search_Results_Redfin.dropDowns.maxAmountDropDownClicked();
		City_Search_Results_Redfin.amountChosen.maxAmount400kClicked();
		

	}


	@AfterClass
	public void Close() {
		rfWebDriver.WebInstance.quit();
	
	}
}
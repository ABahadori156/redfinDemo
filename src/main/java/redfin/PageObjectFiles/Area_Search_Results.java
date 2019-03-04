package redfin.PageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import redfin.WebDriver.rfWebDriver;

public class Area_Search_Results {
	public static String bedResultsId = "MapHomeCard_1";
	public static String areaResultsId = "sidepane-header";
	public static class dropDowns {
		
		public static void minAmountDropDownClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement minDropDownEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[1]/span/span/span"));
			minDropDownEle.click();
		}
		
		public static void maxAmountDropDownClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement maxDropDownEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[3]/span/span/span"));
			maxDropDownEle.click();
		}
		
		public static void minBedsDropDownClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement minDropDownEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='filterContent']/div/div[1]/div[1]/div[1]/div[2]/div/span[1]/span/span/span"));
			minDropDownEle.click();
		}
		
		public static void maxBedsDropDownClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement minDropDownEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='filterContent']/div/div[1]/div[1]/div[1]/div[2]/div/span[3]/span/span/span"));
			minDropDownEle.click();
		}
		
		public static void oneBedClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement oneBedEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='filterContent']/div/div[1]/div[1]/div[1]/div[2]/div/span[1]/span/span/div/div[1]/div/div[3]"));
			oneBedEle.click();
		}
		
		public static void twoBedsClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement twoBedsEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='filterContent']/div/div[1]/div[1]/div[1]/div[2]/div/span[3]/span/span/div/div[1]/div/div[4]"));
			twoBedsEle.click();
		}
	}
	
	public static class amountChosen {
		
		public static void minAmount375kClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement minAmount375kEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[1]/span/span/div/div[1]/div/div[15]/span"));
			minAmount375kEle.click();
		}

		public static void maxAmount475kClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement maxAmount400kEle = rfWebDriver.WebInstance.findElement(By.xpath("//*[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[3]/span/span/div/div[1]/div/div[2]"));
			maxAmount400kEle.click();
		}
		
	}
	
	public static class resultsAssertion {
		public static WebElement firstBedsResults = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='MapHomeCard_0']/div/div/a/div/div[2]/div[1]"));
		public static WebElement firstBathsResults = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='MapHomeCard_0']/div/div/a/div/div[2]/div[2]"));
		public static WebElement secondBedsResults = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='MapHomeCard_1']/div/div/a/div/div[2]/div[1]"));
		public static WebElement secondBathsResults = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='MapHomeCard_1']/div/div/a/div/div[2]/div[2]"));
		
		
		public static void bedsAssertion(WebElement results) {
			char bedChar = results.getText().charAt(0);
			int bedInt = Character.getNumericValue(bedChar);
			
			if (bedInt >= 1 && bedInt <= 2) {
				Assert.assertTrue(true);
				System.out.println("There are between 1 and 2 number of beds. Bed filter assertion is correct!");
			} else {
				Assert.assertTrue(false);
				System.out.println(" " + bedInt + "beds were not in the search critera. Assertion failed ..");
			}
		}
		
		public static void bathsAssertion(WebElement results) {
			char bathChar = results.getText().charAt(0);
			int bathInt = Character.getNumericValue(bathChar);
			
			if (bathInt >= 2) {
				Assert.assertTrue(true);
				System.out.println("There are " + bathInt + " number of baths. Bath filter assertion is correct!");
			} else {
				Assert.assertTrue(false);
				System.out.println(" " + bathInt + "baths were not in the search criteria. Assertion failed ..");
			}
		}
		
		
	}

	public static void moreFiltersClicked() {
		WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
		WebElement moreFiltersEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='wideSidepaneFilterButtonContainer']/button"));
		moreFiltersEle.click();
	}
	
	public static void plusBathsClicked() {
		WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
		WebElement plusBathsEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='filterContent']/div/div[1]/div[1]/div[2]/div[2]/span/span/span[3]"));
		plusBathsEle.click();
		plusBathsEle.click();
		plusBathsEle.click();
	}
	
	public static void applyFiltersClicked() {
		WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
		WebElement applyFiltersEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='searchForm']/form/div[2]/div/div/button"));
		applyFiltersEle.click();
	}
	
	public boolean retryingFindClick(By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            rfWebDriver.WebInstance.findElement(By.xpath("")).click();
	            result = true;
	            break;
	        } catch(StaleElementReferenceException e) {
	        }
	        attempts++;
	    }
	    return result;
	}

}

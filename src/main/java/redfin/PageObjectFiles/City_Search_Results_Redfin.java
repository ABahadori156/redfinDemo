package redfin.PageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import redfin.WebDriver.rfWebDriver;

public class City_Search_Results_Redfin {
	
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

		public static void maxAmount400kClicked() {
			WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
			WebElement maxAmount400kEle = rfWebDriver.WebInstance.findElement(By.xpath("//*[@id='scrollableSearchForm']/div[2]/div[1]/div/div[2]/span[3]/span/span/div/div[1]/div/div[16]/span"));
			maxAmount400kEle.click();
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
	}
	
	public static void applyFiltersClicked() {
		WebDriverWait wait = new WebDriverWait(rfWebDriver.WebInstance, 20);
		WebElement applyFiltersEle = rfWebDriver.WebInstance.findElement(By.xpath("//div[@id='searchForm']/form/div[2]/div/div/button"));
		applyFiltersEle.click();
	}

}

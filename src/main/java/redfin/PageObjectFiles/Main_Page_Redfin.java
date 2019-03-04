package redfin.PageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import redfin.WebDriver.rfWebDriver;

public class Main_Page_Redfin {
	
	public static void rfCityToSearch(String city) {
		WebElement irvineRealEstate = rfWebDriver.WebInstance.findElement(By.xpath("//input[@placeholder='City, Address, School, Agent, ZIP']"));
		irvineRealEstate.sendKeys(city);
	}
	
	public static void searchCity() {
		WebElement searchCityEle = rfWebDriver.WebInstance.findElement(By.xpath("(//button[@class='inline-block SearchButton clickable float-right'])[1]"));
		searchCityEle.click();
	}

}

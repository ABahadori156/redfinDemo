package redfin.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import redfin.PageObjectFiles.Area_Search_Results;
import redfin.PageObjectFiles.Main_Page_Redfin;

public class testDriver {
	public static WebDriver WebInstance;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Bahadori/Desktop/Mobile Automation Testing/chromedriver");
		WebInstance = new ChromeDriver();
		WebInstance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String redfinURL = "http://www.redfin.com";
		WebInstance.manage().window().maximize();
		WebInstance.get(redfinURL);
		
		// Main_Page_Redfin.rfCityToSearch("Rancho Santa Margarita");
		WebInstance.findElement(By.xpath("//input[@placeholder='City, Address, School, Agent, ZIP']")).sendKeys("Rancho Santa Margarita");
		WebInstance.findElement(By.xpath("(//button[@class='inline-block SearchButton clickable float-right'])[1]")).click();
		
		WebInstance.findElement(By.xpath("//*[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[1]/span/span/span")).click();
		WebInstance.findElement(By.xpath("//*[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[1]/span/span/span")).click();
		System.out.println("Minimum amount clicked");
		
		WebInstance.findElement(By.xpath("//div[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[1]/span/span/div/div[1]/div/div[15]/span")).click();
		System.out.println("$375k clicked");
		
 		WebInstance.findElement(By.xpath("//div[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[3]/span/span/span")).click();
 		WebInstance.findElement(By.xpath("//div[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[3]/span/span/span")).click();
 		System.out.println("Max amount clicked");
 		
		WebInstance.findElement(By.xpath("//div[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[3]/span/span/div/div[1]/div/div[2]/span")).click();
		System.out.println("$400k clicked");
		
		WebInstance.findElement(By.xpath("//div[@id='sidepane-header']/div[2]/div/div[1]/form/div/div[2]/span[3]/span/span/div/div[1]/div/div[2]/span")).click();
		
		System.out.println("$400k clicked twice");
//		Main_Page_Redfin.searchCity();
//		Thread.sleep(5000);

		// WebInstance.quit();
	}
	
	/*
	 * 1. Start the WebInstance
4. Set the Min Price to $375k
5. Set the Max Price to $400k
6. Click on ‘More Filters’
7. Under Beds, click on the drop down for ‘No min’
8. Click on 1
9. Under Beds, click on the drop down for ‘No max’
10. Click on 2
11. Under Baths, click on the + under ‘Baths’ till it’s 2+
12. Click on Apply Filters
13. Assert that the bed is either 1 or 2 pass, if not fail
14. Assert that the baths are 2 or greater pass, if not fail
15. Assert that the price is between $375,000 and $400,000, then pass.
	 */

}

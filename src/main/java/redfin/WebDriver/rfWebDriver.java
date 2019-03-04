package redfin.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class rfWebDriver {
	public static WebDriver WebInstance;

	public static void ChromeInstance() {
		System.setProperty("webdriver.chrome.driver", "/Users/Bahadori/Desktop/Mobile Automation Testing/chromedriver");
		WebInstance = new ChromeDriver();
		WebInstance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String redfinURL = "http://www.redfin.com";
		WebInstance.manage().window().maximize();
		WebInstance.get(redfinURL);
		
		
	}
	
	public static void WaitForElement(String id) {
		WebDriverWait wait = new WebDriverWait(WebInstance, 100);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(id)));
	}

}

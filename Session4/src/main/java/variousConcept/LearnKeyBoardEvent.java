package variousConcept;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyBoardEvent {
	
	WebDriver driver;
	
	@Before
	public void init () {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
				
	}

	@Test
	public void testKeyBoardEvent() {
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		// for Keyboard Function test-- we user Action Object
		Actions action = new Actions(driver);
		
		userName.sendKeys("demo@techfios.com");
		passWord.sendKeys("abc123");
//		action.sendKeys(Keys.ENTER).build().perform();
		action.sendKeys(Keys.RETURN).build().perform();
		
		
		
		
		
		
		
	}
}

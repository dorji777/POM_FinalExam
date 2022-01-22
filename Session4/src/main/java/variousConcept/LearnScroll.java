package variousConcept;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScroll {
	
	
	WebDriver driver;
	
	@Before
	public void init () {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
				
	}

	@Test
	public void testMouseHover() throws InterruptedException {
		
		WebElement Product_element = driver.findElement(By.xpath("//span[contains(text(), 'Products')]"));
		WebElement Monitor_element = driver.findElement(By.xpath("//a[contains(text(), 'Monitors')]"));
		WebElement ForHome_element = driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[11]/ul/li[3]/a"));
		
		Actions action = new Actions (driver);
		
		action.moveToElement(Product_element).build().perform();
		
		Thread.sleep(3000);
		action.moveToElement(Monitor_element).build().perform();
		
		ForHome_element.click();
		
   }
	

}

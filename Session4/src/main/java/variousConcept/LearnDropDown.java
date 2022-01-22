package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDropDown {

	WebDriver driver;

	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
				driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
						
	}
	
	@Test
	public void testScroll() {
		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement sinInButton = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		
		userName.sendKeys("demo@techfios.com");
		passWord.sendKeys("abc123");
		sinInButton.click();
		
		WebElement dashBoardHeader = driver.findElement(By.xpath("//h2[contains(text(),' Dashboard ')]"));
		WebElement cusTomerButtonElement = driver.findElement(By.xpath("//span[contains(text(),'Customer')]"));
		WebElement cusTomerAddElement = driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
		
		System.out.println(dashBoardHeader.getText());
		Assert.assertEquals("Wrong Page!!","Dashboard",dashBoardHeader.getText());
		
		
		
	}
}

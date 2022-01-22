package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;

	
	@Before
	
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	public void tstlocators() {

		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("TF-API"));
		
		//Absolute X path 
		driver.findElement(By.xpath("html/body/div/div[2]/div/form/div[7]/input")).sendKeys("Dorji try");
		
		driver.findElement(By.xpath("//strong[text()='']"));
	}

//	@After

	public void tearDown() {
		driver.close();

	}
}
package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertPopup {

	
	WebDriver driver;
	
	@Before
	public void init() {
		
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
		
		
	}
	
	@Test
	public void testAlertPopup() throws InterruptedException {
		
		WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]"));
		SIGNIN_BUTTON_ELEMENT.click();
		
		///Alert/POPup
		Thread.sleep(3000);
		String a = driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().accept();
		
		
		
	}
}

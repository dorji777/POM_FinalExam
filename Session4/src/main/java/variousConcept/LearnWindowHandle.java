package variousConcept;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
	
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");		
				
	}
	
	@Test
	public void testWindowHandle() {
		
		String handle1 = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
		
		String handle2 = driver.getWindowHandle();
		System.out.println(handle2);
		//driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'XPath Tutorial - W3Schools')]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),' Selenium')]")).click();
		driver.findElement(By.xpath("//div[@id='web']/descendant::li[1]/descendant::a[1]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		//gives both handle  
		System.out.println(driver.getTitle());
		
		for(String i: handles ) {
			System.out.println(i);
			driver.switchTo().window(i);
		
		System.out.println(driver.getTitle());	
			
		}
		
	}

}

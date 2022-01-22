package practiceDorji;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnWindowHandle {

	WebDriver driver;
	
	@Test
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");	
		
	}
	
	public void testWindowHandle() {
		
    Set<String> handles = driver.getWindowHandles();
    
    for(String i:handles ) {
    	
    	driver.switchTo().window(i);
    	
    }
    		
	}
	
	
}

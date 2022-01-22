package homeWork1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class BankAccount {

	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		
			driver = new ChromeDriver();
			driver.get("http://www.techfios.com/billing/?ng=admin/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
							
	}
	
	@Test
	public void login() {
		
 		WebElement USERNAME_ELEMENT = driver.findElement(By.xpath( "//*[@id=\"username\"]"));
 		WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
 		WebElement SIGNIN_ELEMENT = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
 		
 		USERNAME_ELEMENT.clear();
 		USERNAME_ELEMENT.sendKeys("demo@techfios.com");
 		PASSWORD_ELEMENT.sendKeys("abc123");
 		SIGNIN_ELEMENT.click();
		
 		WebElement DASHBOARDHEADER_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(), Dashboard  )]"));
 		WebElement CUSTOMER_ELEMENT = driver.findElement(By.xpath("//span[contains(text(),\"Customer\")]"));
 		WebElement ADDCUSTOMER_ELEMENT = driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]"));
 		
 		 			 		
 		Assert.assertEquals("Page not Found","Dashboard",DASHBOARDHEADER_ELEMENT.getText());
 		
 		CUSTOMER_ELEMENT.click();
 		ADDCUSTOMER_ELEMENT.click();
 		
 		WebElement ADDCONTACT_ELEMENT =driver.findElement(By.xpath("//h5[contains(text(), \"Add Contact\")]"));
 		
 		System.out.println(ADDCONTACT_ELEMENT.getText());
 		
 		Assert.assertEquals("ADD Contact not found", "Add Contact", ADDCONTACT_ELEMENT.getText());
 		
 		WebElement ADDFULLNAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"account\"]"));
 		ADDFULLNAME_ELEMENT.sendKeys("DORJI DUKPA");
 		
 		
 		//DROPDOWN-LIST-SELECT 
 		
 		WebElement DROP_ELEMENT =driver.findElement(By.xpath("//select[@id='cid']"));
 		
 		Select Sel =new Select(DROP_ELEMENT);
 		
 		Sel.selectByVisibleText("Techfios");
 		
	}
}


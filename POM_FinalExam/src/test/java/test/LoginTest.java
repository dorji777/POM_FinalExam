package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
// by creating an Object & by the name of the class
	
	@Test
	public void ValidUserShouldBeAbletoLogin() {
	 driver =	BrowserFactory.init();
	 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	 loginPage.clickonToggleAll();
	 loginPage.clickonSingleList();
	 loginPage.removeSingleList();
	 
		
	}
}

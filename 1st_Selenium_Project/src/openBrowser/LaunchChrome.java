package openBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jigme\\Desktop\\July2021\\1st_Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.close();
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

}

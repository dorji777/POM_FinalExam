package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	//Element Library
//	WebElement TOGGLE_ALL = driver.findElement(By.xpath("/html/body/div[3]/input[3]"));

/*Test 1: Validate when the toggle all check box is CHECKED, all check boxes for 
	list items are also CHECKED ON.*/
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TOGGLE_ALL;
/*Test 2: Validate that a single list item could be removed 
using the remove button when a single checkbox is selected.*/
	
	@FindBy(how= How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[2]/input" )
	WebElement CLICK_SINGLE_LIST;
	@FindBy(how= How.XPATH, using = "/html/body/div[3]/input[1]" )
	WebElement REMOVE_SINGLE_LIST;
	
	
	
	
	public void clickonToggleAll() {
		TOGGLE_ALL.click();
	
	}
	public void clickonSingleList() {
		CLICK_SINGLE_LIST.click();
	
	}
	public void removeSingleList() {
		REMOVE_SINGLE_LIST.click();
	}

}

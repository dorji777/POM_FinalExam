package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankNcash extends TestBase {
	
	WebDriver driver; 
	 public BankNcash(WebDriver driver) {
	  this.driver = driver;
	 }
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")WebElement BankCash;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]")WebElement NewAccount;
//	 @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")WebElement AccountsPage;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement Accounttitle;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")WebElement Description;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")WebElement Balance;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")WebElement Account_Number;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")WebElement Contact_Person;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")WebElement Contact_Phone;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")WebElement Ib_Url;
	 
	 
	 // Methods to interact with the elements
	 public void clickonBankCash() {
		 BankCash.click();;
	 }
	 public void clickonNewAccount() {
		 NewAccount.click();;
	 }
	 public void EnterAccounttitle(String accounttitle) {
		 Accounttitle.sendKeys(accounttitle);
	 }
	 public void description(String desc) {
		 Description.sendKeys(desc);
		 		 
	 }
	 public void balance(String bal) {
		 Balance.sendKeys(bal);
		 		 
	 }	 
	 public void Account_Number(String Ac_no) {
		 Account_Number.sendKeys(Ac_no);
		 		 
	 }	 
	 public void contact_person(String c_person) {
		 Contact_Person.sendKeys(c_person);
		 		 
	 }	 
	 
	 public void contact_Phone(String phone) {
		 Contact_Phone.sendKeys(phone);
		 		 
	 }	 
	 public void ib_url(String url) {
		 Ib_Url.sendKeys(url);
		 		 
	 }	 
		 
	 public String getPageTitle() {
	  return driver.getTitle();
	 }

}

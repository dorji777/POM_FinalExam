package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BankNcash;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinitions extends TestBase {
	// Given User is on the Techfios login page
	LoginPage loginPage;// -- Global Object
	BankNcash bankNcash;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		bankNcash = PageFactory.initElements(driver, BankNcash.class);

	}

	@Given("^User is on the Techfios login page$")

	public void Given_User_is_on_the_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	// When User enters username as "demo@techfios.com"

	@When("^User enters username as \"([^\"]*)\"$")
	// @When ("^User enters username as {string}")-- New version

	public void user_enters_username_as(String username) throws Exception {

		loginPage.enterUserName(username);
		Thread.sleep(3000);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
		Thread.sleep(3000);
	}

	@And("^User clikcks on signin button$")
	public void user_clikcks_on_signin_button() throws Throwable {
		loginPage.clickSignInButton();
		Thread.sleep(3000);
	}

	@Then("^user should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		String actualTitle = loginPage.getPageTitle();
		String expectedTitle = "Dashboard- iBilling";

		Assert.assertEquals(expectedTitle, actualTitle);
		// Assert.assertEquals(DASHBOAR_HEADER_ELEMENT.getText(), "Dashboard", "Wrong
		// Page!!!");

		takeScreenShot(driver);

	}
	@Given("^User is on Dashboard page$")
	public void user_is_on_Dashboard_page() throws Throwable {
		
			
		
	}

	@When ("^User click on bankCash$")	
	public void When_User_click_on_bankCash() throws Throwable {
		bankNcash.clickonBankCash();	
			
	}
	@And ("^User click on newAccount$")
	public void User_click_on_newAccount() throws Throwable {
		bankNcash.clickonNewAccount();
		
	}
		
	@Then("^User should land on Accounts Page$")
	public void user_should_land_on_Accounts_Page() throws Throwable {
		
	}

	@Then("^User enter accounttitle as \"([^\"]*)\"$")
	public void user_enter_accounttitle_as(String accounttitle) throws Throwable {

		bankNcash.EnterAccounttitle(accounttitle);
	}

	@Then("^User enter descriptive as \"([^\"]*)\"$")
	public void user_enter_descriptive_as(String arg1) throws Throwable {
		
	}

	@Then("^User enter initial balance as \"([^\"]*)\"$")
	public void user_enter_initial_balance_as(String arg1) throws Throwable {
	
	}

	@Then("^User enter Account Number as \"([^\"]*)\"$")
	public void user_enter_Account_Number_as(String arg1) throws Throwable {
	}

	@Then("^User enter Contact Person as \"([^\"]*)\"$")
	public void user_enter_Contact_Person_as(String arg1) throws Throwable {
	}

	@Then("^User enter phoneNo as \"([^\"]*)\"$")
	public void user_enter_phoneNo_as(String arg1) throws Throwable {
	}

	@Then("^User enter Internet banking URL as \"([^\"]*)\"$")
	public void user_enter_Internet_banking_URL_as(String arg1) throws Throwable {
	}

	@Then("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String arg1) throws Throwable {
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() throws Throwable {
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}

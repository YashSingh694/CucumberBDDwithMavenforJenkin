package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import pageObjects.AddcustomerPage;
import pageObjects.EditandDeletePage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Stepdef extends BaseClass {
	@Before
	public void setup() throws IOException {
		// Logging
		logger = Logger.getLogger("nopCommerceSDET");
		PropertyConfigurator.configure("Log4j.properties");
		logger.setLevel(Level.DEBUG);

		// Load properties file
		configProp = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);

		String br = configProp.getProperty("browser"); // getting the browser name from config.properties file

		// Launching browser
		if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}

		else if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			ChromeOptions ChromeOptions = new ChromeOptions();
			ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
			driver = new ChromeDriver(ChromeOptions);
		}

		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", configProp.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}

	}

	// Login steps....................
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		logger.info("************* Launching Browser *****************");
		lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		logger.info("************* Opening URL  *****************");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
		logger.info("************* Prvding user and password *****************");
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_Login() {
		logger.info("************* click on login *****************");
		lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String exptitle) throws InterruptedException {

		if (driver.getPageSource().contains("Login was unsuccessful")) {
			logger.info("************* Login failed *****************");
			driver.close();
			Assert.assertTrue(false);
		} else {
			logger.info("************* Login Passed *****************");
			Assert.assertEquals(exptitle, driver.getTitle());
		}
		Thread.sleep(3000);

	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		logger.info("************* clciking on logout *****************");
		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		logger.info("************* cloding browser *****************");
		driver.quit();
	}

	// Customer feature step definitions..........................................

	@Then("User can view Dashboad")
	public void user_can_view_Dashboad() {

		addCust = new AddcustomerPage(driver);
		logger.info("********* Verifying Dashboad page title after login successful **************");
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_Menu() throws InterruptedException {
		Thread.sleep(3000);
		logger.info("********* Clicking on customer main menu **************");
		addCust.clickOnCustomersMenu();
	}

	@When("click on customers Menu Item")
	public void click_on_customers_Menu_Item() throws InterruptedException {
		Thread.sleep(2000);
		logger.info("********* Clicking on customer sub menu **************");
		addCust.clickOnCustomersMenuItem();
	}

	@When("Enter customer EMail as {string}")
	public void enter_customer_EMail_as(String email) {
		searchCust = new SearchCustomerPage(driver);
		logger.info("********* Searching customer details by Email **************");
		searchCust.setEmail(email);// Write code here that turns the phrase above into concrete actions

	}

	@When("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		addCust.clickOnAddnew();
		Thread.sleep(2000);
	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		String email = randomestring() + "@gmail.com";
		addCust.setEmail(email);
		addCust.setPassword("test123");
		// Registered - default
		// The customer cannot be in both 'Guests' and 'Registered' customer roles
		// Add the customer to 'Guests' or 'Registered' customer role
		addCust.setCustomerRoles("Guest");
		Thread.sleep(3000);

		addCust.setManagerOfVendor("Vendor 2");
		addCust.setGender("Male");
		addCust.setFirstName("Pavan");
		addCust.setLastName("Kumar");
		addCust.setDob("7/05/1985"); // Format: D/MM/YYY
		addCust.setCompanyName("busyQA");
		addCust.setAdminContent("This is for testing.........");
	}

	@When("click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		logger.info("********* Saving customer details **************");
		addCust.clickOnSave();
		Thread.sleep(2000);
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(string));
	}

	// Searching customer by email ID.............................
	@When("Enter customer EMail")
	public void enter_customer_EMail() {
		searchCust = new SearchCustomerPage(driver);
		logger.info("********* Searching customer details by Email **************");
		searchCust.setEmail("victoria_victoria@nopCommerce.com");
	}

	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {
		searchCust.clickSearch();
		Thread.sleep(3000);
	}

	@Then("User should found Email {string} as in the Search table")
	public void user_should_found_Email_as_in_the_Search_table(String email) {
		boolean status = searchCust.searchCustomerByEmail(email);
		Assert.assertEquals(true, status);
	}

	@When("click on EditBtn")
	public void click_on_EditBtn() {
		editanddelete = new EditandDeletePage(driver);
		editanddelete.clkEditBTn();
		boolean Displayed =driver.findElement(By.xpath("//button[@name='save']")).isDisplayed();
		Assert.assertEquals(true, Displayed);		
	}

	@Then("Add the following details")
	public void add_the_following_details(DataTable dataTable) {
		List<String> details = dataTable.asList();
		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys(details.get(0));
		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys(details.get(1));
		driver.findElement(By.id("AdminComment")).clear();
		driver.findElement(By.id("AdminComment")).sendKeys(details.get(2));
	 }
	

	@Then("User should found Email in the Search table")
	public void user_should_found_Email_in_the_Search_table() {
		boolean status = searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true, status);
	}

	// steps for searching a customer by Name................
	@When("Enter customer FirstName")
	public void enter_customer_FirstName() {
		logger.info("********* Searching customer details by Name **************");
		searchCust = new SearchCustomerPage(driver);
		searchCust.setFirstName("Victoria");
	}

	@When("Enter customer LastName")
	public void enter_customer_LastName() {
		searchCust.setLastName("Terces");
	}

	@Then("User should found Name in the Search table")
	public void user_should_found_Name_in_the_Search_table() {
		boolean status = searchCust.searchCustomerByName("Victoria Terces");
		Assert.assertEquals(true, status);
	}

}

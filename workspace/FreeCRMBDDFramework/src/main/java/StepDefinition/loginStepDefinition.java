package StepDefinition;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*public class loginStepDefinition {
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^title is Free CRM$")
	public void title_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		Assert.assertEquals(
				"#1 Free CRM for Any Business: Online Customer Relationship Software",
				title);
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_Username_and_Password(String username,
			String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginButton = driver.findElement(By
				.xpath("//input[@type='submit']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", loginButton);
	}

	@Then("^User is on home page$")
	public void user_is_on_home_page() {
		String homeTitle = driver.getTitle();
		// Assert.assertEquals("CRMPRO", homeTitle);
		if (homeTitle.equalsIgnoreCase("CRMPRO")) {
			System.out.println("Login was success");
		} else {
			System.out.println("Login was failed");
		}
	}

	@When("^User clicks on Contact tab and select new contact$")
	public void user_clicks_on_Contact_tab_and_select_new_contact()
			throws Throwable {
		driver.switchTo().frame("mainpanel");
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		a.moveToElement(e).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		Thread.sleep(5000);
	}

	@Then("^Create new contact form opens$")
	public void create_new_contact_form_opens() {
		Boolean contactDisplayed = driver.findElement(By.name("first_name")).isDisplayed();
		Assert.assertTrue(contactDisplayed);

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String firstName, String lastName,
			String position) {
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.id("surname")).sendKeys(lastName); ;
		driver.findElement(By.id("company_position")).sendKeys(position);
	
	}

	@When("^User clicks on Save button$")
	public void user_clicks_on_Save_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}*/

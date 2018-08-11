package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepDefination extends TestBase {
	LoginPage login;
	HomePage homepage;
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_already_on_Login_page() {
		/*System.setProperty("webdriver.chrome.driver",
				"C://Users//User//eclipse-workspace//FreecrmBDDFramework1//src//main//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");*/
		
		//Launch the Browser
		lauchBrowser();
		url();
		
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		/*String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("Free CRM in the cloud software boosts sales", Title);*/
		login=new LoginPage();
		login.validateLoginPagetitle();

	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String Username,String Password) 
	{
		
		/*driver.findElement(By.name("Username")).sendKeys(Username);
		driver.findElement(By.name("Password")).sendKeys(Password);*/
		
		homepage=login.loginPage(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("^user clicks on Login Button$")
	public void user_clicks_on_Login_Button() {
		/*WebElement LoginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		try {
			LoginButton.click();
		} catch (Exception e) {
			Actions actions = new Actions(driver);
			actions.moveToElement(LoginButton).click().build().perform();
		}*/
		login=new LoginPage();
		login.clickLoginBtn();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		/*String Title = driver.getTitle();
		System.out.println("home page Title is" + Title);
		Assert.assertEquals("CRMPRO", Title);*/
		String homepageTitle=homepage.validateHomeTitle();
		Assert.assertEquals("Free CRM in the cloud software boosts sales", homepageTitle);
		

	}
	
 	
	
}

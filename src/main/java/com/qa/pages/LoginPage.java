package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	 
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement login;
	
	@FindBy(name="//td[text()='CRMPRO']")
	public WebElement Crmpro;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginPage(String un, String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		
		/*JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("argument[0].click();",loginBtn);*/
		return new HomePage();
	}
	 
	public void clickLoginBtn() {
		login.click();
	}
	
	public String validateLoginPagetitle() {
		return driver.getTitle();
	}
	
	public String validateloginImg() {
		return Crmpro.getText();
	}
	
}

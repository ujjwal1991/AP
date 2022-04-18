package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtils;

public class LoginPage {
	public WebDriver driver;
	private ElementUtils elementUtils;
	//1. By locator or page object or object repository
	//2. All locators should be private in nature to achieve encapsulation
	
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginbutton = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	private By registerLink = By.linkText("Register");
	
	// Page Constructor:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtils = new ElementUtils(driver);
	}
	
	//3.Page actions/methods/features:
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public String getLoginPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean isForgotPwdLinkExists() {
		return elementUtils.doIsDiplayed(forgotPwdLink);
	}
	
	public boolean isRegisterLinkExists() {
		return elementUtils.doIsDiplayed(registerLink);
	}
	
	public AccountsPage doLogin(String un, String pwd) {
//		driver.findElement(emailId).sendKeys(un);
//		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(loginbutton).click();
		
		elementUtils.doSendKeys(emailId, un);
		elementUtils.doSendKeys(password, pwd);
		elementUtils.doClick(loginbutton);
		return new AccountsPage(driver);
		
	}
	
	
}







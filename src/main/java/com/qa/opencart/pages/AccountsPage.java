package com.qa.opencart.pages;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtils;

public class AccountsPage {
  
	 private WebDriver driver;
	 private ElementUtils elementUtils;
	 
	private By search = By.name("search");
	private By logoutLink = By.linkText("Logout");
	private By accSecsHeader = By.cssSelector("div#content  h2");
	
	// Page Constructor
	public  AccountsPage(WebDriver driver) {
		this.driver = driver;
		elementUtils  = new ElementUtils(driver);
	}
	
	
	public String getaccountPageTitle() {
		return elementUtils.waitForTitleToBe(Constants.DEFAULT_TIME_OUT, Constants.ACCOUNT_PAGE_TITLE);
	}
	
	public boolean islogoutLinkExists() {
		return elementUtils.doIsDiplayed(logoutLink);
		
	}
	
	public boolean isSearchFieldExists() {
		return elementUtils.doIsDiplayed(search);
		
	}
	
	public List<String> getAccontSecList() {
		List<WebElement> secList =  elementUtils.getElements(accSecsHeader);
		List<String> secHeaderList = new ArrayList<String>();
		for (WebElement e : secList) {
			secHeaderList.add(e.getText());
			}
		 return secHeaderList;
		
	}
	
	
	
	
	
	
	
	
	
	
}

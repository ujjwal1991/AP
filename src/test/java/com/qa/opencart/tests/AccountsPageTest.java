package com.qa.opencart.tests;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.Constants;

public class AccountsPageTest extends BaseTest {
     
	@BeforeClass
	public void accPageSetup() {
		accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void accPageTitle() {
		String title = accPage.getaccountPageTitle();
		System.out.println("Acc Page Title is " + title);
		Assert.assertEquals(title, Constants.ACCOUNT_PAGE_TITLE);
	}
	
	@Test
	public void accPageLogoutLinkTest() {
		Assert.assertTrue(accPage.islogoutLinkExists()); 
	}
	
	@Test
	public void accsearchFieldTest() {
		Assert.assertTrue(accPage.isSearchFieldExists()); 
	}
	
	@Test
	public void accPageSecHeaderTest() {
		List<String> actualList =  accPage.getAccontSecList();
		System.out.println(actualList);
		Assert.assertEquals(actualList, Constants.EXP_ACCOUNTS_SECTIONS_LIST);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

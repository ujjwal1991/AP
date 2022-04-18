package com.qa.opencart.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {

	public static final int DEFAULT_TIME_OUT = 5;
	public static final String LOGIN_PAGE_TITLE = "Account Login";
	//public static final String LOGIN_PAGE_URL = "https://demo.opencart.com/index.php?route=account/login";
	public static final String LOGIN_PAGE_URL_VALUE = "account/login";
	public static final String ACCOUNT_PAGE_TITLE = "My Account";
	
	public static final List<String> EXP_ACCOUNTS_SECTIONS_LIST = new ArrayList<String>(Arrays.asList("My Account", "My Orders", "My Affiliate Account", "Newsletter"));
}

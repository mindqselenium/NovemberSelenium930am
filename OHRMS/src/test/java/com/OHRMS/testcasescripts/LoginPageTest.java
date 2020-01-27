package com.OHRMS.testcasescripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
//import org.w3c.dom.DOMConfiguration;

import com.OHRMS.Pages.Dashboardpage;
import com.OHRMS.Pages.HomePage;
import com.OHRMS.Pages.LoginPage;
import com.OHRMS.baseclass.Baseclass;
import com.OHRMS.util.Testutil;

public class LoginPageTest  extends Baseclass {

	
	HomePage hp;
	LoginPage lp;
	
	Logger logger=Logger.getLogger(LoginPageTest.class);
	String configurepath=System.getProperty("F:\\November Selenium930AM\\OHRMS\\src\\main\\java\\log4j.properties");
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
	}

	@BeforeTest
	public void setup() throws Exception{
		logger.info("initialization started");
		initialization();
		lp=new LoginPage();		//login page initialization
		
	}
	
	
	@Test(priority=1)
	public void LoginTest() throws Exception{
		
		takescreenshot("login page");
		logger.info("before login screenshot captured");
	
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	takescreenshot("dashboard page");
	logger.info("after login screenshot captured");
		
}

	@AfterTest
	public void teardown(){
		//driver.quit();
	}
}

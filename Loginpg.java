package com.Letcode.pageobject;

import java.time.Duration; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpg {
	WebDriver ldriver;

	public Loginpg(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//*[text()='Sign up']")
	WebElement signbtn;

	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Enter your name']")
	WebElement namefld;

	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Enter valid email address']")
	WebElement emailfld;

	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Enter your password']")
	WebElement psdfld1;

	@CacheLookup
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement ckcbox;

	@CacheLookup
	@FindBy(xpath = "//button[text()='SIGN UP']")
	WebElement submitbtn;

	@CacheLookup
	@FindBy(xpath = "//*[@id='toast-container']")
	WebElement toaster;

	@CacheLookup
	@FindBy(xpath = "//*[text()='Sign out']")
	WebElement signoutbtn;

	@CacheLookup
	@FindBy(xpath = "//*[contains(@class,'toast-top-right toast-container')]")
	WebElement toast;

	@CacheLookup
	@FindBy(xpath = "//*[text()='Log in']")
	WebElement loginbtn;

	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Enter registered email'])[1]")
	WebElement mailfld;

	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Enter password'])[1]")
	WebElement psdfld2;

	@CacheLookup
	@FindBy(xpath = "//*[text()='LOGIN']")
	WebElement lgnbtn;

	public void signup() {
		try {
		signbtn.click();
		namefld.sendKeys("tester");
		emailfld.sendKeys("testg1@yopmail.com");
		psdfld1.sendKeys("Test@1234");
		ckcbox.click();
		submitbtn.click();
		toaster.click();
			Thread.sleep(2000);
			signoutbtn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void login() {
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		toast.click();
		try {
			Thread.sleep(2000);
			loginbtn.click();
			mailfld.sendKeys("testg1@yopmail.com");
			psdfld2.sendKeys("Test@1234");
			lgnbtn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

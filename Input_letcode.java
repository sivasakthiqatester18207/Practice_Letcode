package com.Letcode.pageobject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Input_letcode
{
	public WebDriver ldriver;
	
	public Input_letcode(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@CacheLookup
	@FindBy(xpath = "//*[text()='Edit']")
	WebElement editlnktxt;
	
	public void clkeditlnk()
	{
		editlnktxt.click();
	}
	
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Enter first & last name']")
	WebElement fullnamefld;
	
	public void sendfullname()
	{
		fullnamefld.sendKeys("Automatiion Testing");
	}
	
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Enter '])[1]")
	WebElement append_tab;
	
	public void append_tab()
	{
		append_tab.sendKeys(" Tester", Keys.TAB);
	}
	
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Enter '])[2]")
	WebElement insidetxtbox;
	
	public void insidetxtbox()
	{
		String insidetext = insidetxtbox.getAttribute("value");
		System.out.println("Inside text is"+ insidetext);
	}
	
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Enter '])[3]")
	WebElement clrtxt;
	
	public void clrtxt()
	{
		clrtxt.clear();
	}
	
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Enter'])")
	WebElement isflddisable;
	
	public void isflddisable()
	{
		boolean enabled = isflddisable.isEnabled();
		System.out.println("Is the field Enabled "+enabled);
	}
	
	@CacheLookup
	@FindBy(xpath = "(//*[@id='dontwrite'])")
	WebElement  readonly;
	
	public void readonly()
	{
		
		String isreadable = readonly.getAttribute("readonly");
		System.out.println("Yes it is "+isreadable);
	}
}

package com.Letcode.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.Letcode.pageobject.Input_letcode;

public class TC_input_letcode
{
	public WebDriver driver;

	@Test
	
	public void inputs()
	{
		ChromeOptions op = new ChromeOptions();
		op.setBrowserVersion("130");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Input_letcode il = new Input_letcode(driver);
//		il.clkeditlnk();
		il.sendfullname();
		il.append_tab();
		il.insidetxtbox();
		il.clrtxt();
		il.isflddisable();
		il.readonly();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}

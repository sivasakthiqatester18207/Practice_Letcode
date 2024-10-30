package com.Letcode.testcase;

import org.testng.annotations.Test;

import com.Letcode.pageobject.Loginpg;

public class TC_Login extends Baseclass
{
	@Test
	public void loginpg()
	{
		Loginpg lpg = new Loginpg(driver);
		lpg.signup();
		lpg.login();
	}
}

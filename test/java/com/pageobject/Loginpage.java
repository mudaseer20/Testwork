package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	@FindBy(id="Email")
	WebElement username;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
public Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void enterusername(String user) {
	username.sendKeys(user);
}
public void enterpassword(String pwd) {
	password.sendKeys(pwd);
}
	public void loginuspwd() {
		login.click();
	}
	
}

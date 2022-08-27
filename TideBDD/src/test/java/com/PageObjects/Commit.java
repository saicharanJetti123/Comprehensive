package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Commit {

	
	WebDriver driver;
	public Commit(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 
	@FindBy(xpath="//a[@data-action-detail='Our Commitment']")
	WebElement Comm;
	
	
	@FindBy(linkText="Turn to Cold with Tide")
	WebElement Tide;
	
	
	
	public void Comm() {
		
		Comm.click();
	}
	
	public void Tide() {
		
		Tide.click();
	}
	
}

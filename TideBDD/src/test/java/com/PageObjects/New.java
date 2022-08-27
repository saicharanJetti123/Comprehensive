package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New {

	WebDriver driver;
	public New(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@data-action-detail='What’s New']")
	WebElement NewItem;
	
	@FindBy(xpath="//*[@id=\"site-content\"]/div/div/div/div[3]/div[1]/div/div/div/section/div[2]/div[2]/div/a")
	WebElement More;
	
	
	public void NewItem() {
		
		NewItem.click();
	}

	public void More() {
		
		More.click();
	}
}

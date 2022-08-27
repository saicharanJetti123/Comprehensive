package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons {
	
	WebDriver driver;
	public Coupons(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[@data-action-detail='Coupons and Rewards']")
	WebElement Reward;
	
	
	public void Reward1() {
		 Reward.click();;
	}
	
	
}


package com.toolsQAcom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toolsQAcom.base.BaseClass;

public class TextBoxPom extends BaseClass {
	
	public TextBoxPom() {
		PageFactory.initElements(driver , this);		
	}
	
	@FindBy(id = "userName")
	WebElement fullName ;
	
	@FindBy(id = "userEmail")
	WebElement userEmail ;
	
	@FindBy(id = "currentAddress")
	WebElement currentAddress ;
	
	@FindBy(id = "permanentAddress")
	WebElement permanentAddress ;
	
	public boolean validateFNbox() {
		if(fullName.isDisplayed()) {
			System.out.println("fullName is available");
			return true ;
		} else {
			return false ;
		}
	}

}

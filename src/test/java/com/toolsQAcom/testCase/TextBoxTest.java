package com.toolsQAcom.testCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.toolsQAcom.base.BaseClass;
import com.toolsQAcom.pom.TextBoxPom;

public class TextBoxTest extends BaseClass {
	
	TextBoxPom textBoxPom ;
	
	@BeforeMethod
	public void setup() {
		intializationDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void validateFNbox() {
		textBoxPom = new TextBoxPom();
		
		boolean ref = textBoxPom.validateFNbox();
		Assert.assertTrue(ref);
	}

}

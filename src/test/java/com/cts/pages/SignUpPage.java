package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	private static By signupusernameLoc = By.id("sign-username");
	private static By signuppasswordLoc = By.id("sign-password");
	private static By signupLoc = By.xpath("//button[contains(text(),'Sign up')]");

	public static void clickOnSignUpUsername(WebDriver driver, String Username) {
		driver.findElement(signupusernameLoc).sendKeys(Username);

	}

	public static void clickOnSignUpPassword(WebDriver driver, String Password) {
		driver.findElement(signuppasswordLoc).sendKeys(Password);

	}

	public static void clickSignUp(WebDriver driver) {
		driver.findElement(signupLoc).click();

	}

}

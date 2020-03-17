package com.cts.stepdefnitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.pages.AddToCartPage;
import com.cts.pages.CartPage;
import com.cts.pages.ContactInfoPage;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.NextPage;
import com.cts.pages.OrderInfo;
import com.cts.pages.SignUpPage;
import com.cts.pages.ThanksPage;

import io.cucumber.java.en.*;

public class StepDefnition {
	WebDriver driver;

	@Given("I have browser with demoblaze page")
	public void i_have_browser_with_demoblaze_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoblaze.com/");
	}

	// Scenario: Valid Signup

	@When("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String Username, String Password) {
		HomePage.clickonSignUp(driver);
		SignUpPage.clickOnSignUpUsername(driver, Username);
		SignUpPage.clickOnSignUpPassword(driver, Password);
		SignUpPage.clickSignUp(driver);
	}

	@Then("I should get popup as {string}")
	public void i_should_get_popup_as(String expectedpopup) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());

		String actualpopup = driver.switchTo().alert().getText();
		System.out.println(actualpopup);
		Assert.assertEquals(expectedpopup, actualpopup);
		//driver.quit();

	}

	// Scenario: Invalid signup with blank username/password

	@When("I enter blankusername as {string} and password as {string}")
	public void i_enter_blankusername_as_and_password_as(String Username, String Password) {
		HomePage.clickonSignUp(driver);
		SignUpPage.clickOnSignUpUsername(driver, Username);
		SignUpPage.clickOnSignUpPassword(driver, Password);
		SignUpPage.clickSignUp(driver);

	}

	@Then("I should get error popup as {string}")
	public void i_should_get_error_popup_as(String expectedpopup) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualpopup = driver.switchTo().alert().getText();
		System.out.println(actualpopup);
		Assert.assertEquals(expectedpopup, actualpopup);
		//driver.quit();
	}

// valid credential

	@When("I enter username as {string} and I enter password as {string}")
	public void i_enter_username_as_and_I_enter_password_as(String username, String password)
			throws InterruptedException {
		HomePage.clickOnLogin(driver);
		Thread.sleep(2000);
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.clickLogin(driver);
	}

	@Then("I should have login to the account")
	public void i_should_have_login_to_the_account() {
		System.out.println("Then");
		//driver.quit();
	}

//Scenario: Invalid Password Credential 

	@When("I enter valid username as {string} and invalid password as {string}")
	public void i_enter_username_as_and_invalid_password_as1(String userName, String Password)
			throws InterruptedException {
		HomePage.clickOnLogin(driver);
		Thread.sleep(2000);
		LoginPage.enterUsername(driver, userName);
		LoginPage.enterPassword(driver, Password);
		LoginPage.clickLogin(driver);

	}

	@Then("I should get error popup message as {string}")
	public void i_should_get_error_popup_message_as(String expectedtext) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualtext = driver.switchTo().alert().getText();
		System.out.println(actualtext);
		Assert.assertEquals(expectedtext, actualtext);
		//driver.quit();
	}

//Scenario: Invalid Username Credential

	@When("I enter Invalid username as {string} and password as {string}")
	public void i_enter_Invalid_username_as_and_password_as(String userName, String Password)
			throws InterruptedException {
		HomePage.clickOnLogin(driver);
		Thread.sleep(2000);
		LoginPage.enterUsername(driver, userName);
		LoginPage.enterPassword(driver, Password);
		LoginPage.clickLogin(driver);

	}

	@Then("I should get error popup message as {string}")
	public void i_should_get_error_popup_textmessage_as(String expectedtext) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualtext = driver.switchTo().alert().getText();
		System.out.println(actualtext);
		Assert.assertEquals(expectedtext, actualtext);
		//driver.quit();
	}

	// Scenario: Blank Username or password

	@When("I enter blank username as {string} and password as {string}")
	public void i_enter_blank_username_as_and_password_as(String userName, String Password)
			throws InterruptedException {

		HomePage.clickOnLogin(driver);
		Thread.sleep(2000);
		LoginPage.enterUsername(driver, userName);
		LoginPage.enterPassword(driver, Password);
		LoginPage.clickLogin(driver);
	}

	@Then("I should get error message as {string}")
	public void i_should_get_error_message_as(String expectedtext) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualtext = driver.switchTo().alert().getText();
		System.out.println(actualtext);
		Assert.assertEquals(expectedtext, actualtext);
		//driver.quit();
	}

//	Scenario: valid filling contact 

	@When("I enter valid recepeintEmail as {string} and recepientName as {string} and message as {string}")
	public void i_enter_valid_recepeintEmail_as_and_recepientName_as_and_message_as(String recepientMailId,
			String recepientName, String Message) {
		ContactInfoPage.clickOnContact(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("recipient-email")));
		ContactInfoPage.enterRecepientMailId(driver, recepientMailId);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("recipient-name")));
		ContactInfoPage.enterRecepientName(driver, recepientName);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message-text")));
		ContactInfoPage.enterMessage(driver, Message);
		ContactInfoPage.clickOnMessage(driver);
	}

	@Then("I should get complete contact filling popup message as {string}")
	public void i_should_get_complete_contact_filling_popup_message_as(String expectedContactFillingAlertMessage) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualContactFillingAlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(actualContactFillingAlertMessage, expectedContactFillingAlertMessage);
		//driver.quit();
	}

//	Scenario: Contact Blank fill

	@When("I will not enter valid recepientEmail as {string} and recepientName as {string} and message as {string}")
	public void i_will_not_enter_valid_recepientEmail_as_and_recepientName_as_and_message_as(String recepientMailId,
			String recepientName, String Message) {
		ContactInfoPage.clickOnContact(driver);
		ContactInfoPage.enterRecepientMailId(driver, recepientMailId);
		ContactInfoPage.enterRecepientName(driver, recepientName);
		ContactInfoPage.enterMessage(driver, Message);
		ContactInfoPage.clickOnMessage(driver);
	}

	@Then("I should get popup message without filling details as {string}")
	public void i_should_get_popup_message_without_filling_details_as(
			String expectedWithoutContactFillingAlertMessage) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualWithoutContactFillingAlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(actualWithoutContactFillingAlertMessage, expectedWithoutContactFillingAlertMessage);
		//driver.quit();
	}

	// Scenario: selecting a product in the home page

	@When("I click on the product in home page and click on add to cart")
	public void i_click_on_the_product_in_home_page_and_click_on_add_to_cart() {
		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		AddToCartPage.clickOnAddToCart(driver);
	}

	@Then("I should get a popup message as {string}")
	public void i_should_get_a_popup_message_as(String expectedText) {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.alertIsPresent());
		String actualText = driver.switchTo().alert().getText();
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		//driver.quit();
	}
//Scenario: selecting a product in the next page

	@When("I click on next and selcet a product and add to cart")
	public void i_click_on_next_and_selcet_a_product_and_add_to_cart() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.clickNext(driver);
		NextPage.nextPageProducts(driver);
		Thread.sleep(1000);
		AddToCartPage.clickOnAddToCart(driver);

	}

	@Then("It should navigate to the next page and I should get a popup message as {string}")
	public void it_should_navigate_to_the_next_page_and_I_should_get_a_popup_message_as(String expectedText) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualText = driver.switchTo().alert().getText();
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		//driver.quit();

	}

//Scenario: Deleting a product from the cart 
	@When("I click on delete")
	public void i_click_on_delete() throws InterruptedException {
		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		AddToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		AddToCartPage.clickCart(driver);
		CartPage.clickonDelete(driver);

	}

	@Then("The product should be deleted")
	public void the_product_should_be_deleted() {
		System.out.println("Then");
		//driver.quit();
	}

//Scenario: Placing order 
	@When("I click on place order")
	public void i_click_on_place_order() {
		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		AddToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		AddToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

	}

	@Then("it should display {string} form for filling details")
	public void it_should_display_form_for_filling_details(String expectedText) {
//		String actualText=OrderInfo.checkPlaceOrder(driver);
//		System.out.println(actualText);
//		Assert.assertEquals(expectedText, actualText);
		System.out.println("Then");
		//driver.quit();
	}

//Scenario: Filling all details for purchase 
	@When("I enter name as {string} and country as {string} and City as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order")
	public void i_enter_name_as_and_country_as_and_City_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(
			String name, String country, String city, String creditcard, String month, String year) {

		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		AddToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		AddToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

		OrderInfo.enterName(driver, name);
		OrderInfo.enterCountry(driver, country);
		OrderInfo.enterCity(driver, city);
		OrderInfo.enterCreditCard(driver, creditcard);
		OrderInfo.enterMonth(driver, month);
		OrderInfo.enterYear(driver, year);
		OrderInfo.clickPurchase(driver);
	}

	@Then("It should display a popup message as {string}")
	public void it_should_display_a_popup_message_as(String expectedmessage) {
		String actualmessage = ThanksPage.thanksMessage(driver);
		System.out.println(actualmessage);
		Assert.assertEquals(expectedmessage, actualmessage);
		//driver.quit();
	}

//	Scenario: Blank name or Credit card 
	@When("I enter Blank name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order")
	public void i_enter_Blank_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(
			String name, String country, String city, String creditcard, String month, String year) {

		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		AddToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		AddToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

		OrderInfo.enterName(driver, name);
		OrderInfo.enterCountry(driver, country);
		OrderInfo.enterCity(driver, city);
		OrderInfo.enterCreditCard(driver, creditcard);
		OrderInfo.enterMonth(driver, month);
		OrderInfo.enterYear(driver, year);
		OrderInfo.clickPurchase(driver);
		//driver.quit();
	}

	@Then("It should display a error popup message as {string}")
	public void it_should_display_a_error_popup_message_as(String expectedText) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualText = driver.switchTo().alert().getText();
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);
	}
	// Scenario: Filling all the details and click on close

	@When("I enter name as {string} and Country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order and click on close")
	public void i_enter_name_as_and_Country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_close(
			String name, String country, String city, String creditcard, String month, String year) {
		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		AddToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		AddToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

		OrderInfo.enterName(driver, name);
		OrderInfo.enterCountry(driver, country);
		OrderInfo.enterCity(driver, city);
		OrderInfo.enterCreditCard(driver, creditcard);
		OrderInfo.enterMonth(driver, month);
		OrderInfo.enterYear(driver, year);
		// OrderInfo.clickPurchase(driver);
		OrderInfo.clickOnClose(driver);

	}

	@Then("It should go back to the cartpage and assert for {string}")
	public void it_should_go_back_to_the_cartpage_and_assert_for(String expectedText) {

		String actualText = CartPage.checkPlaceOrder(driver);
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		//driver.quit();
	}

//	Scenario: Filling all details for purchase and click on OK 
	@When("I enter Name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order and click on ok")
	public void i_enter_Name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_ok(
			String name, String country, String city, String creditcard, String month, String year) {

		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		AddToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		AddToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

		OrderInfo.enterName(driver, name);
		OrderInfo.enterCountry(driver, country);
		OrderInfo.enterCity(driver, city);
		OrderInfo.enterCreditCard(driver, creditcard);
		OrderInfo.enterMonth(driver, month);
		OrderInfo.enterYear(driver, year);
		OrderInfo.clickPurchase(driver);
		ThanksPage.clickOnOK(driver);
		
	}

	@Then("It should navigate to {string} page")
	public void it_should_navigate_to_page(String expectedtext) {
		String actualtext = HomePage.checkHomePageElement(driver);
		System.out.println(actualtext);
		Assert.assertEquals(expectedtext, actualtext);
		//driver.quit();
	}

}

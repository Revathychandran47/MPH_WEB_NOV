package Stepdefinition;

import java.io.IOException;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;

import Reusable_Functions.Generic_function;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup_positive_scenarios extends Generic_function {
	public static boolean value1,value2;
	public static String text,phonenumber = random_number();

	/*TC_001 Verify that the browser is lauched.Clicks on the Signup button and navigates to Signup page*/
	@Given("Launch the URL and click on signup")
	public static void launching() throws Exception  {
		try {
			Browser_Launch();
			click("welcome_signup");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_launching");
		}
	}
	@Then("Navigated to signup page")
	public static void navigate_to_signup_page() throws Exception  {
		try {
			value1=driver.findElement(By.xpath(OR_reader("signup_title"))).isDisplayed();
			Assert.assertEquals(true,value1);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_navigate_to_signup_page");
		}
	}

	/*TC_002 Verify clicking on login link will navigate to login page*/
	@When("Clicks on the 'Login' link")
	public static void click_on_login_link() throws Exception{
		try{
			click("login_link");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_click_on_login_link");
		}
	}
	@Then("Navigates to the login page")
	public static void navigate_to_login() throws Exception{
		try{
			value1=driver.findElement(By.xpath(OR_reader("login_phone_number"))).isDisplayed();
			Assert.assertEquals(true,value1);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_navigate_to_login");
		}
	}

	/*TC_003 Verify that the data entered in both Password and Confirm password fields are masked*/
	@When("Enter details in the 'Password' and 'Confirmed Password' field should be masked")
	public static void enter_passwords() throws Exception{
		try {
			driver.navigate().back();
			click("welcome_signup");
			driver.findElement(By.xpath(OR_reader("signup_password"))).sendKeys(td_reader("signup_password",1));
			driver.findElement(By.xpath(OR_reader( "signup_confirm_password"))).sendKeys(td_reader("signup_confirm_password",2));
			value1=driver.findElement(By.xpath(OR_reader( "signup_password"))).isDisplayed();
			value2=driver.findElement(By.xpath(OR_reader("signup_confirm_password"))).isDisplayed();
			Assert.assertEquals(true,value1);
			Assert.assertEquals(true,value2);
			browser_refresh();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_enter_passwords");
		}
	}

	/* TC_004 Verify that the password should be displayed on an eye click for Password fields*/
	@When("Clicks on the Eye")
	public static void click_on_show_password() throws Exception  {
		try {
			driver.findElement(By.xpath(OR_reader("signup_password"))).sendKeys(td_reader("signup_password",1));
			click("show_password");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_click_on_show_password");
		}
	}
	@Then("Original value should be displayed in the password fields")
	public static void display_value() throws Exception  {
		try {
			browser_wait(1000);
			value1=driver.findElement(By.xpath(OR_reader( "show_password"))).isDisplayed();
			Assert.assertEquals(true,value1);
			browser_refresh();  
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_display_value");
		}
	}

	/* TC_005 Verify that the Confirm password field by comparing data entered in the Password field*/ 
	@When("Enter same values of 'Password' in the 'Confirmed Password' field")
	public void passwords() throws Exception {
		try {
			driver.findElement(By.xpath(OR_reader("signup_password"))).sendKeys(td_reader("signup_password",1));
			driver.findElement(By.xpath(OR_reader( "signup_confirm_password"))).sendKeys(td_reader("signup_confirm_password",2));  
			value1=driver.findElement(By.xpath(OR_reader( "signup_password"))).isDisplayed();
			value2=driver.findElement(By.xpath(OR_reader("signup_confirm_password"))).isDisplayed();
			Assert.assertEquals(true,value1);
			Assert.assertEquals(true,value2);
			browser_refresh();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_passwords");
		}
	}
	
	/*TC_006 Verify referral code is edited,deleted and added*/
	@When("add,delete and edit referral code")
	public void add_delete_edit_code() throws Exception, InterruptedException {
		try {
			browser_wait(5000);
			click("signup_referral_code");
			driver.findElement(By.xpath(OR_reader("signup_referral_code"))).sendKeys("TESTf41c");
			click("signup_apply");
			text= driver.findElement(By.xpath(OR_reader("signup_referral_code_message"))).getText();
			Assert.assertEquals(text,"Referral code successfully applied");
			browser_wait(10000);
			browser_refresh();
			driver.findElement(By.xpath(OR_reader("signup_referral_code"))).sendKeys("TESTe1a3");
			click("signup_apply");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("add_delete_edit_code");
		}  
	}
	@Then("validation message should be displayed")
	public void display_validation_message() throws Exception, ExceptionInInitializerError {
		try {
			text= driver.findElement(By.xpath(OR_reader("signup_referral_code_message"))).getText();
			Assert.assertEquals(text,"Referral code successfully applied");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("display_validation_message");
		}  	
	}

	/* TC_007 Verify click on Sign Up with valid credentials*/ 
	@When("Enters valid credentials")
	public void enter_valid_credentials() throws Exception {
		try {
			driver.findElement(By.xpath(OR_reader( "signup_first_name"))).sendKeys(td_reader("signup_first_name",2));
			driver.findElement(By.xpath(OR_reader( "signup_last_name"))).sendKeys(td_reader("signup_last_name",2));
			driver.findElement(By.xpath(OR_reader("signup_email_id"))).sendKeys(td_reader("signup_email_id",2));
			driver.findElement(By.xpath(OR_reader("signup_phone_number"))).sendKeys(phonenumber);
			driver.findElement(By.xpath(OR_reader("signup_password"))).sendKeys(td_reader("signup_password",2));
			driver.findElement(By.xpath(OR_reader( "signup_confirm_password"))).sendKeys(td_reader("signup_password",2));
			click("signup_terms_and_conditions");
			browser_wait(1000);
			click("signup");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_enter_valid_credentials");
		}
	}
	@Then("Verify navigation to OTP page")
	public void verify_OTP_page() throws Exception {
		try {
			browser_wait(1000);
			value1 = driver.findElement(By.xpath(OR_reader("otp_1"))).isDisplayed();
			Assert.assertEquals(true, value1);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("signup_positive_verify_OTP_page");
		}
	}

	/*TC_008 Verify user should be navigated to the otp Login page*/
	@When("Enters otp")
	public void enter_otp() throws Exception, InterruptedException {
		try {
			driver.findElement(By.xpath(OR_reader("otp_1"))).sendKeys(td_reader("otp_1"));
			driver.findElement(By.xpath(OR_reader("otp_2"))).sendKeys(td_reader("otp_2"));
			driver.findElement(By.xpath(OR_reader("otp_3"))).sendKeys(td_reader("otp_3"));
			driver.findElement(By.xpath(OR_reader("otp_4"))).sendKeys(td_reader("otp_4"));	
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_enter_otp");
		}  
	}
	@Then("Clicks on verify button")
	public void click_verify() throws Exception, ExceptionInInitializerError {
		try{
			click("verify");
			value1 = driver.findElement(By.xpath(OR_reader( "login_title"))).isDisplayed();
			Assert.assertEquals(true,value1);
			browser_close();
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("signup_positive_click_verify");
		}
	}
}

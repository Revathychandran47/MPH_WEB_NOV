package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class Login_positive_scenarios extends Generic_function {
	public static boolean value;
	static String str;

	/*TC 001 - Validate that the'Phone number' field is prefixed with '+1' country code*/
	@Given("Launch the URL")
	public static void browser_launching() throws Exception  {
		try {
			Browser_Launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@When("Clicks on 'Login' button")
	public void clicks_on_login_button() throws Exception {
		try {
			click("welcome_login");
			browser_wait(1000);
			str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
			Assert.assertEquals(str,td_reader("login_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_clicks_on_login_button");
		}
	}
	@Then("check  the  'Phone number' field is prefixed with country code")
	public static void checks_prefixed_code() throws Exception   {
		try {
			value = driver.findElement(By.xpath(OR_reader( "plus_one"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_checks_prefixed_code");
		}
	}

	/*TC 002 - Validate that the user is able to click on the 'Forgot password?' link*/
	@When("clicks on 'Forgot password'")
	public static void clicks_on_forgot_password() throws Exception  {
		try {
			click("forgot_password_link");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_clicks_on_forgot_password");
		}
	}
	@Then("navigated to Forgot password page")
	public void navigated_to_forgot_password_page() throws IOException {
		try {
			browser_wait(12);
			str= driver.findElement(By.xpath(OR_reader("forgot_password_title"))).getText();
			Assert.assertEquals(str,td_reader("forgot_password_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_navigated_to_forgot_password_page");
		}
	}

	/*TC 003 - Validate that the user is able click on the 'Sign up' link*/
	@When("clicks on 'Sign up'")
	public static void clicks_on_signup() throws Exception  {
		try {
			browser_back();
			click("sign_up_link");
		}  catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_clicks_on_signup");
		}
	}
	@Then("navigated to Sign up page")
	public void navigate_to_signup_page()  throws Exception {
		try {
			browser_wait(12);
			str= driver.findElement(By.xpath(OR_reader("signup_title"))).getText();
			Assert.assertEquals(str,td_reader("signup_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_navigate_to_signup_page");
		}
	}

	/*TC 004 -  Validate that the user is able to enter  the Password in the Password field*/
	@Then("enters the Password")
	public static void enters_password() throws IOException {
		try {
			driver.navigate().back();
			driver.findElement(By.xpath(OR_reader( "login_password"))).sendKeys(td_reader("login_password",1));
			click("login_show_password");
			browser_wait(1000);
			value= driver.findElement(By.xpath(OR_reader( "login_show_password2"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_enters_password");
		}
	}

	/*TC 005 - Validate that the user is able to Login with valid data*/
	@When("enters valid phonenumber and password")
	public static void enters_valid_phoneno_and_password() throws Exception  {
		try {
			backspace("login_password");
			driver.findElement(By.xpath(OR_reader( "login_phone_number"))).sendKeys(td_reader("login_phone_number",2));
			driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",1));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_enters_valid_phoneno_and_password");
		}
	}
	@Then("clicks on 'login'")
	public void clicks_on_login() throws Exception {
		try {
			click("login");
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_clicks_on_login");
		}
	}

	/*TC 006 - Validate that the user is navigated to 'Landing page' on clicking the 'Log out' option*/
	@When("clicks on Logout")
	public static void clicks_on_logout() throws Exception {
		try {
			click("logout");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_clicks_on_Logout");
		}
	}
	@Then("navigated to Landing page")
	public static void navigate_to_landingPage() throws Exception {
		try {
			browser_wait(1000);
			str= driver.findElement(By.xpath(OR_reader("welcome_page_title"))).getText();
			Assert.assertEquals(str,td_reader("welcome_page_title"));
			browser_close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_navigate_to_landingPage");
		}
	}
}
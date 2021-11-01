package Stepdefinition;

import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Circles_positive_scenarios extends Generic_function  {
	public static boolean value;
	public static String str;

	/*TC 001 - Validate that a user is taken to the Circles page when they click on the Circles tab*/
	@Given("launch the browser")
	public void browserlaunching() {
		try {
			browser_launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@When("Click on the Circles tab")
	public void click_circles() throws Exception {
		try {
			login(6,7);
			browser_wait(1200);
			click("circle_click");
		}
		catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_click_circles");
		}
	}
	@Then("Validate Circles page")
	public void validate_circles_page() throws Exception {
		try {
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("circle_header_assert"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_validate_circles_page");
		}
	}

	/*TC 002 -  Validate that when a user able to view message when not part if any circles.Verify partner logo*/
	@Given("Validate not part of any circles message and verify partner logo")
	public void validate_not_part_of_any_circles_message() throws Exception {
		try{
			browser_wait(1000);
			if(driver.findElement(By.xpath(OR_reader("circles_not_part_message"))).isDisplayed()==true)
			{
				str= driver.findElement(By.xpath(OR_reader("circles_not_part_message"))).getText();
				Assert.assertEquals(str,"You are not part of any circles yet");
				str= driver.findElement(By.xpath(OR_reader("circles_add_pertner_message"))).getText();
				Assert.assertEquals(str,"Start by adding a partner in the mobile app");
			}
			else {
				if(driver.findElement(By.xpath(OR_reader("circles_ahk_logo"))).isDisplayed()==true)
				{
					click("circles_ahk_logo");
				}
				if(driver.findElement(By.xpath(OR_reader("circles_med_logo"))).isDisplayed()==true)
				{
					click("circles_med_logo");
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_validate_not_part_of_any_circles_message");
		}
	}

	/*TC 003 - Validate Forgot username link*/
	@When ("click on the Forgot username link")
	public void forgot_username() throws Exception {
		try {
			browser_handle();
			value = driver.findElement(By.xpath(OR_reader("circle_usernamelink"))).isDisplayed();
			Assert.assertEquals(true, value);
			click("circle_usernamelink");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_forgot_username");
		}
	}

	@Then("Validate forgot username page")
	public void validate_forgot_username() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader( "circle_allfieldsnumber"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_validate_forgot_username");
		}
	}

	/*TC 004 - Validate Forgot password link*/
	@When ("Click on the Forgot password link")
	public void forgot_password() throws Exception {
		try{
			browser_wait(1200);
			click("circle_forgotpasswordlink");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_forgot_password");
		}
	}
	@Then("Validate the forgot password page")
	public void validate_forgot_password() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader("circle_allfieldsnumber"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_validate_forgot_password");
		}
	}

	/*TC 005 - User can able to enter Username and Password*/
	@Given("Enter  the Username and Password")
	public void Login() throws Exception {
		try{
			driver.findElement(By.xpath(OR_reader("circle_username"))).sendKeys(td_reader("circle_user_name"));
			driver.findElement(By.xpath(OR_reader( "circle_password"))).sendKeys(td_reader("circle_password"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_Login");
		}
	}

	/*TC 006- Password is displayed on clicking the eye icon*/
	@When("Click on eye icon")
	public void eye_symbol() throws Exception {
		try{
			click("circle_eye");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_eye_symbol");
		}
	}
	@Then("Password text is visible")
	public void view_password() throws Exception {
		try {
			str =driver.findElement(By.xpath(OR_reader("circle_password"))).getAttribute("value");
			Assert.assertEquals(str,"PW27961!");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_view_password");
		}
	}

	/*TC 007 Validate valid Login data*/
	@When("Enter valid username and password")
	public void username_password() throws Exception {
		try{
			click("circle_login");
			browser_close();
			browser_switch();
			driverquit();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_username_password");
		}
	}

	/*TC 08 -  Verify My Medicare icon in the Circles page. */
	@Given("Navigate to Circles page")
	public void navigate_to_circles() throws Exception {
		try {
			Browser_Launch();
			click("welcome_login");
			browser_wait(1200);
			driver.findElement(By.xpath(OR_reader( "login_phone_number"))).sendKeys(td_reader("login_phone_number",9));
			driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",5));
			click("login");
			browser_wait(1000);
			click("circle_click");
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_navigate_to_circles");
		}
	}
	@When("My Medicare logo will be displayed")
	public void medicare_logo() throws Exception {
		try{
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("circles_ahk_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_wait(1200);
			click("circles_ahk_logo");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_medicare_logo");
		}
	}
	@Then("Click on My Medicare icon")
	public void validate_its_clickable() throws Exception  {
		try {
			value = driver.findElement(By.xpath(OR_reader("my_medicare_claims_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("logout");
			driverquit();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_validate_its_clickable");
		}		
	}
}

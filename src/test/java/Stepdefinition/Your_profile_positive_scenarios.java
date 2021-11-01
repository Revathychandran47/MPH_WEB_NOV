package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Your_profile_positive_scenarios extends Generic_function{
	public static boolean value;
	public static String text; 

	/*Browser launch*/
	@Given("launch the URL and open login page")
	public void launch_url() throws Exception {
		try {
			Browser_Launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@When("Enter login data")
	public void login_data() throws Exception {
		try{
			//login(9,5);
			click("welcome_login");
			browser_wait(5000);
			driver.findElement(By.xpath(OR_reader("login_phone_number"))).sendKeys(td_reader("signup_phone_number",6));
			driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("signup_password",2));
			click("login");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_login_data");
		}
	}

	/*TC 001 - Validate that the  Your Profile  title  should be present in  Your Profile screen*/
	@Then("check Your Profile  title  should be present in  Your Profile screen")
	public void check_yourprofile_title() throws Exception  {
		try {
			browser_wait(1000); 
			value = driver.findElement(By.xpath(OR_reader( "header_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_menu");
			browser_wait(1000);
			click("header_profile");
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader( "your_profile_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_check_yourprofile_title");
		}
	}

	/*TC 002 - Verify the scenario when dialogue box will appear, when click on edit icon  */
	@When("Click on edit icon")
	public void click_edit_icon() throws Exception {
		try{
			browser_wait(6000);
			click("profile_edit");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_click_edit_icon");
		}
	}
	@And("Verify the dialogue box")
	public void verify_dialogue_box() throws Exception {
		try {
			browser_wait(1000);
			click("profile_checkbox");
			browser_wait(1000);
			click("profile_send_code");
			browser_wait(1000);
			driver.findElement(By.xpath(OR_reader( "profile_enter_code"))).sendKeys(td_reader("otp"));
			driver.findElement(By.xpath(OR_reader( "profile_password"))).sendKeys(td_reader("signup_password",2));
			browser_wait(1000);
			click("profile_verify");
			browser_wait(1000);
			click("tab_ok");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_verify_dialogue_box");
		}
	}

	@Then("Edit the profile details")
	public void edit_profile_details() throws Exception {
		try {
			browser_wait(1000);
			backspace("profile_firstname");
			backspace("profile_lastname");
			backspace("profile_preferredname");
			browser_wait(1000);
			driver.findElement(By.xpath(OR_reader("profile_firstname"))).sendKeys(td_reader("profile_firstname",2));
			driver.findElement(By.xpath(OR_reader( "profile_lastname"))).sendKeys(td_reader("profile_lastname",2));
			driver.findElement(By.xpath(OR_reader("profile_preferredname"))).sendKeys(td_reader("profile_preferred_name",2));
			click("profile_gender");
			browser_wait(1000);
			text = td_reader("profile_gender");
			drop_down(OR_reader( "profile_dropdownlist"),text); 
			click("profile_bloodgrp");
			browser_wait(1000);
			text = td_reader("profile_bloodgrp");
			drop_down(OR_reader( "profile_dropdownlist"),text); 
			browser_wait(1000);
			click("profile_calender");
			click("tab_ok");
			browser_wait(1000);
			click("profile_save");
			click("tab_ok");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_edit_profile_details");
		}
	}

	/*TC 004 - Verify the scenario when adding Email ID in contact details*/
	@Then("Add Email ID in contact details")
	public void add_email_id() throws Exception  {
		try {
			browser_wait(1000);
			click("profile_contact");
			value = driver.findElement(By.xpath(OR_reader("profile_contact_assert"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_wait(10);
			click("profile_plus");
			value = driver.findElement(By.xpath(OR_reader("profile_email_assert"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_wait(10);
			driver.findElement(By.xpath(OR_reader("profile_email"))).sendKeys(td_reader("profile_email",2));
			click("profile_submit");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_add_email_id");
		}
	}

	/*TC 0010 - Verify the scenario when Activate , Edit and  Deactivate the Email ID*/
	@When("Activate , Edit and  Deactivate the Email ID")
	public void activate_deactivate_email() throws Exception {
		try {
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("profile_activate"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("profile_activate");
			click("profile_yes");
			click("tab_ok");
			click("profile_email_edit");
			click("profile_contact_assert");
			click("profile_dot");
			browser_wait(1000);
			text = td_reader("profile_dot");
			drop_down(OR_reader("profile_mail_list"),text); 
			click("profile_yes");
			click("tab_ok");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_add_email_id");
		}
	}

	/*TC 006 - Verify the scenario when add Phone Number in contact details.*/
	@Then("Add Phone Number in contact details")
	public void add_phoneno() throws Exception {
		try {
			click("profile_phno");
			click("profile_plus");
			value = driver.findElement(By.xpath(OR_reader("profile_add_phone_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			driver.findElement(By.xpath(OR_reader("profile_phonenumber"))).sendKeys(td_reader("profile_phonenumber"));
			click("profile_submit");
			driver.findElement(By.xpath(OR_reader("profile_phno_code"))).sendKeys(td_reader("otp"));
			click("profile_phno_verify");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_add_phoneno");
		}
	}

	/*TC 007 - Verify the scenario when Activate , Edit and  Deactivate the Phone Number*/
	@Then("Activate , Edit and  Deactivate the Phone Number")
	public void activate_deactivate_phoneno() throws Exception {
		try {
			browser_wait(1000);
			click("profile_phno_edit");
			value = driver.findElement(By.xpath(OR_reader("profile_contact_assert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("profile_contact_assert");
			click("profile_dot_phno");
			browser_wait(10);
			text = td_reader("profile_dot");
			drop_down(OR_reader("profile_phno_list"),text); 
			click("profile_yes");
			click("profile_phno_activate");
			click("profile_yes");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_activate_deactivate_phoneno");
		}
	}

	/*TC 008 - Verify the scenario when add Address in contact details. */
	@Then("Add Address in contact details.")
	public void add_address() throws Exception {
		try {
			browser_wait(1000);
			click("profile_address");
			click("profile_plus");
			value = driver.findElement(By.xpath(OR_reader("profile_add_address_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			driver.findElement(By.xpath(OR_reader("profile_save_as"))).sendKeys(td_reader("profile_save_as"));
			driver.findElement(By.xpath(OR_reader("profile_add1"))).sendKeys(td_reader("profile_add1"));
			driver.findElement(By.xpath(OR_reader("profile_add2"))).sendKeys(td_reader("profile_add2"));
			driver.findElement(By.xpath(OR_reader("profile_city"))).sendKeys(td_reader("profile_city"));
			text = td_reader("profile_state");
			selectdrop_down("profile_state",text);
			driver.findElement(By.xpath(OR_reader("profile_zip"))).sendKeys(td_reader("profile_zip"));
			click("profile_save");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_add_address");
		}
	}

	/*TC 009 - Verify the scenario when Activate , Edit , Primary and  Deactivate the Address*/
	@Then("Activate , Edit , Primary and  Deactivate the Address")
	public void activate_deactivate_address() throws Exception {
		try {
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader( "profile_address_activate"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("profile_address_activate");
			click("profile_yes");
			click("profile_address_edit");
			click("profile_address_back");
			click("profile_contact_assert");
			click("profile_dot_address");
			browser_wait(1000);
			text = td_reader("profile_dot");
			drop_down(OR_reader( "profile_address_list"),text);
			click("profile_yes");
			click("profile_address_back");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_activate_deactivate_address");
		}
	}

	/*TC 010 - Verify the scenario when add Plan coveragee*/
	@Then("Add Plan coverage")
	public void add_plan() throws Exception {
		try {
			browser_wait(1000);
			click("profile_plancoverage");
			value = driver.findElement(By.xpath(OR_reader( "profile_plan_coverage_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("profile_plan_plus");
			value = driver.findElement(By.xpath(OR_reader("profile_addassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			driver.findElement(By.xpath(OR_reader( "profile_planname"))).sendKeys(td_reader("profile_planname"));
			driver.findElement(By.xpath(OR_reader( "profile_plan_holderfname"))).sendKeys(td_reader("profile_plan_holderfname"));
			driver.findElement(By.xpath(OR_reader( "profile_plan_holderlname"))).sendKeys(td_reader("profile_plan_holderlname"));
			click("profile_plan_relationship");
			browser_wait(10);
			text = td_reader("profile_plan_relationship");
			drop_down(OR_reader("profile_dropdownlist"),text); 
			driver.findElement(By.xpath(OR_reader( "profile_plan_memberid"))).sendKeys(td_reader("profile_plan_holderlname"));
			driver.findElement(By.xpath(OR_reader( "profile_plan_groupid"))).sendKeys(td_reader("profile_plan_holderlname"));
			driver.findElement(By.xpath(OR_reader( "profile_plan_type"))).sendKeys(td_reader("profile_plan_holderlname"));
			click("profile_plan_save");
			click("tab_ok");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_add_plan");
		}
	}

	/*TC 011 - Verify the scenario when Activate , Edit , Make primary and  Deactivate the Plan coverage*/
	@Then("Activate , Edit , Make primary and  Deactivate the Plan coverage")
	public void activate_deactivate_plan() throws Exception {
		try {
			browser_wait(1000);
			click("profile_plan_edit");
			value = driver.findElement(By.xpath(OR_reader( "profile_plan_editassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("profile_plan_back");
			click("profile_dot_plan");
			browser_wait(1000);
			text = td_reader("profile_dot");
			drop_down(OR_reader( "profile_plan_list"),text);
		}
		catch(StaleElementReferenceException e){
			driver.findElement(By.xpath(OR_reader( "profile_plan_activate"))).click();
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_activate_deactivate_plan");
		}
	} 

	/*TC 012 - Verify the scenario when change the password*/
	@Then("Change the password")
	public void change_password() throws Exception {
		try {
			browser_wait(1000);
			click("profile_plancoverage_back");
			click("profile_password_button");
			value = driver.findElement(By.xpath(OR_reader("profile_passwordassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			driver.findElement(By.xpath(OR_reader( "profile_old_password"))).sendKeys(td_reader("login_password",1000));
			driver.findElement(By.xpath(OR_reader( "profile_new_password"))).sendKeys(td_reader("profile_newpassword"));
			driver.findElement(By.xpath(OR_reader( "profile_confirm_password"))).sendKeys(td_reader("profile_newpassword"));
			click("profile_passwordsave");
			click("tab_ok");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_change_password");
		}
	}

	/*TC 013 -Verify the scenario when password should be displayed on clicking the eye and user can able to save the details*/
	@Then("The password should be displayed on clicking the eye")
	public void password_displayed() throws Exception {
		try {
			browser_wait(1000);
			click("logout");
			driverquit();
			Browser_Launch();
			value = driver.findElement(By.xpath(OR_reader( "welcome_login"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("welcome_login");
			driver.findElement(By.xpath(OR_reader( "login_phone_number"))).sendKeys(td_reader("login_phone_number",9));
			driver.findElement(By.xpath(OR_reader( "login_password"))).sendKeys(td_reader("profile_newpassword"));
			click("login");
			browser_explicit_wait("header_logo",5);
			value = driver.findElement(By.xpath(OR_reader( "header_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_menu");
			browser_wait(1000);
			click("header_profile");
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader( "your_profile_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_wait(1000);
			click("profile_edit");
			browser_wait(1000);
			click("profile_checkbox");
			browser_wait(1000);
			click("profile_send_code");
			browser_wait(1000);
			driver.findElement(By.xpath(OR_reader( "profile_enter_code"))).sendKeys(td_reader("otp"));
			driver.findElement(By.xpath(OR_reader( "profile_password"))).sendKeys(td_reader("profile_newpassword"));
			browser_wait(1000);
			click("profile_verify");
			browser_wait(1000);
			click("tab_ok");
			click("profile_password_button");
			value = driver.findElement(By.xpath(OR_reader( "profile_passwordassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			driver.findElement(By.xpath(OR_reader( "profile_old_password"))).sendKeys(td_reader("profile_newpassword"));
			click("profile_oldeye");
			driver.findElement(By.xpath(OR_reader( "profile_new_password"))).sendKeys(td_reader("login_password",1000));
			click("profile_neweye");
			driver.findElement(By.xpath(OR_reader( "profile_confirm_password"))).sendKeys(td_reader("login_password",1000));
			click("profile_confirmeye");
			click("profile_passwordsave");
			click("tab_ok");
			browser_wait(2000);
			click("logout");
			driverquit();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("your_profile_positive_password_displayed");
		}		
	}
}
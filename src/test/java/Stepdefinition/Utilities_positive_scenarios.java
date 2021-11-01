package Stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Utilities_positive_scenarios extends Generic_function{
	static boolean value;
	static String text,ere,str;
	public static Signup_positive_scenarios sp = new Signup_positive_scenarios();
	public static String phone_number = sp.phonenumber;

	/* TC_001 -Navigate to Utilities screen*/
	@Given("user is on home page")
	public static void launch_url() throws Exception{
		try {
			Browser_Launch();
			click("welcome_signup");
			sp.enter_valid_credentials();
			sp.verify_OTP_page();
			sp.enter_otp(); 
			click("verify");
			driver.findElement(By.xpath(OR_reader("login_phone_number"))).sendKeys(phone_number);
			driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("signup_password",2));
			click("login");
			browser_wait(2000);
			browser_explicit_wait("home_skip_button", 5);
			click("home_skip_button");
			value = driver.findElement(By.xpath(OR_reader("home"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader("home"))).isEnabled();
			Assert.assertEquals(true,value); 
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_launch_url");
		}		
	}	
	@When("clicks on Utilities tab")
	public static void click_utilities() throws Exception {
		try {
			click("utilities");
			browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_click_utilities");
		}	
	}
	@Then("Navigate to Utilities Dashboard")
	public static void navigate_to_utilities() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader("wallet_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_navigate_to_utilities");
		}	
	}

	/* TC_002-Click options provided in left side navigator*/
	@When("Click on left side navigator options")
	public static void click_navigator_options() throws Exception {
		try{
			browser_wait(1000);
			click("home");
			browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_click_navigator_options");
		}
	}
	@Then("Verify the navigator options")
	public void verify_navigators() throws Exception {
		try{
			str = driver.findElement(By.xpath(OR_reader("home_page_title"))).getText();
			Assert.assertEquals(str,td_reader("home_page_title"));
			click("services");
			str = driver.findElement(By.xpath(OR_reader("services_page_title"))).getText();
			Assert.assertEquals(str,td_reader("services_page_title"));
			click("circles");
			browser_wait(1000);
			str = driver.findElement(By.xpath(OR_reader("circles_page_title"))).getText();
			Assert.assertEquals(str,td_reader("circles_page_title"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_verify_navigators");
		}
	}

	/* TC_003 - Verify that click on all the Tiles in the Utilities dashboard*/
	@When("Click all tiles in utilities dashboard")
	public static void click_all_tiles() throws Exception {
		try {
			click_javascript("utilities");
			browser_wait(1000);
			grid_tiles(OR_reader( "utilities_gridpath"),"utilities");
			browser_wait(1000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_click_all_tiles");
		}	
	}

	/* TC_004 - Add card details  in the Wallet dashboard*/
	@When("Enter card details in wallet dashboard")
	public static void enter_card_details() throws Exception {
		try {
			browser_wait(1000);
			click_javascript("utilities");
			click_javascript("wallet");
			browser_wait(1000);
			click_javascript("utilities_add_card");
			browser_wait(4000);
			driver.findElement(By.xpath(OR_reader("utilities_save_as"))).sendKeys(td_reader("utilities_save_as"));
			driver.findElement(By.xpath(OR_reader("utilities_name_on_card"))).sendKeys(td_reader("utilities_name_on_card"));
			Robot robot = new Robot();
			browser_wait(8000);
			robot.keyPress(KeyEvent.VK_TAB);
			for (int i=0; i<5;i++) {
				robot.keyPress(KeyEvent.VK_NUMPAD4);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD4);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
			}
			robot.keyPress(KeyEvent.VK_TAB);
			browser_wait(3000);
			robot.keyPress(KeyEvent.VK_NUMPAD1);
			robot.keyPress(KeyEvent.VK_NUMPAD2);
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyPress(KeyEvent.VK_NUMPAD2);
			robot.keyPress(KeyEvent.VK_NUMPAD6);
			robot.keyPress(KeyEvent.VK_TAB);
			browser_wait(3000);
			robot.keyPress(KeyEvent.VK_NUMPAD1);
			robot.keyPress(KeyEvent.VK_NUMPAD2);
			robot.keyPress(KeyEvent.VK_NUMPAD3);
			browser_wait(3000);
			driver.findElement(By.xpath(OR_reader("utilities_zip_code"))).sendKeys(td_reader("utilities_zip_code",0));
			driver.findElement(By.xpath(OR_reader("utilities_phone_number"))).sendKeys(td_reader("utilities_phone_number",0));
			driver.findElement(By.xpath(OR_reader("utilities_address"))).sendKeys(td_reader("utilities_address"));
			driver.findElement(By.xpath(OR_reader("utilities_country"))).sendKeys(td_reader("utilities_country"));
			driver.findElement(By.xpath(OR_reader("utilities_state"))).sendKeys(td_reader("utilities_state"));
			driver.findElement(By.xpath(OR_reader("utilities_city"))).sendKeys(td_reader("utilities_city"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_enter_card_details");
		}	
	}
	@Then("Verify card details is saved")
	public static void card_details_save() throws Exception {
		try {
			click_javascript("utilities_save_button");
			//click_javascript("card_ok");
			browser_wait(1000);
			browser_back();
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_card_details_save");
		}
	}

	/* TC_005 - Add bank details  in the Wallet dashboard*/
	@When("Enter bank details in wallet dashboard")
	public void enter_bank_details() throws Exception {
		browser_wait(1000);
		try {
			click_javascript("utilities");
			click_javascript("wallet");
			click_javascript("utilities_add_bank");
			browser_wait(3000);
			driver.findElement(By.xpath(OR_reader("utilities_bank_saveas"))).sendKeys(td_reader("utilities_bank_saveas"));
			driver.findElement(By.xpath(OR_reader("utilities_account_name"))).sendKeys(td_reader("utilities_account_name",0));
			driver.findElement(By.xpath(OR_reader("utilities_routing_no"))).sendKeys(td_reader("utilities_routing_no",0));
			click("utilities_account_type");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_enter_bank_details");
		}
	}
	@Then("Verify bank details is saved")
	public static void save_bank_details() throws Exception {
		try {
			text = td_reader("utilities_account_type");
			drop_down(OR_reader( "utilities_account_type_list"),text);  
			driver.findElement(By.xpath(OR_reader("utilities_account_number"))).sendKeys(td_reader("utilities_account_number",0));
			driver.findElement(By.xpath(OR_reader("utilities_address1"))).sendKeys(td_reader("utilities_address"));
			driver.findElement(By.xpath(OR_reader("utilities_address2"))).sendKeys(td_reader("utilities_address"));
			Robot robot = new Robot();
			browser_wait(8000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			browser_wait(8000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_N);
			driver.findElement(By.xpath(OR_reader("utilities_zip"))).sendKeys(td_reader("utilities_zip"));
			click_javascript("utilities_bank_checkbox");
			click_javascript("utilities_save_button");
			click_javascript("card_ok");
		}catch (Exception e) {
			takeScreenShot("utilities_positive_save_bank_details");
		}	
	}

	/*TC_006 - Validate user can click on Award points and able to view Balance and Your award point history.*/
	@Given("Click Award Points")
	public void click_awardpoints() throws Exception {
		try {
			browser_explicit_wait("utilities",10);
			click("utilities");
			browser_wait(3000);
			click("award_points");
			browser_wait(3000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_click_awardpoints");
		}
	}
	@When("Navigate to Award Points screen")
	public static void validate_award_points() throws Exception {
		try {
			str = driver.findElement(By.xpath(OR_reader("award_points_title"))).getText();
			Assert.assertEquals(str,td_reader("award_points_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_validate_award_points");
		}
	}

	@Then("view the Balance, award points history and Welcome bonus text.")
	public static void validate_balance_history_bonus() throws Exception {
		try {
			str= driver.findElement(By.xpath(OR_reader("award_point_balance_text"))).getText();
			Assert.assertEquals(str,td_reader("award_point_balance_text"));
			str= driver.findElement(By.xpath(OR_reader("award_point_history_text"))).getText();
			Assert.assertEquals(str,td_reader("award_point_history_text"));
			str= driver.findElement(By.xpath(OR_reader("award_point_balance_amount"))).getText();
			Assert.assertEquals(str,td_reader("award_point_balance_amount"));
			browser_close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_validate_balance_history_bonus");
		}
	}
}

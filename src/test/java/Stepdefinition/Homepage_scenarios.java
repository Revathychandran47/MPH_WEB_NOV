
package Stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_scenarios extends Generic_function {
	public static boolean value;
	public static Signup_positive_scenarios sp = new Signup_positive_scenarios();
	public static String str,phoneno= sp.phonenumber;

	/*TC_001 -Validate that user is able to view Welcome grid and carousel when login for the first time*/
	@Given("signup with new user and login from the same")
	public static void new_user_sign_up() throws Exception {
		try {
			Browser_Launch();
//			click("welcome_signup");
//			sp.enter_valid_credentials();
//			sp.verify_OTP_page();
//			sp.enter_otp();
//			click("verify");
//			driver.findElement(By.xpath(OR_reader("login_phone_number"))).sendKeys(phoneno);
//			driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("signup_password",2));
//			click("login");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_new_user_sign_up");
		}
	}

	@When("Click on Show Me button")
	public static void click_show_me_button() throws Exception {
		try {
//			browser_explicit_wait("home_starting_panel_text",1000);
//			str= driver.findElement(By.xpath(OR_reader("home_starting_panel_text"))).getText();
//			Assert.assertEquals(str,td_reader("home_starting_panel_text"));
//			click("home_showme_button");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_click_show_me_button");
		}
	}

	@And("Click on right arrow and left to view all grids")
	public static void click_right_arrow() throws Exception {
		try {
//			browser_explicit_wait("home_first_panel_text",1000);
//			str= driver.findElement(By.xpath(OR_reader("home_first_panel_text"))).getText();
//			Assert.assertEquals(str,td_reader("home_first_panel_text"));
//			click("home_panel_right_arrow");
//			browser_explicit_wait("home_second_panel_text",1000);
//			str= driver.findElement(By.xpath(OR_reader("home_second_panel_text"))).getText();
//			Assert.assertEquals(str,td_reader("home_second_panel_text"));
//			click("home_panel_right_arrow");
//			browser_explicit_wait("home_third_panel_text",1000);
//			str= driver.findElement(By.xpath(OR_reader("home_third_panel_text"))).getText();
//			Assert.assertEquals(str,td_reader("home_third_panel_text"));
//			click("home_panel_right_arrow");
//			browser_explicit_wait("home_fourth_panel_text",1000);
//			str= driver.findElement(By.xpath(OR_reader("home_fourth_panel_text"))).getText();
//			Assert.assertEquals(str,td_reader("home_fourth_panel_text"));
//			click("home_panel_right_arrow");
//			browser_explicit_wait("home_last_panel_text",1000);
//			str= driver.findElement(By.xpath(OR_reader("home_last_panel_text"))).getText();
//			Assert.assertEquals(str,td_reader("home_last_panel_text"));
//			click("home_panel_left_arrow");
//			click("home_panel_right_arrow");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_click_right_arrow");
		}
	}

	@And("Click on Get Started")
	public static void click_get_started() throws Exception {
		try {
//			browser_explicit_wait("home_get_started_button", 1000);
//			click("home_get_started_button");
//			value = driver.findElement(By.xpath(OR_reader( "home"))).isDisplayed();
//			Assert.assertEquals(true,value);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_click_get_started");
		}
	}

	@Then("Logout")
	public static void logout() throws Exception {
		try {
//			click("logout");
//			browser_close();
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_logout");
		}
	}

	/*TC_002 -Validate user is able to click on skip button in the carousel*/
	@Given("signup with new user and login")
	public static void user_sign_up() throws Exception {
		try {
//			new_user_sign_up();
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_user_sign_up");
		}
	}

	@When("Click on Skip at the top right corner of the panel")
	public static void click_skip_button() throws Exception {
		try {
//			browser_explicit_wait("home_skip_button", 2000);
//			click("home_skip_button");
//			value = driver.findElement(By.xpath(OR_reader( "home"))).isDisplayed();
//			Assert.assertEquals(true,value);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_click_skip_button");
		}
	}

	@And("Verify Firstname and Lastname")
	public static void verify_firstname_lastname() throws Exception {
		try {
//			str=driver.findElement(By.xpath(OR_reader( "home_name_text"))).getText();
//			String[] splited = str.split("\\s+");
//			Assert.assertEquals(splited[0],td_reader("signup_first_name",2));
//			Assert.assertEquals(splited[1],td_reader("signup_last_name",2));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_verify_firstname_lastname");
		}
	}

	@Then("Click logout")
	public static void click_logout() throws Exception {
		try {
//			click("logout");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_click_logout");
		}
	}

	/*TC_003 -Validate that the user is navigated to Welcome page*/
	@When("Enter valid phonenumber and password and login")
	public void login_valid_data() throws Exception {
		try {
			login(2,1);
			browser_wait(2000);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_login_valid_data");
		}
	}
	@Then("Verify user is on homepage")
	public void verify_user_is_home() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader( "home"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader( "home_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader( "home"))).isEnabled();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader( "header_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader( "home_profile_picture"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_verify_user_is_home");
		}
	}

	/*TC_004 - Validate that the user is navigated to  the Home page and User should be able to click on all the grid tiles */
	@When("clicks on all the grid tiles")
	public static void clicks_on_all_tiles() throws Exception, InterruptedException {
		try {
			grid_tiles(OR_reader("home_grid_path"),"home");
			browser_wait(1000);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_clicks_on_all_tiles");
		}
	}

	/*TC_005 - Validate that the user can able to view and click left nav panel tabs */
	@When("Click on left nav panel tabs")
	public static void click_on_left_nav_tabs() throws Exception, InterruptedException {
		try {
			value = driver.findElement(By.xpath(OR_reader( "services_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("services");
			value = driver.findElement(By.xpath(OR_reader( "second_opinion"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_click_on_left_nav_tabs");
		}
	}
	@Then("Verify navigation to respective pages")
	public static void verify_navigation_to_pages() throws Exception, InterruptedException {
		try {
			click("home");
			value = driver.findElement(By.xpath(OR_reader( "circles_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("circles");
			value = driver.findElement(By.xpath(OR_reader( "circles_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("home");
			value = driver.findElement(By.xpath(OR_reader( "utilities_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("utilities");
			value = driver.findElement(By.xpath(OR_reader( "wallet"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("Homepage_verify_navigation_to_pages");
		}
	}
	
		/*TC_005-Validate that the user is navigated to the Second Opinion page on clicking 'Get second opinion' button*/
		@Given("'Get second opinion' is visible in the home")
		public void get_second_opinion_is_visible() throws InterruptedException, Exception {
			try {
//				value = driver.findElement(By.xpath(OR_reader( "get_second_opinion_icon"))).isDisplayed();
//				Assert.assertEquals(true,value);
//				str=driver.findElement(By.xpath(OR_reader( "get_second_opinion_text"))).getText();
//				Assert.assertEquals(str,td_reader("get_second_opinion_text"));
			}catch(Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_get_second_opinion_is_visible");
			}
		}
		@When("clicks on the 'Get second opinion' button")
		public void clicks_on_get_second_opinion() throws InterruptedException, Exception {
			try {
//				click("get_second_opinion_button");
//				browser_wait(3000);
			}catch(Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_clicks_on_get_second_opinion");
			}
		}
		@Then("navigated to the Second opinion page")
		public void navigate_to_second_opinion_page() throws Exception {
			try {
//				browser_explicit_wait("get_second_opinion_title",3000);
//				str=driver.findElement(By.xpath(OR_reader("get_second_opinion_title"))).getText();
//				Assert.assertEquals(str,td_reader("get_second_opinion_title"));
//				browser_wait(1000);
//				browser_back();
			} catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_navigate_to_second_opinion_page");
			}
		}
	
		/*TC_006-Validate that the user is navigated to the  Refer a friend page on clicking 'Refer a friend' button*/
		@Given("'Refer a friend' is visible on the home")
		public void refer_a_friend_is_visible() throws InterruptedException, Exception {
			try {
//				value = driver.findElement(By.xpath(OR_reader( "refer_a_friend_icon"))).isDisplayed();
//				Assert.assertEquals(true,value);
//				str=driver.findElement(By.xpath(OR_reader( "refer_a_friend_text"))).getText();
//				Assert.assertEquals(str,td_reader("refer_a_friend_text"));
			}catch(Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_refer_a_friend_is_visible");
			}
		}
		@When("clicks on 'Refer a friend' button")
		public static void clicks_on_refer_a_friend() throws InterruptedException, Exception {
			try {
//				click("refer_a_friend_button");
//				browser_wait(1500);
			}catch(Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_clicks_on_refer_a_friend");
			}				
		}
		@Then("navigated to the Refer a friend page")
		public void navigated_to_refer_a_friend_page() throws Exception {
			try {
//				str=driver.findElement(By.xpath(OR_reader("refer_a_friend_title"))).getText();
//				Assert.assertEquals(str,td_reader("refer_a_friend_title"));
//				browser_wait(1000);
//				click("refer_a_frnd_back_arrow");
			} catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_navigated_to_refer_a_friend_page");
			}		
		}
		
		/*TC_007-Validate that the user is navigated to the Coverage page on clicking 'Buy Coverage' button*/
		@Given("'Shop for Coverage' is visible on the home")
		public void shop_for_coverage_is_visible() throws InterruptedException, Exception {
			try {
//				value = driver.findElement(By.xpath(OR_reader( "shop_for_coverage_icon"))).isDisplayed();
//				Assert.assertEquals(true,value);
//				str=driver.findElement(By.xpath(OR_reader( "shop_for_coverage_text"))).getText();
//				Assert.assertEquals(str,td_reader("shop_for_coverage_text"));
			}catch(Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_shop_for_coverage_is_visible");
			}
		}
		@When("Click on 'Shop for Coverage' button")
		public static void clicks_on_shop_for_coverage() throws Exception {
			try {
//				click("home_buy_coverage_button");
//				browser_wait(1500);
			}catch(Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_clicks_on_shop_for_coverage");
			}				
		}
		@Then("navigated to the Coverage page")
		public void navigated_to_coverage_page() throws Exception {
			try {
//				str= driver.findElement(By.xpath(OR_reader("coverage_title"))).getText();
//				Assert.assertEquals(str,td_reader("coverage_title"));
//				browser_explicit_wait("logout",3000);
//				click("logout");
//				browser_close();
			} catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("Homepage_navigated_to_coverage_page");
			}		
		}
}

package Stepdefinition;

import java.io.IOException;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Headerpage_scenarios extends Generic_function{
	public static boolean value;
	static String str;

	@Given("site is available")
	public static void browser_launching() throws Exception {
		try {
			Browser_Launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("clicks on Help tab")
	public static void click_help() throws Exception {
		try {
			login(2,1);
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("header_logo"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("help_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("help");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_help");
		}
	}
	/*TC 001 - Validate that the Frequently asked questions title  should be present in  Help page*/
	@Then("verify the Frequently asked questions title")
	public static void verify_faq_title() throws Exception {
		try {
			browser_wait(1000);
			str= driver.findElement(By.xpath(OR_reader("header_frequently_asked"))).getText();
			Assert.assertEquals(str,td_reader("header_frequently_asked"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_faq_title");
		}
	}

	/*TC 002 - Validate that the 'Second Opinions' title  should be present  and able to see description , when user click on Second Opinions title */
	@When("clicks on Second Opinions title")
	public static void click_second_opinion() throws Exception {
		try {
			click_javascript("help_secondassert");
			browser_wait(2000);
			value = driver.findElement(By.xpath(OR_reader("help_second_opinion_img"))).isDisplayed();
			Assert.assertEquals(true,value);
			str= driver.findElement(By.xpath(OR_reader("help_secondassert"))).getText();
			Assert.assertEquals(str,td_reader("help_secondassert"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_second_opinion");
		}
	}
	@Then("verify the Second Opinions description is displayed")
	public static void verify_second_opinion_description() throws Exception {
		try {
			browser_explicit_wait("help_second_description",1000);
			str= driver.findElement(By.xpath(OR_reader("help_second_description"))).getText();
			Assert.assertNotNull(str,true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_second_opinion_description");
		}
	}

	/*TC 003 - Validate that the 'Award Points' title  should be present  and able to see description , when user click on Award Points title  */
	@When("clicks on Award Points title")
	public static void click_award_points() throws Exception {
		try {
			click("help_awardpoints");
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("help_award_point_img"))).isDisplayed();
			Assert.assertEquals(true,value);
			str= driver.findElement(By.xpath(OR_reader("help_awardpoints"))).getText();
			Assert.assertEquals(str,td_reader("help_awardpoints"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_award_points");
		}
	}
	@Then("verify the Award Points description is displayed")
	public static void verify_award_points_description() throws Exception {
		try {
			browser_wait(1000);
			str= driver.findElement(By.xpath(OR_reader("help_award_description"))).getText();
			Assert.assertNotNull(str,true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_award_points_description");
		}
	}

	/*TC 004 - Validate that the 'Referral' title  should be present  and able to see description , when user click on Referral title   */
	@When("clicks on Referral title")
	public static void click_referral_title() throws Exception {
		try {
			click("help_referralassert");
			value = driver.findElement(By.xpath(OR_reader("help_referral_img"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_wait(1000);
			str= driver.findElement(By.xpath(OR_reader("help_referralassert"))).getText();
			Assert.assertEquals(str,td_reader("help_referralassert"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_referral_title");
		}
	}
	@Then("verify the Referral description is displayed")
	public static void verify_referral_description() throws Exception {
		try {
			str= driver.findElement(By.xpath(OR_reader("help_referral_description"))).getText();
			Assert.assertNotNull(str,true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_referral_description");
		}
	}

	/*TC 005 - Validate that the 'Profile' title  should be present  and able to see description , when user click on Profile title  */
	@When("clicks on Profile title")
	public static void click_profile_title() throws Exception {
		try {
			browser_wait(1000);
			click("help_profileassert");
			value = driver.findElement(By.xpath(OR_reader("help_profile_img"))).isDisplayed();
			Assert.assertEquals(true,value);
			str= driver.findElement(By.xpath(OR_reader("help_profileassert"))).getText();
			Assert.assertEquals(str,td_reader("help_profileassert"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_profile_title");
		}
	}
	@Then("verify the Profile description is displayed")
	public static void verify_profile_description() throws Exception {
		try {
			str= driver.findElement(By.xpath(OR_reader("help_profile_description"))).getText();
			Assert.assertNotNull(str,true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_profile_description");
		}
	}

	/*TC 006 - Validate that the 'Payments' title  should be present  and able to see description , when user click on Payments title  */
	@When("clicks on Payments  title")
	public static void click_payments_title() throws Exception {
		try {
			click("help_paymentassert");
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("help_payment_img"))).isDisplayed();
			Assert.assertEquals(true,value);
			str= driver.findElement(By.xpath(OR_reader("help_paymentassert"))).getText();
			Assert.assertEquals(str,td_reader("help_paymentassert"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_payments_title");
		}
	}
	@Then("verify the Payments description is displayed")
	public static void verify_payments_description() throws Exception {
		try {
			browser_wait(2000);
			str= driver.findElement(By.xpath(OR_reader("help_payment_description"))).getText();
			Assert.assertNotNull(str,true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_payments_description");
		}
	}

	/*TC 007 - Validate that the 'Add coverage' title  should be present  and able to see description , when user click on Add coverage title   */
	@When("clicks on Add coverage  title")
	public static void click_addcoverage_title() throws Exception {
		try {
			click("help_coverageassert");
			browser_wait(2000);
			str= driver.findElement(By.xpath(OR_reader("help_coverageassert"))).getText();
			Assert.assertEquals(str,td_reader("help_coverageassert"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_addcoverage_title");
		}
	}
	@Then("verify the Add coverage description is displayed")
	public static void verify_add_coverage_description() throws Exception {
		try {
			str= driver.findElement(By.xpath(OR_reader("help_coverage_description"))).getText();
			Assert.assertNotNull(str,true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_add_coverage_description");
		}
	}
	/*TC 008 -Validate the navigation to the alerts page on clicking Your alerts icon*/
	@When("Click on Your alerts icon")
	public static void click_on_your_alerts_icon() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader("header_alert_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_alerts");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_your_alerts_icon");
		}
	}
	@Then("Verify navigation to the alerts page")
	public static void verify_navigation_to_the_alerts_page() throws IOException {
		try {
			browser_explicit_wait("header_alerts_title",2000);
			str= driver.findElement(By.xpath(OR_reader("header_alerts_title"))).getText();
			Assert.assertEquals(str,td_reader("header_alerts_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_navigation_to_alerts");
		}
	}
	/*TC 009 -Validate the Drop down tab*/
	@When("Click on Drop down tab")
	public static void click_on_drop_down_tab() throws IOException {
		try {
			browser_wait(2000);
			click("header_menu");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_drop_down_tab");
		}
	}

	@Then("Verify options are visible")
	public static void verify_options_visible() throws IOException {
		try {
			browser_explicit_wait("header_yourprofile_icon",3000);
			value = driver.findElement(By.xpath(OR_reader("header_yourprofile_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_options_visible");
		}
	}

	/*TC 010 -Validate the navigation to the  profile page on clicking  Your profile tab*/
	@When("Click on Your profile")
	public static void click_on_your_profile() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader("header_yourprofile_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_profile");
			browser_wait(1000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_your_profile");
		}
	}

	@Then("Verify navigation to the profile page.")
	public static void verify_navigation_to_the_profile_page() throws IOException {
		try {
			browser_wait(1000);
			str= driver.findElement(By.xpath(OR_reader("header_profile_title"))).getText();
			Assert.assertEquals(str,td_reader("header_profile_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_navigation_to_profile");
		}
	}
	/*TC 011 -Validate  the  navigation to the ratings dashboard page on clicking Your ratings tab*/
	@Given("Click on Your ratings")
	public static void click_on_your_ratings() throws IOException {
		try {
			click("header_menu");
			browser_explicit_wait("header_ratings_icon",1000);
			value = driver.findElement(By.xpath(OR_reader( "header_ratings_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_ratings");
			browser_wait(2000);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_your_ratings");
		}
	}
	@When("Verify navigation to the ratings dashboard page")
	public static void verify_navigation_to_the_ratings_dashboard_page() throws IOException {
		try {
			str= driver.findElement(By.xpath(OR_reader("header_ratings_title"))).getText();
			Assert.assertEquals(str,td_reader("header_ratings_title"));
			value = driver.findElement(By.xpath(OR_reader("header_rating_image"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_navigation_to_ratings");
		}
	}

	@And("Click on Past tabs")
	public static void click_on_past_tabs() throws IOException {
		try {
			click("header_ratings_past_tab");
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("header_ratings_past_image"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_past_tabs");
		}
	}
	@And("Click on Rate a service")
	public static void click_on_rate_a_service() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader("header_rating_rateService"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_rating_rateService");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_rate_a_service");
		}
	}
	@Then("Click on Explore service")
	public static void click_on_explore_service() throws IOException {
		try {
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("header_rating_exploreService"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_rating_exploreService");
			browser_wait(1000);
			value = driver.findElement(By.xpath(OR_reader("second_opinion"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_explore_service");
		}
	}
	/*TC 012 - Validate the navigation to the Feedback Port   page  on clicking Feedback*/
	@When("Click on Feedback")
	public static void click_on_feedback() throws IOException {
		try {
			click("header_menu");
			browser_explicit_wait("header_feedback_icon",2000);
			value = driver.findElement(By.xpath(OR_reader( "header_feedback_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_feedback");
			browser_wait(4000);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_feedback");
		}
	}

	@Then("Verify the navigation to the Feedback Port.")
	public static void verify_the_navigation_to_the_feedback_port() throws IOException {
		try {
			browser_handle();
			str= driver.findElement(By.xpath(OR_reader("header_feedback_title"))).getText();
			Assert.assertEquals(str,td_reader("header_feedback_title"));
			str= driver.findElement(By.xpath(OR_reader("header_feedback_description"))).getText();
			Assert.assertEquals(str,td_reader("header_feedback_description"));
			browser_close();
			browser_switch();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_navigation_to_feedback_port");
		}
	}
	/*TC 013 -Validate  the navigation to the Contact Us page  on clicking  Contact us*/
	@When("Click on  Contact Us")
	public static void click_on_contact_us() throws IOException {
		try {
			browser_explicit_wait("header_menu",1000);
			click("header_menu");
			browser_explicit_wait("header_contact_icon",1000);
			value = driver.findElement(By.xpath(OR_reader( "header_contact_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_contact");
			browser_wait(4000);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_contact_us");
		}
	}
	@Then("Verify the navigation to the Contact Us.")
	public static void verify_the_navigation_to_the_contact_us() throws IOException {
		try {
			browser_handle();
			browser_explicit_wait("help_contact_title",3000);
			str= driver.findElement(By.xpath(OR_reader("help_contact_title"))).getText();
			Assert.assertEquals(str,td_reader("help_contact_title"));
			value = driver.findElement(By.xpath(OR_reader("header_contact_form"))).isDisplayed();
			Assert.assertEquals(true,value);
			browser_close();
			browser_switch();
			browser_wait(2000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_navigation_to_contactus");
		}
	}

	/*TC 014 - Validate the  Privacy Policy dialogue box on clicking on the Privacy Policy */
	@When("Click on  Privacy Policy")
	public static void click_on_privacy_policy() throws IOException {
		try {
		browser_explicit_wait("header_menu",1000);
		click("header_menu");
		browser_explicit_wait("header_privacy_icon",2000);
		value = driver.findElement(By.xpath(OR_reader("header_privacy_icon"))).isDisplayed();
		Assert.assertEquals(true,value);
		click("header_privacy");
		browser_wait(4000);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_privacy_policy");
		}
	}
	@Then("Verify the dialogue box on privacy page")
	public static void verify_the_dialogue_box_on_privacy_page() throws IOException {
		try {
			browser_explicit_wait("header_privacy_title",1000);
			str= driver.findElement(By.xpath(OR_reader("header_privacy_title"))).getText();
			Assert.assertEquals(str,td_reader("header_privacy_title"));
			value = driver.findElement(By.xpath(OR_reader("header_privacy_description"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader("header_ok_button"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_ok_button");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_dialoguebox_on_privacy_policy");
		}
	}
	/*TC 015 -  Validate  the  Terms & Conditions dialogue box on clicking on the Terms & Conditions */
	@When("click on  Terms & Conditions")
	public static void click_on_terms_conditions() throws IOException {
		try {
			click("header_menu");
			browser_explicit_wait("header_terms_icon",1000);
			value = driver.findElement(By.xpath(OR_reader("header_terms_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_terms");
			browser_wait(2000);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_terms_conditions");
		}
	}
	@Then("Verify the dialogue box on Terms and condition page")
	public static void verify_the_dialogue_box_on_terms() throws IOException {
		try {
			browser_explicit_wait("header_terms_title",1000);
			str= driver.findElement(By.xpath(OR_reader("header_terms_title"))).getText();
			Assert.assertEquals(str,td_reader("header_terms_title"));
			value = driver.findElement(By.xpath(OR_reader("header_terms_description"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader( "header_ok_button"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("header_ok_button");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_the_dialogue_box_on_terms");
		}
	}
	/*TC 016 -Validate the navigation to the Landing page on clicking Log out icon*/
	@When("Click on Log out icon")
	public static void click_on_log_out_icon() throws IOException {
		try {
		  value = driver.findElement(By.xpath(OR_reader("logout_icon"))).isDisplayed();
		  Assert.assertEquals(true,value);
		  click("logout");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("header_click_on_log_out_icon");
		}
	}
	@Then("Verify navigation to the Landing  page")
	public static void verify_navigation_to_the_landing_page() throws IOException {
		try {
			browser_explicit_wait("welcome_login",2000);
			str = driver.findElement(By.xpath(OR_reader( "welcome_page_title"))).getText();
			Assert.assertEquals(str,td_reader("welcome_page_title"));
			browser_close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_verify_navigation_to_the_landing_page");
		}
	}
}
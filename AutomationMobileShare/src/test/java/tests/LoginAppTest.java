package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.context.annotation.Description;

import screens.*;
import util.tests.BaseMobileTest;

import javax.swing.*;

public class LoginAppTest extends BaseMobileTest {

	@Description(value = "Failed assertive login test ID:0001")
	@Test()
	public void failedLoginTest() {
		log.info("Starting Failed assertive login test");
		DashBoardScreen dashBoard = dismissTutorial();
		LoginScreen login = dashBoard.goToLoginScreen();
		login.fillInLoginData("email", "password");
		String bannerText = login.getBannerText();
		Assert.assertEquals(bannerText, "Something's not right…. We're sorry for the inconvenience!");
	}

	@Description(value = "Get category List ID:0002")
	@Test()
	public void getCategoryList() {
		log.info("Starting selected a Hotel Category");
		DashBoardScreen dashBoardScreen = dismissTutorial();
		MapScreen mapOption = dashBoardScreen.goToMapScreen();
		mapOption.getListCategory();
		mapOption.tapOption();
		String menuHeader = mapOption.getMenuTitle();
		Assert.assertTrue(menuHeader.contains("Hotels"));

	}

	@Description(value = "Go to Privacy Policy and Legal page ID:0003")
	@Test()
	public void readPrivacyPolicy() {
		log.info("Starting Privacy Policy and Legal view");
		DashBoardScreen dashBoardScreen = dismissTutorial();
		SettingScreen privacyOption = dashBoardScreen.goToSettingScreen();
		privacyOption.tapPolicyLegal();
		String headerText = privacyOption.getHeaderPrivacy();
		Assert.assertEquals(headerText, "Privacy & Legal, heading");

	}

	@Description(value = "Go to Privacy Policy and Legal page ID:0004")
	@Test()
	public void addPlans() {
		log.info("Starting to add new Plans");
		DashBoardScreen dashBoardScreen = dismissTutorial();
		PlansScreen addPlan = dashBoardScreen.goToPlansScreen();
		addPlan.tapReserveDining();
		String headerText = addPlan.getReservationHeader();
		Assert.assertEquals(headerText, "Make a Reservation, heading");

	}
}
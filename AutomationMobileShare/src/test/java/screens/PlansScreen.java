package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

public class PlansScreen extends BaseScreen {
    /**
     * Constructor
     */
    public PlansScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * Locators of the plans
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/actionSheetListView\").childSelector(new UiSelector().textContains(\"Reserve Dining, 2 of 5, button\"))")
    @AndroidFindBy(accessibility = "Reserve Dining, 2 of 5, button")
    private AndroidElement tapPlanButton;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Make a Reservation, heading")
    private AndroidElement reservationHeader;

    /**
     * Tap on Reservation Dinning
     */
    public void tapReserveDining() {
        isElementAvailable(tapPlanButton);
        click(tapPlanButton);
    }

    /**
     * Get header on the reservation view
     */
    public String getReservationHeader() {
        return reservationHeader.getAttribute("content-desc");
    }


    @Override
    public void alertControl() {
        // TODO Auto-generated method stub

    }
}

package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

public class SettingScreen extends BaseScreen {

    /**
     * Constructor
     */
    public SettingScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * Locators of Setting options (more options)
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Privacy & Legal button")
    private AndroidElement privacyLegalButton;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Privacy & Legal, heading")
    private AndroidElement privacyLegalScreen;

    /**
     * Open Policy and Legal view
     */
    public void tapPolicyLegal() {
        scrollToDescription("Privacy & Legal button");
        click(privacyLegalButton);

    }

    /**
     * Get the header
     */
    public String getHeaderPrivacy(){
        isElementAvailable(privacyLegalScreen);
        return privacyLegalScreen.getAttribute("content-desc");
    }

    @Override
    public void alertControl() {
        // TODO Auto-generated method stub

    }

}

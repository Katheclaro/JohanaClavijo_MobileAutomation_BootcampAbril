package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * Map screen.
 *
 * @author Johana.Clavijo
 */
public class MapScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Johana.Clavijo
     */
    public MapScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * The category button.
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/categoryTitle\")")
    private AndroidElement categoryButton;

    /**
     * Hotel option Locators
     */
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Hotels, Category, 11of12, button")
    private AndroidElement hotelOption;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(id="com.disney.wdpro.dlr:id/categoryTitleLayout")
    private AndroidElement menuHeader;

    /**
     * category list
     */
    public MapScreen getListCategory() {
        click(categoryButton);
        return new MapScreen(driver);
    }
    /**
     * Tap on Hotel Category
     */
    public void tapOption() {
        click(hotelOption);

    }
    /**
     * Validate header the category list
     */
    public String getMenuTitle(){
        return menuHeader.getAttribute("content-desc");
    }

    /**
     * Alert control.
     */
    @Override
    public void alertControl() {
        // TODO Auto-generated method stub

    }
}

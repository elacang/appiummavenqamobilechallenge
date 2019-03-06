package pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class KrakenPage extends BasePage {

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='root']/android.view.View[2]/android.widget.Button")
    MobileElement btnHamburger;

    @AndroidFindBy(xpath = "(//android.view.View[@text='Prices'])[1]")
    MobileElement lnkPrices;

    @AndroidFindBy(xpath = "(//android.view.View[@text='Features'])[1]")
    MobileElement lnkFeatures;


    public KrakenPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void navigateToMenu(String menuItem){

    }

}

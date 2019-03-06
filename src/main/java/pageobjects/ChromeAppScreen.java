package pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ChromeAppScreen extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'url_bar')]")
    MobileElement navBarChrome;

    public ChromeAppScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getURLInNavBar(){
        return navBarChrome.getText();
    }

}

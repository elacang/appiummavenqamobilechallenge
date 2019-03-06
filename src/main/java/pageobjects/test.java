package pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test {

    private static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "/Apps/Amazon/");
//        File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://www.kraken.com");
        TimeUnit.SECONDS.sleep(10);
        MobileElement navBar = (MobileElement) driver.findElementById("com.android.chrome:id/url_bar");
        navBar.sendKeys("YOU ARE AWESOME!");


        TimeUnit.SECONDS.sleep(10);
        driver.quit();

    }

}
package stepdefinitions;

import cucumber.api.java8.En;
import static org.junit.Assert.assertTrue;
import pageobjects.BasePage;
import pageobjects.ChromeAppScreen;
import pageobjects.KrakenPage;


public class CommonPageSteps implements En {
    private KrakenPage krakenPage;
    private BasePage basePage;
    private ChromeAppScreen chromeAppScreen;


    public CommonPageSteps(KrakenPage krakenPage, BasePage basePage, ChromeAppScreen chromeAppScreen) {
        this.basePage = basePage;
        this.chromeAppScreen = chromeAppScreen;


        When("^I navigate to ([^\"]*) website$", (String url) -> {
            basePage.openPage(url);
        });
        Given("^I launch the Chrome mobile browser$", () -> {
            basePage.printBrowserInstance();
        });

        Then("^I should see ([^\"]*) URL in the address bar", (String url) -> {
            String browserNavBarText = chromeAppScreen.getURLInNavBar();
            assertTrue(url.equals(browserNavBarText));
        });
    }
}

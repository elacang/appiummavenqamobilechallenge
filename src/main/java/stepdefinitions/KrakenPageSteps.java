package stepdefinitions;

import cucumber.api.java8.En;
import pageobjects.BasePage;
import pageobjects.KrakenPage;

public class KrakenPageSteps implements En {
    private KrakenPage krakenPage;
    private BasePage basePage;

    public KrakenPageSteps(KrakenPage krakenPage, BasePage basePage) {
        this.krakenPage = krakenPage;
        this.basePage = basePage;


        And("^I navigate to ([^\"]*) page from the menu$", (String menuItem) -> {
            krakenPage.navigateToMenu(menuItem);
        });
        Given("^I am at ([^\"]*) website$", (String url) -> {
            basePage.openPage(url);
        });
    }
}

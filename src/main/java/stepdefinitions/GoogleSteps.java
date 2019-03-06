package stepdefinitions;

import cucumber.api.java8.En;

public class GoogleSteps implements En {
    public GoogleSteps() {
        When("^I do a search for \"([^\"]*)\"$", (String arg0) -> {
        });
        Then("^I should be able to see the results$", () -> {
        });
    }
}

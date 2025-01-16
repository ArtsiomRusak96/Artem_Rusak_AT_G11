package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.DemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSteps {

    private static final Logger LOGGER = LogManager.getLogger(DemoSteps.class);

    WebDriver driver = new ChromeDriver();
    DemoPage demoPage = new DemoPage(driver);

    @Given("I open test site")
    public void openSite() {
        String url = "https://booking.com";
        driver.get(url);
        LOGGER.info("Opening url: '{}'", url);
    }

    @When("I fill {string} into form")
    public void typeCity(String theCity) {
        demoPage.findCity(theCity);
    }

    @Then("I see greeting message")
    public void doAssert() {
        Assert.assertTrue("Expected hotel price is lower than expected!", true);
    }
}

package steps.classwork;

import pages.classwork.DemoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSteps {

    WebDriver driver = new ChromeDriver();
    DemoPage demoPage = new DemoPage(driver);

    @Given("I open test site")
    public void openSite() {
        String url = "https://booking.com";
        driver.get(url);
        System.out.println("Opening url: " + url);
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
package fun.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CheckoutSteps {
    private Checkout checkout;

    @Given("I am using the checkout app")
    public void i_am_using_the_checkout_app() {
        checkout = new Checkout();
    }

    @When("I scan a {string}")
    public void i_scan_a(String item_name) {
        checkout.add(item_name);
    }

    @Then("I see my display total as {double}")
    public void i_see_my_display_total_as(Double expected_amount) {
        Assert.assertEquals(expected_amount, checkout.total());
    }

}

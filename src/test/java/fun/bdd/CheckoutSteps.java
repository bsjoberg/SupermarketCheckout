package fun.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class CheckoutSteps {
    private Checkout checkout;

    @Given("I am using the checkout app")
    public void i_am_using_the_checkout_app() {
        Inventory mockInventory = mock(Inventory.class);
        doReturn(.49).when(mockInventory).getPrice("banana");
        doReturn(.59).when(mockInventory).getPrice("apple");
        checkout = new Checkout(mockInventory);
    }

    @When("I scan (a|an) {string}")
    public void i_scan_a(String item_name) {
        checkout.add(item_name);
    }

    @Then("I see my display total as {double}")
    public void i_see_my_display_total_as(Double expected_amount) {
        Assert.assertEquals(expected_amount, checkout.total());
    }

}

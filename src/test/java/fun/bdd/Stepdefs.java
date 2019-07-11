package fun.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Stepdefs {
    private Hello_World hello_world;
    private String actual_message;

    @Given("I have a hello world app")
    public void i_have_a_hello_world_app() {
        hello_world = new Hello_World();
    }

    @When("I say hi")
    public void i_say_hi() {
        actual_message = hello_world.sayHi();
    }

    @Then("I see the words {string}")
    public void i_see_the_words(String expected_message) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expected_message, actual_message);
    }
}

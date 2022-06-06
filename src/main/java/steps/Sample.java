package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Sample {

    @Given("I started testing")
    public void iStartedTesting() {
        System.out.println("Okay can be anything");
    }

    @When("assert numbers")
    public void assertNumbers() {
        Assert.assertEquals(2, 2);
    }

    @Then("should pass intes")
    public void shouldPassIntes() {
        System.out.println("yes passing");
    }

    @When("assert string")
    public void assertString() {
        Assert.assertEquals("chandra", "chandra");
    }

    @Then("should pass strings")
    public void shouldPassStrings() {
        System.out.println("yes passing string");
    }

    @When("assert booleans")
    public void assertBooleans() {
        Assert.assertFalse(false);
    }

    @Then("should pass boolean")
    public void shouldPassBoolean() {
        System.out.println("yes passing boolean");

    }
}

package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoutyDefinitions {
    Person lucy = new Person("Lucy");
    Person sean = new Person("Sean");
    private String messageFromSean;
    private String messageFromSeanN;
    @Given("{person} is located/standing {int} metre(s) from Sean")
    public void lucy_is_located_metres_from_sean(Person person, Integer distance) {
        lucy.moveTo(distance);
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        assertEquals(asList(messageFromSean), lucy.getMessagesHeard());
    }

    @Given("Lucy is {int} metres from Sean")
    public void lucy_is_metres_from_sean(Integer distance) {
        lucy.positionTo(distance);
    }
    @When("Sean shout {string}")
    public void sean_shout(String message) {
        sean.shout(message);
        messageFromSeanN = message;
    }
    @Then("Lucy should hear Sean's message")
    public void lucy_should_hear_sean_s_message() {
        assertEquals(asList(messageFromSeanN), lucy.getMessagesHeardLucy());
    }

}

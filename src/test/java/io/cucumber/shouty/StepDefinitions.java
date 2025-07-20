package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private Person sean;
    private String messageFromSean;
    private Person lucy;

    @Given("Lucy is located {int} metre from Sean")
    public void lucy_is_located_metre_from_sean(Integer distance) {
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);
        System.out.println(distance);
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
       sean.shout(message);
       messageFromSean = message;
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message(){

        assertEquals(new ArrayList<>(
                Arrays.asList(messageFromSean)),lucy.getMessageHeard());
    }

}

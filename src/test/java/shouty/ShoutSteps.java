package shouty;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class ShoutSteps {
    @Autowired
    private ShoutyHelper shouty;

    private static final String ARBITRARY_MESSAGE = "Hello, world";

    @When("{word} shouts")
    public void shouter_shouts(String person) {
        shouty.shout(person, ARBITRARY_MESSAGE);
    }

    @Then("{word} should hear {word}")
    public void listener_should_hear_shouter(String listener, String shouter) {
        Map<String, List<String>> shouts = shouty.getShoutsHeardBy(listener);
        assertEquals(true, shouts.containsKey(shouter));
    }

    @Then("{word} should not hear {word}")
    public void listener_should_not_hear_shouter(String listener, String shouter) {
        Map<String, List<String>> shouts = shouty.getShoutsHeardBy(listener);
        assertEquals(false, shouts.containsKey(shouter));
    }

    @Then("{word} should hear {int} shouts from {word}")
    public void listener_should_hear_shouts_from_shouter(String listener, int shouts, String shouter) {
        Map<String, List<String>> shoutedMessages = shouty.getShoutsHeardBy(listener);
        assertEquals(shouts, shoutedMessages.get(shouter).size());
    }

}

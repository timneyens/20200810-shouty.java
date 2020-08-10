package shouty;

import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocationSteps {
    @Autowired
    private ShoutyHelper shouty;

    @Given("{word} is at {coordinate}")
    public void person_is_at(String person, Coordinate coordinate) {
        shouty.setLocation(person, coordinate);
    }

    @Given("people are located at")
    public void person_is_at(List<PersonLocation> personLocations) {
        for (PersonLocation personLocation : personLocations) {
            shouty.setLocation(personLocation.name,
                    new Coordinate(personLocation.x, personLocation.y));
        }
    }
}

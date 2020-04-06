package shouty;

import cucumber.api.java.en.Given;

import java.util.List;

public class LocationSteps {
    private final Shouty shouty = new Shouty();

    @Given("{word} is at {int}, {int}")
    public void user_is_at(String name, int xCoord, int yCoord) {
        shouty.setLocation(name, new Coordinate(xCoord, yCoord));
    }

    @Given("people are located at")
    public void peopleAreLocatedAt(List<PersonLocation> personLocations) {

        for (PersonLocation personLocation: personLocations){
            shouty.setLocation(personLocation.name,
                    new Coordinate(personLocation.x, personLocation.y));
        }
    }
}

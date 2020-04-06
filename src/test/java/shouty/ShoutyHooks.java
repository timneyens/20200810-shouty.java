package shouty;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShoutyHooks {

    @Before
    public void beforeScenario(){
        System.out.println("this is before");
    }

    @After
    public void afterScenario(){
        System.out.println("this is after");
    }
}

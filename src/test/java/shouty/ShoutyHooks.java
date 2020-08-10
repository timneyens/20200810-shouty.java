package shouty;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShoutyHooks {
    @Before(order = 3)
    public void Before() {
        System.out.println("before tests");
    }

    @Before(value = "@Smoke, @wip", order = 1)
    public void BeforeSmoke() {
        System.out.println("before smoke");
    }

    @Before(order = 2)
    public void Before2() {
        System.out.println("before tests2");
    }

    @After(order = 2)
    public void After() {
        System.out.println("after test");
    }

    @After(order = 1)
    public void After2() {
        System.out.println("after test2");
    }
}

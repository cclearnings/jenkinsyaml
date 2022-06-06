package steps;


import io.cucumber.java.*;


public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Scenario Started: " + scenario.getName());

    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario Ended: " + scenario.getName());

    }


}

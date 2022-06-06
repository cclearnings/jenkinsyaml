package automation.core;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        publish = true
)

public class Runner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setup() {
        System.out.println("Started Executing the scenarios");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("Started Executing the scenarios");
    }
}

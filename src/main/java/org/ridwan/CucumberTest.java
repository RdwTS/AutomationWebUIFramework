package org.ridwan;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = ("org.ridwan"),
        features = ("src/main/resources/Login.feature"),
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"}
)

public class CucumberTest {


}

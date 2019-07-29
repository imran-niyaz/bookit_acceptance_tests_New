package com.cybertek.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "html:target/cucumber",
            features = "src/test/resources/features",
            glue = "com.cybertek.step_definitions",
            tags = "@youtube",
            dryRun = false

    )
    public class CukesRunner {

}

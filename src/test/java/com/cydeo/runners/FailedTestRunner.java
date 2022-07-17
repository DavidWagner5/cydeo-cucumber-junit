package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)   //Ths class runs the failed test that is stored in the rerun.txt file
@CucumberOptions(

        glue = "com/cydeo/step_definitions",
        features = "@target/rerun.txt"
)

public class FailedTestRunner {


}

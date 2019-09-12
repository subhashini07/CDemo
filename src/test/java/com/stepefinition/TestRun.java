package com.stepefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featurefile/Data.feature",glue="com.definition",plugin="html:target")
public class TestRun {

}

package com.saucelabs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)

@CucumberOptions(
features = "src/test/resources/features/Login.feature",
glue = "src/test/java/com/saucelabs/stepdefinitions/LoginPageSD.java",
tags = "login"

)
public class TestRunner {




}

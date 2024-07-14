package com.challenge.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import java.util.logging.Logger;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = "com.challenge.stepdefinitions",
        tags = "@Test_compra"
)
public class CucumberTestSuite {

}

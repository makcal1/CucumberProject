package com.saucelabs.stepdefinitions;

import com.saucelabs.base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleFirstStepDefinition  {



    @Given("This is Given {int}")
    public void method1(int integer){
        System.out.println("This is given method1 " + integer);
    }

    @When("This is {string}")
    public void method2(){
        System.out.println("This is when method2");
    }

    @Then("^This is Then$")
    public void method3(){
        System.out.println("This is Then method3");
    }

}

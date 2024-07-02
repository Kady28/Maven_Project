package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/sparsh/contact.feature",glue = "Steps",tags = "@tag2")//name of my package and path of feature file

public class SparshRunner {

}

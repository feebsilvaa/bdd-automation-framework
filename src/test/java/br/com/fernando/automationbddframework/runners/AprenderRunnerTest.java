package br.com.fernando.automationbddframework.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/aprender_cucumber.feature",
        glue = "br.com.fernando.automationbddframework.steps",
        tags = "@aprenderCucumber", //executa todos que tiverem a tag  @tipo1
        //tags = {"@tipo1", "@tipo2"}, // executa todos que tiverem as duas tags @tipo1 e tipo2
        //tags = {"@tipo1, @tipo2"}, // executa todos que tiverem qualquer uma das tags
        plugin = "pretty",
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = true
)
public class AprenderRunnerTest {
}

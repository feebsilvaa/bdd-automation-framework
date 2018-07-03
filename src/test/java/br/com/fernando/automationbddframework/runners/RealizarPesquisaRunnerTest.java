package br.com.fernando.automationbddframework.runners;

import static br.com.fernando.automationbddframework.core.DriverFactory.getDriver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.fernando.automationbddframework.core.FrameworkProperties;
import br.com.fernando.automationbddframework.core.FrameworkProperties.Browsers;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/realizar_pesquisa.feature", 
		glue = "br.com.fernando.automationbddframework.steps", 
		//tags = "@pesquisaGoogle", 
		plugin = {"pretty", "html:target/report-html", "json:report/report.json"},	
		monochrome = false, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false, 
		strict = true
		)
public class RealizarPesquisaRunnerTest {

	@BeforeClass
	public static void setUpClass() {
		getDriver();
	}

	@AfterClass
	public static void tearDownClass() {
		killWindowsProccess();
	}

	private static boolean killWindowsProccess() {
		String processo = null;

		if (FrameworkProperties.CLOSE_BROWSER) {
			// Chromedriver
			if (FrameworkProperties.BROWSER == Browsers.GOOGLE_CHROME) {
				processo = "chromedriver.exe";
			}
			// Geckodriver
			if (FrameworkProperties.BROWSER == Browsers.MOZILLA_FIREFOX) {
				processo = "geckodriver.exe";
			}

			// No Windows
			if (System.getProperty("os.name").toLowerCase().contains("windows")) {
				try {
					String line;
					Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
					BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
					while ((line = input.readLine()) != null) {
						if (!line.trim().equals("")) {
							if (line.substring(1, line.indexOf("\"", 1)).equalsIgnoreCase(processo)) {
								Runtime.getRuntime()
										.exec("taskkill /F /IM " + line.substring(1, line.indexOf("\"", 1)));
								return true;
							}
						}
					}
					input.close();
				} catch (Exception err) {
					err.printStackTrace();
				}
			}
			// No Linux

			// No Mac

			return false;
		}
		return false;
	}
}

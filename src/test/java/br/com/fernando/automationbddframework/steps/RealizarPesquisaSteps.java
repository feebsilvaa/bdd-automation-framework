package br.com.fernando.automationbddframework.steps;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;


import br.com.fernando.automationbddframework.core.BaseSteps;
import br.com.fernando.automationbddframework.pages.HomePage;
import br.com.fernando.automationbddframework.pages.ResultPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RealizarPesquisaSteps {
	
	private BaseSteps bs = new BaseSteps();
	private HomePage homePage = new HomePage();
	private ResultPage resultPage = new ResultPage();
	
	// Hooks
	@Before(value= {"@pesquisaGoogle"})
	public void setupTest() throws IOException {
		bs.setTestName(RealizarPesquisaSteps.class.getSimpleName());
		bs.setUpTest();		
	}
	
	@After(value= {"@pesquisaGoogle"})
	public void tearDownTest( ) {
		bs.tearDownTest();
	}
	
	// Cenário
	@Dado("^que estou na página inicial$")
	public void queEstouNaPaginaInicial() throws Throwable {
		String tituloPagina = homePage.tituloPagina();
		assertThat(tituloPagina, is("Google"));
	}

	@Quando("^eu pesquisar por ([^\"]*)$")
	public void euPesquisarPor(String texto) throws Throwable {
		bs.evidence();
		homePage.typeFldPesquisar(texto);
		bs.evidence();
		homePage.submeterFormulario();
	}

	@Então("^devo ver resultados de pesquisa sobre ([^\"]*)$")
	public void devoVerResultadosDePesquisaSobre(String expect) throws Throwable {	
		bs.evidence();
		assertThat(resultPage.validarResultado(expect), is(true));		
		bs.setResultadoDoTeste("Passed");
	}
	
}

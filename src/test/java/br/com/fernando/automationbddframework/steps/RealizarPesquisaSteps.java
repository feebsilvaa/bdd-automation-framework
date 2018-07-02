package br.com.fernando.automationbddframework.steps;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import br.com.fernando.automationbddframework.core.BaseSteps;
import br.com.fernando.automationbddframework.pages.Page;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class RealizarPesquisaSteps {
	
	private BaseSteps bs = new BaseSteps();
	private Page page = new Page();
	
	
	@Dado("^que estou na página inicial$")
	public void queEstouNaPáginaInicial() throws Throwable {
		String tituloPagina = page.tituloPagina();
		assertThat(tituloPagina, is("Google"));		
	}

	@Quando("^eu pesquisar por \"([^\"]*)\"$")
	public void euPesquisarPor(String arg1) throws Throwable {
	}

	@Então("^devo ver resultados de pesquisa sobre \"([^\"]*)\"$")
	public void devoVerResultadosDePesquisaSobre(String arg1) throws Throwable {
	}
	
}

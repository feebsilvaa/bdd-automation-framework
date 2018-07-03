package br.com.fernando.automationbddframework.pages;

import org.openqa.selenium.By;

import br.com.fernando.automationbddframework.core.BasePage;

public class HomePage extends BasePage {

	public HomePage typeFldPesquisar(String texto) {
		escrever("input[name='q']", texto);
		return this;
	}	 

	public ResultPage clickBtnPesquisaGoogle() {
		clicarElemento("#main #body");
		clicarBotao("input[name='btnK']");
		return new ResultPage();
	}
	
	public ResultPage submeterFormulario() { 
		submeterForm(By.cssSelector("input[name='q']"));
		return new ResultPage();
	}

	public ResultPage realizarPesquisa(String texto) {
		typeFldPesquisar(texto);
		return submeterFormulario();
	}

}

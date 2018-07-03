package br.com.fernando.automationbddframework.pages;

import org.openqa.selenium.By;

import br.com.fernando.automationbddframework.core.BasePage;

public class ResultPage extends BasePage {
	public boolean validarResultado(String expect) {
		
		StringBuilder str = new StringBuilder();
		str.append("//h3//a[contains(.,'");
		str.append(expect);
		str.append("')]");
		
		if (obterTexto(By.xpath(str.toString())) != null) {
			return true;
		} else {
			return false;		
		}
	}
}

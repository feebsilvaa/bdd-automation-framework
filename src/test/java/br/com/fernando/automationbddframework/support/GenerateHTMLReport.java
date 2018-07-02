package br.com.fernando.automationbddframework.support;

import static br.com.fernando.automationbddframework.support.Generator.dataHoraParaArquivo;

import java.io.File;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateHTMLReport {
	
	public static ExtentHtmlReporter htmlReport(String reportName) {

		StringBuilder pathSaidaArquivo = new StringBuilder();
        pathSaidaArquivo
                .append("report")
                .append(File.separator)
                .append("html")
                .append(File.separator)
                .append(reportName)
                .append("_")
                .append(dataHoraParaArquivo())
                .append(".html");
		
		return new ExtentHtmlReporter(pathSaidaArquivo.toString());
	}
	

}

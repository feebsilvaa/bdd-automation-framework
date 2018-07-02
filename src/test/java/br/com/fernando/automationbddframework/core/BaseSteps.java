package br.com.fernando.automationbddframework.core;

import static br.com.fernando.automationbddframework.core.DriverFactory.killDriver;
import static br.com.fernando.automationbddframework.support.Generator.arquivoSaidaDocx;
import static br.com.fernando.automationbddframework.support.Screenshot.screenshotByte;

import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.junit.Rule;
import org.junit.rules.TestName;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import br.com.fernando.automationbddframework.pages.Page;
import br.com.fernando.automationbddframework.support.CustomXWPFDocument;
import cucumber.api.java.After;

public class BaseSteps {
	
	protected Map<String, String> dadosDoTeste;

	protected String resultadoDoTeste;

	public static FileOutputStream fileOutput = null;
	public static CustomXWPFDocument evidenciaDocx = null;

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	protected Page page = new Page();
	


	@Rule
	public TestName testName = new TestName();

	

	@After
	public void tearDownTest() {
		extent.flush();
		try {
			// Salva a evidência montada em um arquivo word .docx
			fileOutput = arquivoSaidaDocx(testName.getMethodName(), evidenciaDocx, dadosDoTeste, resultadoDoTeste);
			evidenciaDocx.write(fileOutput);
			// converToPdf(evidenciaDocx, testName.getMethodName());
			fileOutput.flush();
			fileOutput.close();

			if (FrameworkProperties.CLOSE_BROWSER) {
				killDriver();
			}

		} catch (Exception e) {
			test.fail(e.getMessage());
	        extent.flush();
			resultadoDoTeste = "Failed";
			inserirErroEvidencia(e.toString());
		}

	}

	protected static void inserirDadosTesteEvidencia(Map dadosDoTeste) {

		Set<Map.Entry<String, String>> set = dadosDoTeste.entrySet();
		Iterator it = set.iterator();

		XWPFParagraph par1 = evidenciaDocx.createParagraph();
		XWPFRun runpar1 = par1.createRun();
		runpar1.setText("DADOS UTILIZADOS NO TESTE");
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry) it.next();
			runpar1.addBreak();
			StringBuilder str = new StringBuilder();
			str.append(String.valueOf(entry.getKey())).append(": ").append(String.valueOf(entry.getValue()));
			runpar1.setText(str.toString());
		}
	}

	protected static void inserirErroEvidencia(String erro) {
		XWPFParagraph par1 = evidenciaDocx.createParagraph();
		XWPFRun runpar1 = par1.createRun();
		runpar1.addBreak();
		runpar1.addBreak();
		runpar1.setText(erro);
		runpar1.setColor("FF0000");
	}

	protected static void evidence() throws InvalidFormatException, InterruptedException {
		int width = (int) (1280 * 0.53);
		int height = (int) (720 * 0.53);
		Thread.sleep(500);
		String blipId = evidenciaDocx.addPictureData(screenshotByte(), XWPFDocument.PICTURE_TYPE_PNG);
		evidenciaDocx.createPicture(blipId, evidenciaDocx.getNextPicNameNumber(Document.PICTURE_TYPE_PNG), width,
				height);
	}

	

}

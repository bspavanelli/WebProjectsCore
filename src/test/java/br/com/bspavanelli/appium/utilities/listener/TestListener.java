package br.com.bspavanelli.appium.utilities.listener;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.bspavanelli.appium.utilities.DriverFactory;
import io.qameta.allure.Attachment;

public class TestListener extends TestWatcher {

	@Override
	protected void failed(Throwable e, Description description) {
		System.out.println("Método '" + description.getMethodName() + "' falhou! Tirando screenshot da tela.");
		takeScreenshot(description.getMethodName());
	}

	@Override
	protected void finished(Description description) {
		System.out.println("Finalizando os testes do método '" + description.getMethodName() + "'!");
		DriverFactory.killDriver();
	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] takeScreenshot(String methodName) {
		return ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
	}
}

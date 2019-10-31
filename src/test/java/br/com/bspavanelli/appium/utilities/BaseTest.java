package br.com.bspavanelli.appium.utilities;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import br.com.bspavanelli.appium.page.home.HomePage;
import br.com.bspavanelli.appium.page.login.LoginPage;
import br.com.bspavanelli.appium.utilities.listener.TestListener;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	@Rule
	public TestListener listener = new TestListener();

	protected LoginPage loginPage;
	protected HomePage homePage;

	@Before
	public void setUpPages() {
		System.out.println("Iniciando os testes do método '" + testName.getMethodName() + "'!");

		loginPage = new LoginPage();
		homePage = new HomePage();
		
	}

}

package br.com.bspavanelli.appium.test.login;

import org.junit.Test;

import br.com.bspavanelli.appium.utilities.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LoginTest extends BaseTest {

	@Severity(SeverityLevel.CRITICAL)
	@Epic("Android")
	@Feature("Login")
	@Story("Realizar Login")
	@Test
	public void realizarLogin() {
		loginPage.openUrl()
			.writeUser()
			.writePassword()
			.clickLogin();

		homePage.validateHeader();
	}
}

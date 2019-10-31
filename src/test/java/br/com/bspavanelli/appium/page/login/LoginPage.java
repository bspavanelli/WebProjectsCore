package br.com.bspavanelli.appium.page.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.bspavanelli.appium.constants.login.LoginConstants;
import br.com.bspavanelli.appium.utilities.BaseConstants;
import br.com.bspavanelli.appium.utilities.screen_actions.ScreenActions;

public class LoginPage extends ScreenActions {

	@FindBy(id = "usuario_login")
	private WebElement fld_user;

	@FindBy(id = "usuario_senha")
	private WebElement fld_password;

	@FindBy(css = "input[value='Entrar no sistema']")
	private WebElement btn_login;

	public LoginPage() {
		initElements(this);
	}

	public LoginPage openUrl() {
		goToUrl(BaseConstants.BASE_URL);
		return this;
	}

	public LoginPage writeUser() {
		fld_user.sendKeys(LoginConstants.USER);
		return this;
	}

	public LoginPage writePassword() {
		fld_password.sendKeys(LoginConstants.PASSWORD);
		return this;
	}

	public LoginPage clickLogin() {
		btn_login.click();
		return this;
	}
}

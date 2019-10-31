package br.com.bspavanelli.appium.page.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.bspavanelli.appium.utilities.screen_actions.ScreenActions;

public class HomePage extends ScreenActions {

	@FindBy(css = "a[href='/registros/new']")
	private WebElement mnu_apontamentos;

	public HomePage() {
		initElements(this);
	}

	public HomePage validateHeader() {
		elementExists(mnu_apontamentos);
		return this;
	}
}

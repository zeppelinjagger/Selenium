package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("LoginTests", 4, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 5, 2));
		String textForAssertion = citacIzExcela.getStringDaTA("LoginTests", 8, 2);

		logInFormFilling(email, password);
		String actualText = loginPage.textFromSignOutButton();
		assertEquals(actualText, textForAssertion);
	}

	@Test(priority = 10)
	public void logInInvalidCredentials() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("LoginTests", 4, 3);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 5, 3));
		String textForAssertion = citacIzExcela.getStringDaTA("LoginTests", 8, 3);

		logInFormFilling(email, password);
		String actualText = loginPage.textFromSignInButton();
		assertEquals(actualText, textForAssertion);
	}

	@Test(priority = 20)
	public void logInEmptyCredentials() throws InterruptedException {
		String textForAssertion = citacIzExcela.getStringDaTA("LoginTests", 8, 4);
		logInFormWithoutFilling();
		String actualText = loginPage.textFromSignInButton();
		assertEquals(actualText, textForAssertion);
	}

	@Test(priority = 30)
	public void logOut() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("LoginTests", 4, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LoginTests", 5, 2));
		String textForAssertion = citacIzExcela.getStringDaTA("LoginTests", 8, 5);

		logInFormFilling(email, password);
		loginPage.signOutButtonClick();
		String actualText = loginPage.textFromSignInButton();
		assertEquals(actualText, textForAssertion);
	}

	public void logInFormFilling(String email, String password) throws InterruptedException {
		navigationPage.getSignInTabClick();
		loginPage.insertEmail(email);
		loginPage.insertPassword(password);
		loginPage.signInButtonClick();
	}

	public void logInFormWithoutFilling() throws InterruptedException {
		navigationPage.getSignInTabClick();
		loginPage.signInButtonClick();
	}

	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}

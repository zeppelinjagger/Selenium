package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInfoTests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void editPersolanInformation() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("MyAccountTests", 2, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInfoTests", 3, 2));
		logInFormFilling(email, password);
		myPersonalInfoPage.myPersonalInfoButtonClick();
		String firstName = citacIzExcela.getStringDaTA("MyPersonalInfoTests", 9, 2);
		myPersonalInfoPage.firstNameInputField(firstName);
		String lastName = citacIzExcela.getStringDaTA("MyPersonalInfoTests", 10, 2);
		myPersonalInfoPage.lastNameInputField(lastName);
		String email2 = citacIzExcela.getStringDaTA("MyPersonalInfoTests", 11, 2);
		myPersonalInfoPage.emailInputField(email2);
		String dayOfBirth = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInfoTests", 12, 2));
		myPersonalInfoPage.pickDateOfBirthDayMenu(dayOfBirth);
		String monthOfBirth = citacIzExcela.getStringDaTA("MyPersonalInfoTests", 13, 2);
		myPersonalInfoPage.pickDateOfBirthMonthMenu(monthOfBirth);
		String yearOfBirth = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInfoTests", 14, 2));
		myPersonalInfoPage.pickDateOfBirthYearMenu(yearOfBirth);
		String currentPassword = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInfoTests", 15, 2));
		myPersonalInfoPage.currentPasswordInputField(currentPassword);
		String newPassword = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInfoTests", 16, 2));
		myPersonalInfoPage.newPasswordInputField(newPassword);
		String confirmationPassword = String.valueOf(citacIzExcela.getIntegerData("MyPersonalInfoTests", 17, 2));
		myPersonalInfoPage.confirmationInputField(confirmationPassword);
		myPersonalInfoPage.saveButtonClick();
		String textForAssertion = citacIzExcela.getStringDaTA("MyPersonalInfoTests", 20, 2);
		String actualText = myPersonalInfoPage.textFromIdentityConfirmation();
		assertEquals(actualText, textForAssertion);

	}

	public void logInFormFilling(String email, String password) throws InterruptedException {
		navigationPage.getSignInTabClick();
		loginPage.insertEmail(email);
		loginPage.insertPassword(password);
		loginPage.signInButtonClick();
	}

	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}

package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void updateAddress() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("MyAccountTests", 2, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 3, 2));
		logInFormFilling(email, password);
		myAccountPage.myAddressButtonClick();
		myAccountPage.updateButtonClick();
		String firstName = citacIzExcela.getStringDaTA("MyAccountTests", 9, 2);
		myAccountPage.firstNameInputField(firstName);
		String lastName = citacIzExcela.getStringDaTA("MyAccountTests", 10, 2);
		myAccountPage.lastNameInputField(lastName);
		String address = citacIzExcela.getStringDaTA("MyAccountTests", 11, 2);
		myAccountPage.addressInputField(address);
		String city = citacIzExcela.getStringDaTA("MyAccountTests", 12, 2);
		myAccountPage.cityInputField(city);
		String state = citacIzExcela.getStringDaTA("MyAccountTests", 13, 2);
		myAccountPage.pickStateMenu(state);
		String zipCode = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 14, 2));
		myAccountPage.zipCodeInputField(zipCode);
		String homePhone = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 16, 2));
		myAccountPage.homePhoneInputField(homePhone);
		String mobilePhone = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 17, 2));
		myAccountPage.mobilePhoneInputField(mobilePhone);
		String addressTitle = citacIzExcela.getStringDaTA("MyAccountTests", 18, 2);
		myAccountPage.addressTitleInputField(addressTitle);
		myAccountPage.saveButtonClick();
		String textForAssertion = citacIzExcela.getStringDaTA("MyAccountTests", 20, 2);
		String actualText = myAccountPage.textFromUpdatedAddressText();
		assertEquals(actualText, textForAssertion);
	}

	@Test(priority = 10)
	public void addAddress() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("MyAccountTests", 2, 3);
		String password = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 3, 3));
		logInFormFilling(email, password);
		myAccountPage.myAddressButtonClick();
		myAccountPage.addAddressButtonClick();
		String firstName = citacIzExcela.getStringDaTA("MyAccountTests", 9, 3);
		myAccountPage.firstNameInputField(firstName);
		String lastName = citacIzExcela.getStringDaTA("MyAccountTests", 10, 3);
		myAccountPage.lastNameInputField(lastName);
		String address = citacIzExcela.getStringDaTA("MyAccountTests", 11, 3);
		myAccountPage.addressInputField(address);
		String city = citacIzExcela.getStringDaTA("MyAccountTests", 12, 3);
		myAccountPage.cityInputField(city);
		String state = citacIzExcela.getStringDaTA("MyAccountTests", 13, 3);
		myAccountPage.pickStateMenu(state);
		String zipCode = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 14, 3));
		myAccountPage.zipCodeInputField(zipCode);
		String homePhone = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 16, 3));
		myAccountPage.homePhoneInputField(homePhone);
		String mobilePhone = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 17, 3));
		myAccountPage.mobilePhoneInputField(mobilePhone);
		String addressTitle = citacIzExcela.getStringDaTA("MyAccountTests", 18, 3);
		myAccountPage.addressTitleInputField(addressTitle);
		myAccountPage.saveButtonClick();
		String textForAssertion = citacIzExcela.getStringDaTA("MyAccountTests", 20, 3);
		String actualText = myAccountPage.textFromUpdatedAddressText();
		assertEquals(actualText, textForAssertion);
	}

	@Test(priority = 20)
	public void deleteAddress() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("MyAccountTests", 2, 3);
		String password = String.valueOf(citacIzExcela.getIntegerData("MyAccountTests", 3, 3));
		logInFormFilling(email, password);
		myAccountPage.myAddressButtonClick();
		myAccountPage.deleteAddressButtonClick();
		driver.switchTo().alert().accept();

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

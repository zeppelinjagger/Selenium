package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyPersonalInfoPage {

	WebDriver driver;
	WebElement myPersonalInfoButton;
	WebElement firstNameInputField;
	WebElement lastNameInputField;
	WebElement emailInputField;
	WebElement dateOfBirthDayMenu;
	WebElement dateOfBirthMonthMenu;
	WebElement dateOfBirthYearMenu;
	WebElement currentPasswordInputField;
	WebElement newPasswordInputField;
	WebElement confirmationInputField;
	WebElement saveButton;
	WebElement identityConfirmation;



	public MyPersonalInfoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getMyPersonalInfoButton() {
		return driver.findElement(By.className("icon-user"));
	}
	public void myPersonalInfoButtonClick() {
		this.getMyPersonalInfoButton().click();
	}


	public WebElement getFirstNameInputField() {
		return driver.findElement(By.id("firstname"));
	}
	public void firstNameInputField(String firstName) {
		this.getFirstNameInputField().clear();
		this.getFirstNameInputField().sendKeys(firstName);
	}

	public WebElement getLastNameInputField() {
		return driver.findElement(By.id("lastname"));
	}
	public void lastNameInputField(String lastName) {
		this.getLastNameInputField().clear();
		this.getLastNameInputField().sendKeys(lastName);
	}

	public WebElement getEmailInputField() {
		return driver.findElement(By.id("email"));
	}
	public void emailInputField(String email) {
		this.getEmailInputField().clear();
		this.getEmailInputField().sendKeys(email);
	}
	
	public WebElement getDateOfBirthDayMenu() {
		return driver.findElement(By.id("days"));
	}
	public void pickDateOfBirthDayMenu(String day) {
		this.getDateOfBirthDayMenu().click();
		this.getDateOfBirthDayMenu().sendKeys(day);
	}
	
	public WebElement getDateOfBirthMonthMenu() {
		return driver.findElement(By.id("months"));
	}
	public void pickDateOfBirthMonthMenu(String month) {
		this.getDateOfBirthMonthMenu().click();
		this.getDateOfBirthMonthMenu().sendKeys(month);
	}
	public WebElement getDateOfBirthYearMenu() {
		return driver.findElement(By.id("years"));
	}
	public void pickDateOfBirthYearMenu(String year) {
		this.getDateOfBirthYearMenu().click();
		this.getDateOfBirthYearMenu().sendKeys(year);
	}


	public WebElement getCurrentPasswordInputField() {
		return driver.findElement(By.id("old_passwd"));
	}
	public void currentPasswordInputField(String currentPassword) {
		this.getCurrentPasswordInputField().clear();
		this.getCurrentPasswordInputField().sendKeys(currentPassword);
	}

	public WebElement getNewPasswordInputField() {
		return driver.findElement(By.id("passwd"));
	}
	public void newPasswordInputField(String newPassword) {
		this.getNewPasswordInputField().clear();
		this.getNewPasswordInputField().sendKeys(newPassword);
	}

	public WebElement getConfirmationInputField() {
		return driver.findElement(By.id("confirmation"));
	}
	public void confirmationInputField(String confirmationPassword) {
		this.getConfirmationInputField().clear();
		this.getConfirmationInputField().sendKeys(confirmationPassword);
	}


	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button/span"));
	}
	
	public void saveButtonClick() {
		this.getSaveButton().click();
	}
	
	public WebElement getIdentityConfirmation() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p"));
	}
	public String textFromIdentityConfirmation() {
		return getIdentityConfirmation().getText();
	}
}

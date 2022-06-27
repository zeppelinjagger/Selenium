package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

	WebDriver driver;
	WebElement myAddressButton;
	WebElement updateButton;
	WebElement firstNameInputField;
	WebElement lastNameInputField;
	WebElement addressInputField;
	WebElement cityInputField;
	WebElement pickStateMenu;
	WebElement zipCodeInputField;
	WebElement countryInputField;
	WebElement homePhoneInputField;
	WebElement mobilePhoneInputField;
	WebElement addressTitleInputField;
	WebElement saveButton;
	WebElement updatedAddressText;
	WebElement addAddressButton;
	WebElement deleteAddressButton;
	WebElement enterKey;

	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getMyAddressButton() {
		return driver.findElement(By.className("icon-building"));
	}

	public void myAddressButtonClick() {
		this.getMyAddressButton().click();
	}

	public WebElement getUpdateButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span"));
	}

	public void updateButtonClick() {
		this.getUpdateButton().click();
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

	public WebElement getAddressInputField() {
		return driver.findElement(By.id("address1"));
	}

	public void addressInputField(String address) {
		this.getAddressInputField().clear();
		this.getAddressInputField().sendKeys(address);
	}

	public WebElement getCityInputField() {
		return driver.findElement(By.id("city"));
	}

	public void cityInputField(String city) {
		this.getCityInputField().clear();
		this.getCityInputField().sendKeys(city);
	}

	public WebElement getPickStateMenu() {
		return driver.findElement(By.id("id_state"));
	}

	public void pickStateMenu(String state) {
		this.getPickStateMenu().click();
		this.getPickStateMenu().sendKeys(state);
	}

	public WebElement getZipCodeInputField() {
		return driver.findElement(By.id("postcode"));
	}

	public void zipCodeInputField(String zipCode) {
		this.getZipCodeInputField().clear();
		this.getZipCodeInputField().sendKeys(zipCode);
	}

	public WebElement getCountryInputField() {
		return driver.findElement(By.id("id_country"));
	}

	public WebElement getHomePhoneInputField() {
		return driver.findElement(By.id("phone"));
	}

	public void homePhoneInputField(String homePhone) {
		this.getHomePhoneInputField().clear();
		this.getHomePhoneInputField().sendKeys(homePhone);
	}

	public WebElement getMobilePhoneInputField() {
		return driver.findElement(By.id("phone_mobile"));
	}

	public void mobilePhoneInputField(String mobilePhone) {
		this.getMobilePhoneInputField().clear();
		this.getMobilePhoneInputField().sendKeys(mobilePhone);
	}

	public WebElement getAddressTitleInputField() {
		return driver.findElement(By.id("alias"));
	}

	public void addressTitleInputField(String addressTitle) {
		this.getAddressTitleInputField().clear();
		this.getAddressTitleInputField().sendKeys(addressTitle);
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitAddress"));
	}

	public void saveButtonClick() {
		this.getSaveButton().click();
	}

	public WebElement getUpdatedAddressText() {
		return driver.findElement(By.className("page-subheading"));
	}

	public String textFromUpdatedAddressText() {
		return this.getUpdatedAddressText().getText();
	}

	public WebElement getAddAddressButton() {
		String title = "Add an address";
		return driver.findElement(By.cssSelector("[title^='" + title + "']"));
	}

	public void addAddressButtonClick() {
		this.getAddAddressButton().click();
	}

	public WebElement getDeleteAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[9]/a[2]/span"));
	}

	public void deleteAddressButtonClick() {
		this.getDeleteAddressButton().click();
	}

	public WebElement getEnterKey() {
		return enterKey;
	}

	public void enterKey() {
		this.getEnterKey().sendKeys(Keys.ENTER);
	}

	public void enterClick() {
		this.getEnterKey().sendKeys(Keys.ENTER);

	}
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	WebElement emailInputField;
	WebElement passwordInputField;
	WebElement signInButton;
	WebElement signOutButton;
	//WebElement centerColumnText;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getEmailInputField() {
		return driver.findElement(By.id("email"));
	}


	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("passwd"));
	}


	public WebElement getSignInButton() {
		return driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	}
	
	public void insertEmail(String email) {
		this.getEmailInputField().sendKeys(email);
	}
	public void insertPassword(String password) {
		this.getPasswordInputField().sendKeys(password);
	}
	public void signInButtonClick() {
		this.getSignInButton().click();
	}
	
	public String textFromSignInButton() {
		return this.getSignInButton().getText();
		}
	
	public WebElement getSignOutButton() {
		return driver.findElement(By.className("logout"));
	}
	public void signOutButtonClick() {
		this.getSignOutButton().click();
		}
	public String textFromSignOutButton() {
		return this.getSignOutButton().getText();
		}
//	public WebElement getCenterColumnText() {
//		return driver.findElement(By.id("center_column"));
//	}
//	public String textCenterColumnText() {
//		return this.getCenterColumnText().getText();
//		}
}

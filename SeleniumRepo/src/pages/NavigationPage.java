package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {

	WebDriver driver;
	WebElement signInTab;
	
	
	public NavigationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getSignInTab() {
		return driver.findElement(By.className("login"));
	}
	
	public void getSignInTabClick() {
		this.getSignInTab().click();
	}
}

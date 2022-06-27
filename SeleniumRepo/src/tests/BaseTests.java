package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyPersonalInfoPage;
import pages.MyWishListPage;
import pages.NavigationPage;


public class BaseTests {

	WebDriver driver;
	LoginPage loginPage;
	ExcelReader citacIzExcela;
	String homeUrl;
	NavigationPage navigationPage;
	MyAccountPage myAccountPage;
	MyPersonalInfoPage myPersonalInfoPage;
	MyWishListPage myWishListPage;

	@BeforeClass
	public void preSvihTestova() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		navigationPage = new NavigationPage(driver);
		myAccountPage = new MyAccountPage(driver);
		myPersonalInfoPage = new MyPersonalInfoPage(driver);
		myWishListPage = new MyWishListPage(driver);

		citacIzExcela = new ExcelReader("data/AutomationTestPlan.xlsx");
		homeUrl = "http://automationpractice.com/index.php";
	}

	@AfterClass
	public void posleSvihTestova() {
		driver.close();
	}
}

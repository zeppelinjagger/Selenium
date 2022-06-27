package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishListTests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void addWishList() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("MyWishListTests", 2, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("MyWishListTests", 3, 2));
		logInFormFilling(email, password);
		driver.navigate().to(homeUrl);
		myWishListPage.printedDressViewClick();
		myWishListPage.addToWishListButtonClick();
		myWishListPage.addedWishListClosePopUpClick();
		myWishListPage.userInfoHeaderClick();
		myWishListPage.myWishListButtonClick();
		myWishListPage.checkIsDeleteVisible();

	}

	@Test(priority = 10)
	public void addMultipleWishList() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("MyWishListTests", 2, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("MyWishListTests", 3, 2));
		logInFormFilling(email, password);
		driver.navigate().to(homeUrl);
		myWishListPage.userInfoHeaderClick();
		myWishListPage.myWishListButtonClick();
		String name = citacIzExcela.getStringDaTA("MyWishListTests", 7, 3);
		myWishListPage.nameWishListInputFieldClick(name);
		myWishListPage.saveNewWishListButtonClick();
		myWishListPage.checkIsDeleteVisible();

	}

	@Test(priority = 20)
	public void removeWishList() throws InterruptedException {

		String email = citacIzExcela.getStringDaTA("MyWishListTests", 2, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("MyWishListTests", 3, 2));
		logInFormFilling(email, password);
		myWishListPage.myWishListButtonClick();
		myWishListPage.deleteButtonClick();
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

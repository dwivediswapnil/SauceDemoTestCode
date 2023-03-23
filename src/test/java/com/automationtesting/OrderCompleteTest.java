package com.automationtesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.Homepage;
import pageObjects.LoginPage;

@Listeners(resources.Listeners.class)
public class OrderCompleteTest extends BasePage {

	public OrderCompleteTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;

	}

	@Test
	public void endToEndTest() throws InterruptedException, IOException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.usernameEntry().sendKeys(getUsername());
		loginPage.passwordEntry().sendKeys(getPassword());
		loginPage.loginButton().click();
		Homepage homePage = new Homepage(driver);
		homePage.inventoryListSelection();
		homePage.goToCartIcon().click();

		CartPage cartPage = new CartPage(driver);
		cartPage.removeBtnForSecondElement().click();
		
		String firstProductPrice = cartPage.priceForFirstProduct();
		String secondProductPrice = cartPage.priceForSecondProduct();
		cartPage.checkoutBtn().click();
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.getFirstNameField().sendKeys(getFirstName());
		checkoutPage.getLastNameField().sendKeys(getLastName());
		checkoutPage.getPostalCodeField().sendKeys(getPostalCode());
		checkoutPage.continueBtn().click();
		String priceOfFirstProductAtCheckoutPage = checkoutPage.getPriceForFirstProduct();
		Assert.assertEquals(firstProductPrice, priceOfFirstProductAtCheckoutPage);

		String priceOfSecondProductAtCheckoutPage = checkoutPage.getPriceForSecondProduct();
		Assert.assertEquals(secondProductPrice, priceOfSecondProductAtCheckoutPage);

		checkoutPage.finishButton().click();
		String confirmationMessage = checkoutPage.getConfirmationMessage();
		Assert.assertEquals(getActualConfirmationMessage(), confirmationMessage);

		String imageName = checkoutPage.getimageConfirmation();
		Assert.assertEquals(getImageName(), imageName);
		
		String confirmationText = checkoutPage.getOrderStateConfirmationText();
		Assert.assertEquals(getActualOrderStateConfirmationMessage(), confirmationText);
		
		

	}

	@Test
	public void lockedoutUserTest() throws InterruptedException, IOException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.usernameEntry().sendKeys(getLockedOutUsername());
		loginPage.passwordEntry().sendKeys(getPassword());
		loginPage.loginButton().click();
		String errorAttribute = loginPage.getLoginErrorAttribute();
		Assert.assertEquals(getActualErrorAttribute(), errorAttribute);

	}

}

package com.automationtesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomepage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)
public class OrderCompleteTest extends BasePage {

	public OrderCompleteTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
		
	}
	
	@Test
	public void endToEndTest() throws InterruptedException, IOException {
		Homepage home = new Homepage(driver);
		Thread.sleep(5000);
		home.getCookie().click();
		home.getTestStoreLink().click();
		
		ShopHomepage shopHome = new ShopHomepage(driver);
		shopHome.getProdOne().click();
		
		ShopProductPage shopProd = new ShopProductPage(driver);
		Select sel = new Select(shopProd.getSizeOption());
		sel.selectByVisibleText("M");
		shopProd.getQuantIncrease().click();
		shopProd.getAddToCartBtn();
		
		Thread.sleep(5000);
		
		ShopContentPanel cPanel = new ShopContentPanel(driver);
		cPanel.getCheckoutBtn();
		
		ShoppingCart cart = new ShoppingCart(driver);
		cart.getHavePromo();
		cart.getPromoTextbox();
		cart.getPromoTextbox().sendKeys("20OFF");
		Thread.sleep(3000);
		cart.getProceedCheckoutBtn().click();
		
		
		
		
		
	}

}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopHomepage {
	public WebDriver driver;

	By productOne = By.linkText("Hummingbird printed t-shirt");
	By productTwo = By.linkText("Hummingbird printed sweater");
	By productThree = By.linkText("The best is yet to come'...");
	By productFour = By.linkText("The adventure begins Framed...");
	By productFive = By.linkText("Today is a good day Framed...");
	By productSix = By.linkText("Mug The best is yet to come");
	By productSeven = By.linkText("Mug The adventure begins");
	By productEight = By.linkText("Mug Today is a good day");

	public ShopHomepage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProdOne() {
		return driver.findElement(productOne);
	}

	public WebElement getProdTwo() {
		return driver.findElement(productTwo);
	}

	public WebElement getProdThree() {
		return driver.findElement(productThree);
	}

	public WebElement getProdFour() {
		return driver.findElement(productFour);
	}

	public WebElement getProdFive() {
		return driver.findElement(productFive);
	}

	public WebElement getProdSix() {
		return driver.findElement(productSix);
	}

	public WebElement getProdSeven() {
		return driver.findElement(productSeven);
	}

	public WebElement getProdEight() {
		return driver.findElement(productEight);
	}

}

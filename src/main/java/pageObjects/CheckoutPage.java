package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By postalCode = By.id("postal-code");
	By continueBtn = By.id("continue");
	By priceForFirstProduct = By.xpath("//div[text()='Sauce Labs Bike Light']/../following::div[2]/div");
	By priceForSecondProduct = By.xpath("//div[text()='Sauce Labs Onesie']/../following::div[2]/div");
	By finishBtn = By.xpath("//button[@id='finish']");
	By thankYouMessage = By.xpath("//h2[normalize-space()='Thank you for your order!']");
	By imageName = By.xpath("//img[@alt='Pony Express']");
	By thankyouText = By.xpath("//div[@class='checkout_complete_container']//h2");
	By orderStateConfirmationText = By.xpath("//div[@class='complete-text']");

	public WebElement getFirstNameField() {
		return driver.findElement(firstName);
	}

	public WebElement getLastNameField() {
		return driver.findElement(lastName);
	}

	public WebElement getPostalCodeField() {
		return driver.findElement(postalCode);
	}

	public WebElement continueBtn() {
		return driver.findElement(continueBtn);
	}

	public String getPriceForFirstProduct() {
		return driver.findElement(priceForFirstProduct).getText().trim();
	}

	public String getPriceForSecondProduct() {
		return driver.findElement(priceForSecondProduct).getText().trim();
	}

	public WebElement finishButton() {
		return driver.findElement(finishBtn);
	}

	public String getConfirmationMessage() {
		return driver.findElement(thankyouText).getText().trim();
	}

	public String getimageConfirmation() {
		return driver.findElement(imageName).getAttribute("class");
	}

	public String getOrderStateConfirmationText() {
		return driver.findElement(orderStateConfirmationText).getText();
	}

}

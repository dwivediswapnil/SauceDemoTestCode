package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	public WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	By secondElementRemoveBtn = By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']");
	By checkoutBtn = By.id("checkout");
	By priceForFirstItem = By.xpath("//div[3]//div[2]//div[2]//div[1]");
	By priceForSecondItem = By.xpath("//div[5]//div[2]//div[2]//div[1]");

	public WebElement removeBtnForSecondElement() {
		return driver.findElement(secondElementRemoveBtn);
	}

	public WebElement checkoutBtn() {
		return driver.findElement(checkoutBtn);
	}

	public String priceForFirstProduct() {
		System.out.println(driver.findElement(priceForFirstItem).getText().trim());
		return driver.findElement(priceForFirstItem).getText().trim();
	}

	public String priceForSecondProduct() {
		return driver.findElement(priceForSecondItem).getText().trim();
	}
}

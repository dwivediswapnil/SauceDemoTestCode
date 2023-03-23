package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;
//	public String listOfItems=["Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt"];

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	By inventoryListItems = By.xpath("//div[@class='inventory_item_name']");
	By addToCartButton = By.xpath("//button[text()='Add to cart']");
	By cart =  By.id("shopping_cart_container");

	public void inventoryListSelection() throws InterruptedException {

		List<WebElement> shoppingItems = driver.findElements(inventoryListItems);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/../..//following-sibling::div/button"))
				.click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']/../..//following-sibling::div/button"))
				.click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/../..//following-sibling::div/button")).click();
	}
	
	public WebElement goToCartIcon() {
		return driver.findElement(cart);
	}
}

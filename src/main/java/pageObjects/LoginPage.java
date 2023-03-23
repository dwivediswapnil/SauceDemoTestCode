package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebDriver driver;

	By username = By.cssSelector("#user-name");
	By password = By.cssSelector("#password");
	By loginBtn = By.cssSelector("#login-button");
	By errorAttribute = By.xpath("//div[@class='error-message-container error']/h3");

	public WebElement usernameEntry() {
		return driver.findElement(username);

	}

	public WebElement passwordEntry() {
		return driver.findElement(password);

	}

	public WebElement loginButton() {
		return driver.findElement(loginBtn);

	}
	public String getLoginErrorAttribute() {
		return driver.findElement(errorAttribute).getAttribute("data-test");
	}

}

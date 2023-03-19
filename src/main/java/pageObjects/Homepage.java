package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;

	By toggle = By.cssSelector(".toggle");
	By homeLink = By.linkText("Homepage");
	By accordionLink = By.linkText("Accordion");
	By browserTabLink = By.linkText("Browser Tabs");
	By buttonsLink = By.linkText("Buttons");
	By calcLink = By.linkText("Calculator (JS)");
	By contactUsLink = By.linkText("Contact Us Form Test");
	By datePickerLink = By.linkText("Date Picker");
	By dropdownLink = By.linkText("DropDown Checkbox Radio");
	By fileUpload = By.linkText("File Upload");
	By hiddenElementsLink = By.linkText("Hidden Elements");
	By iFrameLink = By.linkText("iFrames");
	By loaderLink = By.linkText("Loader");
	By loginPortalLink = By.linkText("Login Portal Test");
	By mouseLink = By.linkText("Mouse Movement");
	By popupLink = By.linkText("Pop Ups & Alerts");
	By predictiveLink = By.linkText("Predictive Search");
	By tablesLink = By.linkText("Tables");
	By testStoreLink = By.xpath("//a[normalize-space()='Test Store']");
	By aboutMeLink = By.linkText("About Me");
	By cookie = By.cssSelector(".close-cookie-warning > span");
	

	public Homepage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getToggle() {
		return driver.findElement(toggle);

	}

	public WebElement getHomepageLink() {
		return driver.findElement(homeLink);
	}

	public WebElement getAccordionLink() {
		return driver.findElement(accordionLink);
	}

	public WebElement getBrowserTabLink() {
		return driver.findElement(browserTabLink);
	}

	public WebElement getButtonLink() {
		return driver.findElement(buttonsLink);
	}

	public WebElement getCalcLink() {
		return driver.findElement(calcLink);
	}

	public WebElement getContactUsLink() {
		return driver.findElement(contactUsLink);
	}

	public WebElement getDatePickerLink() {
		return driver.findElement(datePickerLink);
	}

	public WebElement getDropdownLink() {
		return driver.findElement(dropdownLink);
	}

	public WebElement getFileUploadLink() {
		return driver.findElement(fileUpload);
	}

	public WebElement getHiddenElementsLink() {
		return driver.findElement(hiddenElementsLink);
	}

	public WebElement getIframeLink() {
		return driver.findElement(iFrameLink);
	}

	public WebElement getLoaderLink() {
		return driver.findElement(loaderLink);
	}

	public WebElement getLoginPortalLink() {
		return driver.findElement(loginPortalLink);
	}

	public WebElement getMouseLink() {
		return driver.findElement(mouseLink);
	}

	public WebElement getPopupLink() {
		return driver.findElement(popupLink);
	}

	public WebElement getPredictiveLink() {
		return driver.findElement(predictiveLink);
	}

	public WebElement getTablesLink() {
		return driver.findElement(tablesLink);
	}

	public WebElement getTestStoreLink() {
		return driver.findElement(testStoreLink);
	}

	public WebElement getAboutMeLink() {
		return driver.findElement(aboutMeLink);
	}

	public WebElement getCookie() throws IOException {
		return driver.findElement(cookie);
	}

}

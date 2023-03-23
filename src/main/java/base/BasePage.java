package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public static WebDriver driver;
	private Properties prop;

	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}

	public WebDriver getDriver() throws IOException {
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public String getActualErrorAttribute() throws IOException {
		return prop.getProperty("loginErrrorAttribute");

	}

	public String getUrl() throws IOException {
		return prop.getProperty("url");

	}

	public String getUsername() throws IOException {
		return prop.getProperty("username");

	}

	public String getLockedOutUsername() throws IOException {
		return prop.getProperty("lockedUsername");

	}

	public String getPassword() throws IOException {
		return prop.getProperty("password");

	}

	public String getFirstName() throws IOException {
		return prop.getProperty("firstName");
	}

	public String getLastName() throws IOException {
		return prop.getProperty("lastName");

	}

	public String getPostalCode() throws IOException {
		return prop.getProperty("postalCode");
	}

	public String getActualConfirmationMessage() throws IOException {
		return prop.getProperty("confirmationMessage");

	}

	public String getActualOrderStateConfirmationMessage() throws IOException {
		return prop.getProperty("orderStateConfirmationText");

	}

	public String getImageName() throws IOException {
		return prop.getProperty("imageName");

	}

	public void takeSnapShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destFile = new File(System.getProperty("user.dir") + "\\target\\screenshots\\" + timestamp() + ".png");

		FileUtils.copyFile(srcFile, destFile);
	}

	public String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}

package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class TestRule {
	private static WebDriver driver;
	
	@Before
	private void beforeCenario() {
		System.setProperty("webdriver.chrome.driver", "C:/tools/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://test.juniorsbrissa.com/pagina-de-exemplo/");

	}
	public static WebDriver getDriver() {
		return driver;
	}

}

package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	
	public ChromeDriver driver;
	
	@BeforeTest
	public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless","--disable-gpu");
	  driver = new ChromeDriver(options);
	}
    @Test
    public void openWebsite() {
    	driver.get("https://www.google.com/");
    }

    @AfterTest
    public void afterClass() {
	    driver.close();
  }

}
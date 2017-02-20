package facebook.WhisperWeb;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Utils {
	
	public static WebDriver driver;
	

	@BeforeClass
	public static void CreateEnvironment() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hi2abhinav\\workspace\\WhisperWeb\\src\\test\\java\\facebook\\WhisperWeb\\datadriven.properties");
		prop.load(fis);
		
		if(prop.getProperty("Browser").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		else if(prop.getProperty("Browser").equals("Firefox")){
			System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
	}
	
	@AfterClass
	public static void CloseEnvironment() throws InterruptedException{
		driver.quit();
	}
}

package facebook.WhisperWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetAppPage {

public WebDriver driver;
	
	public GetAppPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=".//*[@id='phone']")
	WebElement phone;

	@FindBy(xpath=".//button[@class='btn-submit']")
	WebElement submit;

	@FindBy(xpath="html/body/div[1]/form/div/button")
	WebElement sms;

	public WebElement sms(){
		return sms;
	}

	public WebElement phone(){
		return phone;
	}

	public WebElement submit(){
		return submit;
	}

	
}

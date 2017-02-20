package facebook.WhisperWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LolPage {

public WebDriver driver;
	
	public LolPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=".//*[@id='category-rows-container']/div[1]/div[2]/div/div/div[2]/h4/a")
	WebElement firstlol;

	@FindBy(xpath=".//*[@id='story-main-column']/div/div[3]/a")
	WebElement fbshare;

	@FindBy(xpath=".//*[@id='email']")
	WebElement fbusername;

	@FindBy(xpath=".//*[@id='pass']")
	WebElement fbpassword;

	@FindBy(xpath=".//*[@id='u_0_2']")
	WebElement submit;

	public WebElement firstlol(){
		return firstlol;
	}

	public WebElement fbshare(){
		return fbshare;
	}

	public WebElement fbusername(){
		return fbusername;
	}

	public WebElement fbpassword(){
		return fbpassword;
	}

	public WebElement submit(){
		return submit;
	}

}

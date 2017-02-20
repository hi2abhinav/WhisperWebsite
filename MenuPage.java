package facebook.WhisperWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
public WebDriver driver;
	
	public MenuPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="html/body/header/div[1]/div/div/nav/div[5]/div[2]/ul/li[1]/a")
	WebElement jobs;

	@FindBy(xpath="html/body/div[3]/div[2]/div[2]/div/div/p[2]/a")
	WebElement positions;

	@FindBy(xpath="html/body/div[3]/div[1]/div/ul/li[7]/a")
	WebElement faq;

	@FindBy(xpath=".//*[@id='desk-rightcol']/ul/li/a")
	WebElement emailus;

	@FindBy(xpath=".//*[@id='interaction_name']")
	WebElement name;

	@FindBy(xpath=".//*[@id='interaction_email']")
	WebElement emailid;

	@FindBy(xpath=".//*[@id='ticket_custom_platform_version']")
	WebElement platform;
	
	@FindBy(xpath=".//*[@id='ticket_custom_contact_reason']")
	WebElement issue;

	@FindBy(xpath=".//*[@id='email_subject']")
	WebElement subject;

	@FindBy(xpath=".//*[@id='email_body']")
	WebElement message;

	public WebElement issue(){
		return issue;
	}

	public WebElement subject(){
		return subject;
	}
	
	public WebElement message(){
		return message;
	}	

	public WebElement name(){
		return name;
	}

	public WebElement faq(){
		return faq;
	}

	public WebElement emailid(){
		return emailid;
	}
	
	public WebElement platform(){
		return platform;
	}
	
	public WebElement jobs(){
		return jobs;
	}

	public WebElement positions(){
		return positions;
	}
	
	public WebElement emailus(){
		return emailus;
	}
	
	
	
	
}

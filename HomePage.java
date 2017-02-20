package facebook.WhisperWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=".//*[@id='feed-category-sections']")
	WebElement navbar;
	
	@FindBy(xpath = ".//*[@id='story-box-featured-image-container']")
	WebElement featureimage;
	
	@FindBy(xpath = "html/body/div[3]/div[2]/div/div[1]/div/a")
	WebElement allstories;
	
	@FindBy(xpath = "html/body/header/div[1]/div/div/nav/div[4]/div/a") 
	WebElement getapp;
	
	@FindBy(xpath = ".//*[@id='ellipsis_button']") 
	WebElement menu;
	
	public WebElement navbar(){
		return navbar;
	}

	public WebElement featureimage(){
		return featureimage;
	}
	
	public WebElement allstories(){
		return allstories;
	}

	public WebElement getapp(){
		return getapp;
	}

	public WebElement menu(){
		return menu;
	}

}

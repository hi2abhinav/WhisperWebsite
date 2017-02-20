package facebook.WhisperWeb;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppTest extends Utils {

	@Test
	public void aOpenSite() throws IOException{    
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hi2abhinav\\workspace\\WhisperWeb\\src\\test\\java\\facebook\\WhisperWeb\\datadriven.properties");
		prop.load(fis);
		driver.get(prop.getProperty("Website"));
		AssertJUnit.assertEquals(prop.getProperty("PageTitle"), driver.getTitle());
	}
	
	@Test
	public void bNavigationBar(){
		HomePage hp = new HomePage(driver);
		int links = hp.navbar().findElements(By.tagName("a")).size();
		AssertJUnit.assertEquals(10, links);
	}

	@Test
	public void cStories(){
		HomePage hp = new HomePage(driver);
		AssertJUnit.assertEquals(true, hp.allstories().isEnabled());
	}

	@Test
	public void dImage(){
		HomePage hp = new HomePage(driver);
		boolean fimg = hp.featureimage.isEnabled();
		AssertJUnit.assertEquals(true, fimg);
		hp.featureimage().click(); 
	}
	
	@Test
	public void eApp() throws InterruptedException, IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hi2abhinav\\workspace\\WhisperWeb\\src\\test\\java\\facebook\\WhisperWeb\\datadriven.properties");
		prop.load(fis);
		HomePage hp = new HomePage(driver);
		hp.getapp().click();
		GetAppPage gap = new GetAppPage(driver);
		gap.phone().sendKeys(prop.getProperty("Mobileno"));
		//gap.submit().click();
		//Thread.sleep(2000);
		//Assert.assertEquals(prop.getProperty("Success"), gap.sms().getText());
	}
	
	@Test
	public void fLol(){
		driver.get("http://whisper.sh");
		HomePage hp = new HomePage(driver);
		List<WebElement> navelement = hp.navbar.findElements(By.tagName("a"));
		for(int i=0;i<navelement.size();i++){
			if(navelement.get(i).getText().contains("LOL")){
				navelement.get(i).click();
				break;
			}
		}
		AssertJUnit.assertEquals("LOL Whisper", driver.getTitle());
	}
	
	@Test
	public void gFbShare() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hi2abhinav\\workspace\\WhisperWeb\\src\\test\\java\\facebook\\WhisperWeb\\datadriven.properties");
		prop.load(fis);
		LolPage lp = new LolPage(driver);

		lp.firstlol.click();
		lp.fbshare.click();
		Set<String> ids = driver.getWindowHandles();   //Store windows in string
		Iterator<String> it = ids.iterator();          //create iteration
		String parentid = it.next();                   //assign names to string
		String childid = it.next();
		driver.switchTo().window(childid); 
		lp.fbusername.sendKeys(prop.getProperty("fbUsername"));
		lp.fbpassword.sendKeys(prop.getProperty("fbPassword"));
		lp.submit.click();
		AssertJUnit.assertEquals("Post to Facebook", driver.getTitle());
		driver.switchTo().window(parentid);
	}
	
	@Test
	public void hJobs(){
		driver.get("http://whisper.sh/");
		HomePage hp = new HomePage(driver);
		hp.menu.click();
		MenuPage mp = new MenuPage(driver);
		mp.jobs.click();
		mp.positions.click();
		AssertJUnit.assertEquals("Jobs at Whisper", driver.getTitle());		
	}
	
	@Test
	public void iSupport() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hi2abhinav\\workspace\\WhisperWeb\\src\\test\\java\\facebook\\WhisperWeb\\datadriven.properties");
		prop.load(fis);
		MenuPage mp = new MenuPage(driver);

		mp.faq.click();
		mp.emailus.click();
		mp.name.sendKeys(prop.getProperty("Browser"));
		mp.emailid.sendKeys(prop.getProperty("fbUsername"));
		Select platform = new Select(mp.platform);
		platform.selectByVisibleText(prop.getProperty("Platform"));
		Select issue = new Select(mp.issue);
		issue.selectByVisibleText(prop.getProperty("Issue"));
		mp.subject.sendKeys("Test");
		mp.message.sendKeys("Hi");
	}
}	

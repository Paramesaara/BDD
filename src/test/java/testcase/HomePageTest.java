package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Homepage;
import reportgenerator.Screenshotgenerator;

public class HomePageTest {
	WebDriver wd;
	@Given ("^open browser as (.*)$")
	public void openBrowser(String browser)
	{
		Homepage.loadbrowser(wd);
		// wd=new FirefoxDriver();
		 //wd.manage().window().maximize();
		//System.out.println("Open browser step completed"+ browser);
	}
	@Given ("^enter url as (.*)$")
	public void enterUrl(String Url)
	{
		Homepage.loadurl(wd, Url);
		//wd.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//System.out.println("enter url"+ Url);
	}
	@Then ("^enter Username as (.*)$")
	public void Username(String Username)
	{
		Homepage.enterusername(wd, Username);
		//WebElement username=wd.findElement(By.xpath(".//*[@id='usernameId']"));
		//username.sendKeys(Username);
		//int i=1;
		//System.out.println("enter username"+Username);
	}
	@Then ("^enter Password as (.*)$")
	public void Password(String Password)
	{
		Homepage.enterpswd(wd, Password);
		//WebElement password=wd.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input"));
		//password.sendKeys(Password);
		//System.out.println("enter password"+Password);
	}
	
	@And ("^enter captcha as (.*)$")
	public void Captcha(String Captcha)
	{
		Homepage.entercaptcha(wd, Captcha);
		//WebElement captcha=wd.findElement(By.xpath(".//*[@id='nlpAnswer']"));
		//captcha.sendKeys(Captcha);
		//System.out.println("enter captcha"+Captcha);
	}
	@When ("^click login button$")
	public void loginbutton()
	{
		Homepage.clicklogin(wd);
		
		//WebElement login =wd.findElement(By.xpath(".//*[@id='loginbutton']"));
		//login.click();
		//System.out.println("Login completed");
	}
	@But ("^dont click otp checkbox$")
	public void Checkbox()
	
	{
		int i=1/0;
		//System.out.println("checboxskipped ");
	}
	@After
	public void teardow(Scenario s) throws IOException
	
	{
		if(s.isFailed())
		{
			
			Screenshotgenerator.generatescreenshot(s, wd);
			//System.err.println("Teardown function called");
		}
		
	}
}

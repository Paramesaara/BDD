package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {
	WebDriver wd;

	public static WebDriver loadbrowser(WebDriver wd)
	{
		return wd=new FirefoxDriver();
		
	}
	public static void loadurl(WebDriver wd,String Url)
	{
		wd.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	}
	public static void enterusername(WebDriver wd,String Userid)
	{
		WebElement userid=wd.findElement(By.xpath(".//*[@id='usernameId']"));
		userid.sendKeys(Userid);
	}
	public static void enterpswd(WebDriver wd,String pswd)
	{
		WebElement passwd=wd.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input"));
		passwd.sendKeys(pswd);
	}
	public static void entercaptcha(WebDriver wd,String captcha)
	{
		WebElement cpt=wd.findElement(By.xpath(".//*[@id='nlpAnswer']"));
		cpt.sendKeys(captcha);
	}
	public static void clicklogin(WebDriver wd)
	{
		WebElement login=wd.findElement(By.xpath(".//*[@id='loginbutton']"));
		login.click();
	}
}
